package test;

public class Calculator {
   
   public int minNumberOf(int first, int second) {
      return(first > second)? second : first;
   }
   
   public int maxNumberOf(int first, int second) {
      return (first > second)?  first : second ;
      }
   
   public int plusTwoNumbers(int first , int second) {
         return first + second;
      }
   public int minusTowNumbers(int first, int second) {
      return first - second;
   }
   public int multipleTowNumber(int first, int second) {
      return first * second;
   }
   public int divideTowNumber(int first, int second) {
      return first / second;
   }
}