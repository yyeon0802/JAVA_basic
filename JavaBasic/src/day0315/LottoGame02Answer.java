package day0315;
// ArrayUtil을 사용한 로또 게임

import java.util.Scanner;

import util.ArrayUtil;
import util.ScannerUtil;

import java.util.Random;
public class LottoGame02Answer {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
       // 1. 컴퓨터에 숫자 넣기
       //   a. 컴퓨터 숫자 배열 선언과 초기화
       int[] computerNumbers = new int[0];
       
       //   b. 메소드를 통해 해당 배열에 중복되지 않는 랜덤 숫자넣기
       computerNumbers = addRandomNumber(computerNumbers);
       
       //   c. 메소드를 통해 해당 배열 정렬
       sort(computerNumbers);
       
       // 2. 사용자로부터 몇게임 할지 입력 받아서
       //    총 게임 수와 그리고 해당 게임에 자동 vs 수동 결정하기
       //   a. 총 게임 수 입력받기
       int gameNumber = ScannerUtil.nextInt(scanner, "총 게임 수 : ");
       //   b. 2차원 배열 선언
       int[][] userNumbers = new int[gameNumber][0];
       //   c. 2차원 배열 for문으로 돌아다니면서
       //       자동 수동을 각각 입력 받아 결정
       for ( int i = 0; i < userNumbers.length; i++) {
           System.out.println((i + 1) + "번 게임");
           int userChoice = ScannerUtil.nextInt(scanner, "1. 자동 2. 수동", 1, 2);
           if ( userChoice == 1 ) {
               userNumbers[i] = addRandomNumber(userNumbers[i]);
           }else if ( userChoice == 2) {
               userNumbers[i] = insert(userNumbers[i] , scanner);
           }
           //   d. 정렬
           sort(userNumbers[i]);
       }

       // 3. 결과 보기

       System.out.print("컴퓨터 숫자 : ");
       print(computerNumbers);
       System.out.println();
       
       System.out.println("사용자 숫자");
       for ( int i = 0; i < userNumbers.length; i++) {
           System.out.println( (i + 1) + "번 게임 : ");
           print(userNumbers[i]);
           int count = compare(userNumbers[i], computerNumbers);
           System.out.println(", 맞은 갯수 : " + count + "개, ");
           if (count >= 2) {
               System.out.println("등수 : " + (6 - count + 1) + "등");
           } else {
               System.out.println("등수 : 등외");
           }
               
       }
       
       scanner.close();
    }
    
    // 랜덤 숫자 넣어주는 메소드
    public static int[] addRandomNumber(int[] numbers) {
        Random random = new Random();
        while(ArrayUtil.size(numbers) < 6 ) {
            int number = random.nextInt(45) + 1;
            if(!ArrayUtil.contains(numbers, number)) {
                numbers = ArrayUtil.add(numbers, number);
            }
        }
        
        return numbers;
    }
    // 배열을 정렬해주는 메소드
    public static void sort(int[] numbers) {
        for ( int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] > numbers[i + 1]) {
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
                i = -1;
            }
        }
    }
    
    // 수동으로 숫자를 넣는 메소드
    public static int[] insert(int[] numbers, Scanner scanner) {
        while(ArrayUtil.size(numbers) < 6 ) {
            System.out.println( (ArrayUtil.size(numbers) + 1) + "번 숫자");
            int number = ScannerUtil.nextInt(scanner, "숫자를 입력해주세요", 1, 45);
            
            if ( !ArrayUtil.contains(numbers, number) ) {
                numbers = ArrayUtil.add(numbers, number);
            } else {
                System.out.println("이미 중복된 숫자 입니다.");
            }
        }
        
        return numbers;
    }
    
    // 배열을 출력하는 print() 메소드
    public static void print(int[] array) {
        System.out.print("[");
        for ( int i = 0; i < array.length; i++) {
            System.out.printf("%d" , array[i]);
            if ( i != array.length - 1 ) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    // 2개의 배열을 비교해서 같은 숫자가 몇개인지 찾아주는 메소드
    public static int compare(int[] array1, int[]array2) {
        int count = 0;
        for ( int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if( array1[i] == array2[j]) {
                    count++;
                }
            }
        }
        return count;
    }
    
    
}
