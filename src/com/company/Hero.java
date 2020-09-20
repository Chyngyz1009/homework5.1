package com.company;

public class Hero {

    private int health;
    private int injury;
    private String superability;

    public Hero(int health, int injury, String superability) {
        this.health = health;
        this.injury = injury;
        this.superability = superability;
    }

    public Hero(int health, int injury) {
        this.health = health;
        this.injury = injury;

    }

    public int getHealth() {
        return health;
    }



    public int getinjury() {
        return injury;
    }



    public String getSuperability() {
        return superability;
    }


}
