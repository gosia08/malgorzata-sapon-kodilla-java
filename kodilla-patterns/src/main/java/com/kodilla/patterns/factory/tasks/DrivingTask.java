package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
   final String taskName;
   final String where;
   final String using;
   private String executeTask = null;

   public DrivingTask(final String taskName, final String where, final String using) {
       this.taskName = taskName;
       this.where = where;
       this.using = using;
   }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {
        executeTask = "Go to: " + where + "by using " + using;
        return executeTask;
    }

    @Override
    public boolean isTaskExecuted() {
        if(executeTask != null){
            System.out.println(taskName+ " Task is done.");
        }else{
            System.out.println(taskName + " Task is not done.");
        }
        return executeTask !=null;
    }
}




