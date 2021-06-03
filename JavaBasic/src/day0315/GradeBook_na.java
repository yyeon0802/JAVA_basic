package day0315;

// 입력과 출력을 메소드로 분리해서
// 6명의 학생을 관리하는 프로그램을 작성하시오

import java.util.Scanner;

import util.ArrayUtil;
import util.ScannerUtil;
public class GradeBook_na {
    //static final int SIZE_STUDENT = 6;
    static final int SCORE_MAX = 100;
    static final int SCORE_MIN = 1;
    static final int SIZE_SUBJECT = 3;
    static final int INDEX_KOREAN = 0;
    static final int INDEX_ENGLISH = 1;
    static final int INDEX_MATH = 2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idArray = new int[0];
        String[] nameArray = new String[0];
        int[]scoreArray = new int [0];
        int[][]scoresArray = new int[0][3];
        
        int index = 0;
        while (true) {
            System.out.println("1. 학생 정보 입력");
            System.out.println("2. 출력");
            System.out.println("3. 종료");
            int userChoice = ScannerUtil.nextInt(scanner, "메뉴");

            if (userChoice == 1) {
                insert(scanner, index, idArray, nameArray);
                //insert(scanner, scoreArray);
                index++;
            } else if (userChoice == 2) {
                if (index == 0) {
                    System.out.println("아직 저장된 정보가 없어 출력 불가합니다.");
                    
                }else {
                    //print(index, idArray, nameArray, scoreArrays);
                } 
            }else if (userChoice == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
      }
        scanner.close();
        
    }
    
    // GradeBook02  입력 메소드 정답
    public static void insert(Scanner scanner, int index, int[] idArray, String[] nameArray) {
        
        int id = ScannerUtil.nextInt(scanner, "번호(id)를 입력하세요.");
        ArrayUtil.add(idArray, index, id);
        
        String name = ScannerUtil.nextLine(scanner, "이름을 입력하세요.");
        ArrayUtil.add(nameArray, index, name);
        
        
    }
    
    public static int[] insertScore(Scanner scanner, int[] scoreArray) {
        /*int korean = ScannerUtil.nextInt(scanner, "국어 점수를 입력하세요." , SCORE_MIN , SCORE_MAX);
        ArrayUtil.add(scoreArray, 0, korean);
        int english = ScannerUtil.nextInt(scanner, "영어 점수를 입력하세요." , SCORE_MIN , SCORE_MAX);
        ArrayUtil.add(scoreArray, 1, english);
        int math = ScannerUtil.nextInt(scanner, "수학 점수를 입력하세요." , SCORE_MIN , SCORE_MAX);
        ArrayUtil.add(scoreArray, 2, math);*/
        
        for (int i = 0; i < scoreArray.length; i++) {
            if ( i == 0 ) {
                int korean = ScannerUtil.nextInt(scanner, "국어 점수를 입력하세요." , SCORE_MIN , SCORE_MAX);
                ArrayUtil.add(scoreArray, korean);
            } else if ( i == 1 ) {
                int english = ScannerUtil.nextInt(scanner, "영어 점수를 입력하세요." , SCORE_MIN , SCORE_MAX);
                ArrayUtil.add(scoreArray, english);
            } else if ( i == 2 ) {
                int math = ScannerUtil.nextInt(scanner, "수학 점수를 입력하세요." , SCORE_MIN , SCORE_MAX);
                ArrayUtil.add(scoreArray, math);
            }
        }
        
        return scoreArray;        
    }
    
    // GradeBook02  출력 메소드 정답
    public static void print(int index, int[] idArray, String[] nameArray, int[][] scoreArrays) {
        for (int i = 0; i < index; i++) {
            System.out.printf("번호 : %03d번 이름 : %s\n", idArray[i], nameArray[i]);
            System.out.printf("국어 : %03d점 영어 : %03d점 수학 : %03d점\n", scoreArrays[i][INDEX_KOREAN],
                    scoreArrays[i][INDEX_ENGLISH], scoreArrays[i][INDEX_MATH]);
            int sum = scoreArrays[i][INDEX_KOREAN] + scoreArrays[i][INDEX_ENGLISH] + scoreArrays[i][INDEX_MATH];
            double average = (double) sum / SIZE_SUBJECT;
            System.out.printf("총점 : %03d점 평균 : %06.2f점\n", sum, average);
        }
    }
    
}
