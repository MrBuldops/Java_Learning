package com.company;

public class Main {

    public static void main(String[] args) {

//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        int finalS =calculateScore(gameOver, score, bonus, levelCompleted);
//        System.out.println("Your final score is " + finalS);
//
//
//        score = 10000;
//        levelCompleted= 8;
//        bonus = 200;
//
//        finalS = calculateScore(gameOver, score, bonus, levelCompleted);
//
//        System.out.println("Your final score is " + finalS);

        int pos = calculateHighScorePosition(1500);
        displayHighScore("Tomek",pos);

        pos = calculateHighScorePosition(900);
        displayHighScore("Rocco",pos);

         pos = calculateHighScorePosition(400);
        displayHighScore("Samanta",pos);

         pos = calculateHighScorePosition(50);
        displayHighScore("Luj",pos);

    }

    public static void displayHighScore(String name, int position ){

        System.out.println(name + " jest na miejscu " + position + "  w tabeli wyników");
    }


    public static int calculateHighScorePosition( int score){
        if(score > 1000)
            return 1;
        else if(score > 500 && score <= 1000)
            return 2;
        else if(score > 100 && score <=500)
            return 3;
        else
            return 4;
    }



    public static int calculateScore(boolean gameOver, int score, int bonus, int levelCompleted) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;

            return finalScore;
        }

            return -1;

    }


}
