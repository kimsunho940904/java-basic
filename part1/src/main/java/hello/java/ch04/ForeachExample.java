package hello.java.ch04;

public class ForeachExample {
    public static void main(String[] args) {

            /*
    향산된 for문
    for(타입 변수명 : 배열 또는 컬렉션)
        빈복할 문장
     */

        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("for");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("foreach");
        for(int tmp : arr){
            System.out.println(tmp);
        }

    }


}
