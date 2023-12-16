package org.sdu.edu.kz;

public abstract class HeroDecorator implements IHero {
    private final IHero iHero;
    private double health;

    public HeroDecorator(IHero iHero) {
        this.iHero = iHero;
    }

    @Override
    public double getPower() {
        return iHero.getPower();
    }

    @Override
    public double getDefense() {
        return iHero.getDefense();
    }

    @Override
    public double getHealth() {
        return iHero.getHealth();
    }

    @Override
    public void setHealth(double health) {
        this.health = health;
    }
}
