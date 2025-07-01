package chap1_7.inherit.player;

public class Hunter extends Player{

    int concentrate; // 집중 게이지

    public Hunter(String nickName) {
        super(nickName,60);
        this.concentrate = 100;
    }

    void multiArrow() {
        System.out.printf("%s님이 점프합니다.\n", this.nickName);

    }
}
