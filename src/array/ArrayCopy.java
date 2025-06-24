package array;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {
        String[] pets = {"멍멍이", "아용이", "짹짹이"};
//        주소 복사
//        String[] petsCopy = pets;
//        배열 객체 복사
//        String[] petsCopy = new String[pets.length];
//        배열 값 복사
//        for (int i = 0; i < pets.length; i++) {
//            petsCopy[i] = pets[i];
//        }

        String[] petsCopy = Arrays.copyOf(pets, pets.length);

        petsCopy[1] = "어흥이";

        System.out.println("원본 주소: " + pets);
        System.out.println("사본 주소: " + petsCopy);
        System.out.println("원본: " + Arrays.toString(pets));
        System.out.println("사본: " + Arrays.toString(petsCopy));

    }
}
