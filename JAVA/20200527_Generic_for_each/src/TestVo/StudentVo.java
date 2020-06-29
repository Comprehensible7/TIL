package TestVo;

public class StudentVo {
	
	private String name;	// 이름
	private String grade;	// 학번
	private String location;	// 교실
	private double score;	// 점수
	
	// 기본생성자
	public StudentVo() {

	}
	
	// 생성자
	public StudentVo(String name, String grade, String location, double score) {
		
		this.name = name;
		this.grade = grade;
		this.location = location;
		this.score = score;
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	public void printAll() {
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + grade);
		System.out.println("교실 : " + location);
		System.out.println("점수 : " + score);
	}

	
}
