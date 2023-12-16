package org.sdu.edu.kz;

public class HeroComponent implements IHero {
    private double power;
    private double defense;
    private double health;

    public HeroComponent(double power, double defense, double health) {
        this.power = power;
        this.defense = defense;
        this.health = health;
    }

    @Override
    public double getPower() {
        return power;
    }

    @Override
    public double getDefense() {
        return defense;
    }

    @Override
    public double getHealth() {
        return health;
    }

    @Override
    public void setHealth(double health) {
        this.health = health;
    }
}
