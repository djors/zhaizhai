package com.zhaizhai.weappserver.infrastructure.service.impl;

import com.zhaizhai.weappserver.infrastructure.entity.Comics;
import com.zhaizhai.weappserver.infrastructure.mapper.ComicsMapper;
import com.zhaizhai.weappserver.infrastructure.service.IComicsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 漫画信息表 服务实现类
 * </p>
 *
 * @author djors
 * @since 2025-05-25
 */
@Service
public class ComicsServiceImpl extends ServiceImpl<ComicsMapper, Comics> implements IComicsService {

}
