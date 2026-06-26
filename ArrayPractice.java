import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double[] scores = new double[5];
        double sum = 0; 
        double average; 
       
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++\n");
        for(int i = 0; i < scores.length; i++){
            System.out.println("Enter scores " + (i  + 1) + ": ");
            scores[i] = input.nextDouble();

        } 

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++\n");
        for(int i = 0; i < scores.length; i++){

            
            System.out.println( "this is array number :> "+ (i + 1)+": " + scores[i]);
            sum += scores[i];
        }

         average = (double) sum / 5;
        System.out.println("This is average studetn : " + average);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++\n ");
        for(int i = 0; i < scores.length; i++){
            if(scores[i] > average){
                System.out.println("this is grade the average:> " + scores[i]);
            }

        }

        double  max = scores[0];
        double  min = scores[0];
         System.out.println("=============================================\n");
        System.out.println("This is the max and min menou");

        for(int i = 0; i < scores.length; i++){
            if(scores[i] > max) max  = scores[i];
            if(scores[i] < min ) min = scores[i];
           
        }
        System.out.println("this is the max numbe of array :> " +  max);
        System.out.println("This is the min number of array :> " + min );

     
    }
    
}
