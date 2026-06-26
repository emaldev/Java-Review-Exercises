import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
       for(int i = 1; i <= 3; i++){
        try{
        System.out.println("Processing student number successfully: ");
        System.out.println("Enter name of student " + (i + 1));
        String name = input.nextLine();
         System.out.println("Enter age of student : " +  (i + 1));
        int age = input.nextInt();
        System.out.println("Enter Height of student" + (i + 1));
        double height = input.nextDouble();
        input.nextLine();
        System.out.println("Studnt " + i + "has been registred");
        
        System.out.println("===========================<<<>>>================================");        
        System.out.println(  "|| "+" \t Name : " + name + ", \tAge: " + age + ", \tHeight: "+ height +"||"); 
        System.out.println("===========================<<<>>>================================");  
        
        
        }catch(Exception e ){
            System.out.println("Invalid : please enter number only input!");
            input.nextLine();
            i--;
        }
        
        finally{
            System.out.println("Finish program.");
        }
       }
       System.out.println("All students have been procssed");
     
       input.close();
    }
    
    
}
