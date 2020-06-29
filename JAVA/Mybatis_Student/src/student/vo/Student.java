package student.vo;

/**
 * ���� ������ ������ VO Ŭ����
 */
public class Student {
	private String id;				//�й�
	private String name;			//�̸�
	private int kor;				//��������
	private int eng;				//��������
	private int mat;				//��������
	private double avg;				//�������
	
	// �⺻������
	public Student() {
		// TODO Auto-generated constructor stub
	}
	// ������
	public Student(String id, String name, int kor, int eng, int mat, double avg) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.avg = avg;
	}
	
	public Student(String id, String name, int kor, int eng, int mat) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	// Getter Setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", avg="
				+ avg + "]";
	}
	
}
