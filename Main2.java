import java.util.Scanner;
public class Main2 {
    public static void main(String[] args){
         
        Scanner input = new Scanner(System.in);
          
        System.out.println("Enter your Name : ");
        String name = input.nextLine();
        System.out.println("Enter your Age:");
        int age = input.nextInt();
        System.out.println("Enter yout Height: ");
        double height =input.nextDouble();
        if(age < 18){
            System.out.println("your are child");
        }else{
            System.out.println("Your are old man ");
        }
        System.out.println("Name: " + name + ", Age : " + age + ", Height: " + height);



    }
    
}
