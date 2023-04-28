package test2;

public class Computer extends Product{
	
	//컴퓨터 고유기능
	private String cpu; 
	private int hdd;
	private int ram;
	private boolean state;
	public Computer() {} //기본생성자

	public Computer(String cpu, int hdd, int ram) { //매개변수 있는 생성자
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
	}
	
	public Computer(String cpu, int hdd, int ram, String code, // 컴퓨터 매개변수 있는 생성자 호출
						int power, String brand, String name) { //인자를 부모+자식 같이 받음
		super(code,power,brand,name); //인자 부모
		//this(cpu.hdd,ram); 인자 자식
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
	
	}
	//컴퓨터 오버라이딩
	@Override
	public void turnOn() { //공통기능 전원 on/off
		this.state = true;
		System.out.println("컴퓨터를 킵니다");
		System.out.println();
	}


	@Override
	public void turnOff() { 
		this.state = false;
		System.out.println("컴퓨터를 끕니다.");
		System.out.println();
	}
	
	//컴퓨터 getter와 setter
	public String cpu() {
		return cpu;
	}
	public void setCpu(String cpu) { 
		this.cpu = cpu;
	}
	
	public int Hdd() {
		return hdd;
	}
	
	public void setHdd(int hdd) {
		this.hdd = hdd;
	}
	
	public int Ram() {
		return ram;
	}
	
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	public boolean isState() {          
		return state;
	}
	
	public void setState(boolean state) {
		this.state = state;
	}

	//컴퓨터 toString 오버라이딩
	//Product의 정보와 컴퓨터의 정보를 함께 출력
	@Override
	public String toString() { //메소드이름
		return "["+super.toString()+"[제품사양 cpu=" + cpu + ", hdd=" + hdd+"기가"+ ", ram=" + ram +"기가"+ "]";
		
	}
	 //컴퓨터 메소드 오버로딩 (컴퓨터 기능을 넣으려고 만들었음)
	public int add(int a, int b) {
		return a+b;
	}
	public int add(String a, String b) {
		return Integer.parseInt(a)+Integer.parseInt(b);
	}
		
	public double add(double a, double b) {
		return a+b;
	}
}
