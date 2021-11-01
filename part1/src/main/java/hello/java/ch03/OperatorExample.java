package hello.java.ch03;

public class OperatorExample {
    public static void main(String[] args) {
        /*
        조건 연산자
        조건 연산자는 조건식, 식1, 식2 모두 세 개의 피연산자를 필요로 하는 삼항 연산자이며,
        삼항 연산자는 조건 연산자 하나 뿐이다.
         */

        int x = 10;
        int y = 20;
        int result;
        System.out.printf("%d", result = (x > y) ? x : y);
    }
}
