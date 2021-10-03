package duke;

import duke.task.Task;
import java.util.Scanner;

public class UI {
    public static void printBreaker() {
        System.out.println("......................................................................");
    }

    public static void printWelcomeMessage() {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
        printBreaker();
        System.out.println("Hi! I'm Duke.\n" + "How can I make your life easier?");
        printBreaker();
    }

    public static void printByeMessage() {
        System.out.println("Bye bye! Have a wonderful day!");
        printBreaker();
    }

    public static void printDoneTask(String taskDone) {
        System.out.println("Wonderful! This task is now marked as done:\n" + taskDone);
        printBreaker();
    }

    public static void printDeleteTask(int taskNumber, String taskDelete) {
        System.out.println("Alright, the following task has been removed\n" + taskDelete + "\n" + "Now you have " + (taskNumber - 1) + " tasks left.");
        printBreaker();
    }

    public static void printRecordTask(int taskNumber, Task taskRecord) {
        System.out.println("Got it. I've added this task:\n" + taskRecord.toString() + "\n" + "Now you have " + (taskNumber + 1) + " tasks in your list.");
        printBreaker();
    }

    public static String getInput() {
        String lineInput;
        Scanner input = new Scanner(System.in);
        lineInput = input.nextLine();
        return lineInput;
    }
}
