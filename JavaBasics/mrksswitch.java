package JavaBasics;
import java.util.Scanner;

public class mrksswitch {
   
   public static String findGrade(int score) {
     
      if(score < 0 || score > 100)
         return "Invalid score"; 
      
       switch(score/10) {
        
        case 10:
        case 9:
           return "A";
        
        case 8:
           return "B";
        
        case 7:
           return "C";
        
        case 6:
           return "D";
        
        case 5:
           return "E";
        
        default:
           return "F";
      }
   }

   public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      
      
      System.out.print("Enter score value: ");
      int score = scan.nextInt();
      
     
      System.out.println("Grade = " + findGrade(score));
      
   
      scan.close();
   }

}
