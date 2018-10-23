package com.company;

public class Main {

    public static void main(String[] args) {

//        int newScore = calculateScore("Dżony", 500);
//        System.out.println("New socre is " + newScore);
//        calculateScore(75);


stopyNacm(7, 5);
stopyNacm(100);



    }


    public static double stopyNacm(double stopy, double cale){

        if (stopy < 0 || cale <   0 || cale > 12){
            return -1;
        }
        else{
            double cm = stopy * 12 *  2.54 + cale * 2.54;
            System.out.println(stopy + " stóp " + cale + " cali = " + cm + " centymetrów" );
            return cm;
        }

    }

    public static double stopyNacm( double cale){

        if ( cale <= 0 ){
            return -1;
        }
        else{
            double cm = cale * 2.54;

            double c = cale % 12;
            double s = (cale - c)/12;
            System.out.println(s + " stóp " + c + " cali = " + cm + " centymetrów" );

            return cm;
        }

    }







    public static int calculateScore( String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + "points");
        return score * 1000;

    }

    public static int calculateScore(  int score) {
        System.out.println("Unnamed player scored " + score  + " points");
        return score * 1000;

    }

    public static int calculateScore() {
        System.out.println("No name, no score");
        return 0;

    }



}
