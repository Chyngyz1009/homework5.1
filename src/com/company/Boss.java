package com.company;

public class Boss {

    private int health;
    private int injury;
    private String defence;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health1) {
        this.health = health1;
    }

    public int getInjury() {
        return injury;
    }

    public void setInjury(int injury) {
        this.injury = injury;
    }

    public String getDefence() {
        return defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }

    public void printInfo() {
        System.out.println("Health: "+ getHealth() +"\n Damage:" +getInjury()+"\n Defence: "+getDefence());
    }
}
