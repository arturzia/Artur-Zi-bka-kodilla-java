package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Buy dress", "Dresses", 4.0);
            case PAINTINGTASK:
                return new PaintingTask("Painting house", "White", "House");
            case DRIVINGTASK:
                return new DrivingTask("Driving to", "Paris", "By plane");
            default:
                return null;
        }

    }

}
