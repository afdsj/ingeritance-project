package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Application01 {

   public static void main(String[] args) {
      /* 1. 사용자에게 숫자를 입력받는다. 
       * 2. 연산기호를 입력받는다. 
       * 3. 두번째 숫자를 입력받는다. */
      List<Integer> list = new ArrayList();
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      list.add(6);
      
      for(int a : list) {
    	 System.out.println(a);
    	 
      }
      
   }
   
       public static int plus(int first, int second) {
      return first + second;
   }
       public static int minus(int first, int second) {
      return first-second;
   }
       public static int multiple(int first, int second) {
      return first*second;
   }
       public static int divide(int first, int second) {
      return first/second;
   }
   
}