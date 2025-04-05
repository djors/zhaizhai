package com.zhaizhai.weappserver.query.jikan;

import cn.hutool.core.text.CharSequenceUtil;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.http.Method;
import com.alibaba.fastjson2.JSON;
import com.zhaizhai.weappserver.app.jikan.SearchAnimeResp;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class JiKanQueryService {
    public SearchAnimeResp searchAnime(String q) {
        try(HttpResponse httpResponse = HttpUtil.createRequest(Method.GET, "https://api.jikan.moe/v4/anime")
                .form("q", q)
                .execute()) {

            String bodyStr = httpResponse.body();
            String imageUrl = Optional.ofNullable(bodyStr)
                    .map(m -> JSON.parseObject(bodyStr))
                    .map(jsonObject -> jsonObject.getJSONArray("data"))
                    .map(jsonArray -> jsonArray.getJSONObject(0))
                    .map(jsonObject -> jsonObject.getJSONObject("jpg"))
                    .map(jsonObject -> jsonObject.getString("image_url"))
                    .orElse(null);
            if (CharSequenceUtil.isBlank(imageUrl))  {
                log.warn("imageUrl is blank! q:{}", q);
            }
            return new SearchAnimeResp(imageUrl);
        }
    }

}
