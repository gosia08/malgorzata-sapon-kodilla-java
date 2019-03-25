package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {
   final String taskName;
   final String color;
   final String whatToPaint;
   private String executeTask = null;

   public PaintingTask(final String taskName, final String color, final String whatToPaint) {
       this.taskName = taskName;
       this.color = color;
       this.whatToPaint = whatToPaint;
   }


    @Override
    public String executeTask() {
        executeTask = "Paint: "+ whatToPaint + " by: " + color + "color.";
        return  executeTask;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(executeTask != null){
            System.out.println(taskName + "Task is done.");
        }else{
            System.out.println(taskName + " Task is not done.");
        }
        return executeTask !=null;
    }
}
