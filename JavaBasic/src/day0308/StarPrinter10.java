package day0308;


import java.util.Scanner;
public class StarPrinter10 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("출력할 줄 수를 입력하세요 : ");
        System.out.print("(5) >  ");
        int userNumber = scanner.nextInt();
        System.out.println();
        
        /*
        int n = userNumber + (userNumber-1);
        int m = 1;
        
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        
        
        //공백만큼 거꾸로 별 + 가운데마름모 + 거꾸로 별
        for ( int i = 1; i < userNumber; i++) {
            String stars = new String();
            for ( int j = userNumber-1; j >= i; j--) {
                stars += "*";
            }
            for ( int k = 1; k <= m; k++) {
                stars += " ";
            }
            for ( int l = userNumber-1; l >= i; l--) {
                stars += "*";
            }
            m+=2;
            System.out.println(stars);
        }
        
        m = n-3;
        for ( int i = 2; i < userNumber; i++) {
            String stars = new String();
            for (int j = 1; j <= i; j++) {
                stars += "*";
            }
            for (int k = m; k >= i; k--) {
                stars += " ";
            }
            for (int l = 1; l <= i; l++) {
                stars += "*";
            }
            m--;
            System.out.println(stars);
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        */
        int MAX_SIZE = 2 * userNumber - 1;
        
        
        System.out.println();
        scanner.close();
 
    }
}
