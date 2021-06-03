package day0312;

// 입력과 출력을 메소드로 분리해서
// 6명의 학생을 관리하는 프로그램을 작성하시오

import java.util.Scanner;
import util.ScannerUtil;
public class GradeBook02 {
    static final int SIZE_STUDENT = 6;
    static final int SCORE_MAX = 100;
    static final int SCORE_MIN = 1;
    static final int SIZE_SUBJECT = 3;
    static final int INDEX_KOREAN = 0;
    static final int INDEX_ENGLISH = 1;
    static final int INDEX_MATH = 2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idArray = new int[SIZE_STUDENT];
        String[] nameArray = new String[SIZE_STUDENT];
        int[][] scoreArrays = new int [SIZE_STUDENT][SIZE_SUBJECT];
        
        int index = 0;
        while (true) {
            System.out.println("1. 학생 정보 입력");
            System.out.println("2. 출력");
            System.out.println("3. 종료");
            int userChoice = ScannerUtil.nextInt(scanner, "메뉴");

            if (userChoice == 1) {
                if ( !(index < SIZE_STUDENT) ) {
                    System.out.println("더이상 입력할 수 없습니다.");
                } else {
                    int id = ScannerUtil.nextInt(scanner, "번호(id)를 입력하세요.");
                    idArray[index] = id;
                    
                    String name = ScannerUtil.nextLine(scanner, "이름을 입력하세요.");
                    nameArray[index] = name;
                    
                    int korean = ScannerUtil.nextInt(scanner, "국어 점수를 입력하세요." , SCORE_MIN , SCORE_MAX);
                    scoreArrays[index][INDEX_KOREAN] = korean;
                    
                    int english = ScannerUtil.nextInt(scanner, "영어 점수를 입력하세요." , SCORE_MIN , SCORE_MAX);
                    scoreArrays[index][INDEX_ENGLISH] = english;
                    
                    int math = ScannerUtil.nextInt(scanner, "수학 점수를 입력하세요." , SCORE_MIN , SCORE_MAX);
                    scoreArrays[index][INDEX_MATH] = math;
                    
                    System.out.println(">> 정보 저장 완료");
                    index++;
                }
            } else if (userChoice == 2) {
                if (index == 0) {
                    System.out.println("아직 저장된 정보가 없어 출력 불가합니다.");
                    
                }else {
                    ScannerUtil.print(index, idArray, nameArray, scoreArrays, INDEX_KOREAN, INDEX_ENGLISH, INDEX_MATH, SIZE_SUBJECT);
                } 
            }else if (userChoice == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
      }
        scanner.close();
        
    }
}
