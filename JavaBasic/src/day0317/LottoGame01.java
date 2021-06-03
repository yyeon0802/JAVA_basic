package day0317;
//ArrayList를 활용한 로또 게임

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import util.ScannerUtil;
public class LottoGame01 {
    private static final int NUMBER_MAX = 45;
    private static final int NUMBER_MIN = 1;
    private static final int NUMBER_SIZE = 6;
    // 전역변수로  스캐너 만드는 것은 별로 좋은 방법이 아니다.
    private static Scanner scanner = new Scanner(System.in);
    // 필드 : 전역변수와 다른점이 뭘까?! 아무대서 접근 몬해
    // 전역변수 : 모든 메소드가 접근가능함 장점이자 단점 요새는 그닥 선호하지 X
    public static void main(String[] args) {
        ArrayList<Integer> computerList = new ArrayList<>();
        ArrayList<ArrayList<Integer>> userList = new ArrayList<>(); // !!ArrayList도 이중배열처럼 가능
        
        // computerList에 숫자 추가
        insertRandomNumber(computerList);
        
        // 사용자 리스트에 게임 숫자 몇번인지 받기
        // 사용자의 선택에 따라서 자동/수동 숫자 넣기
        // 위의 두가지는 우리가 decideUserGame() 메소드만 실행 해 주면 됨.
        decideUserGame(userList);
        // 리스트 정렬하기 (위에 같이 해버림)
        
        // 비교해서 등수 정하기
        showResult(computerList, userList);
        
    }
    // 랜덤 숫자를 리스트에 추가하고 정렬해 주는 메소드
    private static void insertRandomNumber(ArrayList<Integer> list) {
        Random random = new Random();
        while (list.size() < NUMBER_SIZE) {
            Integer randomNumber = random.nextInt(NUMBER_MAX) + 1;
            if( !list.contains(randomNumber) ) {
                list.add(randomNumber);
            }
        }
        sortList(list);
    }
    
    // 사용자 숫자를 리스트에 추가하고 정렬 해 주는 메소드
    private static void insertUserNumber(ArrayList<Integer> list) {
        while(list.size() < NUMBER_SIZE) {
            int currentPosition = list.size() + 1;
            String message = new String(currentPosition + "번 숫자를 입력해 주세요");
            int userNumber = ScannerUtil.nextInt(scanner, message, NUMBER_MIN, NUMBER_MAX);
           
            if(!list.contains(userNumber)) {
                list.add(userNumber);
            }else {
                System.out.println("중복된 숫자 입니다.");
            }
        }
        sortList(list);
    }
    
    
    // 사용자로부터 입력을 받아서 자동으로 해줄지 수동으로해줄지 결정해주는 메소드
    private static void decideUserGame(ArrayList<ArrayList<Integer>> list) {
        String message = new String("몇 번 플레이 하실지 정해 주세요.");
        int gameNumber = ScannerUtil.nextInt(scanner, message);
        while(list.size() < gameNumber) {
            message = new String("1. 자동 2. 수동");
            int userChoice = ScannerUtil.nextInt(scanner, message, 1 , 2);
            
            ArrayList<Integer> tempList = new ArrayList<>();

            if (userChoice == 1) {
                insertRandomNumber(tempList);
                System.out.println(tempList.size());
            }else if(userChoice == 2) {
                insertUserNumber(tempList);
                System.out.println(tempList.size());
            }
            list.add(tempList);
        }
        
    }
    
    // 리스트에 숫자를 정렬해 주는 메소드
    private static void sortList(ArrayList<Integer> list) {
        for ( int i = 0; i < list.size() - 1; i++) {
            if( list.get(i) > list.get(i + 1)) {
                // Integer temp = list.get(i); 굳이 이렇게 안 하고 !
                Integer temp = list.set(i, list.get(i + 1));
                // set을 쓰면 원래 있던 값이 어디론가 튕겨저 return되는데
                // 그 값을 그대로 temp에 받으면 되쟈나
                list.set(i + 1, temp);
                i = -1;
            }
        }
    }
    // 결과를 출력하고 확인하는 메소드
    private static void showResult(ArrayList<Integer> computerList, ArrayList<ArrayList<Integer>> userList) {
        // 컴퓨터 숫자 출력
        System.out.print("컴퓨터의 숫자 : [");
        for ( int i = 0; i < computerList.size(); i++) {
            System.out.printf("%4d", computerList.get(i));
        }
        System.out.println(" ]");
        System.out.println();
        
        // for문으로 사용자 게임마다 숫자 맞춘갯수 등수 출력
        for ( int i = 0; i < userList.size(); i++) {
            String message = new String((i + 1) + "번 게임");
            System.out.println(message);
            System.out.print("사용자의 숫자 : [");
            for ( int j = 0; j < userList.get(i).size(); j++) { //   이중 기억하라ㅏㅏ
                System.out.printf("%4d", userList.get(i).get(j));
            }
            System.out.println(" ]");
            int count = countSame(computerList, userList.get(i));
            System.out.printf("맞은 갯수 : %d개" , count);
            if (count >= 2) {
                System.out.printf(" 사용자의 등수 : %d등\n" , NUMBER_SIZE - count + 1);
            }else {
                System.out.println(" 사용자의 등수 : 등외");
            }
            System.out.println();
            

            System.out.println();
        }
    }

    // 2개의 리스트를 비교하여 같은 숫자가 몇개인지 확인 하는 메소드
    private static int countSame(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int count = 0;
        for ( int i = 0; i < list1.size(); i++) {
            if ( list2.contains(list1.get(i))) {
                count++;
            }
        }
        return count;
    }
    
}
