import java.util.*;
public class primeCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter your number");
         int n = sc.nextInt();

         if(n == 0 || n == 1){   // condition 1
    System.out.println("Not prime nor composite");
      }else{
       if(n == 2){  // condition 2 nested if-else
        System.out.println("2 is prime number");
       }else{
        boolean isPrime = true;
        for(int i=2; i<=n-1; i++){
            if(n % i == 0){
                isPrime = false;
            }
        }

        if(isPrime == true){ // condition 3 nested if-else
            System.out.println(n+" " + "is prime number");
        }else{
            System.out.println(n+" " + "is composite number");
        }//condition 3 closing else

    }//condition 2 closing else
       } // condition 1 closing else 
        
}// main function
}// class