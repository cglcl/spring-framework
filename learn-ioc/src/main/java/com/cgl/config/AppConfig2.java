package com.cgl.config;

import com.cgl.bean.Fox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 扫描类
 *
 * @author cgl
 * @date 2019/5/17 16:00
 */
@Configuration
public class AppConfig2 {

	@Bean(initMethod = "initxml", destroyMethod = "destroyxml", name = "fox1")
	public Fox fox() {
		return new Fox();
	}
}
