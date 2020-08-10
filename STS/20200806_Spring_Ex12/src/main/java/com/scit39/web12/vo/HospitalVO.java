package com.scit39.web12.vo;

import lombok.Data;

@Data
public class HospitalVO {

		private int h_no;           		  // 차트번호
		private String h_hnum;				  // 환자번호
		private String h_sec;      		      // 진료과
		private String h_loc;                 // 위치
		private String h_doc;                 // 의사명
		private String h_name;				  // 환자명
		private String h_sup;                 // 담당 간호사
		private String h_info;                // 환자기록
		private String h_res;                 // 진단명
		private String h_indate;    	      // 진료날짜
		private int h_price;                  // 진료비
		private int row_num;				  // 정렬번호


}
