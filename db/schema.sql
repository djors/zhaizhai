create table comics(
                       `id` bigint(20) unsigned not null auto_increment comment '主键',
                       `title` varchar(256) not null comment '漫画名称（中文）',
                       `original_title` varchar(256) not null comment '漫画原始名称',
                       `author` varchar(100) not null comment '作者',
                       `score` float default 0 comment '评分',
                       `category` varchar(50) null comment '分类',
                       `region` varchar(20) null comment '地区',
                       `summary` text null comment '简介',
                       `cover_url` varchar(512) null comment '封面图url',
                       `attributes` json default null comment '漫画扩展信息',
                       `status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除（0：未删除，1：已删除）',
                       primary key (`id`),
                       key `idx_title` (`title`)
) engine = innodb default charset = utf8mb4 collate = utf8mb4_unicode_ci comment = '漫画信息表';