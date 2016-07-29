package it.morfoza.java101.pokemon;

public class Pokemon {


    private String name;
    private long health = 1000;

    public Pokemon(String name) {

        this.name = name;
    }

    public String toString(){
        return "Pokemon: " + name + " health: " + health;
    }

    public void takeAttack() {
        health -= 100;
    }


    public boolean isAlive() {
        if (health>0) {
            return true;
        } else {
            return false;
        }

    }


}
