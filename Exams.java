/**A school conducts three exams namely
 * term1 exams,term2 exams and final-term exams.
 * Final marks scored(weightedmarks) are computed as 30% of term1 
 * and term2 each's marks+40% of final-term marks.
 * Write a program to compute the weighted marks for a student
 * whose scores in first term,second term and final-term
 * are inputed from the user. Then compute the
 * weighted percentage out of 500 marks.
 */
import java.util.*;
public class Exams
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A school conducts three exams namely");
        System.out.println("term1 exams,term2 exams and final-term exams.");
        System.out.println("Final marks scored(weightedmarks) are computed as 30% of term1");
        System.out.println("and term2 each's marks+40% of final-term marks.");
        System.out.println("Write a program to compute the weighted marks for a student");
        System.out.println("whose scores in first term,second term and final-term");
        System.out.println("are inputed from the user. Then compute the");
        System.out.println("weighted percentage out of 500 marks.");
        System.out.println();
        String name;
        int term1,term2,term3;
        double wmarks,wper;
        System.out.println("Enter name of the student:-");
        name=sc.nextLine();
        System.out.println("Enter marks of "+name+" for first term:-");
        term1=sc.nextInt();
        System.out.println("Enter marks of "+name+" for second term:-");
        term2=sc.nextInt();
        System.out.println("Enter marks of "+name+" for third and the final term:-");
        term3=sc.nextInt();
        wmarks=0.30*term1+0.30*term2+0.40*term3;
        System.out.println(name+"'s weighted marks are:-"+"\n"+wmarks);
        wper=(wmarks/500.0)*100.0;
        System.out.println("Therefore, the weighted percentage of "+name+" out of 500 is:-");
        System.out.println(+wper);
    }
}