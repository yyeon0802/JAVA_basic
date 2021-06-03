package day0308;


import java.util.Scanner;
public class StarPrinter03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("출력할 줄 수를 입력하세요 : ");
        System.out.print("(5) >  ");
        int userNumber = scanner.nextInt();
        
        System.out.println();
        for (int i = 1; i <= userNumber; i++) {
            String stars = new String();
            for(int j = 1; j <= i - 1; j++) { // 나는 j < i,,,,
                stars += " ";
            }
            for (int j = i; j <= userNumber; j++) {
                stars += "*";
            }
            
            System.out.println(stars);
        }
        
        scanner.close();
 
    }
}
