import java.util.ArrayList;
import java.util.Scanner;

class Computation{

    public void display(){

        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> findGrades = new ArrayList<>();

        //Taking the number of student.
        System.out.println("Enter the number of students:");
        int numStudent=sc.nextInt();

        //Accepting grade of each student.
        for (int i=0;i<numStudent;i++){
            System.out.println("Enter grade for student " + (i + 1) + ":");
            int grade=sc.nextInt();
            findGrades.add(grade);
        }

        // Code to find average grade
        double sum=0;
        for(int grade:findGrades){
            sum=sum+grade;
        }
        double averageGrade=sum/numStudent;

        // Code to find the highest & lowest grades.
        int highestGrade=findGrades.get(0);
        int lowestGrade=findGrades.get(0);
        
        for (int i=1;i<findGrades.size();i++){

            //for highest grade
            if(findGrades.get(i)>highestGrade){
                highestGrade=findGrades.get(i);
            }
            //for lowest grade
            if(findGrades.get(i)<lowestGrade) {
                lowestGrade=findGrades.get(i);
            }
        }

        // Output
        System.out.println("Average grade: " + averageGrade);
        System.out.println("Highest grade: " + highestGrade);
        System.out.println("Lowest grade: " + lowestGrade);
    }
}
public class Task1{
    public static void main(String[] args){
        Computation obj=new Computation();
            obj.display();
    }
}
