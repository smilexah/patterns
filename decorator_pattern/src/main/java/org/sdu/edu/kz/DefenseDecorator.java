package org.sdu.edu.kz;

public class DefenseDecorator extends HeroDecorator {
    IHero iHero;
    public DefenseDecorator(IHero iHero) {
        super(iHero);
        this.iHero = iHero;
    }
    @Override
    public double getDefense() {
        return iHero.getDefense() * 2;
    }
}
