package cgv_viewer;

import java.util.Scanner;

import cgv_model.UserDTO;
import util.ScannerUtil;

// 처음 메뉴
public class MainViewer {
    // 1. 회원 가입 SignIn();
    // 2. 로그인 LogIn();
    // 3. 종료

    private Scanner scanner;
    private UserViewer userViewer;
    private UserDTO mainLogIn;

    public MainViewer() {
        scanner = new Scanner(System.in);
        userViewer = new UserViewer();        
    }

    public void showIndex() {
        while (true) {
            String message = new String("1. 회원가입 2. 로그인 0. 종료");
            int userChoice = ScannerUtil.nextInt(scanner, message, 0, 2);

            // 회원가입
            if (userChoice == 1) {
                SignIn();

            } else if (userChoice == 2) {
                LogIn();

            } else if (userChoice == 0) {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }

    private void SignIn() {
        while (true) {
            String message = new String("1. 관람객 2. 평론가 3. 관리자 0.돌아가기");
            int userChoice = ScannerUtil.nextInt(scanner, message, 0, 3);
            if (userChoice == 0) {
                System.out.println("상위 메뉴로");
                break;
            } else {
                userViewer.register(userChoice);
            }
        }
    }

    private void LogIn() {
        while (true) {
            String message = new String("1. 관람객 2. 평론가 3. 관리자 0.돌아가기");
            int userChoice = ScannerUtil.nextInt(scanner, message, 0, 3);
            UserDTO temp = new UserDTO();
            if (userChoice == 1) {
                message = new String("[관람객 로그인] 아이디를 입력하세요.");
                temp.setUserId(ScannerUtil.nextLine(scanner, message));
                message = new String("[관람객 로그인] 비밀번호를 입력하세요.");
                temp.setUserPassword(ScannerUtil.nextLine(scanner, message));
                
                if(userViewer.logIn(temp) != null) {
                    mainLogIn = userViewer.logIn(temp);
                    if (mainLogIn.getGroup() == 1) {
                        System.out.println("관람회원> " + mainLogIn.getNickName() + "님 로그인 완료");
                    } else {
                        System.out.println("관람회원이 아닙니다.");
                    }
                } 
                
             // 관람객용 메인화면 보여주기

            } else if (userChoice == 2) {
                temp = new UserDTO();
            
                message = new String("[평론가 로그인] 아이디를 입력하세요.");
                temp.setUserId(ScannerUtil.nextLine(scanner, message));
                message = new String("[평론가 로그인] 비밀번호를 입력하세요.");
                temp.setUserPassword(ScannerUtil.nextLine(scanner, message));
                
                if(userViewer.logIn(temp) != null) {
                    mainLogIn = userViewer.logIn(temp);
                    if (mainLogIn.getGroup() == 2) {
                        System.out.println("평론가회원> " + mainLogIn.getNickName() + "님 로그인 완료");
                    } else {
                        System.out.println("평론가회원이 아닙니다.");
                    }
                }
                // 평론가용 메인화면 보여주기
            } else if (userChoice == 3) {
                temp = new UserDTO();
                
                message = new String("[관리자 로그인] 아이디를 입력하세요.");
                temp.setUserId(ScannerUtil.nextLine(scanner, message));
                message = new String("[관리자 로그인] 비밀번호를 입력하세요.");
                temp.setUserPassword(ScannerUtil.nextLine(scanner, message));
                
                if(userViewer.logIn(temp) != null) {
                    mainLogIn = userViewer.logIn(temp);
                    if (mainLogIn.getGroup() == 3) {
                        System.out.println("관리자> " + mainLogIn.getNickName() + "님 로그인 완료");
                    } else {
                        System.out.println("관리자회원이 아닙니다.");
                    }
                } 
                
                // 관리자용 메인화면 보여주기

            } else if (userChoice == 0) {
                System.out.println("메인메뉴로");
                break;
            }
        }
    }
    
    
}