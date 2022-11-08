import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Start");
//        int x = 0;
//        while (x <= 10){
//            System.out.println(x);
//            x++;
//        }
//        System.out.println("Process ended");


////        do-while
//        int y = 0;
//        do{
//            System.out.println(y);
//            y++;
//        }while (y<5);

        // Targil: Write program that asks for users age, if user age is < 18 ask him again until he enters age higher than 18;


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter your age");
//        int age = scanner.nextInt();
//
//        while (age < 18){
//            System.out.println("Please enter your age again");
//             age = scanner.nextInt();
//        }

//        Scanner scanner = new Scanner(System.in);
//        int age;
//        do {
//            System.out.println("Please enter your age");
//            age = scanner.nextInt();
//        }while (age < 18);
//
//        System.out.println("Process ended");


//        int z=10;
//        //SCOPES
//        if (true){
//            int x =10;
//            int y = 10;
//        }
//
//        if(false){
//            int x = 5;
//            System.out.println(x);
//        }
//
//        System.out.println(x); //error, out of scope


//        for (int x = 0; x < 5; x--) {
//            System.out.println(x);
//        }


        //targil: ask from a user to enter positive numbers,
        // when the user enter negative number stop the
        // loop and print the sum of all the positive numbers user entered
        // tip: should be easier with while/do-while

//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int userInput;
//        System.out.println("Please enter positive number");
//        userInput = scanner.nextInt();
//        if (userInput > 0) {
//            sum = sum + userInput;
////            sum += userInput;
//        }
//        while (userInput > 0) {
//            System.out.println("Please enter positive number again");
//            userInput = scanner.nextInt();
//            if (userInput > 0) {
//                sum = sum + userInput;
////                sum += userInput;
//            }
//        }
//        System.out.println("The sum is: " + sum);



//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int userInput = 0;
//        do{
//            System.out.println("Please enter positive number");
//            userInput = scanner.nextInt();
//            if(userInput > 0 ){
//                sum+=userInput;
//            }
////            System.out.println("sum: "+sum); //this is good way to debug
//        }while (userInput > 0);
//
//        System.out.println("Sum of positive numbers is: "+sum);


        int x =5;
        int sum =0;
        x++;

        sum +=x;

        for (int y = 0; y < 5 ; y++) {
            sum += 10;
        }
        System.out.println(sum);


    }
}
