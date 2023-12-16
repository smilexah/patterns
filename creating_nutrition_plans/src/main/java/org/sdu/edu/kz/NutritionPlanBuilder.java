package org.sdu.edu.kz;

import java.util.List;

public interface NutritionPlanBuilder {
    void setCaloricIntake(int dailyCalorieIntake);
    void setMacronutrientRatios(int carbohydrates, int proteins, int fats);
    void setMealPlans(List<String> mealPlans);
    void setFitnessGoal(String fitnessGoal);
    void setDietaryRestrictions(List<String> dietaryRestrictions);
    NutritionPlan build();
}
