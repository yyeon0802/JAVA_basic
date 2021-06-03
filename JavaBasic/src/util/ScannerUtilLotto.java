package util;

//우리가 Scanner의 메소드를 사용할때

//좀 더 편리하게 사용할 수 있는 메소드를 우리가 구현해 놓은 
//클래스

import java.util.Scanner;

public class ScannerUtilLotto {

 
 public static String nextLine(Scanner scanner, String message) {
     System.out.println(message);
     System.out.print(">  ");

     String str = new String(scanner.nextLine());


     if (str.isEmpty()) {
         str = new String(scanner.nextLine());
     }

     return str;
 }

 public static int nextInt(Scanner scanner) {
     
     System.out.print(">  ");
     return scanner.nextInt();
 }


 public static int nextInt(Scanner scanner, int min, int max) {

     int number = nextInt(scanner);

     while (!(number >= min && number <= max)) {
         System.out.println("잘못 입력하셨습니다. (1 ~ 45) 다시 입력하세요.");
         number = nextInt(scanner);
     }

     return number;
 }

}
