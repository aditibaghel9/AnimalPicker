import java.util.Scanner;

public class AnimalPicker{

public void animalOption(){

    System.out.println("Would you like to see a dog or cat? Enter D for dog, C for cat, F for fish, or Ca for Camel.");

    String dog = "D";
    String cat = "C";
    String fish = "F";
    String camel = "Ca";

    Scanner sc = new Scanner(System.in);

    String option = sc.nextLine(); 
        
    while(!option.equals(dog) && !option.equals(cat) && !option.equals(fish) && !option.equals(camel))
    
    {
        System.out.println("Invalid Statement");

        System.out.println("Please enter D for dog, C for cat, or F for fish.");
        option = sc.nextLine();
    }

    if(option.equals(dog)) {
           
        System.out.println(" __      _\no\'\')}____//\n `_/      )\n (_(_/-(_/");   
   }

   else if(option.equals(cat)){

        System.out.println(" _._     _,-\'\"\"`-._\n(,-.`._,\'(       |\\`-/|\n    `-.-\' \\ )-`( , o o)\n          `-    \\`_`\"\'-");   
   }   
   
   else if(option.equals(fish)){

        System.out.println("  _\n><_>");
   }
   else if(option.equals(camel)){
        System.out.println("   //\n _oo\\\n(__/ \\  _  _\n   \\  \\/ \\/ \\\n   (         )\\\n    \\_______/  \\\n     [[] [[]\n     [[] [[]");
   }
}        
    public static void main(String[] args){

        AnimalPicker obj = new AnimalPicker();

        obj.animalOption();
    }
}