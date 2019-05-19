package com.cgl.bean;

import lombok.Data;
import lombok.ToString;

/**
 * user
 *
 * @author cgl
 * @date 2019/5/17 15:50
 */
@Data
public class User {

	private String name;

	private int age;

	public User() {
		System.out.println("user constructor");
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
