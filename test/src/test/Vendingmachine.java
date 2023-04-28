package test;

import java.util.Scanner;

public class Vendingmachine {
	   public void  juice() {
	      System.out.println("1. 오렌지쥬스 2. 딸기쥬스 3. 무설탕쥬스 중 원하는 번호를 입력하세요 : ");
	      Scanner sc = new Scanner(System.in);
	      int juices= sc.nextInt();
	      
	      if(juices == 1) {
	         System.out.println(
	               "╔═════ °• ♔ •° ═════╗\r\n"
	               + "\r\n" 
	               +"오렌지 쥬스가 나왔습니다."
	               + "\r\n" 
	               + "╚═════ °• ♔ •° ═════╝");
	         
	         }else if(juices ==2 ) {
	            System.out.println(
	                  "╔═════ °• ♔ •° ═════╗\r\n"
	                  + "\r\n" 
	                  +"딸기 쥬스가 나왔습니다."
	                  + "\r\n" 
	                  + "╚═════ °• ♔ •° ═════╝");
	      }else if(juices == 3) {
	         System.out.println(
	               "╔═════ °• ♔ •° ═════╗\r\n"
	               + "\r\n" 
	               +"무설탕 쥬스가 나왔습니다."
	               + "\r\n" 
	               + "╚═════ °• ♔ •° ═════╝");
	      }else {
	         System.out.println("입력이 잘못 되었습니다. 다시 돌아가세요");
	      }
	      
	      
	      
	   }
	   public void beverage() {
	      System.out.println("1. 사이다 2. 콜라 3. 무설탕 음료 중 번호를 입력하세요 : ");
	      Scanner scr = new Scanner(System.in);
	      int beverages = scr.nextInt();
	      if(beverages == 1) {
	         System.out.println(
	               "╔═════ °• ♔ •° ═════╗\r\n"
	               + "\r\n" 
	               +"사이다가 나왔습니다."
	               + "\r\n" 
	               + "╚═════ °• ♔ •° ═════╝");
	         
	      }else if(beverages ==2 ) {
	         System.out.println(
	               "╔═════ °• ♔ •° ═════╗\r\n"
	               + "\r\n" 
	               +"콜라가 나왔습니다."
	               + "\r\n" 
	               + "╚═════ °• ♔ •° ═════╝");
	      }else if(beverages == 3) {
	         System.out.println(
	               "╔═════ °• ♔ •° ═════╗\r\n"
	               + "\r\n" 
	               +"무설탕 음료가 나왔습니다."
	               + "\r\n" 
	               + "╚═════ °• ♔ •° ═════╝");
	      }else {
	         System.out.println("입력이 잘못 되었습니다. 다시 돌아가세요");
	      }
	      
	      
	      
	      
	      
	   }
	   public void chocolate() {
	      System.out.println("1. 다크초콜릿 2. 밀크초콜릿 3. 무설탕초콜릿 중 원하는 번호를 입력하세요 : ");
	      Scanner scr = new Scanner(System.in);
	      int choco= scr.nextInt();
	      if(choco == 1) {
	         System.out.println(
	               "╔═════ °• ♔ •° ═════╗\r\n"
	               + "\r\n" 
	               +"다크초콜릿이 나왔습니다."
	               + "\r\n" 
	               + "╚═════ °• ♔ •° ═════╝");
	         
	      }else if(choco ==2 ) {
	         System.out.println(
	               "╔═════ °• ♔ •° ═════╗\r\n"
	               + "\r\n" 
	               +"밀크초콜릿이 나왔습니다."
	               + "\r\n" 
	               + "╚═════ °• ♔ •° ═════╝");
	         
	      }else if(choco == 3) {
	         System.out.println(
	               "╔═════ °• ♔ •° ═════╗\r\n"
	               + "\r\n" 
	               +"무설탕초콜릿이 나왔습니다."
	               + "\r\n" 
	               + "╚═════ °• ♔ •° ═════╝");
	         
	      }else {
	         System.out.println("입력이 잘못 되었습니다. 다시 돌아가세요");
	      }
	      
	      
	      
	   }
	   public void coffee() {
	      System.out.println("1. 라떼 2.아메리카노 3. 커피믹스 중 원하는 번호를 입력하세요 : ");
	      Scanner scr = new Scanner(System.in);
	      int coffee= scr.nextInt();
	      if(coffee == 1) {
	         System.out.println("라떼가 나왔습니다.");
	         
	      }else if(coffee ==2 ) {
	         System.out.println("아메리카노가 나왔습니다.");
	      }else if(coffee == 3) {
	         System.out.println("커피믹스가 나왔습니다.");
	      }else {
	         System.out.println("입력이 잘못 되었습니다. 다시 돌아가세요");
	      }
	      
	   }
	      
	      
	   public void errors() {
	      System.out.println("입력값이 잘못 되었습니다. 다시 돌아가세요"+
	            "＼　　ヽ　　　　i　　|　　　　 /　　　/　\r\n"
	            + "　　　＼　\r\n"
	            + "!\r\n"
	            + "　　　　　　　　　　　　　　;' ':;,,　　　　 ,;'':;,\r\n"
	            + "　　　　　　　　　　　　　;'　　 ':;,.,.,.,.,.,,,;'　　';,\r\n"
	            + "　　ー　　　　　　　　 ,:'　　　　　　　　 　::::::::､\r\n"
	            + "　_＿　　　　　　　　,:' ／ 　 　　　　＼ 　　::::::::',\r\n"
	            + "　　　　　二　　　　:'　 ●　　　　　 ●　 　　 ::::::::i.\r\n"
	            + "　　￣　　　　　　　i　 '''　(__人_)　　'''' 　　 ::::::::::i\r\n"
	            + "　　　　-‐　　　　　 :　 　　　　　　　　　 　::::::::i\r\n"
	            + "　　　　　　　　　　　`:,､ 　　　　　 　 　 :::::::::: /\r\n"
	            + "　　　　／　　　　　　 ,:'　　　　　　　 : ::::::::::::｀:､\r\n"
	            + "　　　　　　　　　　　 ,:'　　　　　　　　 : : ::::::::::｀:､\r\n"
	            + "");
   }

}

