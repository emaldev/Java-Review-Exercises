import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter yout Name :");
        String name = input.nextLine();
        
        System.out.println("Enter your Age: ");
        int age = input.nextInt();
        System.out.println("Enter your hight: ");
        double Height = input.nextInt();

        System.out.println("\t Hi Welcom .");
        System.out.println( "Name : " + name + " this is your age : " + age + "and this is yout Height: " + Height);
    }
    
}
