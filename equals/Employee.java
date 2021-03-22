import java.time.*;
import java.util.*;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year,int month, int day) 
    {
        this.name = name;
        this.salary = salary;
        hireDay=LocalDate.of(year,month,day);
    }
    private String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    private LocalDate getHireDay()
    {
        return hireDay;
    }
    public void raiseSalart(double byPercent)
    {
        double raise=salary*byPercent/100;
        salary+=raise;
    }
    public boolean equals(Object otherObject)
    {
        //a quick test to see if objects are identical or not
        if(this==otherObject) return true;

        //must return false if explicit parameters is null
        if(otherObject==null) return false;

         //if classes don't match ,they can't be equal
         if(getClass()!=otherObject.getClass()) return false;
          
         //now we know otherObject is a non nullable Employee
         Employee other=(Employee) otherObject;

         //test whether the field have identical values
         return Objects.equals(name,other.name) &&salary==other.salary
                 &&Objects.equals(hireDay,other.hireDay); 

            }
    public int hashCode()
     {
       return Objects.hash(name,salary,hireDay);
    }
    public String toString()
    {
        return getClass().getName() + "[name=" + name + ",salary=" +salary + ",hireDay=" + hireDay +"]";
    }
}
