package ToDoList;

import javax.swing.text.View;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDOApp {
    private static ArrayList<Task> tasks=new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("****** To Do List ******");
            System.out.println("1. Add Task");
            System.out.println("2. View Task");
            System.out.println("3.Mark as Done");
            System.out.println("4. Delete Task");
            System.out.println("0. Exit");
            System.out.println("Enter Your Choice: ");
            choice= scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1-> AddTask(scanner);
                case 2-> viewTasks();
                case 3-> markTaskDone(scanner);
                case 4-> deleteTask(scanner);
                case 0-> System.out.println("GoodBye!");
                default -> System.out.println("Sad to see you go!:(");

            }
        }while(choice!=0);
    }

    public static void AddTask(Scanner scanner) {
        System.out.println("Enter task: ");
        String Description= scanner.nextLine();
        tasks.add(new Task(Description));
        System.out.println("Task Added!");


    }
    private static void viewTasks(){
        if (tasks.isEmpty()){
            System.out.println("No tasks found!");
        }else{
            for (int i=0; i< tasks.size();i++){
                System.out.println((i+1)+"."+tasks.get(i));
            }
        }
    }

    public static void markTaskDone(Scanner scanner) {
        viewTasks();
        if (tasks.isEmpty())
            return;
        System.out.println("Enter Task number to mark as done:");
        int taskNumber = scanner.nextInt();
        scanner.nextLine();
        if (taskNumber>0 && taskNumber< tasks.size()){
            tasks.get(taskNumber-1).isComplete=true;
            System.out.println("Task marked complete successfully!");
        }else{
            System.out.println("Invalid task number");
        }


    }
    public static void deleteTask(Scanner scanner) {
        viewTasks();
        if (tasks.isEmpty())
            return;
        System.out.println("Enter task number to delete it");
        int taskNumber = scanner.nextInt();
        scanner.nextLine();
        if (taskNumber>0 && taskNumber< tasks.size()){
            tasks.remove(taskNumber-1);
            System.out.println("Task Deleted!");

        }else{
            System.out.println("Invalid number!!");
        }

}}
