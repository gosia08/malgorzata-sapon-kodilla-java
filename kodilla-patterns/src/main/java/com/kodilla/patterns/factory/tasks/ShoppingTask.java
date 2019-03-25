package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;
    private String executeTask = null;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity){
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask(){
        executeTask = "Buy" + whatToBuy + "quantity" + quantity;
        return executeTask;
    }

    @Override
    public boolean isTaskExecuted() {
        if (executeTask != null) {
            System.out.println(taskName + "Task is done.");
        } else {
            System.out.println(taskName + "Task is not done.");
        }
        return executeTask != null;
    }
}
