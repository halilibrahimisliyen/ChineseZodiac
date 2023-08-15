import java.util.Scanner;

public class ChineseZodiac{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int dateOfBirth;
        System.out.println("What is yout date of birth?");
        dateOfBirth=input.nextInt();

        int remainder=dateOfBirth%12; 

        switch (remainder) {
            case 0:
                    System.out.println("Your Chinese Zodiac is Monkey");
                break;
            case 1:
                    System.out.println("Your Chinese Zodiac is Rooster");
                break;
            case 2:
                    System.out.println("Your Chinese Zodiac is Dog");
                break;
                
            case 3:
                    System.out.println("Your Chinese Zodiac is Pig");
                break;
            case 4:
                    System.out.println("Your Chinese Zodiac is Rat");
                break;
            case 5:
                    System.out.println("Your Chinese Zodiac is Ox");
                break;
                
            case 6:
                    System.out.println("Your Chinese Zodiac is Tiger");
                break;
            case 7:
                    System.out.println("Your Chinese Zodiac is Rabbit");
                break;
            case 8:
                    System.out.println("Your Chinese Zodiac is Dragon");
                break;

            case 9:
                    System.out.println("Your Chinese Zodiac is Snake");
                break;
                
            case 10:
                    System.out.println("Your Chinese Zodiac is Horse");
                break;
            case 11:
                    System.out.println("Your Chinese Zodiac is Goat");
                break;    

            default:

                System.out.println("Chinese math is over :)  ");
                break;
        }



    }
}