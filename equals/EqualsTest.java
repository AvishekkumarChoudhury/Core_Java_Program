/**
 * This program demonstrates the equals method
 */
public class EqualsTest {
    public static void main(String[] args)
    {
        Employee avi1=new Employee("Avishek Choudhary",75000,1999,9,15);
        Employee avi2=avi1;
        Employee avi3=new Employee("Alice Adams",75000,1999,9,15);
        Employee bob=new Employee("Bob Brandson",50000,1989,10,1);

        System.out.println("avi1==avi2:" + (avi1==avi2));

        System.out.println("avi1==avi3:" + (avi1==avi3));

        System.out.println("avi1.equals(avi3):" + (avi1.equals(avi3)));

        
        System.out.println("avi1.equals(bob):" + (avi1.equals(bob)));
        
        System.out.println("bob.toString(): " +bob);

        Manager carl=new Manager("Carl Cracker",80000,1987,12,15);
        Manager boss=new Manager("Carl Cracker",80000,1987,12,15);
        boss.setBonus(5000);
        System.out.println("boss.toString():" +boss.toString());
        System.out.println("carl.equals(boss): " +carl.equals(boss));
        System.out.println("avi1.hashCode():" +avi1.hashCode());
        System.out.println("avi3.hashCode():" +avi3.hashCode());
        System.out.println("carl.hashCode():" +carl.hashCode());
        System.out.println("bob.hashCode():" +bob.hashCode());
    }
}
        
        
        

        
        
        


        
        


