package day0312;
// 6명의 학생을 관리하는 프로그램을 작성하시오

// 단 입력 부분은 ScannerUtil을 사용하시오

import java.util.Scanner;
import util.ScannerUtil;

public class GradeBook01Answer {
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
            System.out.println();
            System.out.println("1.입력 2.출력 3.종료 ");
            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                if ( index < SIZE_STUDENT ) {
                    // 번호 입력
                    idArray[index] = ScannerUtil.nextInt(scanner, "번호를 입력해 주세요.");
                    
                    // 이름
                    nameArray[index] = ScannerUtil.nextLine(scanner, "이름을 입력해 주세요.");
                    
                    // 국어 
                    scoreArrays[index][INDEX_KOREAN] = ScannerUtil.nextInt(scanner, "국어점수를 입력하세요.", SCORE_MIN, SCORE_MAX);
                    // 영어
                    scoreArrays[index][INDEX_ENGLISH] = ScannerUtil.nextInt(scanner, "영어점수를 입력하세요.", SCORE_MIN, SCORE_MAX);
                    
                    // 수학
                    scoreArrays[index][INDEX_MATH] = ScannerUtil.nextInt(scanner, "수학점수를 입력하세요.", SCORE_MIN, SCORE_MAX);

                    index++;
                    System.out.println("정보를 저장 했습니다.");
                }else {
                    System.out.println("더이상 입력할 수 없습니다.");
                }
                
            } else if (userChoice == 2) {
                if( index > 0 ) {
                    // 정보 출력
                    for (int i = 0; i < index; i++ ) {
                        System.out.printf("번호 : %03d번 이름 : %s\n" , idArray[i], nameArray[i]);
                        System.out.printf("국어 : %03d점 영어 : %03d점 수학 : %03d점\n" , scoreArrays[i][INDEX_KOREAN], scoreArrays[i][INDEX_ENGLISH] , scoreArrays[i][INDEX_MATH]);
                        int sum = scoreArrays[i][INDEX_KOREAN] + scoreArrays[i][INDEX_ENGLISH] + scoreArrays[i][INDEX_MATH];
                        double average = (double) sum / SIZE_SUBJECT;
                        System.out.printf("총점 : %03d점 평균 : %06.2f점\n" , sum , average);
                    }
                    
                }else {
                     System.out.println("아직 입력된 정보가 존재 X");
                }
               
            }else if (userChoice == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
      }
        scanner.close();
    }
}