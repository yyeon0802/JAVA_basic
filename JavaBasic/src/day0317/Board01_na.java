package day0317;
// 게시판 프로그램

// 게시글에는 제목, 작성자, 내용 의 내용이 있다.
// 이 프로그램은 총 6개ㄴ 게시글을 관리 할 수 있다.
// 단, 중복된 제목의 글은 작성할 수 없다.
// 또한 입력과 출력은 분리되어 있다.

// 입력 

import java.util.Scanner;
import util.ScannerUtil;
import java.util.ArrayList;
public class Board01_na {
    private static ArrayList<Board_na> boardList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
      
       showMenu();
   
   }
        
    public static void showMenu() {
        while(true) {
            System.out.println();
            String message = new String("1. 게시물 등록 2. 게시판 목록 보기 3. 종료 하기");
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
            if(userChoice == 1) {
                // 등록 메소드
                insert();
            }else if (userChoice == 2) {
                // 등록한 글 목록 보기 메소드
                showBoard();
            }else if (userChoice == 3) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }
        }
    }
    
    public static void insert() {
        System.out.println();
        Board_na b = new Board_na();
        
        String message = new String("작성자 입력");
        b.setWriter(ScannerUtil.nextLine(scanner, message));
        
        message = new String("제목 입력");
        b.setTitle(ScannerUtil.nextLine(scanner, message));

        message = new String("내용 입력");
        b.setContent(ScannerUtil.nextLine(scanner, message));
        
        boardList.add(b);
    }
    
    //여기 while 잘 break 어떻게 넣어야하는지 생각
    public static void showBoard() {
      while(true) {  
        if(boardList.size() == 0) {
            System.out.println();
            System.out.println("등록된 글이 없습니다.");
            System.out.println();
            break;
        }
        
        
        for (int i = 0; i < boardList.size(); i++) {
            System.out.printf("%d. < %s > 작성자 : %s님 \n" , 
                    i + 1, boardList.get(i).getTitle(), boardList.get(i).getWriter());
        }
        
        System.out.println();
        String message = new String("열람할 게시글의 번호를 입력하세요  (0. 뒤로가기) ");
        int userChoice = ScannerUtil.nextInt(scanner, message, 0, boardList.size()) - 1;
        if (userChoice >= 0 ) {
            //해당인덱스 내용 보여주기
            showContent(userChoice);
        }else {
            System.out.println("첫 메뉴로 갑니다.");
            break;
        }
        
      }
    }
    
    public static void showContent(int index) {
        boardList.get(index).showContent();
        System.out.println();
        String message = new String("1. 수정하기 2. 삭제하기 0. 뒤로가기");
        int userChoice = ScannerUtil.nextInt(scanner, message);
        if (userChoice == 1) {
            modify(index);
        }else if (userChoice == 2) {
            delete(index);
            
        }
        
    }
    
    public static void modify(int index) {
        
        String message = new String("작성자를 입력하세요");
        String writer = new String(ScannerUtil.nextLine(scanner, message));
        if (writer.equalsIgnoreCase(boardList.get(index).getWriter())) {
            message = new String("수정할 제목을 입력하세요.");
            boardList.get(index).setTitle(ScannerUtil.nextLine(scanner, message));
            
            message = new String("수정할 내용을 입력하세요.");
            boardList.get(index).setContent(ScannerUtil.nextLine(scanner, message));
        }else {
            System.out.println();
            System.out.println("작성자가 일치하지 않습니다.");
            showContent(index);
        }
    }
    
    public static void delete(int index) {
        String message = new String("작성자를 입력하세요");
        String writer = new String(ScannerUtil.nextLine(scanner, message));
        if (writer.equalsIgnoreCase(boardList.get(index).getWriter())) {
            boardList.remove(index);
        }else {
            System.out.println();
            System.out.println("작성자가 일치하지 않습니다.");
            System.out.println();
            showContent(index);
        }
    }
    
}
