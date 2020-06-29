package member.vo;

public class Ex2_1 {

	// 이름 나이 전화번호를 저장할 수 있도록 속성을 지정해줘야 한다.
	// 직접적인 접근을 못하게 private로 선언
	private String name;
	private String car_num;
	private String phone;
	private String position;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCar_num() {
		return car_num;
	}

	public void setCar_num(String car_num) {
		this.car_num = car_num;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
}
