package org.sdu.edu.kz;

import java.util.Arrays;
import java.util.Map;

public class ClientApp {
    public static void main(String[] args) {
        NutritionPlanDirector director = new NutritionPlanDirector();
        NutritionPlanBuilder builder = new MaintenanceNutritionPlanBuilder();
        director.setBuilder(builder);
        NutritionPlan nutritionPlan = director.createNutritionPlan().build();
        System.out.println(nutritionPlan.toString());
    }
}