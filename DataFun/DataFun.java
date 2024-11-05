import java.util.Scanner;

/**
 * Project 2: DataFun
 * @ Reed Jordan
 * AP Comp Sci A w/ Mr. Smith
 * Started 11/5/2024
 * Ended --/--/--
 */


public class DataFun{
    public static void main(String[] args){
        //favoriteNumberActivities();
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
        System.out.println("Look at the keyboard and find your favorite character. Is it a:"+
                "\n\t1- Number\n\t2- Letter");
        int userChoice = input.nextInt();

        int numFav = Integer.MIN_VALUE;
        String charaFav = null;

        switch (userChoice){
            case 1:
                System.out.println("Please enter your favorite number:");
                numFav = input.nextInt();
                break;
            case 2:
                System.out.println("Please enter your favorite character:");
                charaFav = input.nextLine();
                break;
        }

        if(numFav != Integer.MIN_VALUE){

        }
        if(!(charaFav.equals(null))){
            char ch = charaFav.charAt(0);
            int asciiVal = ch;
            System.out.print("The ascii value of your character is "+ asciiVal);
            if(asciiVal >= 65 && asciiVal <= 90){
                System.out.print(". Your character is an uppercase letter ");
                if (asciiVal == 65 || asciiVal == 69 || asciiVal == 73 || asciiVal == 79 || asciiVal == 85 || asciiVal == 89){
                    System.out.print("and a vowel.");
                }else{
                    System.out.print("and a consonant.");
                }
            }else if (asciiVal >= 97 && asciiVal <= 122){
                System.out.print(". Your character is an lowercase letter ");
                if (asciiVal == 97 || asciiVal == 101 || asciiVal == 105 || asciiVal == 111 || asciiVal == 117 || asciiVal == 122){
                    System.out.print("and a vowel.");
                }else{
                    System.out.print("and a consonant.");
                }
        }

    }

}
