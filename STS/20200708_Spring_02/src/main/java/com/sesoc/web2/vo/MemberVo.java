package com.sesoc.web2.vo;

import lombok.Data;

@Data
public class MemberVo {

	private String id, pw, name;
	private int age;

	public MemberVo() {
		super();
	}

	public MemberVo(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "MemberVo [id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + "]";
	}

}
