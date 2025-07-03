package chap1_10.inter;


// 추상적
public interface Pet {

    // 인터페이스는 필드를 가질 수 없다.
    // 따라서 필드를 하위 클래스에게 상속시키고 싶으면 추상클래스를 써야함.
    static final String abc = "dsafd"; // 상수처리

    // 애완동물의 필수 기능
    // 노는 기능
    void handle();
    // 예방접종 기능
    boolean inject();

    // 뒤늦게 이미 구현이 많은 상태에서 새 메서드를 추가할 때는 강요하지 말자
    // 단계적으로 default ~~ {} 로 강요하지 않고 나머지 파일들을 다 바꾼 뒤 추상화한다.
    default void eat() {}

    // static 메서드는 생성 가능하다.
    static void aaa() {}
}
