package com.zhaizhai.weappserver.infrastructure.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
/**
 * <p>
 * 漫画信息表
 * </p>
 *
 * @author djors
 * @since 2025-05-25
 */
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
    private Boolean status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Comics{" +
            "id = " + id +
            ", title = " + title +
            ", originalTitle = " + originalTitle +
            ", author = " + author +
            ", score = " + score +
            ", category = " + category +
            ", region = " + region +
            ", summary = " + summary +
            ", coverUrl = " + coverUrl +
            ", attributes = " + attributes +
            ", status = " + status +
        "}";
    }
}
