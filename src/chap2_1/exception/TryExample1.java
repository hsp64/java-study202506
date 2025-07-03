package chap2_1.exception;

public class TryExample1 {

    public static void main(String[] args) {

        int n1 = 10, n2 = 0;
        System.out.println("나눗셈 시작!");

        int result = n1 / n2;
        System.out.printf("%d / %d = %d\n", n1, n2, result);

        System.out.println("프로그램 정상 종료");

    }
}
