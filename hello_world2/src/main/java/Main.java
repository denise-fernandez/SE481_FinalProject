import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello User!! Please Enter an int value between 0 and 10");
        String lang = input.nextLine();
        System.out.println("You said: " +lang);

        int num = Integer.parseInt(lang);

        if( 0 <= num && num < 3){
            System.out.println("Hola Mundo!");

        } else if (3 <= num && num < 6){
            System.out.println("Bonjour le Monde!");

        } else if (6 <= num && num < 9){
            System.out.println("こんにちは世界    Kon'nichiwa sekai");

        } else if (9 <= num && num <= 10){
            System.out.println("你好，世界     Nǐ hǎo, shìjiè");

        } else {
            System.out.println("You're out of bounds! Goodbye!!!");
        }

    }
}