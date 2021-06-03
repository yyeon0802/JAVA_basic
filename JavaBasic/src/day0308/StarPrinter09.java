package day0308;


import java.util.Scanner;
public class StarPrinter09 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("출력할 줄 수를 입력하세요 : ");
        System.out.print("(5) >  ");
        int userNumber = scanner.nextInt();
        
        System.out.println();
        
        for ( int i = 1; i <= 2 * userNumber - 1; i++) {
            String stars = new String();
            if ( i < userNumber ) {
                for (int j = i; j <= userNumber - 1; j++) {
                    stars += " ";
                }
                for ( int j = 1; j <= 2 * i - 1; j++) {
                    stars += "*";
                }
            }else { // i =5 6 7.. 
                for (int j = 1; j <= i - userNumber; j++) {
                    stars += " ";
                }
                int lowerI = 2 * userNumber - i; // 변해야한다
                for ( int j = 1; j <= 2 * lowerI - 1; j++) {
                    stars += "*"; // 아래부분도 위의 식과 비슷한 형식으로 가야한다
                }
            }
            
            System.out.println(stars);
        }
        scanner.close();
 
    }
}
