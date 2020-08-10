package com.scit39.web10.vo;

import lombok.Data;

@Data
public class StudentVO {

	private String student_id, student_pw, student_name, student_subject, student_indate;
	private int row_num;
}
