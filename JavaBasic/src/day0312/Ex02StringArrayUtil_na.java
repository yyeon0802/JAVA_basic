package day0312;
// ArrayUtil의 메소드를 실습해보는클래스

import java.util.Scanner;
import util.StringArrayUtil;
public class Ex02StringArrayUtil_na {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String[] arr = {"가", "나", "다"};
        
        System.out.println(StringArrayUtil.size(arr));
        
        arr = StringArrayUtil.add(arr, "홍");
        
        for (int i = 0; i < StringArrayUtil.size(arr); i++) {
            System.out.print(arr[i] + " ");
        }


        
        
    }

}
