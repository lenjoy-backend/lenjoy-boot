package cn.lenjoy.boot.framework.security.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.Duration;

/**
 * @description: 乐享 Spring Security 配置类
 * @author: lenjoy's bincloud,mvpzhou
 * @date: Create By lenjoy's bincloud,mvpzhou on 2022 06 05 星期日
 * @version: 1.0.0
 */
@Data
@Validated
@ConfigurationProperties(prefix = "lenjoy.security")
public class LenjoySecurityProperties {
    /**
     * 访问令牌的请求 Header
     */
    @NotEmpty(message = "访问令牌的请求 Header, 不能为空")
    private String tokenHeader;

    /**
     * Token 过期时间
     */
    @NotNull(message = "Token 过期时间, 不能为空")
    private Duration tokenTimeout;

    /**
     * Session 过期时间
     */
    @NotNull(message = "Session 过期时间, 不能为空")
    private Duration sessionTimeout;

    /**
     * 是否开启模拟模式 mock
     * mock 将允许获取模拟用户信息
     */
    @NotNull(message = "是否开启模拟模式, 不能为空")
    private Boolean mockEnable;

}