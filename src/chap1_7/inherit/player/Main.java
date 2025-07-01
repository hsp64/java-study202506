package chap1_7.inherit.player;

/*
    Object 는 모든 클래스의 부모이다.
                  Object
                    |
                 Player
             /     |     \
         Warrior  Mage   Hunter
           /    \  |
     Berserker  warMage
     기본 상속에서는 다중상속을 막고 있다.
 */

public class Main {
    public static void main(String[] args) {

        Warrior warrior = new Warrior("주차왕파킹");
        Mage mage = new Mage("충격왕쇼킹");
        Hunter hunter = new Hunter("스티븐호킹");

        warrior.showStatus();
        warrior.attack();

//        warrior.
        System.out.println("==========");

        mage.showStatus();
        mage.attack();
        System.out.println("==========");

        hunter.showStatus();
        hunter.attack();
        System.out.println("==========");


    }
}
