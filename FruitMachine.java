//Name: Artur Romanov;
//Student number: 3123056;
package griffith;

import java.util.Random;
import java.util.Scanner;

public class FruitMachine {
    public static void main(String[] args) {
        Random ran = new Random();// METHOD TO GENERATE RANDOM NUMBERS;
        Scanner sc = new Scanner(System.in);// METHOD TO GENERATE USER-INPUT;
        int userBasicAccount = 150;// START AMOUNT OF CREDITS

        System.out.println("Hello Sir!");
        System.out.println("Please, enter your nickname to use in this game: ");
        System.out.println("Example: Destroyer83@");
        String name = sc.next().trim();
        while (true) { // LOOP FOR NAME-INPUT
            if (name.length() > 20 || // NAME SHOULDNT CONTAIN MORE THAN 20 CHARACTERS
                    name.length() < 5) { // NAME SHOUNDNT CONTAIN LESS THA 5 CHARACTERS
                System.out.println("Your name is in wrong format");
                System.out.println("Please, enter your nickname again: ");
                name = sc.next().trim(); // NEW INPUT FOR USER;
            } else {
                break;
            }

        }

        System.out.println("Welcome " + name + " to this slot machine game");

        System.out.println("Press a number to begin: ");
        // HERE IS 2 DIFFERENT OPTIONS FOR USER (START TO PLAY, OR READ THE RULES HOW TO
        // PLAY)
        System.out.println("1) Start Game");
        System.out.println("2) Read the rules");
        // THERE ARE METHOD BELOW
        // IN THIS METHOD USER CAN ENTER HIS NAME AND READ THE RULES IN THIS GAME
        start(userBasicAccount);

        //////////////////////////////////////////////

        while (true) {// IT WILL BE EASIER TO MANIPULATE IN FOR-LOOP
            System.out.print("Please select the number of option to bet on (1-6): ");
            firstOptionErrorText();// THERE ARE ONLY TEXT
            // userOptionsToPlay(userBasicAccount, name, userBet);
            String userBet = sc.next().trim();// INPUT FOR USER(REMOVING EMPTY AROUND CHARACTER;
            while (true) {// USER CAN ONLY ENTER OPTION FROM 1 TO 6 (49-54)
                if (userBet.charAt(0) >= 49 && userBet.charAt(0) <= 54 && userBet.length() == 1) {
                    break;
                } else {// OTHERWISE, MESSAGE ERROR. WHICH REQUIRED TO CHOOSE OPTION AGAIN
                    System.out.println("You have entered wrong number or symbol which is doesnt even exist!");
                    System.out.println("You are required to select your option again to bet on");
                    firstOptionErrorText(); // METHOD WHICH CONTAINS TEXT-MESSAGE;
                    userBet = sc.next().trim();// NEW INPUT FOR USERS
                }
            }
            while (true) {// LOOP WHICH IS GONNA REDUCE USER-CREDITS, DEPENDS ON OPTION
                // OPTION NUMBER 1 TAKES AWAY 10 CREDITS
                if (userBet.charAt(0) == 49) {// I DONT NEED TO PRINT MESSAGE-ERROR FOR FIRST OPTION BECAUSE USER
                                              // SHOULDNT HAVE LESS THAN 10 CREDITS TO PLAY
                    userBasicAccount = userBasicAccount - 10; // PAYMENT METHOD
                    break;
                }
                //// OPTION NUMBER 2 TAKES AWAY 20 CREDITS
                else if (userBet.charAt(0) == 50) {// 50 == 2 AND NO MORE THAN 1 CHARACTER
                    int checkBalance = userBasicAccount - 20;// IF YOU HAVE ENOUGH CREDITS FOR THIS OPTION, YOU CAN MISS
                                                             // FIRST CONDITION
                    if (checkBalance < 0) { // IF USER DOESNT HAS ENOUGH GREDITS TO PLAY, HE WILL GET MESSAGE-ERROR
                                            // AND OFFER TO CHOOSE ANOTHER OPTION TO PLAY;
                        secondOptionsErrorText();// TEXT, WHICH CONTAINS MESSAGE-ERROR;
                        userBet = sc.next(); // NEW INPUT FOR USER
                    } else {
                        userBasicAccount = userBasicAccount - 20; // PAYMENT METHOD
                        break;
                    }
                }
                // OPTION NUMBER 3 TAKES AWAY 30 CREDITS
                else if (userBet.charAt(0) == 51) {// 51 == 3 AND NO MORE THAN 1 CHARACTER
                    int checkBalance = userBasicAccount - 30;// IF YOU HAVE ENOUGH CREDITS FOR THIS OPTION, YOU CAN MISS
                                                             // FIRST CONDITION
                    if (checkBalance < 0) { // IF USER DOESNT HAS ENOUGH GREDITS TO PLAY, HE WILL GET MESSAGE-ERROR
                                            // AND OFFER TO CHOOSE ANOTHER OPTION TO PLAY;
                        secondOptionsErrorText();// TEXT, WHICH CONTAINS MESSAGE-ERROR;
                        userBet = sc.next();// NEW INPUT FOR USER
                    } else {
                        userBasicAccount = userBasicAccount - 30; // PAYMENT METHOD
                        break;
                    }
                }
                // OPTION NUMBER 4 TAKES AWAY 40 CREDITS
                else if (userBet.charAt(0) == 52) {// 52 == 4 AND NO MORE THAN 1 CHARACTER
                    int checkBalance = userBasicAccount - 40;// IF YOU HAVE ENOUGH CREDITS FOR THIS OPTION, YOU CAN MISS
                                                             // FIRST CONDITION
                    if (checkBalance < 0) { // IF USER DOESNT HAS ENOUGH GREDITS TO PLAY, HE WILL GET MESSAGE-ERROR
                                            // AND OFFER TO CHOOSE ANOTHER OPTION TO PLAY;
                        secondOptionsErrorText();// TEXT, WHICH CONTAINS MESSAGE-ERROR;
                        userBet = sc.next();// NEW INPUT FOR USER
                    } else {
                        userBasicAccount = userBasicAccount - 40; // PAYMENT METHOD
                        break;
                    }
                }
                // OPTION NUMBER 5 TAKES AWAY 50 CREDITS
                else if (userBet.charAt(0) == 53) { // 53 == 5 AND NO MORE THAN 1 CHARACTER
                    int checkBalance = userBasicAccount - 50;// IF YOU HAVE ENOUGH CREDITS FOR THIS OPTION, YOU CAN MISS
                                                             // FIRST CONDITION
                    if (checkBalance < 0) { // IF USER DOESNT HAS ENOUGH GREDITS TO PLAY, HE WILL GET MESSAGE-ERROR
                                            // AND OFFER TO CHOOSE ANOTHER OPTION TO PLAY;
                        secondOptionsErrorText();// TEXT, WHICH CONTAINS MESSAGE-ERROR;
                        userBet = sc.next();// NEW INPUT FOR USER
                    }

                    else {
                        userBasicAccount = userBasicAccount - 50; // PAYMENT METHOD
                        break;
                    }

                }
                // OPTION NUMBER 6 TAKES AWAY 100 CREDITS
                else if (userBet.charAt(0) == 54) { // 54 == 6 AND NO MORE THAN 1 CHARACTER
                    int checkBalance = userBasicAccount - 100;// IF YOU HAVE ENOUGH CREDITS FOR THIS OPTION, YOU CAN
                                                              // MISS FIRST CONDITION
                    if (checkBalance < 0) { // IF USER DOESNT HAS ENOUGH GREDITS TO PLAY, HE WILL GET MESSAGE-ERROR
                                            // AND OFFER TO CHOOSE ANOTHER OPTION TO PLAY;
                        secondOptionsErrorText();// TEXT, WHICH CONTAINS MESSAGE-ERROR;
                        userBet = sc.next(); // NEW INPUT FOR USER

                    } else {
                        userBasicAccount = userBasicAccount - 100; // PAYMENT METHOD
                        break;
                    }
                }
                // IF USER SELECTED WRONG OPTION, OR SYMBOL. HE WILL REQUIRED TO ENTER NUMBER
                // AGAIN
                else { // MESSAGE-ERROR, IF USER ENTERED WRONG CHARACTER THAN HE WILL HAVE TO CHOOSE
                       // ANOTHER OPTION AGAIN;
                    System.out.println("You have entered wrong options");
                    System.out.println(
                            "Keep in mind that you have only six options and you can choose only affordable up to your credits option!");
                    System.out.println("Please, try again");
                    secondOptionsErrorText();// TEXT, WHICH CONTAINS MESSAGE-ERROR;
                }
            }

            System.out.println(userBasicAccount); // *******************************************************************
            // TO MAKE LESS MISTAKE AS IT POSSIBLE, I AM USING THE VALUES OF CHARACTERS BY
            // GENERATING THE RANDOM NUMBERS
            // I am not using integers or another variable because it will make more mistake
            // if user will enter wrong character
            // [48,49,50,51,52,53,54,55,56,57] == [0,1,2,3,4,5,6,7,8,9]
            int userBet1 = Integer.parseInt(userBet);// CONVERTING USER OPTION INTO AMOUNT OF CREDITS (IN CASE IF HE
                                                     // WILL GUESS SOME NUMBER
            if (userBet1 == 1) { // 10 CREDITS
                userBet1 = 5 * 2; // IF USER HAVE GUESSED 1 NUMBER OF SLOT. HE WILL GET 100% OF CREDITS
            } else if (userBet1 == 2) {
                userBet1 = 5 * 4;
            } else if (userBet1 == 3) {
                userBet1 = 5 * 6;
            } else if (userBet1 == 4) {
                userBet1 = 5 * 8;
            } else if (userBet1 == 5) {
                userBet1 = 5 * 10;
            } else if (userBet1 == 6) {
                userBet1 = 5 * 20;
            }
            // GENERATING RANDOM NUMBERS;
            int n1 = ran.nextInt(48, 57);
            int n2 = ran.nextInt(48, 57);
            int n3 = ran.nextInt(48, 57);

            // ARRAY FOR RANDOM NUMBERS
            int[] randomNumberArray = { n1, n2, n3 }; // I MADE AN ARRAY FOR DIFFERENT RANDOM NUMBERS,
            System.out.println("Please select what numbers would like to bet on");
            System.out.println("First number: ");
            String userN1 = sc.next().trim();
            while (true) { // loop to make sure that user entered correct number (0-9)
                if (userN1.length() == 1 && userN1.charAt(0) >= 48 && userN1.charAt(0) <= 57) {
                    break;
                } else {
                    System.out.println("Your number is not correct or doesnt exist.");
                    userN1 = sc.next().trim(); // FIRST NUMBER
                }
            }
            System.out.println("Second number: ");
            String userN2 = sc.next();
            while (true) {
                if (userN2.length() == 1 && userN2.charAt(0) >= 48 && userN2.charAt(0) <= 57) {
                    break;
                } else {
                    System.out.println("Your number is not correct or doesnt exist.");
                    userN2 = sc.next().trim();// SECOND NUMBER
                }
            }
            System.out.println("Third number: ");
            String userN3 = sc.next();
            while (true) {
                if (userN3.length() == 1 && userN3.charAt(0) >= 48 && userN3.charAt(0) <= 57) {
                    break;
                } else {
                    System.out.println("Your number is not correct or doesnt exist.");
                    userN3 = sc.next().trim();// THIRD NUMBER
                }
            }

            // METHOD FOR INPUT, RECHECK AND VALIDATE THE NUMBER WHICH USER WANNA BET ON;
            // numberConfirmation(userN1, userN2, userN3, name); // METHOD, WHICH IS GONNA
            // TO CHECK AND IMPLEMENT CONFIRMATION OF NUMBERS
            // ARRAY FOR USER-INPUTS
            String[] numberArray = { userN1, userN2, userN3 };

            // if any user number is coincide by random number, user will get SOME AMOUNT OF
            // credits
            // DEPENDS ON BET
            if (numberArray[0].charAt(0) == randomNumberArray[0]) {
                userBasicAccount = userBasicAccount + userBet1;
            }
            if (numberArray[1].charAt(0) == randomNumberArray[1]) {
                userBasicAccount = userBasicAccount + userBet1;
            }
            if (numberArray[2].charAt(0) == randomNumberArray[2]) {
                userBasicAccount = userBasicAccount + userBet1;
            }

            int amountOfLuckyNumbers = (userBasicAccount - 150);// THE RESULT HOW MANY USER WON OR LOST IN THIS GAME

            System.out.println("                    ______________");
            System.out.println("Winning numbers were: " + "| " + (randomNumberArray[0] - 48) + " " // representing to
                                                                                                   // user the winning
                                                                                                   // numbers
                    + (randomNumberArray[1] - 48) + " "
                    + (randomNumberArray[2] - 48) + " |");
            System.out.println("                    ‾‾‾‾‾‾‾‾‾‾‾‾‾‾");// DESIGN SOLUTIONS

            if (userBasicAccount >= 10) { // CONDITION, IF USER STILL HAS enough credits to bet on;

                if (userBasicAccount > 150) { // USER HAS MORE THAN 150 CREDITS
                    System.out.println("Congratulations " + name + "!");
                    System.out.println("You won in this game: " + amountOfLuckyNumbers + "credits");
                    System.out.println("Now, your current balance in this game is " + userBasicAccount + " credits");
                } else if (userBasicAccount == 150) { // USER HAS THE SAME AMOUNT OF CREDITS
                    System.out.println(
                            "Unfortunately " + name + " your current balance is the same when you started this game");
                } else if (userBasicAccount < 150) {// USER HAS LESS THAN 150 CREDITS
                    System.out.println("Unfortunately " + name + " you have lost in this game: "
                            + (150 - userBasicAccount) + " credits");
                    System.out.println("Now, your current balance in this game is " + userBasicAccount + " credits");
                } else { // USER DOESNT HAS CREDITS ANYMORE
                    System.out.println("Sorry " + name + " you have you have lost all your credits in this game!");
                }

                System.out.println("Choose your next option...");
                System.out.println("1)Would you like to continue current game?");
                System.out.println("2)Or you want to end this game?");
                String userDecision = sc.next().trim();// INPUT
                while (true) {
                    if (userDecision.length() == 1 && userDecision.charAt(0) == 49 || userDecision.charAt(0) == 50) {
                        break;
                    } else {
                        System.out.println("You chose wrong option!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1");
                        System.out.println("1)Would you like to continue current game?");
                        System.out.println("2)Or you want to end this game?");
                        userDecision = sc.next();// INPUT
                    }
                }
                if (userDecision.charAt(0) == 49) {// IF USER DECIDED TO CONTINUE;
                    System.out.println("Alright " + name + ",");
                    System.out.println("Your current balance is " + userBasicAccount + " credits");
                    System.out.println("Print the amount you would like to bet on: ");
                } else if (userDecision.charAt(0) == 50) {// IF USER DECIDED TO FINISH TO PLAY
                    if (userBasicAccount > 150) {
                        System.out.println("You are lucky!");
                        System.out.println("During this game you won " + amountOfLuckyNumbers + "$");
                        feedBackOptionsText();// TEXT FOR MAKING CODE MORE COMPACT
                        feedBackManu(name); // I HAVE CREATED SEPARATE METHOD FOR USER FEEDBACK(LOCATED BELOW)
                        break;
                    }
                    // I`M CONSIDEING OPTIONS FOR USERS WHO WON AND LOST NONE CREDITS IN THIS GAME
                    // I SUGGEST THAT AT THE END OF EACH GAME USER HAS TO SHARE HIS FEEDBACK
                    // THERE ARE 3 DIFFERENT FEEDBACKS WHICH USER HAS TO CHOOSE
                    else if (userBasicAccount == 150) {
                        System.out.println("So " + name + ",");
                        System.out.println("During this game your balance is same");
                        feedBackOptionsText();// TEXT FOR MAKING CODE MORE COMPACT
                        feedBackManu(name); // I HAVE CREATED SEPARATE METHOD FOR USER FEEDBACK(LOCATED BELOW)
                        break;
                    } else {
                        System.out.println("Unfortunately " + name + ",");
                        System.out.println("During this game you have lost " + (150 - userBasicAccount) + " credits");
                        feedBackOptionsText();
                        feedBackManu(name);
                        break;
                    }
                }

            } else if (userBasicAccount == 0) {// If user dont have none credits;
                System.out.println("Unfortunately " + name + ", you have used all of your credits!");
                System.out.println("Your balance is " + userBasicAccount + " credits");
                System.out.println("The game is over, you can try your chances next time!!");
                break;
            }
        }
    }

    public static void start(int userBasicAccount) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            String userChose = sc.next().trim();// USER-INPUT TO CHOOSE THE OPTION ONE OR TWO;

            if (userChose.charAt(0) == 49 && userChose.length() < 2) {// USER STARTED THE GAME, AND THAN HE CAN SEE
                                                                      // AVAILABLE FOR HIM CREDITS;

                System.out.println("You have " + userBasicAccount + " credits to use in this game");
                break;
            }
            // USER CAN READ THE RULES AND THAN TAKE A DIC
            else if (userChose.charAt(0) == 50 && userChose.length() == 1) {
                System.out.println("The rules is simple.");// AT LEAST 6 DIFFERENT COMBINATIONAS OF PAYOUTS FOR RULESET
                System.out.println(
                        "1) If user will guess 1 of the numbers than he will get 100% of his bet (his balance will be the same as before user started his current bet)");
                System.out.println(
                        "2) If user had guessed precisely all the three numbers, the prize will be 300% of user-bet.");
                System.out.println("3) if none of the numbers is not coincides, user will get nothing!");
                System.out.println(
                        "4) If user will enter some character which doesn’t exist in this (0-9), user will get error-message and will be required to input current number again");
                System.out.println("Would you like to start the game,?");
                System.out.println("Press 1: ");
                String userDisicion = sc.next();
                if (userDisicion.charAt(0) == 49 && userDisicion.length() == 1) {
                    break;

                } else {
                    System.out.println("ERROR!!!");
                    System.out.println("Please, try again: ");
                }
            }

            else {
                System.out.println("You have entered wrong command!");
                System.out.print("Please, try again: ");
            }
        }
    }

    public static void firstOptionErrorText() {
        System.out.println("You have six options to bet:");
        System.out.println("1) 10 credits");
        System.out.println("2) 20 credits");
        System.out.println("3) 30 credits");
        System.out.println("4) 40 credits");
        System.out.println("5) 50 credits");
        System.out.println("6) 100 credits");
        System.out.print("Please select the amount of credits you would like to bet on: ");
    }

    public static void secondOptionsErrorText() {
        System.out.println("Unfortunately you dont have enough credits to choose second option!");
        System.out.println("Please, choose another option.");
        System.out.println("You have six options to bet:");
        System.out.println("1) 10 credits");
        System.out.println("2) 20 credits");
        System.out.println("3) 30 credits");
        System.out.println("4) 40 credits");
        System.out.println("5) 50 credits");
        System.out.println("6) 100 credits");
        System.out.println("Please enter the amount of credits you would like to bet on: ");
    }

    public static void feedBackOptionsText() {
        System.out.println("Give us your feedback about this game");
        System.out.println("Select your option: ");
        System.out.println("1) The game is awsume, I will advice it my friends;");
        System.out.println("2) I would wish more best from this game;");
        System.out.println("3) The game is AWFUL, I will never play in it!");
        System.out.println("4) I don`t want to share my feedback");
    }

    public static void feedBackManu(String name) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            // AGAIN, I`M GENERATING STRING-INPUT FOR USER TO PREVENT ERRORS IN A SYSTEM;
            String secondChance = sc.next();
            // IF USER DECIDED TO CHOOSE NUMBER 1(49), LENGTH OF HIS INPUT SHOUDN`T BE MORE
            // THAN ONE CHARACTER
            if (secondChance.charAt(0) == 49 && secondChance.length() == 1) {
                System.out.println("We are very glad for you " + name + "!");
                break;
            }
            // IF USER DECIDED TO CHOOSE NUMBER 2(50), LENGTH OF HIS INPUT SHOUDN`T BE MORE
            // THAN ONE CHARACTER
            else if (secondChance.charAt(0) == 50 && secondChance.length() == 1) {
                System.out
                        .println("Thanks for your answer, we are very appriciate your activities in this game" + name);
                break;
            }
            // IF USER DECIDED TO CHOOSE NUMBER 3(51), LENGTH OF HIS INPUT SHOUDN`T BE MORE
            // THAN ONE CHARACTER
            else if (secondChance.charAt(0) == 51 && secondChance.length() == 1) {
                System.out.println("We are sorry to hear that " + name);
                break;
            }
            // IF USER DECIDED TO CHOOSE NUMBER 4(52), LENGTH OF HIS INPUT SHOUDN`T BE MORE
            // THAN ONE CHARACTER
            else if (secondChance.charAt(0) == 52 && secondChance.length() == 1) {
                System.out.println("Have a good day " + name);
                break;
            }
            // IF USER MADE A MISTAKE BY ENTERED MORE THAN 1 CHARACTER;
            // USER WILL HAVE GOT A MESSAGE-ERROR AND WILL BE REQUIRED TO GIVE FEEDBACK
            // AGAIN;
            else if (secondChance.length() > 1) {
                System.out.println(
                        "Sorry " + name + ", you`ve entered too much answers, you have to choose only one option!");
                System.out.println("Please enter your answer again");
            }
            // IF USER MADE A MISTAKE BY ENTERED THE WRONG NUMBER OR CHARACTER;
            // USER WILL HAVE GOT A MESSAGE-ERROR AND WILL BE REQUIRED TO GIVE FEEDBACK
            // AGAIN;
            else {
                System.out.println("Sorry " + name + ", you`ve entered wrong option or wrong symbol");
                System.out.println("Please enter your answer again");
            }
        }
        // MANU, IF USER WANT TO WRITE YOUR OWN FEEDBACK TO IMPROVE THIS GAME;
        // IF USER WANT TO SKIP THIS OPTION, HE (OR SHE) CAN JUST CLICK ENTER;
        System.out.println(name + ", can you please tell us what we could improve in this game?");
        System.out.println("It would really help us to make this game better in future!");
        System.out.print("Your own feedback: ");
        String ownFeedback = sc.next();
        System.out.println("Thank you very much " + name);

    }

}
