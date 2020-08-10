package com.scit39.test16.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.scit39.test16.vo.MemberVo;

@Service
public class MemberService {

	// 리스트 생성
	private ArrayList<MemberVo> list = new ArrayList<MemberVo>();

	public String memberJoin(MemberVo member) {

		// 값이 무조건 들어간다
		String page = "/member/joinComplete";

		// 리스트의 사이즈값을 출력해준다 (입력값 없을 시 0)
		// 입력 값 있을때 1
		System.out.println(list.size());

		// 값이 들어간 이후
		// 만약 실패했을경우를 확인하기 위해(중복), id를 체크
		// 중복일 경우 실패 페이지로 이동한다.
		for (int i = 0; i < list.size(); i++) {
			if (member.getUser_id().equals(list.get(i).getUser_id())) {
				System.out.println("fail");
				page = "/member/joinFail";
				return page;
			}
		}

		// 모든 식 검증 후 조건 부합 시 추가
		list.add(member);

		// 리스트 입력 값 출력
		for (MemberVo m : list) {
			System.out.println(m);

		}
		return page;

	}
	
	// 리스트에 저장된 값을 출력하기 위한 메서드
	public ArrayList<MemberVo> showList() {
		
		return list;
	}

}
