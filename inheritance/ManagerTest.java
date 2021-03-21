/**
 * This program demonstrates inheritance
 */
public class ManagerTest {
    public static void main(String[] args)
    {
        //construct a Manager object
        Manager boss=new Manager("Mahi",80000,2012,10,12);
        boss.setBonus(5000);

        Employee[] staff=new Employee[3];

        //fill the staff array with Manager and Emplolyee objects
        
        staff[0]=boss;
        staff[1]=new Employee("Ravi",50000,2017,8,12);
        staff[2]=new Employee("Rohan",45000,2015,6,11);

        //print out information about all Employee objects
        for(Employee e : staff)
           System.out.println("name=" +e.getName() +",salary=" +e.getSalary());
       }
           }
