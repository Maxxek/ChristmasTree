package max.com.java;
import java.util.Scanner;

public class Menu {

    public Menu() {}

    public static int selectDirection() {
        Scanner sc = new Scanner(System.in);
        boolean incorrectInput = true;
        int userChoice = -1;

        showDirectionMenu();

        while (incorrectInput) {
            if (sc.hasNextInt()) {
                userChoice = sc.nextInt();

                if (userChoice > -1 && userChoice < 5) {
                    if (userChoice == 0) {
                        System.exit(0);
                    }
                    incorrectInput = false;
                } else {
                    System.out.println("Incorrect choice\n");
                    showDirectionMenu();
                }
            } else {
                System.out.println("Selection must be an integer");
                sc.next();
            }
        }
        return userChoice;
    }

    public static int selectHeight() {
        Scanner sc = new Scanner(System.in);
        boolean incorrectInput = true;
        int userChoice = -1;

        showHeightMenu();

        while (incorrectInput) {
            if (sc.hasNextInt()) {
                userChoice = sc.nextInt();

                if (userChoice >= 0 && userChoice < 101) {
                    if (userChoice == 0) {
                        System.exit(0);
                    }
                    incorrectInput = false;
                } else {
                    System.out.println("Incorrect choice\n");
                    showHeightMenu();
                }
            } else {
                System.out.println("Selection must be an integer");
                sc.next();
            }
        }
        return userChoice;
    }

    public static void showDirectionMenu() {
        System.out.println("In what direction should the tree grow?");
        System.out.println("Available actions:");
        System.out.println("(1) UP\n(2) DOWN\n(3) LEFT \n(4) RIGHT\n(0) EXIT");
    }

    public static void showHeightMenu() {
        System.out.println("What tree height do you want to draw?");
        System.out.println("Available options:\n(1-100) HEIGHT\n(0) EXIT");
    }
}
