package src.partone.aop;

public class King  {
    private Task task;

    public King(Task task) {
        this.task = task;
    }
    public void execute(){
        task.play();
    }
}
