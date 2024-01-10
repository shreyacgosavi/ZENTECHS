/*

INSTRUCTIONS :
Input: Take marks obtained (out of 100) in each subject.
Calculate Total Marks: Sum up the marks obtained in all subjects.
Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
average percentage.
Grade Calculation: Assign grades based on the average percentage achieved.
Display Results: Show the total marks, average percentage, and the corresponding grade to the user

*/

import java.util.Scanner;
public class TASK1
{
    public static void main(String args[])
    {

        int marks[] = new int[6];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<6; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();

        avg = total/6;
        
        System.out.print("The student Grade is: ");
        if(avg>=85)
        {
            System.out.print("A+");
        }
        else if(avg>=75 && avg<85)
        {
           System.out.print("A");
        } 
        else if(avg>=65 && avg<75)
        {
            System.out.print("B");
        }
        else if(avg>=50 && avg<65)
        {
            System.out.print("C");
        }
        else if(avg>=35 && avg<50)
        {
            System.out.print("D");
        }
        else if(avg<35)
        {
            System.out.print("FAIL");
        }
        
    }
}

