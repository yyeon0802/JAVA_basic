package day0309;

import java.util.Scanner;
public class zzzz {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int maxSize = 5;
        int[] id = new int[maxSize];
        
        int cnt = 0;
        int idx = 0;
        while ( true ) {
            System.out.println("ㅇㅇㅇ : ");
            int num = scanner.nextInt();
            
            if (cnt == maxSize ) {
                System.out.println("더이상 저장할수 X");
                break;
            }
            
            if (cnt == 0) {
                
                id[0] = num;
                cnt++;
            }else {
               id[cnt] = num;
               cnt++;
               
            }
            
        }
        
        
        for ( int i = 0; i < id.length; i++) {
            
            System.out.print(id[i] + " ");
        }
    }
}
