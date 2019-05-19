package com.cgl.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

/**
 * 狐狸
 *
 * @author cgl
 * @date 2019/5/17 15:49
 */
public class Fox implements InitializingBean, DisposableBean {

	public Fox() {
		System.out.println("Constructor===fox===");
	}

	public void initxml() {
		System.out.println("fox 的initxml方法");
	}

	public void destroyxml() {
		System.out.println("fox destoryxml方法");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy fox");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet fox");
	}

	@PostConstruct
	public void init() {
		System.out.println("init1");
	}

	@PostConstruct
	public void init2() {
		System.out.println("init2");
	}
}
