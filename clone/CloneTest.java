/**
 * This program demonstrates cloning
 */
public class CloneTest {
    public static void main(String[] args)
    {
        try 
        {
           Employee original=new Employee("John",50000);
            original.setHireDay(2000,1,1);
            Employee copy= original.clone();
            copy.raiseSalary(10);
            copy.setHireDay(2002,12,12);
            System.out.println("original: " +original);
            System.out.println("copy: " +copy);
        }
        catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
    
}
