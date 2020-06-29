package TestManager;

import java.util.ArrayList;
import java.util.Scanner;

import TestVo.StudentVo;

public class StudentManager {
	
	// 객체생성
	StudentVo sv = new StudentVo();
	// 리스트 생성
	ArrayList<StudentVo> studentList = new ArrayList<>();
	// 스캐너 선언
	Scanner sc = new Scanner(System.in);
	
	
	public void selectInfo() {
		
		do {
			
			// 메뉴 출력
			printMenu();
			
			System.out.print("메뉴 번호를 선택해 주세요 : ");
			System.out.println();
			// 스위치문에서 받아올 변수 선언
			int code = sc.nextInt();
			
			switch (code) {
			case 1:
				// 성적입력
				insertScore();
				break;
			case 2:
				// 값 삭제하기
				// 수정필요
				deleteScore();
				break;
			case 3:
				// 전체 성적확인
				for(int i = 0; i<studentList.size(); i++ ) {
					System.out.println("===============");
					studentList.get(i).printAll();
					System.out.println("===============");
					
				}
				break;
				
			case 4:
				// 전체 초기화
				clear();
				System.out.println("===============");
				System.out.println("데이터 삭제 완료");
				System.out.println("===============");
				break;
				
			case 0:
				// 시스템종료하기
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
				break;

			default:
				System.out.println("올바른 값을 입력하세요.");
				// 올바른 값 입력을 위한 초기화 진행
				sc.nextLine();
				break;
			}
			
			System.out.println();
			
		} while (true);
		
	}
	
	public void printMenu() {
		System.out.println("==============");
		System.out.println("1. 성적 입력");
		System.out.println("2. 목록 삭제");
		System.out.println("3. 성적 전체보기");
		System.out.println("4. 데이터 모두 삭제");
		System.out.println("0. 시스템 종료");
		System.out.println("==============");
		System.out.println("\n");
	}
	
	public void insertScore() {
		
		sc.nextLine();
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println();
		
		System.out.print("학번을 입력하세요 : ");
		String grade = sc.nextLine();
		System.out.println();
		
		System.out.print("교실을 입력하세요 : ");
		String location = sc.nextLine();
		System.out.println();
		
		System.out.println("점수를 입력하세요 : ");
		double score = sc.nextDouble();
		System.out.println();
		
		// 값을 넣기 위한 객체 생성
		sv = new StudentVo(name, grade, location, score);
		// 입력한 값을 전체 저장한다
		studentList.add(sv);
	}
	
	public void deleteScore() {
		
		boolean check2 = studentList.isEmpty();
		
		for(int i = 0; i < studentList.size(); i++) {
		
			}
		// false일시 데이터 저장사항 없음
		if(check2) {
			System.out.println("저장된 데이터가 없습니다.");
			System.out.println();
		// true일시 저장된 내역이 삭제됨	
		} else if(!check2) {
			System.out.print("최근 입력데이터 삭제");
			System.out.println();
		}
		studentList.remove(sv);
		
	}

	public void clear() {
		
		// 전체삭제 진행
		System.out.println("전체 데이터를 삭제합니다");
		boolean check = studentList.isEmpty();
		System.out.println("삭제 결과가 " + check + " 일시 정상작동");
		System.out.println("True일경우 삭제실패, 중복체크하세요");
		studentList.clear();
		
	}

}
