public class Main {
    public static void main(String[] args) {
        int balance = 500;
        int refill = 3_000;
        int total = balance + refill;
        int bonus = refill / 100;
        int end = refill + bonus;
        if (refill >= 1000) {
            System.out.println(end);
        } else {
            System.out.println(total);
        }
    }
}