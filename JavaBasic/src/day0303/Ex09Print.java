package day0303;
// 콘솔화면에 출력하는 3가지 방법

// 우리가 콘솔화면에 출력을 하는 프로그래밍을 해야하니
// 각 출력 방법이 콘솔에 어떻게 나오는지 알아보자

// 1. print()
//  - 괄호 안의 내용을 그대로 출력하고 
//    만약 이후에 출력할 것이 있다면 출력된 내용의 오른쪽 칸부터 출력을 시작한다.
//    줄이 안 바뀐다.

// 2. println()
//  - print a line의 줄임말. println은 괄호 안의 내용을 그대로 출력하고
//    만약 이후에 출력할 것이 있으면 출력 내용 다음 줄의 첫번째 칸 부터 출력을 시작한다.
//    즉 줄이 바뀐다.

// 3. printf()
//  - print in format의 줄임말. printf 는 괄호 안의 내용을 "형식에" 맞추어서 출력하고
//    만약 이후의 출력할 것이 있다면 출력된 내용의 오른쪽 칸부터 출력을 시작한다.

// 4. 공백 문자
//  - 탭 공백, 다음줄 공백이나 따옴표, 쌍따옴표와 같이 
//    java가 프로그램 내부적으로 쓰는 문장 기호들을
//    프로그램적 기호가 아니라 실제로 넣어줄떄 사용하는 특수 문자들이다.

//  - 주로 \ 와 조합되서 적게 되는데
//    적을때는 2 글자 이지만, 실제 취급은 1 글자 이다.

//      A. 탭 공백
//          - 스페이스 4개의 분량의 공백으로 \t 로 적어준다.
//      B. 줄 공백
//          - 해당 문자가 나오는 즉시 줄을 바꿔준다. \n 으로 적어준다.
//      C. 쌍따옴표 문자
//          - 코드상에 " 는 스트링 값을 시작하는 의미로써 사용이 된다.
//            따라서 우리가 쌍따옴표를 그러한 값의 시작이 아니라 문자로써 스트링 혹은
//            캐릭터 공간에 넣어야 할때에는 "\"를 넣어주어야 한다.


public class Ex09Print {
    public static void main(String[] args) {
        // 출력할 스트링 변수 2개
        String str1 = new String("abc");
        String str2 = new String("DEF");
        
        // print()는 ()의 출력이 끝나면 출력 위치를 바꾸지 않는다.
        System.out.print(str1);
        System.out.print(str2);
        
        // println()은 ()의 출력이 끝나면 출력위치를 다음 줄의 첫번째 칸으로 옮긴다.
         System.out.println(str1);
         System.out.println(str2);
    
        // printf()는 우리가 %문자라는 것을 사용해서 형식에 맞추어 출력을 하고, 출력위치를 바꾸지 않는다.
         System.out.printf("%s", str1);
         System.out.printf("%s", str2);
         
         // 공백문자 체험해보기 위에 printf 바로 옆에 탭공백 예문이 실행되지 않도록 공백사용
         System.out.println();
         
         // 1. \t
         System.out.println(str1 + "\t" + str2);
       
         // 2. \n
         System.out.print(str1 + "\n");
         System.out.print(str2 + "\n");
         
         // 3. \"
         // " To Be or Not To Be "
         System.out.println("\"To Be or Not To Be\"");
    }
}
