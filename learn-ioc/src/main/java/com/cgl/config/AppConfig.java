package com.cgl.config;

import com.cgl.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * bean配置类
 *
 * @author cgl
 * @date 2019/5/17 15:59
 */
@ComponentScan("com.cgl")
@Configuration
@Import(AppConfig2.class)
public class AppConfig {

	@Bean
	public User user() {
		return new User();
	}
}
