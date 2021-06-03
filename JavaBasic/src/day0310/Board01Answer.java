package day0310;
// 게시판 프로그램

// 게시글에는 제목, 작성자, 내용 의 내용이 있다.
// 이 프로그램은 총 6개ㄴ 게시글을 관리 할 수 있다.
// 단, 중복된 제목의 글은 작성할 수 없다.
// 또한 입력과 출력은 분리되어 있다.

// 입력 

import java.util.Scanner;

public class Board01Answer {
    static final int SIZE = 6;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 제목을 담당하는 String 배열
        String[] titleArray = new String[SIZE];
        // 작성자를 담당하는 String 배열
        String[] writerArray = new String[SIZE];
        // 내용을 담당하는 String 배열
        String[] contentArray = new String[SIZE];
        // 현재 인덱스를 저장한 int index
        int index = 0;
        
        while (true) {
            System.out.println("1. 입력 2. 출력 3. 종료");;
            System.out.print(">  ");
            int userChoice = scanner.nextInt();
            
            if (userChoice == 1 ) {
                // 글작성
                if ( index < SIZE ) {
                    // 제목을 입력받는다 단, 기존 칸에 있는 제몯글과 비교하여 이미 있는 제목이면
                    // 중복이 아닐때까지 입력받는다.
                    // 작성자 입력받고 내용 입력받은 후 idx++
                    scanner.nextLine();
                    System.out.println("제목");
                    System.out.print(">  ");
                    String title = new String(scanner.nextLine());
                    
                    //중복 체크
                    boolean titleChecker = true;
                    for ( int i = 0; i < index; i++) {
                        if(title.equals(titleArray[i])) {
                            titleChecker = false;
                            break;
                        }
                    }
                    
                    while (!(titleChecker)) {
                        System.out.println("중복된 제목은 사용하실 수 없습니다.");
                        System.out.println("제목");
                        System.out.print(">  ");
                        title = new String(scanner.nextLine());
                        titleChecker = true;//한번 더 검사하기 귀해
                        
                        for ( int i = 0; i < index; i++) {
                            if(title.equals(titleArray[i])) {
                                titleChecker = false;
                                break;
                            }
                        }
                    }
                   
                    titleArray[index] = new String(title);
                    
                    // 작성자를 입력 받는다.
                    System.out.println("작성자");
                    System.out.print(">   ");
                    writerArray[index] = new String(scanner.nextLine());
                    
                    //내용
                    System.out.println("내용");
                    System.out.print(">   ");
                    contentArray[index] = new String(scanner.nextLine());
                    
                    index++;
                }else {
                    // 글쓸 칸이 남아 있는지 체크해서 없을 시 경고 메시지만 출력
                    System.out.println("더이상 글을 작성하실 수 없습니다.");
                }  
                
            }else if (userChoice == 2) {
                if(index > 0 ) {
                    //작성된 글이 존재
                    for ( int i = 0; i < index; i++ ) {
                        System.out.println();
                        System.out.println("===============================================");
                        System.out.printf("제목 : %s 작성자 : %s\n" , titleArray[i], writerArray[i]);
                        System.out.println("===============================================");
                        System.out.println("-----------------------------------------------");
                        System.out.println("                내용                            ");
                        System.out.println("-----------------------------------------------");
                        System.out.printf(" %s\n" , contentArray[i]);
                        System.out.println("===============================================");
                    }
                }else {
                    // 글이 없으므로 경고 메세지만 출력
                    System.out.println("작성된 글이 존재하지 않습니다.");
                }
            }else if (userChoice == 3) {
                System.out.println("사용해 주셔서 감사합니다.");
                break;
            }
        }
        
        scanner.close();
    }
}
