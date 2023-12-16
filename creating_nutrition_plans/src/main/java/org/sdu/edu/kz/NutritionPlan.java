package org.sdu.edu.kz;

import java.util.List;

public class NutritionPlan {
    private int dailyCaloricIntake;
    private int carbohydratesRatio;
    private int proteinsRatio;
    private int fatsRatio;
    private List<String> mealPlans;
    private String fitnessGoal;
    private List<String> dietaryRestrictions;

    public NutritionPlan (int dailyCaloricIntake, int carbohydratesRatio, int proteinsRatio, int fatsRatio, List<String> mealPlans, String fitnessGoal, List<String> dietaryRestrictions) {
        this.dailyCaloricIntake = dailyCaloricIntake;
        this.carbohydratesRatio = carbohydratesRatio;
        this.proteinsRatio = proteinsRatio;
        this.fatsRatio = fatsRatio;
        this.mealPlans = mealPlans;
        this.fitnessGoal = fitnessGoal;
        this.dietaryRestrictions = dietaryRestrictions;
    }


    public int getDailyCaloricIntake() {
        return dailyCaloricIntake;
    }

    public void setDailyCaloricIntake(int dailyCalorieIntake) {
        this.dailyCaloricIntake = dailyCalorieIntake;
    }

    public List<String> getMealPlans() {
        return mealPlans;
    }

    public void setMealPlans(List<String> mealPlans) {
        this.mealPlans = mealPlans;
    }

    public String getFitnessGoal() {
        return fitnessGoal;
    }

    public void setFitnessGoal(String fitnessGoal) {
        this.fitnessGoal = fitnessGoal;
    }

    public List<String> getDietaryRestrictions() {
        return dietaryRestrictions;
    }

    public void setDietaryRestrictions(List<String> dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions;
    }

    public int getCarbohydratesRatio() {
        return carbohydratesRatio;
    }

    public void setCarbohydratesRatio(int carbohydratesRatio) {
        this.carbohydratesRatio = carbohydratesRatio;
    }

    public int getProteinsRatio() {
        return proteinsRatio;
    }

    public void setProteinsRatio(int proteinsRatio) {
        this.proteinsRatio = proteinsRatio;
    }

    public int getFatsRatio() {
        return fatsRatio;
    }

    public void setFatsRatio(int fatsRatio) {
        this.fatsRatio = fatsRatio;
    }

    @Override
    public String toString() {
        return "NutritionPlan{ \n" +
                "dailyCaloricIntake=" + dailyCaloricIntake +
                ", \ncarbohydratesRatio=" + carbohydratesRatio +
                ", \nproteinsRatio=" + proteinsRatio +
                ", \nfatsRatio=" + fatsRatio +
                ", \nmealPlans=" + mealPlans +
                ", \nfitnessGoal='" + fitnessGoal + '\'' +
                ", \ndietaryRestrictions=" + dietaryRestrictions +
                "\n}";
    }
}
