package cn.lenjoy.boot.framework.web.config.swagger;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.constraints.NotEmpty;

/**
 * @description: lenjoy swagger 配置文件
 * @author: lenjoy's bincloud,mvpzhou
 * @date: Create By lenjoy's bincloud,mvpzhou on 2022 04 20 星期三
 * @version: 1.0.0
 */
@Data
@ConfigurationProperties("lenjoy.swagger")
public class LenjoySwaggerProperties {
    /**
     * 标题
     */
    @NotEmpty(message = "标题不能为空")
    private String title;
    /**
     * 描述
     */
    @NotEmpty(message = "描述不能为空")
    private String description;
    /**
     * 作者
     */
    @NotEmpty(message = "作者不能为空")
    private String author;
    /**
     * 版本
     */
    @NotEmpty(message = "版本不能为空")
    private String version;
    /**
     * 扫描的包
     */
    @NotEmpty(message = "扫描的 package 不能为空")
    private String basePackage;
    /**
     * 地址
     */
    private String url = "";
    /**
     * 邮箱
     */
    private String email = "bincloud@yeah.net";
}