// package org.sdu.edu.kz;

// public class Battle {
//     private IHero hero1;
//     private IHero hero2;

//     public Battle(IHero hero1, IHero hero2) {
//         this.hero1 = hero1;
//         this.hero2 = hero2;
//     }

//     public void fight() {
//         System.out.println("Hero1 power: " + hero1.getPower() + ", defense: " + hero1.getDefense() + ", health: " + hero1.getHealth());
//         System.out.println("Hero2 power: " + hero2.getPower() + ", defense: " + hero2.getDefense() + ", health: " + hero2.getHealth());
//         System.out.println("Hero1 attacks Hero2");
//         hero2.setHealth(hero2.getHealth() - (hero1.getPower() - hero2.getDefense()));
//         System.out.println("Hero2 attacks Hero1");
//         hero1.setHealth(hero1.getHealth() - (hero2.getPower() - hero1.getDefense()));
//         System.out.println("Hero1 power: " + hero1.getPower() + ", defense: " + hero1.getDefense() + ", health: " + hero1.getHealth());
//         System.out.println("Hero2 power: " + hero2.getPower() + ", defense: " + hero2.getDefense() + ", health: " + hero2.getHealth());
//     }

//     public static void main(String[] args) {
//         IHero hero1 = new HeroComponent(100, 50, 100);
//         IHero hero2 = new HeroComponent(100, 50, 100);
//         Battle battle = new Battle(hero1, hero2);
//         System.out.println("-------------------------First Battle: Hero Decorator-------------------------");
//         System.out.println();
//         battle.fight();
//         System.out.println();

//         hero1 = new DefenseDecorator(hero1);
//         hero2 = new DefenseDecorator(hero2);
//         battle = new Battle(hero1, hero2);
//         System.out.println("-------------------------Second Battle: Defense Decorator-------------------------");
//         System.out.println();
//         battle.fight();
//         System.out.println();

//         hero1 = new DoubleDecorator(hero1);
//         hero2 = new DoubleDecorator(hero2);
//         battle = new Battle(hero1, hero2);
//         System.out.println("-------------------------Third Battle: Double Decorator-------------------------");
//         System.out.println();
//         battle.fight();
//         System.out.println();

//         hero1 = new AttackDecorator(hero1);
//         hero2 = new AttackDecorator(hero2);
//         battle = new Battle(hero1, hero2);
//         System.out.println("-------------------------Fourth Battle: Attack Decorator-------------------------");
//         System.out.println();
//         battle.fight();
//         System.out.println();
//     }
// }

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Battle {
    public int getLastMoment(int n, int[] left, int[] right) {
    }
}