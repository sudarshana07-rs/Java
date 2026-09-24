import java.util.Scanner;
public class practice3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to XYZ supermart!!!");
        System.out.println("Enter the no. of items: ");
        int n= sc.nextInt();
        String[] arr= new String[n];
        // sc.next();
        for (int i=1; i<=n; i++){
            System.out.println("Enter the item "+i+" :");
            arr[i]= sc.next();
        }
        for (int i=1; i<=n; i++){
            System.out.println("Final Grocery List: \n");
            System.out.println(arr[i]);
        }
    }
}
