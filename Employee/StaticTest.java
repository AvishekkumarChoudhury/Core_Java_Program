/**
 * This program demonstrate static methods
 */

public class StaticTest {
    public static void main(String[] args)
    {
        //fill the staff array with Employee objects
        Employee[] staff=new Employee[3];

        staff[0]=new Employee ("Neha Sharma",75000);
        staff[1]=new Employee("Nirmal Jha",50000);
        staff[2]=new Employee("Shalini Nahar",40000);
       
       
        //print out information about all Employee objects
        for(Employee e : staff)
        {
            e.setId();
       System.out.println("name=" +e.getName() + ",id= " +e.getId() +",salary=" +e.getSalary());
        }
    
    int n=Employee.getNextId(); //calls static method
    System.out.println("Next available id is:" +n);
}
    
}

//Employee class
class Employee

  {
        private static int nextId=1;

        private String name;
        private double salary;
         private int id;

        public Employee(String name,double salary)
        {
             this.name=name;
             this.salary=salary;
             id=0;
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
     
      public void setId()
      {
          id=nextId; //set id to next available id
          nextId++;
      }
      public static int getNextId()
      {
          return nextId; //return staticfield
      }
    }



