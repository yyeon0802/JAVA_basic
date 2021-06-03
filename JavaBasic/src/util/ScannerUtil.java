package util;
// 우리가 Scanner의 메소드를 사용할때

// 좀 더 편리하게 사용할 수 있는 메소드를 우리가 구현해 놓은 
// 클래스

import java.util.Scanner;

public class ScannerUtil {

    // 1. 버퍼 메모리에 엔터키가 남아있을때
    // 발생하는 nextLine() 버그를 자체적으로해결한
    // nextLine() 메소드

    // nextInt 이후 nextLine - > nextLine이 중간에 한번 더 써서 총 두 번
    // nextLine 이후 nextLine - > 중간에 nextLine또 안 써도 된다.

    public static String nextLine(Scanner scanner, String message) {
        System.out.println(message);
        System.out.print(">  ");

        String str = new String(scanner.nextLine());

        // nextInt()버그 때문에
        // str에 저장된 값이 만약 아무것도 없이 비어있으면
        // str에 다시한번 new String(scanner.nextLine())해서 리턴한다.
        // 만약 String 객체의 값이 비어있는지 체크할 때에는
        // isEmpty() 메소드를 실행하면
        // 비어있으면 true, 비어있지 않으면 false 값이 나온다.
        // 즉 isEmpty() 메소드는 equals("") 과 똑같다는 의미가 된다.

        if (str.isEmpty()) {
            // str.isEmpty()에 true가 나왔다는 것은
            // 스캐너의 버그 때문에 str에 아무런 값이 없다 라는 의미이므로
            // str에 한번 더 입력하게 코드를 넣어주면 된다.
            str = new String(scanner.nextLine());
        }

        return str;
    }
    
    // 사용자로부터 nextInt()를 실행할 때 곧장 int로 입력받는 것이 아니라
    // string으로 입력을 받고, 해당 String값이 숫자로만 이루어져 있는지 체크하여
    // 만약 숫자 외의 글자가 존재할 시에는 "숫자만 입력해주세요" 라는 메세지와 함께
    // 계속 입력을 받게 만들어 준다.
    // 만약 사용자가 숫자만 입력하면
    // Integer 클래스의 static 메소드인 parseInt() 메소드를 호출하여
    // String을 int 로 변환해준다.
    

    // 사용자로부터 숫자값을 입력받는
    // nextInt() 메소드
    public static int nextInt(Scanner scanner, String message) {
        // 1. 먼저 사용자로부터 값을 String의 형태로 입력 받는다.
        String temp = nextLine(scanner, message);

        // 2. temp가 숫자로만 이루어져 있는 지 체크해서 아닐경우
        //    숫자만 입력될 때까지 다시 입력 받는다.
        
        while(!temp.matches("\\d+")) {
            System.out.println("잘못 입력하셨습니다.");
            System.out.println("숫자만 입력 하실 수 있습니다.");
            temp = nextLine(scanner, message);
        }

        // 3. while이 종료되었다 라는 의미는
        //    temp가 숫자로만 이루어져 있다는 의미이므로
        //    Integer.parseInt() 를 통해
        //    String temp의 값을 int 타입의 값으로 바꿔준다.
        //    그리고 해당 int값을 return
        return Integer.parseInt(temp);
        
        //  이전 버전 스캐너로 읽은 값을 리턴하라 return scanner.nextInt()
    }

    // 사용자로부터 특정 범위내의 숫자값을 입력받는 오버로딩
    // nextInt() 메소드

    public static int nextInt(Scanner scanner, String message, int min, int max) {
        /*
         * System.out.println(message); System.out.print(">   "); int number =
         * scanner.nextInt(); 위의 메소드와 거의 중복이다. 이를 메소드 호출로 바꾸면
         */
        
        int number = nextInt(scanner, message);
        
        
        while (!(number >= min && number <= max)) {
            System.out.println("잘못 입력하셨습니다.");
            number = nextInt(scanner, message);
        }

        return number;
    }

    // 배열을 받아서 배열을 출력해라
    public static void print(int index, int[] idArray, String[] nameArray, int[][] scoreArrays, int INDEX_KOREAN,
            int INDEX_ENGLISH, int INDEX_MATH, int SIZE_SUBJECT) {
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
