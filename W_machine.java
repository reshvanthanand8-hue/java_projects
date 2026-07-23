import java.util.Scanner;
public class W_machine{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
        System.out.println("1.TOBLERON - 300$");
        System.out.println("2.BEUNO - 250$");
        System.out.println("3.GALAXY-200$");
        System.out.println("4.DORITOS - 50$");
        System.out.println("5.NACHOS - 50$");
        System.out.println("6.BINGO - 20$");
        System.out.println("7.MONSTER - 109$");
        System.out.println("8.COOL_BERG - 109$");
        System.out.println("9.EXIT");
        System.out.println("Enter your choice");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("TOBLERON");
                System.out.println("enter amount");
            int price = 300;
            int amount = scan.nextInt();
                if(amount == price) {
    System.out.println("Thanks!");
} else if(amount > price) {
    System.out.println("Change: " + (amount - price)); 
} else {
    System.out.println("Insufficient amount!"); }
                break;
        case 2:
                System.out.println("BEUNO");
                System.out.println("enter amount");
            int price_2 = 250;
            int amount_2 = scan.nextInt();
                if(amount_2 == price_2) {
    System.out.println("Thanks!");
} else if(amount_2 > price_2) {
    System.out.println("Change: " + (amount_2 - price_2)); 
} else {
    System.out.println("Insufficient amount!"); 
}
                break;
         case 3:
                System.out.println("GALAXY");
                System.out.println("enter amount");
            int price_3 = 200;
            int amount_3 = scan.nextInt();
               if(amount_3 == price_3) {
    System.out.println("Thanks!");
} else if(amount_3 > price_3) {
    System.out.println("Change: " + (amount_3 - price_3)); 
} else {
    System.out.println("Insufficient amount!"); 
}
                break;
        case 4:
                System.out.println("DORITOS");
                System.out.println("enter amount");
            int price_4 = 50;
            int amount_4 = scan.nextInt();
                if(amount_4 == price_4) {
    System.out.println("Thanks!");
} else if(amount_4 > price_4) {
    System.out.println("Change: " + (amount_4 - price_4)); 
} else {
    System.out.println("Insufficient amount!"); 
}
                break;
        case 5:
                System.out.println("NACHOS");
                System.out.println("enter amount");
            int price_5 = 50;
            int amount_5 = scan.nextInt();
                if(amount_5 == price_5) {
    System.out.println("Thanks!");
} else if(amount_5 > price_5) {
    System.out.println("Change: " + (amount_5 - price_5));
} else {
    System.out.println("Insufficient amount!"); 
}
                break;
        case 6:
                System.out.println("BINGO");
                System.out.println("enter amount");
            int price_6= 20;
            int amount_6 = scan.nextInt();
               if(amount_6 == price_6) {
    System.out.println("Thanks!");
} else if(amount_6 > price_6) {
    System.out.println("Change: " + (amount_6 - price_6)); 
} else {
    System.out.println("Insufficient amount!"); 
}
                break;
        case 7:
                System.out.println("MONSTER");
                System.out.println("enter amount");
            int price_7 = 109;
            int amount_7 = scan.nextInt();
               if(amount_7 == price_7) {
    System.out.println("Thanks!");
} else if(amount_7 > price_7) {
    System.out.println("Change: " + (amount_7 - price_7)); 
} else {
    System.out.println("Insufficient amount!"); 
}
                break;
        case 8:
                System.out.println("COOL_BERG");
                System.out.println("enter amount");
            int price_8 = 109;
            int amount_8 = scan.nextInt();
               if(amount_8 == price_8) {
    System.out.println("Thanks!");
} else if(amount_8 > price_8) {
    System.out.println("Change: " + (amount_8 - price_8)); 
} else {
    System.out.println("Insufficient amount!");
}
                break;
                case 9:
                System.out.println("Thank you!!");
                return;
        }
    }
}}
