package Projects.Quiz_game;

import java.util.Scanner;

public class quiz_game {
    public static void main(String[] args) throws InterruptedException {
        
        // JAVA QUIZ GAME

        // QUESTIONS array[]
        String[] questions = {"What does the acronym \"HTML\" stand for?",
                              "Which of the following is NOT a Python data type?",
                              "In Java, which keyword is used to inherit a class?",
                              "Which of these is a supervised learning algorithm?",
                              "What is the default HTTP method used by an HTML <form> if no method attribute is specified?"};

        // OPTIONS array[][]
        String[][] options = {{"1. Hyperlinks and Text Markup Language","2. Hyper Text Markup Language","3. High-level Text Markup Language","4. Hyper Text Mainframe Language"},
                              {"1. Tuple","2. List","3. Stack","4. Dictionary"},
                              {"1. extends","2. inherits","3. implements","4. override"},
                              {"1. K-Means Clustering","2. Decision Trees","3. Apriori Algorithm","4. DBSCAN"},
                              {"1. POST","2. GET","3. PUT","4. DELETE"}};
        //DECLARE VARIABLES 
        int[] answers = {2,3,1,2,2};
        int score = 0;
        int guess;

        Scanner sc = new Scanner(System.in);

        // WELCOME MESSAGE
        System.out.println("#############################");
        System.out.println("WELCOME TO THE JAVA QUIZ GAME");
        System.out.println("#############################");

        // QUESTION(loop)
        for(int i=0;i<questions.length;i++){
            System.out.println(questions[i]);

            //      OPTIONS
            for(String option : options[i]){
                System.out.println(option);
            }

            //      GET GUESS FROM USER
            System.out.print("Enter your guess : ");
            guess = sc.nextInt();

            //      CHECK OUR GUESS
            if (guess == answers[i]) {
                System.out.println("*******");
                System.out.println("CORRECT");
                System.out.println("*******");
                score++;// Incrementing the score whenever correct answer is selected
            }
            else{
                System.out.println("WRONG ANSWER :(");
            }
            Thread.sleep(1000);

        }

        // DISPLAY FINAL SCORE
        System.out.println("Your final score is "+score+" out of "+questions.length);
        sc.close();
    }
}
