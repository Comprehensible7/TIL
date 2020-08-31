package com.scit39.web13.vo;

import lombok.Data;

@Data
public class BookVO {
	
	private String book_id; // id    
	private String book_user; // user
	private String book_pw; // pw          
	private String book_name; // name        
	private String book_auth; // Author       
	private String book_pub; // Publisher        
	private String book_loc; // 분류         
	private int book_price;  // price   
	private String book_indate; // indate    
	private int book_row;	// row_number() over(order by)


}
