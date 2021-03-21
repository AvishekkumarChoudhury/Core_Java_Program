import java.util.*;

/**
 * This  program demonstrates object construction
 */

 public class ConstructTest
 {
     public static void main(String[] args)
     {
         //fill the staff array with three Employee objects

         Employee[] staff=new Employee[3];

         staff[0]=new Employee("Harry",40000);
         staff[1]=new Employee(60000);
         staff[2]=new Employee();

         //print out the information of all Employee objects
         for(Employee e : staff)
           System.out.println("Name=" +e.getName() + ",id=" +e.getId() +
                                        ",salary=" +e.getSalary());
     }
 }

 class Employee
    {
        private static int nextId;
        private int id;
        private String name=""; //instance field initialization
        private double salary;
        //static initialization block
           static
           {
               Random generator=new Random();
               //set next id to a random number between 0 and 9999
               nextId=generator.nextInt(1000);
           }
           //object initialization block
           {
               id=nextId;
               nextId++;
           }
           //three overloaded constructor
           public Employee(String name,double salary)
           {
               this.name=name;
               this.salary=salary;
           }
           public Employee(double salary)
           {
               //calls the Employee(String,double) constructor
               this("Employee #",salary);
           }

           //the default constructor
           public Employee()
           {
               //name initialized to ""--see above
               //salary not explicitily set--initialized to 0
               //id initialized in initialization block
           }

           public String getName()
           {
               return name;
           }
           public double getSalary()
           {
               return salary;
           }
           public int getId()
           {
               return id;
           }
        }
            
        

 