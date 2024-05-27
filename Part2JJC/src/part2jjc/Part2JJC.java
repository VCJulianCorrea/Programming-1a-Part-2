/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package part2jjc;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class Part2JJC {
public static int arraySize;
public static TaskyTask task = new TaskyTask();
public static Part1For2 part1 = new Part1For2();
public static int totalHours;

    public static void main(String[] args) {
        part1.main(null);
      boolean closeProgram = false;
      int menuChoice;
      while (!closeProgram) {
          menuChoice = Integer.parseInt(JOptionPane.showInputDialog (null, "Hello and Welcome to TaskyTasky!!"
                  + "\nPlease enter a number for the corrosponding actions:"
                  + "\n1: Add task/s"
                  + "\n2: Show the detailed report"
                  + "\n3: Exit the program"));
          switch(menuChoice)
          {
              case 1: addTask(); break;
              case 2: JOptionPane.showMessageDialog(null, "Still busy... will be avalible SOON"); break;
              case 3: JOptionPane.showMessageDialog(null, "OK! Shutting program down..."); break;
                      
          }
          
      }
      
              
       
    }
    public static void addTask()
    {
    boolean checked;
    String givenTask;
    int numOfTasks;
    String taskDeveloper;
    String taskId;
    int taskHours;
    numOfTasks = Integer.parseInt(JOptionPane.showInputDialog(null, "How Many Tasks ddo you want to do?"));
    for (int i = 1; i < numOfTasks; i++) {
         givenTask = JOptionPane.showInputDialog("Task " + (i-1), "What is the name of your task?");
         checked = task.didTaskCheckDesription(givenTask);
         task.setTaskCheckingDescription(checked); 
         taskDeveloper = JOptionPane.showInputDialog("Task " + (i-1), "What is the developer of this task?");
         taskId = task.recieveCreatedTaskId(givenTask, numOfTasks, taskDeveloper);
         task.setCreateTaskId(taskId);
         taskHours = Integer.parseInt(JOptionPane.showInputDialog(null, "How Many hours do you think it will take to complete?")); 
         totalHours = task.getReturnTotalHours(taskHours, totalHours);
         
        }
    
    }
}
/*
*Referencing:
*-Farrell, J. (2022) Java Programming. S.L.: Cengage Learning.
*-Java JOptionPane (2023) GeeksforGeeks. Available at: https://www.geeksforgeeks.org/java-joptionpane/.
*-‌How to use classes in other package? (no date) Stack Overflow. Available at: https://stackoverflow.com/questions/3480389/how-to-use-classes-in-other-package (Accessed: 26 May 2024).
*/