/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2jjc;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class TaskyTask {
    boolean checkTaskDescription;
    String createTaskId;
    String printTaskDetails;
    int returnTotalHours;
     
    public boolean didTaskCheckDesription(String taskCallSign)
    {
        boolean tooLong;
        if(taskCallSign.length()<=50)
        {
            JOptionPane.showInputDialog(null, "Task has been caught!");
            tooLong = true;
        } else {
            JOptionPane.showInputDialog(null, "Description exceeds 50 words. Please enter a description with less than 50");
            tooLong = false;
        }
        return checkTaskDescription = true;
    }
    public void setTaskCheckingDescription(boolean checkTaskDescription) {
        this.checkTaskDescription = checkTaskDescription;
    }
    public String recieveCreatedTaskId(String taskName, int taskNum, String taskDev)
    {
        String taskId;
        taskId = taskName.substring(0,2).toUpperCase()+": " + taskNum + ": " + taskDev.substring(taskDev.length()-3).toUpperCase();
        return taskId;
    }
    public void setCreateTaskId(String createTaskID) {
     this.createTaskId = createTaskID;
    } 
    
    public String getPrintTaskDetails(String taskStatus, String taskDevDetails, int taskNumber, String taskName, String taskDesc, String taskID, int taskTime)
    {
        JOptionPane.showMessageDialog(null, "Task details and bitsnbobs: "
        + taskNumber + "\n Task Status: "+ taskStatus
        + "\n Developer details: : "+ taskDevDetails
        + "\n Task Number: "+ taskNumber
        + "\n Task Name: "+ taskName
        + "\n Task Description: "+ taskDesc
        + "\n Task ID: "+ taskID
        + "\n Task Duration: "+ taskTime + "hrs");
        return printTaskDetails;
    }
    public void setPrintTaskDetails (String printTaskDetails)
    {
        this.printTaskDetails = printTaskDetails;
    }
    
    public int getReturnTotalHours(int taskDuration, int totalHours)
    {
        totalHours = totalHours + taskDuration;
        return totalHours;
    }
    
    public void returnTotalHours (int totalHours)
    {
        this.returnTotalHours = totalHours;
    }
}
