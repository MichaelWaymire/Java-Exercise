public class PushUps {

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


    public static String fizzBuzz(int num){
        if(num % 15 == 0) {
            System.out.println("FizzBuzz");
        }else if (num % 5 == 0) {
            return "Buzz";
        }else if (num % 5 == 0) {
            return "Fizz";
        }else{
            System.out.println(num);
        }
        return null;
    }

    public static boolean sleepIn(boolean weekday,boolean vacation) {
        if(!weekday || vacation){
            System.out.println("Sleep In");
            return true;
        }
        System.out.println("Not today!");
        return false;
    }

//    Given an int n, return the absolute difference between n and 21, except
//    return double the absolute difference if n is over 21.

    public static void differenceTwentyOne(int num){
        if(num < 21){
            System.out.println(21 - num);
        }
        if(num > 21){
            System.out.println(num * num);
        }
    }

    public boolean icyHot(int temp1, int temp2) {
        if((temp1 < 0 || temp1 > 100)&& (temp2 < 0 || temp2 > 100)){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {

        differenceTwentyOne(12);
        differenceTwentyOne(22);
        sleepIn(true,true);
        sleepIn(true, false);
        sleepIn(false, true);
        countingDown(10);
        countUp(1,10);
    }




}
