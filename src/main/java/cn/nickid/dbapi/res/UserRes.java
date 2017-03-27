/*
 * 文 件 名:  TestRes.java
 * 版    权:  Xi'An Leadeon Technologies Co., Ltd. Copyright 2015-9-17,  All rights reserved  
 */
package cn.nickid.dbapi.res;

import java.io.Serializable;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  yunhaibin
 * @version  [版本号, 2015-9-17]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class UserRes implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3926927526843866262L;
	
	/**
	 * id 用户ID
	 */
	private int id;
	/**
	 * name 用户名称
	 */
	private String name;
	/**
	 * age 用户年龄
	 */
	private int age;
	/**
	 * 获取 id
	 * @return 返回 id
	 */
	public int getId() {
		return id;
	}
	/**
	 * 设置 id
	 * @param 对id进行赋值
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 获取 name
	 * @return 返回 name
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置 name
	 * @param 对name进行赋值
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取 age
	 * @return 返回 age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * 设置 age
	 * @param 对age进行赋值
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/* (non-Javadoc)
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserRes [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
