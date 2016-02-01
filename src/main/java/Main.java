
public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("HELLO WURLD!");
        System.out.println("Bye world!");
        countdown(10);

    }

    public static void countdown(int start) throws InterruptedException {
        for(; start >= 0; start--){
            System.out.println(start + "...");
            Thread.sleep(1000);
        }
        System.out.println("u ded, kek");
    }
}
