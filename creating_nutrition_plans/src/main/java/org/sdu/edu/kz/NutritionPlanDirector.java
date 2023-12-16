package org.sdu.edu.kz;

import java.util.List;

public class NutritionPlanDirector {
    private NutritionPlanBuilder nutritionPlanBuilder;

    public void setBuilder(NutritionPlanBuilder nutritionPlanBuilder) {
        this.nutritionPlanBuilder = nutritionPlanBuilder;
    }

    public NutritionPlanBuilder createNutritionPlan() {
        nutritionPlanBuilder.setCaloricIntake(100);
        nutritionPlanBuilder.setMacronutrientRatios(999, 99999, 2);
        nutritionPlanBuilder.setMealPlans(List.of("Nan", "Mai", "Kasha", "Ris"));
        nutritionPlanBuilder.setFitnessGoal("Weight loss");
        nutritionPlanBuilder.setDietaryRestrictions(List.of("vegan", "lactose-fee"));
        return nutritionPlanBuilder;
    }
}
