package chap1_6.encap;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("모닝");
        // 시동 걸기 위해서 먼저 엔진오일 분사
        // 실린더 작동 -> 시동버튼 누르고 -> 시동 걸기
        myCar.pressButton();

//        myCar.model = "페라리 488 스파이더";
        // 기어 변속
        myCar.setMode("DDD");
        System.out.println("현재 모드: " + myCar.getMode());
    }
}
