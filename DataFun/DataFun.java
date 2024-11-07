import java.util.Scanner;

/**
 * Project 2: DataFun
 * @ Reed Jordan
 * AP Comp Sci A w/ Mr. Smith
 * Started 11/5/2024
 * Ended 11/6/2024
 */


public class DataFun{
    public static void main(String[] args){
        favoriteNumberActivities();
        favoriteCharacterStuff();

    }

    public static void favoriteNumberActivities(){


        System.out.println("What is your favorite number?");
        Scanner input = new Scanner(System.in);
        int favNum = input.nextInt();

        if (favNum < 0){
            System.out.print(favNum +" is negative,");
        }else{
            System.out.print(favNum +" is positive,");
        }

        if (favNum > 1000){
            System.out.print(" is greater than 1000,");
        }else if(favNum > 100){
            System.out.print(" is greater than 100,");
        }else if(favNum > 10){
            System.out.print(" is greater than 10,");
        }

        if (favNum % 2 == 0){
            System.out.print(" and is even. ");
        }else{
            System.out.print(" and is odd. ");
        }

        if (favNum == 2){
            System.out.println("It is also the atomic number of the noble gas Helium.");
        }else if (favNum == 10){
            System.out.println("It is also the atomic number of the noble gas Neon.");
        }else if (favNum == 18){
            System.out.println("It is also the atomic number of the noble gas Argon.");
        }else if (favNum == 36){
            System.out.println("It is also the atomic number of the noble gas Krypton.");
        }else if (favNum == 54){
            System.out.println("It is also the atomic number of the noble gas Xenon.");
        }else if (favNum == 86){
            System.out.println("It is also the atomic number of the noble gas Radon.");
        }else{
            System.out.println("It is also not the number of any atomic gases.");
        }
    }

    public static void favoriteCharacterStuff(){


        Scanner input = new Scanner(System.in);
        System.out.print("Look at the keyboard. What is your favorite character? ");
        String userChoice = input.nextLine();
        System.out.println(" ");
        
        char choice = userChoice.charAt(0);
        int asciiVal = choice;
        
        if (asciiVal >= 48 && asciiVal <= 57){
            System.out.println(choice +" is a number, and its ASCII value is "+ asciiVal);
        }else if (asciiVal >= 65 && asciiVal <= 90){
            System.out.print(choice +" is an uppercase letter, ");
                if (asciiVal == 65 || asciiVal == 69 || asciiVal == 73 || asciiVal == 79 || asciiVal == 85 || asciiVal == 89 ){
                    System.out.print("it is a vowel, ");
                }else{
                    System.out.print("it is a consonant, ");
                }
            int upperPlace = asciiVal - 64;
            System.out.print("its ASCII value is "+ asciiVal +", and it is the "+ upperPlace);
            switch(upperPlace){
                case 1: System.out.print("st "); break;
                case 2: System.out.print("nd "); break;
                case 3: System.out.print("rd "); break;
                default: System.out.print("th ");
            }
            System.out.print("letter of the alphabet.");
        }else if (asciiVal >= 97 && asciiVal <= 122){
            System.out.print(choice +" is a lowercase letter, ");
                if (asciiVal == 97 || asciiVal == 101 || asciiVal == 105 || asciiVal == 111 || asciiVal == 117 || asciiVal == 121 ){
                    System.out.print("it is a vowel, ");
                }else{
                    System.out.print("it is a consonant, ");
                }
            int lowerPlace = asciiVal - 96;
            System.out.print("its ASCII value is "+ asciiVal +", and it is the "+ lowerPlace);
            switch(lowerPlace){
                case 1: System.out.print("st "); break;
                case 2: System.out.print("nd "); break;
                case 3: System.out.print("rd "); break;
                default: System.out.print("th ");
            }
            System.out.print("letter of the alphabet.");
        }else{
            System.out.println("You have a pretty weird favorite character.");
        }
    }

}
