// public class Main {
//     public static void main(String[] args) {
//         int two = 20;
//         two = 38;
//         System.out.println(two + two);
//     }
// } 


// public class Main {
//     public static void main(String[] args) {
//         int num1 = 3;
//          int num2 = 2;
//         System.out.println(num1/num2);
//     }
// } 



// public class Main {
//     public static void main(String[] args) {
//         int num1 = 5 ;
//          int num2 =3 ;
//          double result = (double)num1/num2;
//         System.out.println(result);
//     }
// } 





// During decleration or duing initializating a variablr we can not use these operator like +=,-= etc we can only = operator.

// error vala example =>
    
// public class Main {
//     public static void main(String[] args) {
//         int a;
//         a += 11;
//         System.out.println(a);
//     }
// } 

// sahi tarika =>

// public class Main {
//     public static void main(String[] args) {
//         int a=11;
//         a += 11;
//         System.out.println(a);
//     }
// } 


// Uniary operator:

// public class Main {
//     public static void main(String[] args) {
//        int num1 = 23;
//        int num2 = 40;
        
//         System.out.println(num1 | num2);
//     }
// } 



// public class Main {
//     public static void main(String[] args) {
//        int num1 = 23;
//        int num2 = 40;
        
//         System.out.println(num1 & num2);
//     }
// } 


// XOR Operator
// Input A	Input B	XOR (\(A \oplus B\))
// 0	0	0
// 0	1	1
// 1	0	1
// 1	1	0

// • With multiple inputs: XOR returns true if the count of true (1) inputs is odd, and false if it is even.

// public class Main {
//     public static void main(String[] args) {
//        int num1 = 23;
//        int num2 = 40;
        
//         System.out.println(num1 ^ num2);
//     }
// } 


// Not operator


// public class Main {
//     public static void main(String[] args) {
//        int num1 = 23;
//        int num2 = 40;
//        int result = num1 & num2;

        
//         System.out.println(~result);
//     }
// } 







// public class Main {
//     public static void main(String[] args) {
//         int org = 729;
//         int rev = 0;

//         rev = rev + org % 10 * 100;
//         org = org/10;

//         rev = rev + org % 10 * 10;
//         org = org/10;

//        int Result = rev + org;

//         System.out.println(Result);
//     }
// } 




// public class Main {
//     public static void main(String[] args) {
//         int org = 4256;   
//         int rev = 0;

//         rev = org %10 *1000;
//         org = org/10;

//         int rev1 = org % 10 *100;
//         org = org/10;

//         int rev2 = org % 10 * 10;

//        int Result = rev + rev1 + rev2 + org;

//         System.out.println(Result);
//     }
// } 



// use if condition when you need to tae single decision only.




// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Can you vote:");
//         String vote = sc.nextLine();
        
//         System.out.println(vote.equals("yes"));
//         System.out.println(vote);

        

//         if(vote.equals("yes")){
//             System.out.println("Eligible ");
//         }
//         else{
//             System.out.println("Not Eligible ");

//         }
//     }
// } 


// public class Main {
//     public static void main(String[] args) {
//        int a = 17;
//        int b = 23;
//        System.out.println(a%b == 5); 
//     }
// }



















// ======================================================================================================

// public class Main {
//     public static void main(String[] args) {
//         int org = 7298;
//         int rev = 0;

//         rev = rev + org % 10 * 1000;
//         org = org/10;

//         rev = rev + org % 10 * 100;
//         org = org/10;

//         rev = rev + org % 10 * 10;
//         org = org/10;

//         rev = rev + org %10 * 1;

//         System.out.println(rev);
//     }
// } 


// public class Main {
//     public static void main(String[] args) {
//         int org = 7298;
//         int rev = 0;

//         rev = rev + org % 10 * 10^3;
//         org = org/10;

//         rev = rev + org % 10 * 10^2;
//         org = org/10;

//         rev = rev + org % 10 * 10^1;
//         org = org/10;

//         rev = rev + org %10 * 10^0;

//         System.out.println(rev);
//     }
// } 




// public class Main {
//     public static void main(String[] args) {
//         int org = 7298;
//         int rev = 0;

//        if(org<1){
          
//        }

//         System.out.println(rev);
//     }
// } 




// public class Main {
//     public static void main(String[] args) {
//     int num = 9258;
//       num = num / 10;
//       num = num / 10;
//       num = num / 10;
//       num = num / 10;
//     int count = num;
//         System.out.println(count);
//     }
// }




// Ques. found the digit count of a number ?

// public class Main {
//     public static void main(String[] args) {
//     int num = 9258;
//     int i;
//       for( i=0; num>0; i++){ // here num>0 humari originall value  represent kar rha hai ye 9258 hai .
//         num = num/10;
//          System.out.println(i);
//       }
//         System.out.println(i);
//          System.out.println(num);
//     }
// }



//using for loop
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int org = sc.nextInt();
        
//         // int org = 7298;
//         int num = org;
//         int rev = 0;
//         int i;
//         int count;

//         for( i=0; num>0; i++){ // here num>0 humari originall value  represent kar rha hai ye 7298 hai .
//             num = num/10;    
//         }
//         count = i;
//         System.out.println(count);

//         for(; i>0; i--){ // here you dont need to write count or i here.
//             rev = rev + org % 10 * (int) Math.pow(10, i-1);
//             org = org/10;
//             System.out.println("i =" + i);
//             System.out.println("rev =" + rev);
//             System.out.println("org =" + org);
//             //  System.out.println( Math.pow(10, 2));
//         }
//     }
// } 
// i =4
// rev =8000
// org =729
// i =3
// rev =8900
// org =72
// i =2
// rev =8920
// org =7
// i =1
// rev =8927
// org =0




//  import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//        int num;
//        int x;
//        Scanner sc = new Scanner(System.in);
//          System.out.println("Enter your number");
//           num = sc.nextInt();

//         sc = new Scanner(System.in);
//          System.out.println("Enter your number");
//           x = sc.nextInt();  
        
//       if(num%x == 0){
//         System.out.println("not divisible"); 
//       }else{
//         System.out.println(" divisible");
//       }
//     }
// }




//  import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//        int num;
    //    int x;
    //    Scanner sc = new Scanner(System.in);
    //      System.out.println("Enter your number");
    //       num = sc.nextInt();

//         sc = new Scanner(System.in);
//          System.out.println("Enter your number");
//           x = sc.nextInt();  
//         if(num != 0 && x !=0){
//             if(num%x > 0 || num%x < 0){
//                 System.out.println("not divisible"); 
//             }
//             else{
//                 System.out.println(" divisible");
//             }
//         }
//         else{
//             System.out.println("Please enter a valid Number");
//         }
//     }
// }


// In Java, the bitwise operators have a defined precedence:
// &
// ^
// |


// public class Main {
//     public static void main(String[] args) {

// int org = 9258;
// int rev = 0;

//  rev = rev + org%10*1000;
//  org = org/10;

//  rev = rev + org%10*100;
//  org = org/10;

//  rev =  rev + org%10*10;
//  org = org/10;

//  rev =  rev + org%10*1;
//  org = org/10;

//  int result = rev + org;
//    System.out.println(result);
//     }
// }



// // Switch statrement :- 

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {

//         int a;
//         int b;
//         int choice;
//         int result;
//        Scanner sc = new Scanner(System.in);
//          System.out.println("Enter number");
//           a = sc.nextInt();

//          System.out.println("Enter number");
//           b = sc.nextInt();

//          System.out.println("Enter number");
//           choice = sc.nextInt();

//      switch(choice){
//         case 1:
//              result = a + b; 
//              break;
//         case 2:
//              result =  a - b;
//              break;
//         case 3: 
//              result = a * b;
//              break;
//         case 4: 
//              result = a / b;
//              break;
//         case 5:
//               result = a % b;
//               break;
//         default: 
//               result = a - b;
//      }
//     System.out.println(result);
//     }
// }





import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1, number2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count:");
        number1 = sc.nextInt();

        System.out.println("Enter count:");
        number2 = sc.nextInt();

        int gcd = 1;
        for (int i = 0; i <= number1 && i <= number2; i++) {
           if(number1 % 1 == 0 && number2 % 1 == 0){
            gcd = i;
           }
        }

        System.out.println(gcd);
    }
}