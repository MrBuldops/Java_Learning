package com.company;


class movie{
    private String name;

    public movie(String name) {
        this.name = name;
    }

    public String plot()
    {
        return "tere is no plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends movie {

    public Jaws() {
        super("Jaws");
    }

    public String plot(){
        return "shark eats a lot of people";
    }
}

class IndependenceDay extends movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    public String plot(){
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends movie {

    public MazeRunner() {
        super("Maze  Runner");
    }

    public String plot(){
        return "Kids try to escape a maze";
    }
}

class StarWars extends movie {

    public StarWars() {
        super("Star Wars");
    }

    public String plot(){
        return "Imerial Forces try to take over the universe";
    }
}

class Forgetable extends movie{
    public Forgetable() {
        super("Forgetable");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here

        for( int i = 1; i < 11; i++){
            movie film = randomMoovie();
            System.out.println("Movie #" + i + ": "+ film.getName() + "\n" + "Plot: " + film.plot() + "\n\n");
        }
    }


    public static movie randomMoovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number: " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }

        return null;
    }
}
