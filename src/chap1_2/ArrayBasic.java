package chap1_2;

import java.util.Arrays;

public class ArrayBasic {

    public static void main(String[] args) {

        // 배열: 1. 동종모음 구조 (같은 타입끼리만 저장 가능)
        //      2. 생성시의 크기가 ㅜㄹ변함 (값을 안넣으면 기본값 초기화)

        // 1. 배열 변수를 선언 (스택에 변수를 선언)
        int[] numbers; // 4byte? (X)
        // 2. 배열을 생성 (힙에 데이터를 저장)
        numbers = new int[5];
        // 3. 배열을 초기화 (값 저장)
        numbers[0] = 50;
        numbers[1] = 77;
        numbers[2] = (int) 66.7;
        numbers[3] = numbers[0] * 2;
        numbers[4] = 99;


        System.out.println("numbers = " + numbers);
        System.out.println(Arrays.toString(numbers));

        // 배열 길이 확인
        System.out.println(numbers.length);

        // 배열 순회
        System.out.println("=========================");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("데이터 = " + numbers[i]);
        }
        System.out.println("=========================");

        // enhanced for loop iter
        for (int n : numbers) {
            System.out.println("n = " + n);
        }

        Arrays.stream(numbers).forEach(n -> System.out.println(n));

    }
}
