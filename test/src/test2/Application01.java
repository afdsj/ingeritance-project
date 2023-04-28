package test2;

import java.util.Scanner;

public class Application01 {

	public static void main(String[] args) {
		/*1. 주제 한가지를 선정한다 : 전자제품 판매점
		 *2. 상속을 이용하여 세분화 한다. 
		 * 	 ex) 제품-컴퓨터 / 제품-냉장고
		 *3. 공통기능을 도출하고 상속을 받아 개별 기능을 확장한다
		 *   ex) 컴퓨터.전기(100w) / 냉장고.전기(50w)소비
		 *4. 오버로딩을 이용하여 기능을 다양하게 만든다
		 *	 ex) 컴퓨터.키입력(String or int) = 문자 입력 혹은 숫자 입력
		 *	 ex) 냉장고.온도조절(String or int) = "김치냉장고모드", 숫자입력
		 *5. main에서 사용자가 기능을 조작할 수 있도록 만든다.
		 *필수로 들어가야 하는 것!
		 *is a 관계 기술
		 *메소드가 담겨있으면 DTO가 아님
		 *생성자 get / set / toString*/
		
			
		/* 전기제품 공통기능
		 * 전원on과 전원off
		 * 
		 * 컴퓨터 is a 전자제품 (ㅇ) / 전자제품 is a 컴퓨터 (x)
		 * 냉장고 is a 전자제품 (ㅇ) / 전자제품 is a 냉장고 (x)
		 * 
		 * 컴퓨터
		 * cpu, hdd, ram
		 * 컴퓨터의 add 메소드를 오버로딩하여 정수와 실수를 매개변수로 받을 수있게함
		 * 냉장고
		 *  온도조절, 모드 (일반모드 / 김치냉장고모드)
		 * 냉장고의 mode 메소드를 오버로딩하여 String와 정수를 매개변수로 받을 수 있게함
		 * */
		
		Scanner sc = new Scanner(System.in);
		//컴퓨터 인스턴스 생성
		Computer myComputer = new Computer("인텔", 100, 16, "s123", 100, "삼성", "노트북");
		//냉장고 인스턴스 생성
		Refrigerator refru = new Refrigerator(1,"s-144",1000,"엘지","딤채");
		//기능을 보여주기 위해서 반복문 작성
		
		while(true) {								// 반복문 실행
			System.out.println("사용하실 제품을 골라주세요");
			System.out.println("1번 컴퓨터");
			System.out.println("2번 냉장고");
			System.out.println("3번 모든 제품 정보보기");
			int no =sc.nextInt();
			
			if(no==1) { // 입력한 값이 1이라면 또 다시 반복문 실행
				com: // 컴퓨터 선택을 빠져나오기 위해 라벨 사용
				while(true) {
					System.out.println("컴퓨터를 선택하셨습니다.");
					System.out.println();
					System.out.print("사용 하실 기능을 선택해주세요");
					System.out.println("1.켜기,2.끄기,3.정수 더하기,4.실수 더하기");
					int cnum =sc.nextInt();
					
					switch(cnum) {
						case 1:
							myComputer.turnOn(); //오버라이딩 메소드 사용
							break com;
						case 2:
							myComputer.turnOff();//오버라이딩 메소드 사용
							break com;
						case 3:
							if(myComputer.isState()) {
							System.out.println("더할 숫자를 입력해주세요");
							int a= sc.nextInt();
							int b = sc.nextInt();
							System.out.println(myComputer.add(a, b));// 오버로딩 된 add 메소드 사용
							break com;
							}else {
								System.out.println("컴퓨터가 꺼져있습니다.");
								System.out.println();
								break com;
							}
						case 4:
							if(myComputer.isState()) {
								System.out.println("더할 숫자를 입력해주세요");
								double d = sc.nextDouble();
								double e = sc.nextDouble();
								System.out.println(myComputer.add(d, e));// 오버로딩 된 add 메소드 사용
								break com;
							}else {
								System.out.println("컴퓨터가 꺼져있습니다");
								System.out.println();
								break com;
							}
							
						default :
							System.out.println("잘못 입력했습니다");
							break com;
			
							
					}
				}
			}else if(no==2) {
				refr: // 냉장고 선택을 빠져나오기 위해 라벨 사용
					while(true) {
					System.out.println("냉장고를 선택하셨습니다.");
					System.out.print("사용 하실 기능을 선택해주세요");
					System.out.println("1.켜기,2.끄기,3.모드변경,4.온도설정");
					int cnum =sc.nextInt();
					sc.nextLine();
					switch(cnum) {
						case 1:
							refru.turnOn();//오버라이딩 메소드 사용
							break refr;
						case 2:
							refru.turnOff();//오버라이딩 메소드 사용
							break refr;
						case 3:
							System.out.println("모드를 설정해주세요 예)김치냉장고 모드,일반모드");
							String str= sc.nextLine();
							refru.mode(str); // 오버로딩 된 mode 메소드 사용
							if(refru.isLight()) {
								System.out.println("김치냉장고 모드는 라이트가 들어옵니다.");
								System.out.println();
							}
							break refr;
						case 4:
							System.out.println("온도를 설정해주세요  9~0도");
							int tem = sc.nextInt();
							refru.mode(tem); // 오버로딩 된 mode 메소드 사용
							if(refru.isLight()) {
								System.out.println("김치냉장고 모드는 라이트가 들어옵니다.");
								System.out.println();
							}
							break refr;
						default:
							System.out.println("잘못 입력했습니다.");
							break refr;
				
				}	
					}
	

			}else if(no==3) {
				System.out.println(myComputer.toString());   // 컴퓨터 정보를 가지고 있는 toString()
				System.out.println(refru.toString());		// 냉장고 정보를 가지고 있는 toString()
				System.out.println();
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		
		
		}
	
		
	}
	
}
