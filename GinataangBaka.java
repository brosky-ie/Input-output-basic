import java.util.Scanner;
public class GinataangBaka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your favorite color: ");
        String color = sc.next();

        System.out.println("Hello, " + name + "!");
        System.out.println("Your age in 10 years will be: " + (age + 10));
        System.out.println("Your favorite color is: " + color);
    }
}
