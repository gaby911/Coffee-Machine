

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
//        System.out.println("Starting to make a coffee");
//        System.out.println("Grinding coffee beans");
//        System.out.println("Boiling water");
//        System.out.println("Mixing boiled water with crushed coffee beans");
//        System.out.println("Pouring coffee into the cup");
//        System.out.println("Pouring some milk into the cup");
//        System.out.println("Coffee is ready!");

        Scanner sc = new Scanner(System.in);


//
//        System.out.println("Write how many cups of coffee you will need:");
//        int cupsOfCofee = sc.nextInt();
//
//        System.out.println("For " + cupsOfCofee +" cups of coffee you will need:");
//        int water = cupsOfCofee * 200;
//        int milk = cupsOfCofee * 50;
//        int coffeeBeans = cupsOfCofee * 15;
//
//        System.out.println(water +" ml of water");
//        System.out.println(milk +" ml of milk");
//        System.out.println(coffeeBeans +" g of coffee beans");

        /*System.out.println("Write how many ml of water the coffee machine has: ");
        int waterIn = sc.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milkIn = sc.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeBeansIn =sc.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        int cupsOfCoffeeNeeded = sc.nextInt();

        int water = waterIn/200;
        int milk = milkIn/50;
        int coffeeBeans = coffeeBeansIn/15;

        int minimIngredient = Math.min(water, Math.min(milk, coffeeBeans));

        if (cupsOfCoffeeNeeded<minimIngredient){
            int N = minimIngredient-cupsOfCoffeeNeeded;
            System.out.println("Yes, I can make that amount of coffee (and even " +N+ " more than that)");
        }else if (cupsOfCoffeeNeeded==minimIngredient){
            System.out.println("Yes, I can make that amount of coffee");
        }else if(cupsOfCoffeeNeeded>minimIngredient){
            System.out.println("No, I can make only " +minimIngredient+ " cup(s) of coffee");
        }
    */
    
    /* #################################Stage 4 #####################################
        int waterIn = 400;
        int milkIn = 540;
        int coffeeBeansIn = 120;
        int disposableCupsIn = 9;
        int moneyIn = 550;

        System.out.println("The coffee machine has:" + "\n" + waterIn +" of water"
                                                    + "\n" + milkIn +" of milk"
                                                    + "\n" + coffeeBeansIn +" of coffee beans"
                                                    + "\n" + disposableCupsIn +" of disposable cups"
                                                    + "\n" + moneyIn +" of money"
        );

        System.out.println("Write action (buy, fill, take):");
        String action = sc.next();
        switch (action){
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                int coffeeChoice = sc.nextInt();
                if (coffeeChoice == 1){
                    waterIn = waterIn - 250;
                    coffeeBeansIn =coffeeBeansIn - 16;
                    moneyIn =moneyIn + 4;
                    disposableCupsIn--;
                    System.out.println("The coffee machine has:" + "\n" + waterIn +" of water"
                            + "\n" + milkIn +" of milk"
                            + "\n" + coffeeBeansIn +" of coffee beans"
                            + "\n" + disposableCupsIn +" of disposable cups"
                            + "\n" + moneyIn +" of money"
                    );
                }else if(coffeeChoice ==2 ){
                    waterIn = waterIn - 350;
                    milkIn = milkIn - 75;
                    coffeeBeansIn = coffeeBeansIn - 20;
                    moneyIn =moneyIn + 7;
                    disposableCupsIn--;
                    System.out.println("The coffee machine has:" + "\n" + waterIn +" of water"
                            + "\n" + milkIn +" of milk"
                            + "\n" + coffeeBeansIn +" of coffee beans"
                            + "\n" + disposableCupsIn +" of disposable cups"
                            + "\n" + moneyIn +" of money"
                    );
                }else if (coffeeChoice == 3){
                    waterIn = waterIn - 200;
                    milkIn = milkIn - 100;
                    coffeeBeansIn = coffeeBeansIn - 12;
                    moneyIn = moneyIn + 6;
                    disposableCupsIn--;
                    System.out.println("The coffee machine has:" + "\n" + waterIn +" of water"
                            + "\n" + milkIn +" of milk"
                            + "\n" + coffeeBeansIn +" of coffee beans"
                            + "\n" + disposableCupsIn +" of disposable cups"
                            + "\n" + moneyIn +" of money"
                    );
                }
                break;
            case "fill":
                System.out.println("Write how many ml of water do you want to add:");
                int waterAdd = sc.nextInt();
                System.out.println("Write how many ml of milk do you want to add:");
                int milkAdd = sc.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add:");
                int coffeeBeansAdd = sc.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add: ");
                int disposableCupsAdd = sc.nextInt();
                waterIn =waterIn +waterAdd;
                milkIn =milkIn +milkAdd;
                coffeeBeansIn =coffeeBeansIn+coffeeBeansAdd;
                disposableCupsIn =disposableCupsIn +disposableCupsAdd;
                System.out.println("The coffee machine has:" + "\n" + waterIn +" of water"
                        + "\n" + milkIn +" of milk"
                        + "\n" + coffeeBeansIn +" of coffee beans"
                        + "\n" + disposableCupsIn +" of disposable cups"
                        + "\n" + moneyIn +" of money"
                );
                break;
            case "take":
                System.out.println("I gave you $" + moneyIn);
                moneyIn =0;

                System.out.println("The coffee machine has:" + "\n" + waterIn +" of water"
                        + "\n" + milkIn +" of milk"
                        + "\n" + coffeeBeansIn +" of coffee beans"
                        + "\n" + disposableCupsIn +" of disposable cups"
                        + "\n" + moneyIn +" of money"
                );
                break;
        }
        */
        
        //############################# Stage 5 ###################################
        int waterIn = 400;
        int milkIn = 540;
        int coffeeBeansIn = 120;
        int disposableCupsIn = 9;
        int moneyIn = 550;

        boolean loop = true;

        while(loop){
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = sc.next();

            switch (action) {
                case "buy":
                    System.out.println();
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                    String coffeeChoice = sc.next();
                    switch (coffeeChoice) {
                        case "1":
                            if ((waterIn >= 250) && (coffeeBeansIn >= 16)) {
                                waterIn = waterIn - 250;
                                coffeeBeansIn = coffeeBeansIn - 16;
                                moneyIn = moneyIn + 4;
                                disposableCupsIn--;
                                System.out.println("I have enough resources, making you a coffee!");
                                System.out.println();
                            } else if (waterIn < 250) {
                                System.out.println("Sorry, not enough water!");
                                System.out.println();
                            } else if (coffeeBeansIn < 16) {
                                System.out.println("Sorry, not enough coffee beans!");
                                System.out.println();
                            }
                            break;
                        case "2":
                            if ((waterIn >= 350) && (milkIn >= 70) && (coffeeBeansIn >= 20)) {
                                waterIn = waterIn - 350;
                                milkIn = milkIn - 75;
                                coffeeBeansIn = coffeeBeansIn - 20;
                                moneyIn = moneyIn + 7;
                                disposableCupsIn--;
                                System.out.println("I have enough resources, making you a coffee!");
                                System.out.println();
                            } else if (waterIn < 350) {
                                System.out.println("Sorry, not enough water!");
                                System.out.println();
                            } else if (coffeeBeansIn < 20) {
                                System.out.println("Sorry, not enough coffee beans!");
                                System.out.println();
                            } else if (milkIn < 75) {
                                System.out.println("Sorry, not enough coffee milk!");
                                System.out.println();
                            }
                            break;
                        case "3":
                            if ((waterIn >= 200) && (milkIn >= 100) && (coffeeBeansIn >= 12)) {
                                waterIn = waterIn - 200;
                                milkIn = milkIn - 100;
                                coffeeBeansIn = coffeeBeansIn - 12;
                                moneyIn = moneyIn + 6;
                                disposableCupsIn--;
                                System.out.println("I have enough resources, making you a coffee!");
                                System.out.println();
                            } else if (waterIn < 200) {
                                System.out.println("Sorry, not enough water!");
                                System.out.println();
                            } else if (coffeeBeansIn < 12) {
                                System.out.println("Sorry, not enough coffee beans!");
                                System.out.println();
                            } else if (milkIn < 100) {
                                System.out.println("Sorry, not enough coffee milk!");
                                System.out.println();
                            }
                            break;
                        case "back":
                            break;
                    }

                    break;
                case "fill":
                    System.out.println();
                    System.out.println("Write how many ml of water do you want to add:");
                    int waterAdd = sc.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    int milkAdd = sc.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int coffeeBeansAdd = sc.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add: ");
                    int disposableCupsAdd = sc.nextInt();
                    waterIn = waterIn + waterAdd;
                    milkIn = milkIn + milkAdd;
                    coffeeBeansIn = coffeeBeansIn + coffeeBeansAdd;
                    disposableCupsIn = disposableCupsIn + disposableCupsAdd;
                    System.out.println();
                    break;
                case "take":
                    System.out.println();
                    System.out.println("I gave you $" + moneyIn);
                    moneyIn = 0;
                    System.out.println();
                    break;
                case "remaining":
                    System.out.println();
                    System.out.println("The coffee machine has:" + "\n" + waterIn + " of water"
                            + "\n" + milkIn + " of milk"
                            + "\n" + coffeeBeansIn + " of coffee beans"
                            + "\n" + disposableCupsIn + " of disposable cups"
                            + "\n" + moneyIn + " of money"
                    );
                    System.out.println();
                    break;
                case "exit":
                    loop = false;
                    break;
            }
        }
       

    }
}