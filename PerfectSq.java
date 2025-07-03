public class PerfectSq {
    public static void main(String[] args) {
        System.out.println("Perfect squares between 1 and 100:");

        for (int i = 1; i * i <= 100; i++) {
            System.out.println(i * i);
        }
    }
}
