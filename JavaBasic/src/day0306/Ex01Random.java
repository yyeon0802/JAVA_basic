package day0306;

// Random 클래스
// 자바에서 랜덤한 숫자를 만들어야 할 때는
// 우리가 Random 객체를 사용하여
// 숫자를 만들어 줄 수 있다.
// Scanner와 마찬가지로 외부 클래스 이므로
// import 해야 한다.

import java.util.Random;
public class Ex01Random {
    public static void main(String[] args) {
        // Random 객체 생성
        Random random = new Random();
        
        // random은 0이상 1미만의 수만은 실수를 이용해서
        // 램덤한 숫자를 제공해 준다.
        
        // 1. 랜덤한 실수가 필요할 때에는 nextDouble()을 사용하면 된다.
        System.out.println(random.nextDouble());
        
        // 2. 랜덤한 int범위의 숫자가 필요할 때에는 nextInt()를 사용하면 된다.
        System.out.println(random.nextInt());
        
        // 3. 만약 우리가 0부터 특정 숫자 미만의 랜덤한 숫자가 필요할 때에는
        //    nextInt(숫자)를 넣으면
        //    0부터 숫자-1 까지의 랜덤한 숫자가 나온다!
        System.out.println(random.nextInt(10));
        
        // 4. 만약 우리가 0~숫자-1 아니라, 1~숫자 까지의 랜덤한 숫자를 만들어 줄려면
        //    random.nextInt(숫자) + 1 을 해서
        //    어떤 랜덤한 숫자가 나오던 간에 1씩 더해주는 방법을 사용해 주면 된다.
        System.out.println(random.nextInt(3) + 1);
        
    }
}
