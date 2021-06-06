import java.util.Scanner;

public class FirstName {
    public static void main(String[] args){
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("Hello, " + input + " ,nice to meet you!");
    }
}
