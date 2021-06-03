package day0311;
// 로또 게임 최종판

// 사용자로부터 몇번을 할건지 입력을 받고
// 그리고 각 게임을 수동으로 할지 자동으로 할지 입력 받아서
// 최종적으로 컴퓨터의 숫자와 대비하여 각 게임의 맞춘 갯수 등수를 출력하게 만드시오

// 예시
// 몇번 플레이하시겠습니까? 5
// 1번 게임을 수동/자동 중 어떤걸로 하시겠습니까?(1: 수동 2: 자동)
// 2
// 2번 게임을 수동/자동 중 어떤걸로 하시겠습니까?(1: 수동 2: 자동)
// 1
// 첫번째 숫자를 입력해주세요: 33
//             ....
// 5번 게임을 수동/자동 중 어떤걸로 하시겠습니까?(1: 수동 2: 자동)
// 2
// 컴퓨터의 숫자: [##, ##, ##, ##, ##, ##]
// 사용자의 숫자
// 1번 게임: [##, ##, ##, ##, ##, ##] - 4개 3등
// 1번 게임: [##, ##, ##, ##, ##, ##] - 5개 2등
// 1번 게임: [##, ##, ##, ##, ##, ##] - 6개 1등
// 1번 게임: [##, ##, ##, ##, ##, ##] - 3개 4등
// 1번 게임: [##, ##, ##, ##, ##, ##] - 0개 등수 없음

import java.util.Scanner;
import java.util.Random;

public class LottoGameAnswer {
    static final int NUMBER_SIZE = 6;
    static final int NUMBER_MAX = 45;
    static final int NUMBER_MIN = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 컴퓨터 숫자 추첨
        // 컴퓨터의 숫자를 저장할 int[] computerArray 만들기
        int[] computerArray = new int[NUMBER_SIZE];

        // 현재 computerArray의 몇번 인덱스에 값을 저장할지를 할당한 int 변수 index
        int index = 0;

        // index 변수의 할당된 값이 SIZE 보다 작은 동안,
        // while을 이용하여 computerArray의 index번 인덱스에 random이 생성한 숫자를
        // 기존 배열에 없을 때에만 추가하고 index의 값을 1 증가시킨다.
        while (index < NUMBER_SIZE) {
            // 랜덤한 숫자를 만들어준다.
            int randomNumber = random.nextInt(NUMBER_MAX) + 1;

            // 만약 해당 randomNumber가 배열에 존재하지 않으면 true, 존재하면 false가 되는
            // boolean inputSwitch 를 만들고 true로 초기화해준다.
            boolean inputSwitch = true;

            // for 문을 사용하여, randomNumber의 값과 computerArray의 엘리먼트 중
            // 같은 값을 가진 엘리먼트가 있으면 inputSwitch를 false로 바꾸고
            // for 문을 break한다.
            for (int i = 0; i < computerArray.length; i++) {
                if (randomNumber == computerArray[i]) {
                    inputSwitch = false;
                    break;
                }
            }

            // 만약 inputSwitch의 값이 true라는 것은
            // randomNumber의 값이, 중복이 아니라는 의미이므로
            // computerArray의 index번 칸에
            // randomNumber를 할당해준다.

            if (inputSwitch) {
                computerArray[index] = randomNumber;
                index++;
            }

        }

        // 사용자가 총 몇게임 할지 입력 받는다.
        System.out.println("몇번 플레이하시겠습니까?");
        System.out.print("> ");
        int userGameSize = scanner.nextInt();

        // 사용자가 입력한 숫자를 토대로 해서
        // 2차원 배열을 만든다.
        int[][] userArrays = new int[userGameSize][NUMBER_SIZE];

        // 사용자가 입력한 게임 숫자에 따라서 수동 혹은 자동을 선택하게 하고
        // 그거에 맞춰서 숫자를 배분한다.
        for (int i = 0; i < userArrays.length; i++) { // 이 커다란 문제가 다 끝나면 i++이 될것이라는 while을 for로 했네 
            System.out.println();
            System.out.println("=============" + (i + 1) + "번 게임===============");
            System.out.println("1. 수동 2. 자동");
            System.out.print("> ");
            int userChoice = scanner.nextInt();

            // 매 게임의 입력할 위치를 저장할 index의 값을 0으로 초기화해준다.
            index = 0;

            if (userChoice == 1) {
                // 사용자로부터 중복되지 않은 1~45 사이의 숫자를 입력 받아서
                // index가 각 게임 배열의 크기보다 작은 동안
                // index번 칸에 초기화해준다.
                while (index < userArrays[i].length) {
                    // 사용자한테 숫자를 선택 받아서
                    // 1~45의 범위에 속하고 중복되지 않은 숫자인지 체크하여
                    // 아닐 경우에는 다시 입력해달라고 하자
                    System.out.println((index + 1) + "번 숫자를 입력해주세요");
                    System.out.print("> ");
                    int userNumber = scanner.nextInt();

                    // 해당 숫자가 유효한 범위에 속하고 중복되지 않은 숫자이면 true,
                    // 그외엔 false가 할당되는 boolean 변수 inputSwitch

                    // 이번 경우에는 inputSwitch의 초기화 값이
                    // 단순히 true가 아니라
                    // 사용자가 입력한 숫자가 1~45 범위 안에 속하는지를
                    // 비교연산자와 논리연산자를 사용하여
                    // 그 결과값을 그대로 넣어주자

                    boolean inputSwitch = userNumber >= NUMBER_MIN && userNumber <= NUMBER_MAX;

                    // for문을 사용해서, userNumber와 중복되는 숫자가 있으면 inputSwitch의 값을 false로 바꾸고
                    // break 해주자

                    for (int j = 0; j < userArrays[i].length; j++) {
                        if (userNumber == userArrays[i][j]) {
                            inputSwitch = false;
                            break;
                        }
                    }

                    if (inputSwitch) {
                        userArrays[i][index] = userNumber;
                        index++;
                    } else {
                        System.out.println("잘못된 숫자입니다.");
                        System.out.println("다시 입력해주세요");
                    }

                }
            } else {
                // 사용자가 자동으로 골랐을 경우
                // 컴퓨터의 랜덤 숫자 코드와 매우 유사하지만
                // 저장되는 위치가 computerArray[index] 가 아니라
                // userArrays[i][index] 로 바뀔 뿐이다.

                while (index < NUMBER_SIZE) {
                    // 랜덤한 숫자를 만들어준다.
                    int randomNumber = random.nextInt(NUMBER_MAX) + 1;

                    // 만약 해당 randomNumber가 배열에 존재하지 않으면 true, 존재하면 false가 되는
                    // boolean inputSwitch 를 만들고 true로 초기화해준다.
                    boolean inputSwitch = true;

                    // for 문을 사용하여, randomNumber의 값과 computerArray의 엘리먼트 중
                    // 같은 값을 가진 엘리먼트가 있으면 inputSwitch를 false로 바꾸고
                    // for 문을 break한다.
                    for (int j = 0; j < userArrays[i].length; j++) {
                        if (randomNumber == userArrays[i][j]) {
                            inputSwitch = false;
                            break;
                        }
                    }

                    // 만약 inputSwitch의 값이 true라는 것은
                    // randomNumber의 값이, 중복이 아니라는 의미이므로
                    // userArrays[i]의 index번 칸에
                    // randomNumber를 할당해준다.

                    if (inputSwitch) {
                        userArrays[i][index] = randomNumber;
                        index++;
                    }

                }
            }
        }

        // 정렬 하는 코드
        // 1. 컴퓨터 배열 정렬하기
        for ( int i = 0; i < computerArray.length - 1; i++) {
            if(computerArray[i] > computerArray[i+1]) {
                int temp = computerArray[i];
                computerArray[i] = computerArray[i+1];
                computerArray[i+1] = temp;
                i = -1;
            }
        }
        
        // 2. 사용자의 각 배열 정렬하기
        for (int i = 0; i < userArrays.length; i++) {
            for (int j = 0 ; j < userArrays[i].length - 1; j++) {
                if( userArrays[i][j] > userArrays[i][j+1]) {
                    int temp = userArrays[i][j];
                    userArrays[i][j] = userArrays[i][j+1];
                    userArrays[i][j+1] = temp;
                    j = -1;
                }
            }
        }
        
        // 컴퓨터의 숫자와
        // 사용자의 게임내역을 비교해서
        // 맞춘갯수 + 등수 까지, 보여준다.

        // 1. 컴퓨터의 숫자를 [##, ## .... ##] 으로 보여준다.
        System.out.printf("컴퓨터의 숫자: [%2d, %2d, %2d, %2d, %2d, %2d]\n", computerArray[0], computerArray[1],
                computerArray[2], computerArray[3], computerArray[4], computerArray[5]);
        // 2. 사용자의 숫자를
        // 게임 ##번: [##, ##, .... ##], 맞춘갯수: ##개, 등수: #개
        // 의 형식으로 출력해준다.
        for (int i = 0; i < userArrays.length; i++) {
            // 1. 등수를 위하여, 사용자의 i번째 배열의 값과
            // computer의 숫자를 비교하여, 몇개나 일치하는지
            // 갯수를 센다.

            int count = 0;
            for (int j = 0; j < userArrays[i].length; j++) {
                for (int k = 0; k < computerArray.length; k++) {
                    if (userArrays[i][j] == computerArray[k]) {
                        count++;
                    }
                }
            }

            System.out.printf("게임 %2d번: [%2d, %2d, %2d, %2d, %2d, %2d] 맞춘 갯수: %2d개, ", i + 1, userArrays[i][0],
                    userArrays[i][1], userArrays[i][2], userArrays[i][3], userArrays[i][4], userArrays[i][5], count);
            if (count >= 2) {
                System.out.println("등수: " + (NUMBER_SIZE - count + 1) + "등");
            } else {
                System.out.println("등수: 등수 없음");
            }
        }

        scanner.close();
    }
}