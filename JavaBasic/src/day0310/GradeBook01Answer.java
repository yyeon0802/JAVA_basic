package day0310;

import java.util.Scanner;
public class GradeBook01Answer {
    static final int STUDENT_SIZE = 5;
    static final int SUBJECT_SIZE = 5;
    static final int SCORE_MIN = 0;
    static final int SCORE_MAX = 100;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 정보를 담을 배열들을 만들어준다.
        
        // 번호를 담을  idArray
        int[] idArray = new int[STUDENT_SIZE];
        // 이름을 담을 nameArray
        String[] nameArray = new String[STUDENT_SIZE];
        // 국어 점수를 담을 koreanArray
        int[] koreanArray = new int[STUDENT_SIZE];
        // 영어 점수를 담을 englishArray
        int[] englishArray = new int[STUDENT_SIZE];
        // 수학 점수를 담을 mathArray
        int[] mathArray = new int[STUDENT_SIZE];
        
        // 지금 현재 입력할 인덱스를 저장한 int idx
        int idx = 0;
        
        while ( true ) {
            System.out.println();
            System.out.println("1. 입력 2. 출력 3. 종료");
            System.out.print(">  ");
            int userChoice = scanner.nextInt();
            
            if ( userChoice == 1 ) {
                // idx 칸에 각 정보를 입력한다.
                
                // 먼저 우리가 5명 미만을 입력했을 경우
                // idx 칸에 입력한다.
                
                // 만약 우리가 5명을 입력했으면 더이상
                // 입력이 안되게 막는다.
                
                 if ( idx < STUDENT_SIZE ) {
                     // 아직 5명  미만이 입력 되었으므로
                     // 입력 가능
                     
                     // 번호 입력
                     System.out.println("번호");
                     System.out.print(">  ");
                     idArray[idx] = scanner.nextInt();
                            
                     // 이름 입력
                     System.out.println("이름");
                     System.out.print(">  ");
                     scanner.nextLine();
                     nameArray[idx] = new String(scanner.nextLine());
                     
                     // 국어 입력
                     System.out.println("국어 점수");
                     System.out.print(">  ");
                     koreanArray[idx] = scanner.nextInt();
                     
                     // 국어 입력 검증
                     while( !(koreanArray[idx] >= SCORE_MIN && koreanArray[idx] <= SCORE_MAX) ) {
                         System.out.println("잘못 입력 하셨습니다.");
                         System.out.println("국어");
                         System.out.println("> ");
                         koreanArray[idx] = scanner.nextInt();
                     }
                     
                     
                     // 영어 입력
                     System.out.println("영어 점수");
                     System.out.print(">  ");
                     englishArray[idx] = scanner.nextInt();
                     
                     // 영어 입력 검증
                     while( !(englishArray[idx] >= SCORE_MIN && englishArray[idx] <= SCORE_MAX) ) {
                         System.out.println("잘못 입력 하셨습니다.");
                         System.out.println("국어");
                         System.out.println("> ");
                         englishArray[idx] = scanner.nextInt();
                     }
                     
                     // 수학 입력
                     System.out.println("수학 점수");
                     System.out.print(">  ");
                     mathArray[idx] = scanner.nextInt();
                     
                     // 수학 입력 검증
                     while( !(mathArray[idx] >= SCORE_MIN && mathArray[idx] <= SCORE_MAX) ) {
                         System.out.println("잘못 입력 하셨습니다.");
                         System.out.println("국어");
                         System.out.println("> ");
                         mathArray[idx] = scanner.nextInt();
                     }
                                          
                     // idx 값 증가
                     idx++;
                     
                 }else {
                     // 이미 우리가 5명을 다 입력했으므로
                     // 더이상 입력할 수 없다만 알려준다.
                     System.out.println("더이상 입력 하실 수 없습니다.");
                 }
                
                
            }else if ( userChoice == 2 ) {
                // 배열의 내용을 출력한다.
                if ( idx > 0 ) {
                    // 한 명 이상이 입력되어 있다는 뜻
                    
                    // 그럴 경우에는 0번 idx부터 idx보다 작을때 까지 i for문을 사용하여
                    // 내용을 출력해 주면 된다.
                    for ( int i = 0; i < idx; i++ ) {
                        System.out.println();
                        System.out.println("=============== " + nameArray[i] + " 학생의 정보 ============= ");
                        
                        System.out.printf("반호 : %d번 이름 : %s \n", idArray[i], nameArray[i]);
                        System.out.printf("국어 : %03d점 영어 : %03d점 수학 ㅣ %03d점\n" , koreanArray[i] , englishArray[i] , mathArray[i]);
                        int sum = koreanArray[i] + englishArray[i] + mathArray[i];
                        double average = (double)sum / SUBJECT_SIZE;
                        System.out.printf("총점 : %03d점 평균 : %06.2f점 \n" , sum, average);
                        System.out.println("======================================== ");
                        System.out.println();
                    }
                    
                }else {
                    System.out.println();
                    System.out.println("아직 입력된 학생이 존재하지 않습니다.");
                    System.out.println();
                }
                
                
            }else if ( userChoice == 3) {
                // 메세지 출력 후 종료
                System.out.println("사용해 주셔서 감사합니다.");
                break;
            }
        }
        
        scanner.close();
    }
}
