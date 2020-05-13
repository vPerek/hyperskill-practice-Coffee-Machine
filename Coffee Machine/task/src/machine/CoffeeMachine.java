package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

        Machine coffeeMachine = new Machine();
        Scanner scanner = new Scanner(System.in);

        while (coffeeMachine.machineState != State.TURN_OFF) {
            if(coffeeMachine.machineState == State.CHOOSING_ACTION) {
                System.out.println("Write action (buy, fill, take, remaining, exit):");
                coffeeMachine.methodIn(scanner.next());
            }

            if(coffeeMachine.machineState == State.CHOOSING_COFFEE) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                coffeeMachine.methodIn(scanner.next());
            }
        }
    }
}
