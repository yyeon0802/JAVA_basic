package day0312;
// ArrayUtil의 메소드를 실습해보는클래스

import util.ArrayUtil;
public class Ex02ArrayUtil {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        
        // 1. size()
        System.out.println("ArrayUtil.size() : " + ArrayUtil.size(arr));
        System.out.println();
        
        // 2. contains()
        System.out.println("ArrayUtil.contains(arr, 3) : " + 
                        ArrayUtil.contains(arr, 3));
        System.out.println();
        
        System.out.println("ArrayUtil.contains(arr, 30) : " + 
                ArrayUtil.contains(arr, 30));
        System.out.println();

        // 3. indexOf()
        System.out.println("ArrayUtil.indexOf(arr, 4) : " + 
                 ArrayUtil.indexOf(arr, 4));
        System.out.println();

        System.out.println("ArrayUtil.indexOf(arr, 40) : " + 
                ArrayUtil.indexOf(arr, 40));
        System.out.println();
        
        // 4. lastIndexOf()
        System.out.println("ArrayUtil.lastIndexOf(arr, 4) : " +
                 ArrayUtil.lastIndexOf(arr, 4));
        System.out.println();

        System.out.println("ArrayUtil.lastIndexOf(arr, 40) : " +
                ArrayUtil.lastIndexOf(arr, 40));
        System.out.println();
        
        // 5. add()
         arr = new int[0];
         System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
         System.out.println();

         arr = ArrayUtil.add(arr, 11);
         System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
         System.out.println();
         
        // 6. add(index)
         System.out.println("arr[0] : " + arr[0]);
         arr = ArrayUtil.add(arr, 0, 10);
         System.out.println("arr[0] : " + arr[0]);
         
         System.out.println("arr[1] : " + arr[1]);
         arr = ArrayUtil.add(arr, 1, 232);
         System.out.println("arr[1] : " + arr[1]);
         arr = ArrayUtil.add(arr, 1, 777);
         System.out.println("arr[1] : " + arr[1]);
         
         
        // - 불가능한 인덱스에 추가하려는 경우
         System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
         arr = ArrayUtil.add(arr, -3, 100);
         System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
         arr = ArrayUtil.add(arr, 100, -3);
         System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
         System.out.println();
         
         // 7. removByIndex()
         System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
         arr = ArrayUtil.removeByIndex(arr, 0);
         System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
        
         // -불가능한 인덱스를 제거하려는 경우
         System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
         arr = ArrayUtil.removeByIndex(arr, 150);
         System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
         System.out.println();
    
         
         
         String[] arr2 = new String[0];
         arr2 = ArrayUtil.add(arr2, "abc");
         arr2 = ArrayUtil.add(arr2, 0, "def");
         System.out.println(ArrayUtil.size(arr2));
         
         arr2 = ArrayUtil.add(arr2, "1");
         arr2 = ArrayUtil.add(arr2, "2");
         arr2 = ArrayUtil.add(arr2, "3");
         
         System.out.println(arr2[0]);
         arr2 = ArrayUtil.removeByIndex(arr2, 0);
         System.out.println(arr2[0]);
    
         
         System.out.println("ArrayUtil.indexOf(arr2, \"1\"): " + ArrayUtil.indexOf(arr2,"1"));
         arr2 = ArrayUtil.removeByElement(arr2, "1");
         System.out.println("ArrayUtil.indexOf(arr2, \"1\"): " + ArrayUtil.indexOf(arr2,"1"));
    }

}
