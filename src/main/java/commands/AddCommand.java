package commands;
import tasks.Task;
import tasks.TaskList;

public abstract class AddCommand extends Command {
    protected Task task;

    public String execute(TaskList taskManager) {
        taskManager.addTask(task);
        int numTasks = taskManager.getNumOfTasks();
        return "Got it. I've added this task:\n\t" + this.task
                + "\nNow you have " + numTasks + " tasks in the list.";
    }
}