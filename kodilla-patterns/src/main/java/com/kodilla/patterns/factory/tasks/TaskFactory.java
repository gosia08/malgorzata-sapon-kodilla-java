package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String task){
        switch (task) {
            case SHOPPINGTASK:
                return new ShoppingTask("List", "Apples", 6);
            case PAINTINGTASK:
                return new PaintingTask("Painting home", "White", "Every wall");
            case DRIVINGTASK:
                return new DrivingTask("Library","Centre","Bus" );
            default:
                return null;
        }
    }
}