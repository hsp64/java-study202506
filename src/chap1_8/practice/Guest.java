package chap1_8.practice;

public class Guest extends Messenger {

    public Guest(String name) {
        super(name);
    }

    @Override
    void sendMessage(String message) {
        System.out.printf("[손님] %s: %s\n", getName(), message);
    }
}