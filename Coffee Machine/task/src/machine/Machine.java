package machine;
import java.util.Scanner;

public class Machine {

    public int amountOfCups = 9;
    public int amountOfWater = 400;
    public int amountOfMilk = 540;
    public int amountOfCoffee = 120;
    public int amountOfMoney = 550;

    public State machineState = State.CHOOSING_ACTION;

    public void methodIn(String str) {
        if(machineState == State.CHOOSING_ACTION) {
            switch (str) {
                case "buy":
                    machineState = State.CHOOSING_COFFEE;
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    System.out.println("I gave you $" + amountOfMoney);
                    amountOfMoney = 0;
                    break;
                case "remaining":
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("The coffee machine has:\n");
                    stringBuilder.append(amountOfWater + " of water\n");
                    stringBuilder.append(amountOfMilk + " of milk\n");
                    stringBuilder.append(amountOfCoffee + " of coffee beans\n");
                    stringBuilder.append(amountOfCups + " of disposable cups\n");
                    stringBuilder.append(amountOfMoney + " of money\n");
                    System.out.println(stringBuilder);
                    break;
                case "exit":
                    machineState = State.TURN_OFF;
                default:
                    break;
            }
        }

        if(machineState == State.CHOOSING_COFFEE) {
            switch (str) {
                case "1":
                    if (amountOfWater >= 250 && amountOfCoffee >= 16 && amountOfCups >= 1) {
                        amountOfWater -= 250;
                        amountOfCoffee -= 16;
                        amountOfCups -= 1;
                        amountOfMoney += 4;
                        System.out.println("I have enough resources, making you a coffee!");
                    } else {
                        System.out.println("Sorry, not enough resources!");
                    }
                    machineState = State.CHOOSING_ACTION;
                    break;
                case "2":
                    if (amountOfWater >= 350 && amountOfMilk >= 75 && amountOfCoffee >= 20 && amountOfCups >= 1) {
                        amountOfWater -= 350;
                        amountOfMilk -= 75;
                        amountOfCoffee -= 20;
                        amountOfCups -= 1;
                        amountOfMoney += 7;
                        System.out.println("I have enough resources, making you a coffee!");
                    } else {
                        System.out.println("Sorry, not enough resources!");
                    }
                    machineState = State.CHOOSING_ACTION;
                    break;
                case "3":
                    if (amountOfWater >= 200 && amountOfMilk >= 100 && amountOfCoffee >= 12 && amountOfCups >= 1) {
                        amountOfWater -= 200;
                        amountOfMilk -= 100;
                        amountOfCoffee -= 12;
                        amountOfCups -= 1;
                        amountOfMoney += 6;
                        System.out.println("I have enough resources, making you a coffee!");
                    } else {
                        System.out.println("Sorry, not enough resources!");
                    }
                    machineState = State.CHOOSING_ACTION;
                    break;
                case "back":
                    machineState = State.CHOOSING_ACTION;
                    break;
                default:
                    break;
            }
        }
    }

    public void fill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int coffee = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int cups = scanner.nextInt();
        amountOfWater += water;
        amountOfMilk += milk;
        amountOfCoffee += coffee;
        amountOfCups += cups;
    }




}
