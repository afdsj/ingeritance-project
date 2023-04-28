//for Application01_2

package test;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Calculator_1 {

   public static void Plus() {

      Scanner sc = new Scanner(System.in);
      List list = new ArrayList();
      int sum = 0;
      System.out.println("000 을 입력하면 종료합니다");
      
      while (true) {
         
         System.out.println("더할 수를 입력해주세요 : ");
         int num = Integer.parseInt(sc.nextLine());
         list.add(num);
         sum += num;
         
         if (num == 000) {
            break;
         }
   
      System.out.println(sum);
      System.out.println("");
      
      }
      System.out.println(list.toString());
      
   }
   

   



public static void Minus() {
      
      Scanner sc = new Scanner(System.in);
      List list = new ArrayList();
      
      System.out.println("처음 수를 입력해주세요");
      int sum = Integer.parseInt(sc.nextLine());
      System.out.println("000 을 입력하면 종료합니다");
      
      while (true) {
         
         System.out.println("뺄 수를 입력해주세요 : ");
         int num = Integer.parseInt(sc.nextLine());
         list.add(num);
         sum -= num;
         
         if (num == 000) {
            break;
         }
   
      System.out.println(sum);
      System.out.println("");
         
      }
      
   }
   
   public static void Multi () {
      
      Scanner sc = new Scanner(System.in);
      List list = new ArrayList();
      
      System.out.println("처음 수를 입력해주세요");
      int sum = Integer.parseInt(sc.nextLine());
      System.out.println("000 을 입력하면 종료합니다");
      
      while (true) {
         
         System.out.println("곱할 수를 입력해주세요 : ");
         int num = Integer.parseInt(sc.nextLine());
         list.add(num);
         sum *= num;
         
         if (num == 000) {
            break;
         }
   
      System.out.println(sum);
      System.out.println("");
         
      }
      
   }
   
   public static void Div () {
      
      Scanner sc = new Scanner(System.in);
      List list = new ArrayList();
      
      System.out.println("처음 수를 입력해주세요");
      float sum = sc.nextFloat();
      System.out.println("000 을 입력하면 종료합니다");
      
      while (true) {
         
         System.out.println("뺄 수를 입력해주세요 : ");
         float num = sc.nextFloat();
         list.add(num);
         sum /= num;
         
         if (num == 000) {
            break;
         }
   
      System.out.println(sum);
      System.out.println("");
         
      }
      
   }
   
}