package ToDoList;

public class Task {
    String Description;
    boolean isComplete;

    Task(String Description){
        this.Description = Description;
        this.isComplete=false;

    }
    @Override
    public String toString(){
        return (isComplete ?"[Completed]": "[Not Completed]"+Description);
    }
}
