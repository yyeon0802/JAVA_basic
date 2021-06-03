package day0311;
// 사용자로부터 번호 이름 국어 영어 수학 점수를 입력받아서

// 예쁘게 출력하시오
// 해당 프로그램은 총 6명까지 정보입력 가능

// 단 국어 영어 수학 점수는 2차원 배열을 사용해서 묶어서 관리하게 하시오
// ~ 11:20

import java.util.Scanner;

public class GradeBook01 {
    static final int SUBJECTS = 3;
    static final int STUDENT_MAX = 6;
    static final int SCORE_MIN = 0;
    static final int SCORE_MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] id = new int[STUDENT_MAX];
        String[] name = new String[STUDENT_MAX];
        int[][] score = new int[STUDENT_MAX][SUBJECTS];

        int idx = 0;
        while (true) {
            System.out.println();
            System.out.println(">>>> 성적관리 <<<<");
            System.out.println("1) 정보입력");
            System.out.println("2) 출력");
            System.out.println("3) 종료");
            System.out.print(">>   ");
            int select = scanner.nextInt();

            if (select == 1) {
                int subjectsCnt = 0;
                if (idx < STUDENT_MAX) {
                    boolean checker = true;
                    while (checker) {
                        System.out.println("a) id번호 입력");
                        System.out.print(">  ");
                        int idNumber = scanner.nextInt();

                        int idChecker = -1;
                        for (int i = 0; i < id.length; i++) {
                            for (int j = 0; j < i; j++) {
                                if (idNumber == id[j]) {
                                    idChecker = 0;
                                }
                            }
                        }

                        if (idChecker == -1) {
                            id[idx] = idNumber;
                            checker = false;
                        } else {
                            System.out.println("중복된 번호 입니다.");
                        }
                    }

                    System.out.println("b) 이름 입력 ");
                    System.out.print(">  ");
                    scanner.nextLine();
                    name[idx] = scanner.nextLine();

                    while (subjectsCnt < SUBJECTS) {
                        if (subjectsCnt == 0) {
                            System.out.println("c-1) 국어 점수 입력 ");
                        } else if (subjectsCnt == 1) {
                            System.out.println("c-2) 영어 점수 입력 ");
                        } else if (subjectsCnt == 2) {
                            System.out.println("c-1) 수학 점수 입력 ");
                        }
                        System.out.print(">  ");
                        int inputScore = scanner.nextInt();

                        if (!(inputScore >= SCORE_MIN && inputScore <= SCORE_MAX)) {
                            System.out.println("잘못된 점수를 입력 하셨습니다.");
                        } else {
                            score[idx][subjectsCnt] = inputScore;
                            subjectsCnt++;
                        }
                    }
                    idx++;
                    System.out.println(">> 정보저장 완료");
                } else {
                    System.out.println("더 이상 입력할 수 없습니다.");
                }

            } else if (select == 2) {
                if (idx > 0) {

                }
                for (int i = 0; i < idx; i++) {
                    System.out.println();
                    System.out.printf("=========== [%3d]번 [%s]님 ========\n", id[i], name[i]);
                    System.out.printf("[ 국어 ]\t[ 영어 ]\t[ 수학 ]\n");
                    for (int j = 0; j < SUBJECTS; j++) {
                        System.out.print(" " + score[i][j] + " \t");
                    }
                    System.out.println();
                }
            } else if (select == 3) {
                System.out.println(">> 종료합니다.");
                break;
            }
        }

        scanner.close();

    }
}
