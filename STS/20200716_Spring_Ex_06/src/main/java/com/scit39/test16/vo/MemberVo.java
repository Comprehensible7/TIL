package com.scit39.test16.vo;

import lombok.Data;

@Data
public class MemberVo {

	// jsp의 네임은 자바로
	// js id는 아래에서 확인하셈 
	private String user_id, user_pw, user_name, user_hobby, user_gender, introduce;

}
