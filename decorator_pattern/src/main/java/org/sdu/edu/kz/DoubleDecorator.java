package org.sdu.edu.kz;

public class DoubleDecorator extends HeroDecorator {
    IHero iHero;
    public DoubleDecorator(IHero iHero) {
        super(iHero);
        this.iHero = iHero;
    }

    @Override
    public double getPower() {
        return iHero.getPower() * 2;
    }

    @Override
    public double getDefense() {
        return iHero.getDefense() * 2;
    }

    @Override
    public double getHealth() {
        return iHero.getHealth() * 2;
    }
}
