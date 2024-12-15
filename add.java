import java.util.Scanner;

public class add {

 
    public static void main(String args[]){

        Scanner inputAccess = new Scanner(System.in);

        System.out.print("Enter frist number : ");

        int one = inputAccess.nextInt();
        System.out.print("Enter second number : ");
        int two = inputAccess.nextInt();
        System.out.println(one * two );



        inputAccess.close();






    }


    
}