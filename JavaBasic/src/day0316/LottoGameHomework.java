package day0316;
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
import util.ScannerUtil;
import java.util.Random;
import java.util.ArrayList;

public class LottoGameHomework {
	static final int NUMBER_SIZE = 6;
	static final int NUMBER_MAX = 45;
	static final int NUMBER_MIN = 1;

	// 망함!!!
	// 한개의 ArrayList로 만 해서 sort가 안 되요,,,
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		ArrayList<Integer> computerList = new ArrayList<>();

		randomLotto(random, computerList);
		sortLotto(computerList);
		
		/*for (int i = 0; i < computerList.size() - 1; i++) {
			if (computerList.get(i) > computerList.get(i + 1)) {
				int temp = computerList.get(i);
				computerList.set(i, computerList.get(i + 1));
				computerList.set(i + 1, temp);
				i = -1;
			}
		}*/

		String message = new String("로또뽑기를 몇번 하시겠습니까 ? ");
		int playSet = ScannerUtil.nextInt(scanner, message);

		ArrayList<Integer> userList = new ArrayList<>();

		int playCount = 0;
		while (playCount < playSet) {

			message = new String("1. 수동 2. 자동");
			int userChoice = ScannerUtil.nextInt(scanner, message, 1, 2);

			if (userChoice == 1) {
				System.out.println("수동으로 " + (playCount + 1) + "번째 로또를 생성합니다.");

				for (int i = 0; i < NUMBER_SIZE; i++) {
					message = new String((i + 1) + "번 숫자");
					int userNumber = ScannerUtil.nextInt(scanner, message, NUMBER_MIN, NUMBER_MAX);
					System.out.println();
					
					while (userList.contains(userNumber)) {
						System.out.println("중복 숫자 입니다. 다시 입력 하세요.");
						userNumber = ScannerUtil.nextInt(scanner, message, NUMBER_MIN, NUMBER_MAX);
						System.out.println();
					}
					userList.add(userNumber);
					sortLotto(userList);
				}

				playCount++;

			} else if (userChoice == 2) {

				randomLotto(random, userList);

				sortLotto(userList);
				
				/*for (int i = 0; i < userList.size() - 1; i++) {
					if (userList.get(i) > userList.get(i + 1)) {
						int temp = userList.get(i);
						userList.set(i, userList.get(i + 1));
						userList.set(i + 1, temp);
						i = -1;
					}
				}*/
			
				System.out.printf("자동으로 %d번째 로또가 생성 되었습니다.\n", playCount + 1);
				System.out.println();

				playCount++;
			}
		}

		System.out.println();
		computerLottoPrint(computerList);
		userLottoPrint(userList, computerList);

		scanner.close();
	}

	public static ArrayList randomLotto(Random random, ArrayList list) {

		int cnt = 0;
		while (cnt < NUMBER_SIZE) {
			int number = random.nextInt(NUMBER_MAX) + 1;

			while (list.contains(number)) {
				number = random.nextInt(NUMBER_MAX) + 1;
			}

			list.add(number);
			cnt++;
		}
		return list;
	}
		
	public static void computerLottoPrint(ArrayList list) {
		System.out.printf("컴퓨터 로또 : [ %d, %d, %d, %d, %d, %d ]\n", list.get(0), list.get(1), list.get(2), list.get(3),
				list.get(4), list.get(5));
	}

	public static void userLottoPrint(ArrayList list, ArrayList computerList) {

		for (int i = 0; i < list.size(); i++) {
			
			if (i % 6 == 0) {

				int correctCnt = 0;
			
				System.out.print("사용자 로또 : [ ");
				
				for (int j = i; j < i + NUMBER_SIZE; j++) {
					if (computerList.contains(list.get(j))) {
						correctCnt++;
					}

					if (j != i + NUMBER_SIZE - 1) {
						System.out.print(list.get(j) + ", ");
					} else {
						System.out.print(list.get(j));
						System.out.print(" ] 맞은 갯수 : " + correctCnt + "개 ");
				
						if (NUMBER_SIZE - correctCnt > 5) {
							System.out.println("등외");
						} else {
							System.out.println((NUMBER_SIZE - correctCnt + 1) + "등");
						}
					}
				}
			}
		}
		System.out.println();

	}
	// 아헐,, 걍 ArrayList list를 파라미터로 넣으면 안되고 제네릭을 완벽히 써야한다.
	public static void sortLotto(ArrayList<Integer> list) {
	    for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                Integer temp = list.get(i); //int temp도 되기는 한다
                list.set(i, list.get(i + 1));
                list.set(i + 1, temp);
                i = -1;
            }
	    }
	}
}