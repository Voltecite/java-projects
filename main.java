package net.voltecite;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* EXERCISE 1 */

        /* Variables */

        int points = 0;
        boolean allCorrect = false;
        String answer = "World Wide Web";
        String answer2 = "Australia";
        String answer3 = "Fear of dogs";
        
        /* Trivia Game!! */
        System.out.println("       &&&&&&&&&&&&&&&&&&&&&");
        System.out.println("&&&&& Welcome to TRIVIA NIGHT &&&&&");
        System.out.println("       &&&&&&&&&&&&&&&&&&&&&");

        Scanner scanner = new Scanner(System.in);
        System.out.println("To start please enter your name: ");
        String userName = scanner.next();

        System.out.println("Alright " + userName + " get ready for the first question!\n");


        /* Trivia Question 1!! */
        Scanner scan1 = new Scanner(System.in);
        System.out.println("What does “www” stand for in a website browser? :" );
        String userInput;
        userInput = scan1.nextLine();


        if (userInput.equals(answer))
        {
            System.out.println("Correct! That one was super easy!");
            points++;

        } else
        {
            System.out.println("I'm sorry but that is wrong");
            System.out.println("The correct answer is: '" + answer + "'");
        }
        // Temp
        System.out.println("THIS IS HOW MANY POINTS YOU HAVE NOW: " + points);


        /* Trivia Question 2! */

        System.out.println("On to, question number 2!");
        System.out.println("Which country do cities of Perth, Adelade & Brisbane belong to?");

        Scanner scan2 = new Scanner(System.in);
        String userInput2 = scan2.next();

        if (userInput2.equals(answer2))
        {
            System.out.println("Wow! I can't believe you actually got that one! Nice job!");
            points++;
        } else
        {
            System.out.println("Sorry... But the correct answer is actually, " + answer2);
        }

        System.out.println("THIS IS HOW MANY POINTS YOU HAVE NOW: " + points);

        /* Trivia Question 3 */

        System.out.println("On to, question number 3!");
        System.out.println("What is 'Cynophobia'?");

        Scanner scan3 = new Scanner(System.in);
        String userInput3;
        userInput3 = scan3.nextLine();

        if (userInput3.equals(answer3) && points == 2)
        {
            System.out.println("CORRECT!! WOWWOW I can't believe you managed to get them all right!?");
            allCorrect = true;
            points++;
        } else if (userInput3.equals(answer3))
        {
            System.out.println("Alright alright! Nice job! That was correct!");
            points++;
        } else
        {
            System.out.println("I'm sorry to say but that is incorrect!");
            System.out.println("The correct answer is actually, " + answer3);
        }

        /* Results! */

        if (allCorrect)
        {
            System.out.println("I cannot believe you managed to figure all of them out!\n Great job " + userName + "! Go be amazing!");
        } else if (points == 2 || points == 1)
        {
            System.out.println("Not so hard was it huh? Keep studying to make sure you get it on the next go around!\n Here's a participation award!");
        } else
        {
            System.out.println("It was super random so don't feel so bad! Keep trying and I know you'll get it next time!");
        }


    }

}
