public class SandBox {

    public static int countingDown(int num) {
        if (num > 0) {
            System.out.println(num);
            return countingDown(num - 1);
        } else {
            System.out.println("Blastoff");
            return 0;
        }
    }





    public static void main(String[] args) {

        countingDown(10);
    }
}
