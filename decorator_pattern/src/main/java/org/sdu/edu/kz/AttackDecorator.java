package org.sdu.edu.kz;

public class AttackDecorator extends HeroDecorator {
    IHero iHero;
    public AttackDecorator(IHero iHero) {
        super(iHero);
        this.iHero = iHero;
    }
    @Override
    public double getPower() {
        return iHero.getPower() * 2;
    }
}
