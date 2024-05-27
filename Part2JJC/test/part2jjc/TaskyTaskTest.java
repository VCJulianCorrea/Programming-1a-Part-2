/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package part2jjc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class TaskyTaskTest {
    
    public TaskyTaskTest() {
    }
    

    /**
     * Test of didTaskCheckDesription method, of class TaskyTask.
     */
    @Test
    public void testDidTaskCheckDesription() {
        System.out.println("didTaskCheckDesription");
        String taskCallSign = "nfjkfn fjedsnv few ew few ew geww geew ge fe fe fw ew gew few few fw wf wg wg wff f reww ge grw gew gr few fw fee fw f efe";
        TaskyTask instance = new TaskyTask();
        boolean expResult = false;
        boolean result = instance.didTaskCheckDesription(taskCallSign);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Please enter task description of less than 50 words");
    }

    /**
     * Test of setTaskCheckingDescription method, of class TaskyTask.
     */
    @Test
    public void testSetTaskCheckingDescription() {
        System.out.println("setTaskCheckingDescription");
        boolean checkTaskDescription = false;
        TaskyTask instance = new TaskyTask();
        instance.setTaskCheckingDescription(checkTaskDescription);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recieveCreatedTaskId method, of class TaskyTask.
     */
    @Test
    public void testRecieveCreatedTaskId() {
        System.out.println("recieveCreatedTaskId");
        String taskName = "";
        int taskNum = 0;
        String taskDev = "";
        TaskyTask instance = new TaskyTask();
        String expResult = "";
        String result = instance.recieveCreatedTaskId(taskName, taskNum, taskDev);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCreateTaskId method, of class TaskyTask.
     */
    @Test
    public void testSetCreateTaskId() {
        String arrayCreateTaskId[5] = ["AD:1:BYN", "CR:0:IKE", "CR:1:ARD", "CR:2:THA", "CR:3:ND"];
        System.out.println("setCreateTaskId");
        for (int i = 0; i < 4; i++) {
           
        String createTaskID = arrayCreateTaskId[i];
        TaskyTask instance = new TaskyTask();
        instance.setCreateTaskId(createTaskID);
        }
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrintTaskDetails method, of class TaskyTask.
     */
    @Test
    public void testGetPrintTaskDetails() {
        System.out.println("getPrintTaskDetails");
        String taskStatus = "";
        String taskDevDetails = "";
        int taskNumber = 0;
        String taskName = "";
        String taskDesc = "";
        String taskID = "";
        int taskTime = 0;
        TaskyTask instance = new TaskyTask();
        String expResult = "";
        String result = instance.getPrintTaskDetails(taskStatus, taskDevDetails, taskNumber, taskName, taskDesc, taskID, taskTime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrintTaskDetails method, of class TaskyTask.
     */
    @Test
    public void testSetPrintTaskDetails() {
        System.out.println("setPrintTaskDetails");
        String printTaskDetails = "";
        TaskyTask instance = new TaskyTask();
        instance.setPrintTaskDetails(printTaskDetails);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReturnTotalHours method, of class TaskyTask.
     */
    @Test
    public void testGetReturnTotalHours() {
        System.out.println("getReturnTotalHours");
        int taskDuration = 0;
        int totalHours = 0;
        TaskyTask instance = new TaskyTask();
        int expResult = 0;
        int result = instance.getReturnTotalHours(taskDuration, totalHours);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnTotalHours method, of class TaskyTask.
     */
    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
        int totalHours = 0;
        TaskyTask instance = new TaskyTask();
        instance.returnTotalHours(totalHours);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
