package chap1_9.static_;

import static chap1_9.static_.Calculator.*;
import static chap1_9.static_.util.InputUtils.prompt;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        Count.m1();

        Count.x = 100;

        // 원주율 : 샤프계산기의 원주율, 삼성계산기의 원주율
        out.println(PI);

        Count c1 = new Count();
        c1.m2();

//        c1.x++;
        Count.x++;
        c1.y++;


        Count c2 = new Count();
        c2.m2();

//        c2.x++;
        Count.x++;
        c2.y++;

        c2.y = 100;
        c2.x = 999;

        out.printf("c1.x: %d, c1.y: %d\n", c1.x, c1.y);
        out.printf("c2.x: %d, c2.y: %d\n", c2.x, c2.y);


        out.println("============");

        double result = calcCircleArea(5);

        Calculator sharpCalc = new Calculator();
        sharpCalc.customizeColor("노랑색");

        random();

        String age = prompt("너 나이 써봐! : ");

    }
}