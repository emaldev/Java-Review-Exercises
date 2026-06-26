import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Age: ");
        int age = input.nextInt();
        System.out.println("Enter your hight: ");
        int Height = input.nextInt();

        System.out.println("\t Hi Welcom .");
        System.out.println("this is your age : " + age + "and this is yout Height: " + Height);
    }
    
}
