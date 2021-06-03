package day0316;
// 우리가 기존에 만들었던 Dog 클래스와 ArrayList를 사용하여
// 강아지 임시 보호소 만드시오

// 기본적으로 ArrayList안에 3마리의 강아지를 임의로 넣고 while 시작

// 1. 잃어버린 개 등록 2. 일치하는 개 찾기 3. 주인 찾은개 목록에서 삭제 4. 종료

import util.ScannerUtil;
import day0315.Dog;
import java.util.Scanner;
import java.util.ArrayList;
public class DogShelter {
    public static void main(String[] args) {
        ArrayList<Dog> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //클래스 Dog에 캡슐화 및 생성자가 필요했다... 파라미터 있는 생성자 , 없는 기본생성자 
        Dog d1 = new Dog("강아지1" , "01가0001", "골든 리트리버", 3);
        list.add(d1);
        Dog d2 = new Dog("강아지2" , "01가0002", "푸들", 5);
        list.add(d2);
        Dog d3 = new Dog("강아지3" , "01가0003", "치와와" , 8);
        list.add(d3);
        
        while(true) {
            int userChoice = ScannerUtil.nextInt(scanner, "1. 잃어버린 개 등록 "
                    + "2. 일치하는 개 찾기 3. 주인 찾은개 목록에서 삭제 4. 종료", 1 , 4);
        
            if(userChoice == 1) {
                // 잃어버린 개를 리스트에 등록
                Dog d = new Dog();
                String message = new String("강아지의 등록번호를 입력해주세요.");
                d.setId(ScannerUtil.nextLine(scanner, message));
                
                while (list.contains(d)) {
                    System.out.println("해당번호는 이미 등록된 번호 입니다.");
                    d.setId(ScannerUtil.nextLine(scanner, message));
                }
                
                message = new String("강아지의 이름을 입력해주세요.");
                d.setName(ScannerUtil.nextLine(scanner, message));
                
                message = new String("강아지의 품종를 입력해주세요.");
                d.setBreed(ScannerUtil.nextLine(scanner, message));
                
                message = new String("강아지의 나이를 입력해주세요.");
                d.setAge(ScannerUtil.nextInt(scanner, message));
                
                list.add(d);
            
            }else if(userChoice == 2) {
                // 일치하는 개가 있는지 찾는다.
                Dog d = new Dog();
                String message = new String("강아지의 등록번호를 입력해주세요");
                d.setId(ScannerUtil.nextLine(scanner, message));
                
                
                
                if(list.contains(d)) {
                    // 일치하므로 해당 강아지 정보 보여준다
                    // int index = list.indexOf(d);
                    // list.get(index).printInfo();
                    list.get(list.indexOf(d)).printInfo();
                    
                } else {
                    // 등록번호가 일치하는 강아지가 없으므로 경고 메세지만 출력
                    System.out.println("해당 등록번호로 등록된 강아지는 이 보호센터에 없습니다.");
                }
                
            }else if(userChoice == 3) {
                // 일치하는 개 리스트에서 삭제
                Dog d = new Dog();
                String message = new String("강아지의 등록번호를 입력해 주세요.");
                d.setId(ScannerUtil.nextLine(scanner, message));

                if (list.contains(d)) {
                    System.out.println("해당 강아지는 이보호센터에서 보호가 종료 되었습니다.");
                    list.remove(d);
                }else {
                    System.out.println("해당 등록번호로 등록된 강아지는 이 보호센터에 없습니다.");
                }
            }else if(userChoice == 4) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
        
        scanner.close();
    }
    
    
}
