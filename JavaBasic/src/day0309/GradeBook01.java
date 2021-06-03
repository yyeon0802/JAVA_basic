package day0309;
// 학생 관리 프로그램
// 5명의 학생을 관리하는 프로그램을 작성하시오.

// 단, 모두 변수로 만드는 것이 아니라
// 번호 배열, 이름 배열, 국어점수 배열, 영어점수 배열, 수학점수 배열
// 로 만들어서
// 각 배열의 같은 인덱스는 같은 학생의 정보가 될 수 있도록 하시오.
// 또한 메뉴를 만들어
// 입력, 출력, 종료를 분리하고
// 입력시에는 0번, 1번, 2번,,,순서대로 들어갈 수 있게 만드시오.
// 입력시에 잘못된 점수는 입력되지 않도록 만들어라.


// 심화단계 : 출력시, 만약 입력학생이 없으면 
//          "입력된 학생이 없습니다." 라고 출력되고
//          입력되지 않은 칸의 정보는 출력되지 않도록 프로그램을 작성하시오.


import java.util.Scanner;
public class GradeBook01 {
    static final int DATA_SIZE = 5;
    static final int MIN_SIZE = 0;
    static final int MAX_SIZE = 100;
    static final int SUBJECTS = 3;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] id = new int[DATA_SIZE];
        String[] name = new String[DATA_SIZE];
        int[] korean = new int[DATA_SIZE];
        int[] english = new int[DATA_SIZE];
        int[] math = new int[DATA_SIZE];

        int userInput = 0;
        int idx = 0;

        while (true) {
            System.out.println();
            System.out.println(">>> 학생 관리 프로그램 <<<");
            System.out.println("1. 정보입력");
            System.out.println("2. 출력");
            System.out.println("3. 종료");
            System.out.print(">  ");
            int select = scanner.nextInt();

            boolean check = true;
        
            if (select == 1) {
                if (idx == 5) {
                    System.out.println("더이상 저장할 수 없습니다.");
                } else {
                    
                    while ( check ) {
                        
                        System.out.print("a) 번호(id)입력 : ");
                        userInput = scanner.nextInt();
                        
                        int checkId = 0;
                        for( int i = 0; i < idx; i++) {
                            if( userInput == id[i] ) {
                                checkId = -1;
                            }
                        }
                    
                        if (userInput < MIN_SIZE || userInput > MAX_SIZE || checkId == -1) {
                            System.out.println("중복이거나 잘못된 번호 입니다. 확인하세요.");
                        } else {                    
                            id[idx] = userInput;
                            check = false;
                        }
                    }
                    
                    System.out.print("b) 이름입력 : ");
                    scanner.nextLine();
                    String nameInput = scanner.nextLine();
                    
                    name[idx] = nameInput;
                    
                    int cnt = 0;
                    while ( cnt < SUBJECTS ) {
                        
                        if ( cnt == 0 ) {
                            System.out.print("c-1) 국어 점수 입력 : ");
                        }else if ( cnt == 1 ) {
                            System.out.print("c-2) 영어 점수 입력 : ");
                        }else if ( cnt == 2 ) {
                            System.out.print("c-3) 수학 점수 입력 : ");
                        }

                        userInput = scanner.nextInt();
                    
                        if (userInput < MIN_SIZE || userInput > MAX_SIZE ) {
                            System.out.println("잘못된 점수 입니다. 확인하세요.");
                        } else { 
                            if ( cnt == 0 ) {
                                korean[idx] = userInput;
                            }else if ( cnt == 1 ) {
                                english[idx] = userInput;
                            }else if ( cnt == 2 ) {
                                math[idx] = userInput;
                            }
                            cnt++;
                        }
                    }
                    idx++;

                    System.out.println(">> 정보 저장 완료");
                }

            } else if (select == 2) {
                if (idx == 0) {
                    System.out.println();
                    System.out.println(">> 입력 된 학생 정보가 없어 출력할 수 없습니다.");
                } else {
                    System.out.println();

                    for (int i = 0; i < idx; i++) {
                        System.out.printf("번호 : [%03d]번 // 이름 : [%s]\n 국어 : [%03d]점 // 영어 : [%03d]점 // 수학 : [%03d] 점\n", 
                                id[i] , name[i] , korean[i] , english[i] , math[i]);
                        System.out.println("-----------------------------------------------------------");
                        System.out.println();
                    }
                }

            } else if (select == 3) {
                System.out.println();
                System.out.println(">>프로그램을 종료합니다.");
                break;
            }

        }

        scanner.close();
    }

    
}
