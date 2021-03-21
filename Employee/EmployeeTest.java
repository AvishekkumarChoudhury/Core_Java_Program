import java.time.*;

/**
 * This program tests the Employee class.
 */

public class EmployeeTest {

    public static void main(String[] args)
    {
        //fill the staff array with Employee objects
        Employee[] staff=new Employee[3];

        staff[0]=new Employee ("Avishek Choudhury",75000,2022,12,15);
        staff[1]=new Employee("Nirmal Jha",50000,2021,11,12);
        staff[2]=new Employee("Manish Mahto",40000,2018,9,18);

        //raise employee by 5%

        for(Employee e : staff)
        e.raiseSalary(5);

        //print out information about all Employee objects
        for(Employee e : staff)
       System.out.println("name=" +e.getName() + ",salary=" +e.getSalary() + ",hireDay=" 
                                    +e.getHireDay() );

    }
    
}

//Employee class

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