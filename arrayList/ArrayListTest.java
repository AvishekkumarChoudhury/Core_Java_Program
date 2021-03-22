import java.util.*;
import java.time.*;

/**
 * This program demonstrates the ArrayList class
 */
public class ArrayListTest
 {
   public static void main(String[] args)
   {
       //fill the staff arry list with three Employee Objects.equals
       ArrayList<Employee> staff=new ArrayList<>();

       staff.add(new Employee("Carl Cracker",75000,1987,12,15));
       staff.add(new Employee("Harry Hacker",55000,1989,10,12));
       staff.add(new Employee("Tony Tester",40000,1990,3,15));

       //raise everyone's salary by 5%
       for(Employee e : staff)
         e.raiseSalary(5);

         //print out information about all Employee Objects
         for(Employee e : staff)
         System.out.println("name=" +e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay()) ;
   }
    }
    
class Employee
{
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name,double salary,int year,int month,int day)
    {
         this.name=name;
         this.salary=salary;
         hireDay=LocalDate.of(year,month,day);
    }
    public String getName()
  {
    return name;
    }
    public double getSalary()
    {
        return salary;
    }
   public LocalDate getHireDay()
 {
    return hireDay;
  }
  public void raiseSalary(double byPercent)
  {
      double raise=salary*byPercent/100;
      salary+=raise;
  }
}
