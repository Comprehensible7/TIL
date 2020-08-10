package global.sesoc.sample.vo;

import lombok.Data;

/**
 * 개인정보를 저장하는 VO 
 */
@Data
public class Person {
	private String name;
	private int age;
	private String address;
}
