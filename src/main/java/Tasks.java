public class Tasks {

  protected String description;
  protected boolean isDone;
  // protected int taskNumber;

  // public String getDescription() {
  // return description;
  // }

  public Tasks(String description) {
    this.description = description;
    this.isDone = false;
  }

  public String getStatusIcon() {
    return (isDone ? "[X]" : "[ ]"); // mark done task with X
  }

  public void markAsDone() {
    this.isDone = true;
  }

  public void markAsUnDone() {
    this.isDone = false;
  }

}