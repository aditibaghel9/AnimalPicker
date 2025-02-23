import java.util.Scanner;

public class AnimalPicker{

public void animalOption(){

    System.out.println("Would you like to see a dog or cat? Enter D for dog or C for cat.");

    String dog = "D";
    String cat = "C";

    Scanner sc = new Scanner(System.in);

    String option = sc.nextLine(); 
        
    while(!option.equals(dog) && !option.equals(cat))
    
    {
        System.out.println("Invalid Statement");

        System.out.println("Please enter D for dog or C for cat.");
        option = sc.nextLine();
    }

    if(option.equals(dog)) {
           
        System.out.println("DOG ASCII ART HERE");   
   }

   else if(option.equals(cat)){

        System.out.println("CAT ASCII ART HERE");   
   }       
}       
    
    public static void main(String[] args){

        AnimalPicker obj = new AnimalPicker();

        obj.animalOption();
    }
}