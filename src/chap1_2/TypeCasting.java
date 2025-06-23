package chap1_2;

public class TypeCasting {
    public static void main(String[] args) {

        // java는 타입이 다른 데이터의 연산을 지원하지 않음
        byte a = 100;
        int b = a; // 암묵적 형 변환 (byte: 1 -> int: 4)


        /*
            int c
            0 00000000 00000000 00000011 11101000''

            byte d
            1 1101000

            1의보수: 비트 반전
            1101000 -> 0010111
            2의보수: 1을 더함
            0010111
                  1
            0011000
         */

        int c = 1000;
        byte d = (byte) c; // int: 4 => byte: 1
        // 명시적 형 변환 - 데이터 손실이 발생할 수 있음

        System.out.println("d = " + d);

        int k = 50; // 4byte
        double j = k; // 8byte // 암묵적 형 변환
        System.out.println("j = " + j);

        double m = 5.567;
        int n = (int)m; // 명시적 형변환 데이터 손실을 피할 수 없음
        System.out.println("n = " + n); // 소수점 버리기 할때 사용가능

        // 암묵적(묵시적 형 변환 -> upcasting (promotion)
        // 명시적 형 변환 -> downcasting

    }
}
