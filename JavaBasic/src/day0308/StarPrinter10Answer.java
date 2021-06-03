package day0308;

// 별찍기 10번

import java.util.Scanner;
public class StarPrinter10Answer {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("별찍기 10번 ");
        System.out.println("출력할 줄 수를 입력하세요 : ");
        System.out.print("(5) >  ");
        int userNumber = scanner.nextInt();
        System.out.println();
        
        int maxLength = 2 * userNumber - 1;
        
        for (int i = 1; i <= maxLength; i++) {
            String stars = new String();
            //첫번째 와 마지막줄에 별을 모두 넣어주는 if j for문
            if (i == 1 || i == maxLength) {
                for (int j = 1; j <= maxLength; j++) {
                    stars += "*";
                }
            }else {
                
                // 그외의 경우
                // 위수분이건 아랫부분이건
                // 별 - 공백 - 별 이라는 형태이므로
                // if - else를 통해 별의 갯수와 공백의 갯수를 정하고
                // j for문 3개를 만들어 각각의 갯수만큼의 별과 공백을 stars에 추가
                
                // 해당 줄의 별의 갯수를 저장할 int starWidth
                int starWidth = 0;
                // 해당 줄의 공백긔 갯수를 저장할 int spaceWidth
                int spaceWidth = 0;
            
                // starWidth와 spaceWidth 값을 결정하는 if - else 문
                
                if ( i < userNumber ) {
                    // 윗부분
                    // 1부터 ~4줄도 위의 if문에 걸려버린다 맨첫번째 줄을 제외하기 위해서
                    int upperI = i - 1; //2 ~ 4 가 보정되어 123이 된다.

                    // 거꾸로니까 하나씩 줄어야하는 width...
                    starWidth = userNumber - upperI; // = userNumber - 1(upperI!);
                }else {
                    // 아랫부분
                    // 아랫부분 일 때 사용 될 int lowerI
                    int lowerI = i - userNumber + 1; // i가 5678이니까 1로 만들어주자
                    starWidth = lowerI; // (별의 갯수가 1,2,3,4,--)
                }
                
                // 한 줄의 갯수가 maxLength로 정해져 있으니
                // 왼오 별의 갯수를 빼주면 공백이 나온다 ! --> 위아래파트 전부 같다
                // if-else문에 두번써줄 필요없이 바깥으로 ~
                
                // 공백의 갯수는 윗부분 이건 아랫부분이건
                // 총 너비 - 왼쪽별의 갯수 - 오른쪽 별의 갯수이고
                // 왼쪽 별의 갯수와 오른쪽 별의 갯수는 둘다 starWidth이다.
                // 따라서 아래와 같이
                // 공백의 갯수 = 총 너비 - 2 * 별의 갯수 로 적어줄 수 있다.
                spaceWidth = maxLength - (2 * starWidth);
                
                // 왼쪽 별을 담당하는 j for 문
                for ( int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
            
                // 가운데 공백을 담당하는 j for 문
                for ( int j = 1; j <= spaceWidth; j++) {
                    stars += " ";
                }
                
                // 오른쪽 별을 담당하는 j for 문
                for ( int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
                
                
            }
            
            
            System.out.println(stars);
        }

        
        scanner.close();
 
    }
}
