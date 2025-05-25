package com.zhaizhai.weappserver.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.sql.Types;
import java.util.Collections;

public class MybatisPlusCodeGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/test", "root", "cz1997323")
                .globalConfig(builder -> {
                    builder.author("djors") // 设置作者
//                            .enableSwagger() // 开启 swagger 模式
                            .outputDir("/Users/caizhi/IdeaProjects/zhaizhai/weapp-server/src/main/java");
                })
                .dataSourceConfig(builder ->
                        builder.typeConvertHandler((globalConfig, typeRegistry, metaInfo) -> {
                            int typeCode = metaInfo.getJdbcType().TYPE_CODE;
                            if (typeCode == Types.SMALLINT) {
                                // 自定义类型转换
                                return DbColumnType.INTEGER;
                            }
                            return typeRegistry.getColumnType(metaInfo);
                        })
                )
                .packageConfig(builder ->
                        builder.parent("com.zhaizhai.weappserver") // 设置父包名
                                .entity("infrastructure.entity")
                                .mapper("infrastructure.mapper")
                                .service("infrastructure.service")
                                .serviceImpl("infrastructure.service.impl")
                                .pathInfo(Collections.singletonMap(OutputFile.xml, "/Users/caizhi/IdeaProjects/zhaizhai/weapp-server/src/main/java/resources/mapper")) // 设置mapperXml生成路径
                )
                .strategyConfig(builder ->
                        builder.addInclude("comics") // 设置需要生成的表名
//                                .addTablePrefix("t_", "c_") // 设置过滤表前缀
                )
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
