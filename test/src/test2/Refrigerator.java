package test2;

public class Refrigerator extends Product {
	
	//냉장고 고유기능
	private boolean light;
	private int temperature;
	private String mode="일반모드";
	
	public Refrigerator() {} //기본생성자
	
	public Refrigerator(int temperature,										//냉장고 매개변수있는 생성자 호출
						   String code,int power, String brand, String name) { //인자 부모+자식 같이 받음
		super(code, power, brand, name); //인자 부모
		this.temperature = temperature;  //인자 자식
		
	}
	//냉장고 오버라이딩
	@Override
	public void turnOn() { //공통기능 전원 on/off
		light=true;
		System.out.println("냉장고를 킵니다 ");
	}
	
	@Override
	public void turnOff() {
		light=false;
		System.out.println("냉장고를 끕니다");
	}
	
	
	//냉장고 getter와 setter
	public boolean isLight() {
		return light;
	}

	public void setLight(boolean light) {
		this.light = light;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
	
	//냉장고 고유 메소드
	public void mode (String mode) {
		if(mode.equals("김치냉장고 모드")) {
			mode = "김치냉장고 모드";
			temperature=0;
			light=true;
			System.out.println(mode+"입니다");
			System.out.println(temperature+"도로 설정 되었습니다." );
		}else if(mode.equals("일반모드")){
			light=false;
			mode = "일반 모드";
			System.out.println("일반모드입니다.");
			temperature=5;
			System.out.println(temperature+"도로 설정되었습니다.");
			System.out.println(mode);
		}else {
			System.out.println("선택하신 모드가 없습니다");
			System.out.println(mode+"를 유지하겠습니다.");
			System.out.println(temperature+"도 입니다.");
	
			
		}
	}
	
	
	public void mode (int temperature) {
		this.temperature = temperature;
		if(temperature>=0&&temperature<10) {
		if(temperature>5) {
			light=false;
			mode="일반모드";
			System.out.println("설정 온도는 "+temperature+"도 입니다.");
			System.out.println("설정 온도에 따라 일반 모드가 되었습니다.");
		
		}else if(temperature>0){
			mode="김치냉장고 모드";
			light=true;
			this.temperature= temperature;
			System.out.println("설정온도는"+temperature+"도 입니다.");
			System.out.println("설정온도에 따라 김치 냉장고 모드로 변경합니다.");
			
		}
		}else {
			System.out.println("온도 범위를 벗어났습니다.");

		}
	}	
	public void lightState() {
		if(light) {
			System.out.println("불이 켜져 있습니다.");
		}else {
			System.out.println("불이 꺼져 있습니다.");
		}
}
	//냉장고 toString 오버라이딩
	@Override
	public String toString() {
		return "["+super.toString()+ "냉장고 설정 [ 라이트=" + light + ", 현재 설정온도=" + temperature + ", 모드=" + mode + "]";
	}
	
}
