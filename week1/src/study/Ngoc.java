package study;

public class Ngoc implements Person{
    @Override
    public void run() {
        System.out.println("I am Ngoc. I am working as developer java at FPT software!");
    }

    @Override
    public String hometown(String a) {
        return a;
    }
}
