import java.util.Scanner;
public class pratice1 {
    public static void main(String [] agrs){
        Scanner sc =new Scanner(System.in);
        // Taking the input from the user
        System.out.println("Enter a number to check even or odd: ");
        int n=sc.nextInt();
        if (n%2==0){
            System.out.println(n+" is a Even Number");
        }
        else if(n%2!=0){
            System.out.println(n+" is a Odd number");
        }
        else if(n==0){
            System.out.println("The input is zero");
        }
        else{
            System.out.println("Invalid input!!!");
        }
    }
}
