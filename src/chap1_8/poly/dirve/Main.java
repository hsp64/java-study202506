package chap1_8.poly.dirve;

public class Main {
    public static void main(String[] args) {
        Tesla t1 = new Tesla();
        Tesla t2 = new Tesla();
        Tesla t3 = new Tesla();

//        Tesla[] teslas = {t1, t2, t3};

        Sonata s1 = new Sonata();
        Sonata s2 = new Sonata();

//        Sonata[] sonatas = {s1, s2};

        Mustang m1 = new Mustang();
        Mustang m2 = new Mustang();
        Mustang m3 = new Mustang();

//        Car[] cars = {t1, t2, t3, s1, m1, m2, m2, m3, new Sonata()};
/*
        for (Car car : cars) {
            car.accelerate();
        }*/

//        Object[] arr = {1, "dfad", false, new Sonata()};

        Driver heartping = new Driver("하츄핑");

        heartping.drive(m1);
    }
}
