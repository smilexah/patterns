package org.sdu.edu.kz;

import java.util.List;

public class WeightLossNutritionPlanBuilder implements NutritionPlanBuilder{
    private int dailyCalorieIntake;
    private int carbohydrates;
    private int proteins;
    private int fats;
    private List<String> mealPlans;
    private String fitnessGoal;
    private List<String> dietaryRestrictions;


    @Override
    public void setCaloricIntake(int dailyCalorieIntake) {
        this.dailyCalorieIntake = dailyCalorieIntake;
    }

    @Override
    public void setMacronutrientRatios(int carbohydrates, int proteins, int fats) {
        this.carbohydrates = carbohydrates;
        this.proteins = proteins;
        this.fats = fats;
    }

    @Override
    public void setMealPlans(List<String> mealPlans) {
        this.mealPlans = mealPlans;
    }

    @Override
    public void setFitnessGoal(String fitnessGoal) {
        this.fitnessGoal = fitnessGoal;
    }

    @Override
    public void setDietaryRestrictions(List<String> dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions;
    }

    @Override
    public NutritionPlan build() {
        NutritionPlan nutritionPlan = new NutritionPlan(dailyCalorieIntake, carbohydrates, proteins, fats, mealPlans, fitnessGoal, dietaryRestrictions);
        return nutritionPlan;
    }
}
