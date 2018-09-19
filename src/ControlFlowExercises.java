public class ControlFlowExercises {
    public static void main(String[] args) {
        for(int i = 0; i < 101; i++){
            if(i % 15 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);

            }

        }

    }

}



//    long count = 2;
//        do {
//
//                System.out.println(count);
//                count *= count;
//
////            count *= count;
//                }while (count <= 1000000);
//
//                }

//
//    int count = 100;
//        do {
//                count -= 5;
//                System.out.println(count);
//                }while (count >= -5);



//    int i = 5;
//        while(i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//
//    }
//}
