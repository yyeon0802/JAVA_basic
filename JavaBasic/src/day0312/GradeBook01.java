package day0312;
// 6명의 학생을 관리하는 프로그램을 작성하시오

// 단 입력 부분은 ScannerUtil을 사용하시오

import java.util.Scanner;
import util.ScannerUtil;

public class GradeBook01 {
    static final int STUDENTS = 6;
    static final int SCORE_MAX = 100;
    static final int SCORE_MIN = 1;
    static final int SUBJECTS = 3;
    static final int INDEX_KOREAN = 0;
    static final int INDEX_ENGLISH = 1;
    static final int INDEX_MATH = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idArray = new int[STUDENTS];
        String[] nameArray = new String[STUDENTS];
        int[][] scoreArrays = new int [STUDENTS][SUBJECTS];
        
        int index = 0;
        while (true) {
            System.out.println("1. 학생 정보 입력");
            System.out.println("2. 출력");
            System.out.println("3. 종료");
            int userChoice = ScannerUtil.nextInt(scanner, "메뉴");

            if (userChoice == 1) {
                if ( !(index < STUDENTS) ) {
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
                    for (int i = 0; i < index; i++ ) {
                        System.out.printf("번호 : %03d번 이름 : %s\n" , idArray[i], nameArray[i]);
                        System.out.printf("국어 : %03d점 영어 : %03d점 수학 : %03d점\n" , scoreArrays[i][INDEX_KOREAN], scoreArrays[i][INDEX_ENGLISH] , scoreArrays[i][INDEX_MATH]);
                        int sum = scoreArrays[i][INDEX_KOREAN] + scoreArrays[i][INDEX_ENGLISH] + scoreArrays[i][INDEX_MATH];
                        double average = (double)sum / SUBJECTS;
                        System.out.printf("총점 : %03d점 평균 : %06.2f점\n" , sum , average);
                    }
                } 
            }else if (userChoice == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
      }
        scanner.close();
    }
}