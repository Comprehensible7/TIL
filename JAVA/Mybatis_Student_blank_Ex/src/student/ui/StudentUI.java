//사용자 화면
package student.ui;

import java.util.ArrayList;
import java.util.Scanner;

import student.dao.StudentDAO;
import student.vo.Student;

public class StudentUI {
	
	Scanner sc = new Scanner(System.in);
	StudentDAO dao = new StudentDAO();
	
	public StudentUI() {
		
		while (true) {
			menuPrint();
			
			int code = sc.nextInt();
			
			switch (code) {
			case 1:
				input();
				break;
				
			case 2:
				output();
				break;
				
			case 3:
				delete();
				break;
				
			case 4:
				update();
				break;
				
			case 5:
				search();
				break;
				
			case 0:
				System.out.println("프로그램을 종료합니다");
				return;

			default:
				System.out.println("다시 선택하세요");
			}
		}
	}
	public void menuPrint() {
		System.out.println();
		System.out.println("[ 학생 성적 관리 ]");
		System.out.println("1. 입력");
		System.out.println("2. 전체 출력");
		System.out.println("3. 삭제");
		System.out.println("4. 수정");
		System.out.println("5. 검색");
		System.out.println("0. 종료");
		System.out.print("선택 > ");
	}
	
	public void input() {
		int id, k, e, m;
		String name;
		int n;
		
		System.out.println("[ 성적 입력 ]");
		sc.nextLine();
		System.out.print("학번 : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("국어 점수 : ");
		k = sc.nextInt();
		System.out.print("영어 점수 : ");
		e = sc.nextInt();
		System.out.print("수학 점수 : ");
		m = sc.nextInt();
		
		Student s = new Student(id, name, k, e, m);
		n = dao.insert(s);
		
		if(n == 0) {
			System.out.println("저장 실패");
		} else {
			System.out.println("저장 성공");
		}
		
	}
	
	public void output() {
		
		ArrayList<Student> list;
		
		System.out.println("[ 전체 학생 정보 ]");
		System.out.println("학번굏이름굏국어굏영어굏수학굏평균");
		
		list = dao.selectStudentAll();
		
		if(list == null || list.size() == 0) {
			System.out.println("저장된 데이터가 없습니다.");
		} else {
			for(int i = 0; i<list.size();i++) {
				Student s = list.get(i);
				System.out.print(s.getId() + "굏");
				System.out.print(s.getName() + "굏");
				System.out.print(s.getKor() + "굏");
				System.out.print(s.getEng() + "굏");
				System.out.print(s.getMat() + "굏");
				System.out.println(s.getAvg());
			}
		}
		
	}
	
	public void delete() {
		int id, n;
		
		System.out.println("[ 삭제 ]");
		System.out.print("삭제할 학번 : ");
		sc.nextLine();
		id = sc.nextInt();
		
		n = dao.delete(id);
		
		if (n == 0) {
			System.out.println("해당하는 학번이 없습니다.");
		} else {
			System.out.println(n + "건이 삭제되었습니다.");
		}
		
		
	}
	
	public void update() {
		
		int id, k, e, m;
		String name;
		int n;
		
		System.out.println("[ 성적 입력 ]");
		sc.nextLine();
		System.out.print("학번 : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("국어 점수 : ");
		k = sc.nextInt();
		System.out.print("영어 점수 : ");
		e = sc.nextInt();
		System.out.print("수학 점수 : ");
		m = sc.nextInt();
		
		Student s = new Student(id, name, k, e, m);
		n = dao.update(s);
		
		if(n == 0 ) {
			System.out.println("저장 실패");
		} else {
			System.out.println("저장 성공");
		}
		
	}
	
	public void search() {
		ArrayList<Student> list;
		String name;
		
		System.out.println("[ 검색 ]");
		System.out.print("검색할 이름 : ");
		sc.nextLine();
		name = sc.nextLine();
		
		list = dao.selectName(name);
		
		if(list == null || list.size() == 0) {
			System.out.println("이름이 없습니다.");
		} else {
			System.out.println("학번굏이름굏국어굏영어굏수학굏평균");
			for(int i = 0; i<list.size();i++) {
				Student s = list.get(i);
				System.out.print(s.getId() + "굏");
				System.out.print(s.getName() + "굏");
				System.out.print(s.getKor() + "굏");
				System.out.print(s.getEng() + "굏");
				System.out.print(s.getMat() + "굏");
				System.out.println(s.getAvg());
			}
		
		}
	
		
	}
	
	
}
