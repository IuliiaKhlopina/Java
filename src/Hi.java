import java.util.Scanner;

public class Hi {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 4; i++) {
            System.out.println("Please enter your age: ");
            int age = scan.nextInt();
            if (age > 0 && age < 13) {
                System.out.println("This movie contains violence and not appropriate for you.");
            } else if (age >= 13 && age < 18) {
                System.out.println("This movie contains nudity and not appropriate for you.");
            } else if (age >= 18) {
                System.out.println("This movie is appropriate for you.");
            } else if (age == -1) {
                break;
            }
        }
    }

}
