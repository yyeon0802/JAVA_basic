package day0310;
// 게시판 프로그램

// 게시글에는 제목, 작성자, 내용 의 내용이 있다.
// 이 프로그램은 총 6개ㄴ 게시글을 관리 할 수 있다.
// 단, 중복된 제목의 글은 작성할 수 없다.
// 또한 입력과 출력은 분리되어 있다.

// 입력 

import java.util.Scanner;

public class Board01 {
    static final int BOARD_SIZE = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[BOARD_SIZE];
        String[] subjects = new String[BOARD_SIZE];
        String[] memo = new String[BOARD_SIZE];

        int count = 0;
        int index = 0;
        while (true) {
            System.out.println();
            System.out.println(">>>>>>> 게시판 <<<<<<<");
            System.out.println("1. 글 등록");
            System.out.println("2. 게시판 출력");
            System.out.println("3. 게시판 종료");
            System.out.print(">   ");
            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                // 작성자 등록
                if (count < BOARD_SIZE ) {
                    System.out.println("작성자 입력  ");
                    System.out.print(">   ");
                    scanner.nextLine();
                    names[count] = scanner.nextLine();
                    
                    System.out.println("제목 입력  ");
                    System.out.print(">   ");
                    String userSubject = scanner.nextLine();
                    
                    boolean subjectsCheck = true;
                    while (subjectsCheck) {
                        int check = 0;
                        for ( int i = 0; i < count; i++ ) {
                            if ( userSubject.equals(subjects[i]) ) {
                                check = -1;
                                break;                                 
                            }else {
                                check = 0;
                            }
                        }
                        
                        if (check == -1) {
                            subjectsCheck = true;
                            System.out.println("중복된 제목입니다.");
                            System.out.println("제목 입력  ");
                            System.out.print(">   ");
                            userSubject = scanner.nextLine();
                        }else {
                            subjects[count] = userSubject;
                            subjectsCheck = false;
                        }
                    }
                    
                    System.out.println("내용 입력  ");
                    System.out.print(">   ");
                    memo[count] = scanner.nextLine();               
                    count++;
                    
                }else {
                    System.out.println("더이상 등록 할 수 없습니다.");                    
                }                              
                
            } else if (userChoice == 2) {
                for ( int i = 0; i < count; i++ ) {
                    System.out.printf("작성자 : [%s] 제목 : [%s]\n 내용 : [%s]\n" , names[i] , subjects[i] , memo[i]);
                }

            } else if (userChoice == 3) {
                System.out.println(">> 게시판을 종료합니다.");
                break;
            } 
        }

        scanner.close();
    }
}
