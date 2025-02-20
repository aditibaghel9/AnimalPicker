import java.util.Scanner;

public class AnimalPicker{

public void animalOption(){

    System.out.println("Would you like to see a dog or cat? Enter D for dog or C for cat.");

    Scanner sc = new Scanner(System.in);

    String option = sc.next();

    if(option.equals("D")){

        System.out.println("DOG ASCII ART HERE");
    }

    if(option.equals("C")){

        System.out.println("CAT ASCII ART HERE");
        }
}

    public static void main(String[] args){

        AnimalPicker obj = new AnimalPicker();

        obj.animalOption();
    }
}