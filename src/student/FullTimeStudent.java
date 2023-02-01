/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author Admin
 */
public class FullTimeStudent extends Student
{
    private int noOfCourse;

    public FullTimeStudent(int noOfCourse, String studentID, String studentName)
    {
        super(studentID, studentName);
        this.noOfCourse = noOfCourse;
    }
    
    
    public int getNoOfCourse()
    {
        return noOfCourse;
    }
    public void setNoOfCourse(int noOfCourse)
    {
        this.noOfCourse = noOfCourse;
    }
}
