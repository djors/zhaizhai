package com.zhaizhai.weappserver.infrastructure.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
/**
 * <p>
 * 漫画信息表
 * </p>
 *
 * @author djors
 * @since 2025-05-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("comics")
public class Comics implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 漫画名称（中文）
     */
    private String title;

    /**
     * 漫画原始名称
     */
    private String originalTitle;

    /**
     * 作者
     */
    private String author;

    /**
     * 评分
     */
    private Double score;

    /**
     * 分类
     */
    private String category;

    /**
     * 地区
     */
    private String region;

    /**
     * 简介
     */
    private String summary;

    /**
     * 封面图url
     */
    private String coverUrl;

    /**
     * 漫画扩展信息
     */
    private String attributes;

    /**
     * 是否删除（0：未删除，1：已删除）
     */
    @TableLogic
    private Integer status;
}
