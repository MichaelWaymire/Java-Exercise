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

        //This Method takes the starting number and counts up to the ending number.
    public static void countUp(int start, int end){
        //Once the Starting Number is then the ending number, print out "Blarg"
        if (start > end){
            //The systems pring out "Blarg' when the condition is met.
            System.out.println("Blarg");

        }else{
            //The system
            System.out.println(start);
            countUp(start +1, end);
        }
    }


    public static void main(String[] args) {

        countingDown(10);
        countUp(1,10);
    }



}
