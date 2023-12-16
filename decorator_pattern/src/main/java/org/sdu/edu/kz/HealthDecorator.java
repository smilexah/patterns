package org.sdu.edu.kz;

public class HealthDecorator extends HeroDecorator {
    IHero iHero;
    public HealthDecorator(IHero iHero) {
        super(iHero);
        this.iHero = iHero;
    }
    @Override
    public double getHealth() {
        return iHero.getHealth() * 2;
    }
}
