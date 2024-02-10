import java.util.Scanner;

public class BasicInput
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter integer:");
        int userInt = scnr.nextInt();
        System.out.println("Enter double:");
        double userDouble = scnr.nextDouble();
        System.out.println("Enter character:");
        String userChar = scnr.next();
        System.out.println("Enter string:");
        String userString = scnr.next();
        System.out.println(userInt + " " + userDouble + " " + userChar + " " + userString);
        System.out.println(userString + " " + userChar + " " + userDouble + " " + userInt);
        int userCast = (int) userDouble;
        System.out.print(userDouble + " cast to an integer is " + userCast);
    }
}