package day0304;
// printf를 자세하게 알아보자
// printf는 우리가 콘솔창에 무언가 형식을 맞춰서 출력할 필요가 있으면 
// 사용하게 되는 메소드

//  printf 사용방법
//    - printf("출력할 내용", 출력할 내용에서 필요한 값1, 값2, 값3,,,)
//      ""안에 우리가 %문자를 넣으면 뒤에서부터 차례대로 값들이 그 자리에 들어가게 된다.


public class Ex01Printf {
    public static void main(String[] args) {
        // 1. 10진법정수('d'ecimal)
        System.out.println("1. 'd'ecimal");
        int number = 124;

        //  - A. 10진법 정수를 그대로 출력해라
        System.out.printf("A. [%d]\n", number);
        
        //  - B. 10진법 정수를 오른쪽 정렬 5자리로 출력해라
        System.out.printf("B. [%5d]\n", number);
        
        //  - C. 10진법 정수를 오른쪽 정렬 2자리로 출력해라
        //      만약 지정한 출력 자릿수가 실제 출력할 자릿수보다 작으면,
        //      지정한 출력 자릿수는 무시된다.
        System.out.printf("C. [%2d]\n", number);
        
        //  - D. 10진법 정수를 왼쪽 정렬 5자리로 출력해라
        System.out.printf("D. [%-5d]\n", number);
        
        //  - E. 10진법 정수를 오른쪽 정렬 5자리로 맞추고
        //       왼쪽에 빈자리가 있으면 0으로 채워 출력해라.
        System.out.printf("E. [%05d]\n", number);
        
        System.out.println("---------------------");
        
        // 2. 16진법정수(he'x'adecimal)
        System.out.println("2. he'x'adecimal");
        
        //  - A. 16진법 정수를, 알파벳이 있으면 소문자로 해서 그대로 출력해라
        System.out.printf("A. [%x]\n", number);
        
        //  - B. 16진법 정수를, 알파벳이 있으면 대문자로 해서 그대로 출력해라
        System.out.printf("B. [%X]\n", number);
        
        //  - C. 16진법 정수를, 오른쪽 정렬 5자리로 맞추고 알파벳이 있으면 대문자로 해서 출력해라
        System.out.printf("C. [%5X]\n", number);

        //  - D. 16진법 정수를, 왼쪽 정렬 5자리로 맞추고 알파벳이 있으면 소문자로 해서 출력해라
        System.out.printf("D. [%-5x]\n", number);
        
        //  - E. 16진법 정수를, 오른쪽 정렬 5자리로 맞추고 왼쪽 빈자리는 0으로 채우며 
        //    알파벳이 있으면 대문자로 해서 출력해라
        System.out.printf("E. [%05X]\n", number);
 
        System.out.println("----------------------");
        
        // 3. 실수('f'loat)
        //    비록 float의 f를 따왔지만 double 이건 float이건 모두 사용 가능하다
        System.out.println("3. 'f'loat");
        double d = 123.456; // .도 출력하는 자릿수의 하나이다
        
        //  - A. 실수를 그대로 출력하라
        System.out.printf("A. [%f]\n" , d);
        
        //  - B. 실수를 오른쪽 정렬 15자리로 출력하라
        System.out.printf("B. [%15f]\n" , d);
        
        //  - C. 실수를 왼쪽 15자리로 정렬하고 소수점 2번째 자리까지만 출력하라
        System.out.printf("C. [%-15.2f]\n" , d); // 반올림?

        //  - D. 실수를 오른쪽 15자리로 정렬하고 소수점 2번째 자리, 왼쪽 빈자리는 0으로 채워 출력
        System.out.printf("D. [%015.2f]\n" , d);
        
       
        System.out.println("---------------------");
        // 4. 문자열('S'tring)
        String str1 = new String("abcDEF");
        System.out.println("4. 'S'tring");
    
        //  - A. 문자열을 string을 그대로 출력하라
        System.out.printf("A. [%s]\n" , str1);
        
        //  - B. 문자열을 string을 모두 대문자로 출력하라
        System.out.printf("B. [%S]\n" , str1);
        
        //  - C. 문자열을 string을 오른쪽 정렬 10자리로 내용은 바꾸지 말고 출력하라
        System.out.printf("C. [%10s]\n" , str1);
        
        //  - D. 문자열을 string을 왼쪽 정렬 10자리로 모든 글자는 대문자로 출력하라
        System.out.printf("D. [%-10S]\n" , str1);
        
        // printf() 를 사용할 때 주의할 점
        //  - 1) 존재하지 않는 %문자를 사용하면 에러가 발생한다.
        //       특히, 흔한 실수 중 하나가 % 뒤에 아무것도 안 적는 경우가 있다.
        // System.out.printf("%q" , 123);
        // UnknownFormatConversionException: Conversion = 'q'/ q는 없는 기호

        //  - 2) %문자와 맞지 않는 값을 넘겨주면 에러가 발생한다.
        // System.out.printf("%d" , 1.3);
        // IllegalFormatConversionException: d != java.lang.Double

        //  - 3) 여러개의 %문자를 조합해서 우리가 출력할 내용을 지정해 줄 수 있다.
        //       하지만 넘겨주는 값의 갯수가 %문자의 갯수보다 많으면 상관 없다.
        System.out.printf("첫번째 정수 : %d 두번째 실수 : %f \n" , 2 , 3.4 , 5 , 6, 7);
    
        //  - 4) 하지만 %문자의 갯수가 넘겨주는 값의 갯수보다 많으면 에러가 발생한다.
        // System.out.printf("%d %d %d" , 1 , 2);
        // MissingFormatArgumentException: Format specifier '%d'
    }
    
}
