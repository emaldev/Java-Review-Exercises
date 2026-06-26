import java.util.Scanner;
public class CalcuSwitch {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
      
        while(true){
            
            
            System.out.println("Enter  a number (1-4) \n number-1=> Add(sum) \n number-2 => Subrract.\n number-3 => Multiplay. \n number-4 => Divide. \n number-5 => Exit whith zero(0) ");
            int number =  input.nextInt();
            if(number == 0){
                System.out.println("Exiteing program....");
                break;
            }
            System.out.println("Enter number 1: ");
           int number1 = input.nextInt();
           System.out.println("Enter number 2: ");
           int number2 = input.nextInt();
           int sum ;
           int subtract ;
           int multiplay;
           double divide ;
           String exit = input.nextLine();
  
         
        switch (number) {
            case 1:
                sum = number1 + number2;
                System.out.println("+++++++++++++++++++++<<<<: SUM :>>>>+++++++++++++++++++++\n");
                System.out.println("\t \t sum : " + sum + "\n");
                System.out.println("+++++++++++++++++++++<<<<:  SUM :>>>>+++++++++++++++++++++\n");
                
                break;
            case 2:
                subtract = number1 - number2;
                System.out.println("+++++++++++++++++++++<<<<: SUBTRACT :>>>>+++++++++++++++++++++\n");
                System.out.println("\t Subtract: " + subtract + "\n");
                System.out.println("+++++++++++++++++++++<<<<: SUBTRACT :>>>>+++++++++++++++++++++\n");

                  break;
            case 3:
                multiplay = number1 * number2;
                System.out.println("+++++++++++++++++++++<<<<: MULTIPLAY :>>>>+++++++++++++++++++++\n");
                System.out.println(" \t Multiplay: " + multiplay + "\n");
                System.out.println("+++++++++++++++++++++<<<<: MULTIPLAY :>>>>+++++++++++++++++++++\n");
                break;
            case 4:
                if(number2 == 0 ){
                    System.out.println("I cannot divide the number by zero");
                }else{
                    divide =(double) number1 / number2;
                    System.out.println("+++++++++++++++++++++<<<<: DIVIDE :>>>>+++++++++++++++++++++\n");
                    System.out.println("\t Divide: " + divide +"\n");
                    System.out.println("+++++++++++++++++++++<<<<: DIVIDE :>>>>+++++++++++++++++++++\n");
                }
                break;
             
            default:
                System.out.println("Invalid choise!");
                break;
          }

          
         
          
      }

    }
    
}
