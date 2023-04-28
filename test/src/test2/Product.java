package test2;

public class Product{ // 부모 제품
	
	// 제품 고유 기능
	private String code; 	//제품코드
	private int power;   	//파워
	private String brand; 	//브랜드
	private String name;	//제품명
	
	public Product() {} //기본생성자 호출
	
	public Product(String code, int power, String brand, String name) { //제품 매개변수 있는 생성자 호출
		this.code = code;
		this.power = power;
		this.brand = brand;
		this.name = name;
	}
	
	public void turnOn() { //공통 기능 전원 on/off
		System.out.println("제품을 킵니다.");
		System.out.println();
	}
	public void turnOff() {
		System.out.println("제품을 끕니다.");
		System.out.println();
	}
	//제품 getter와 setter
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//제품 toString 오버라이딩
	@Override
	public String toString() {
		return "제품코드명 =" + code + ", 파워=" + power+"와트" + ", 브랜드명 =" + brand + ", 제품명=" + name + "]";
	}
	
	
}
