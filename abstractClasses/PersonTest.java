/**
 * This program demonstartes abstarct Classes
 */
public class PersonTest {
    public static void main(String[] args)
    {
    Person[] people=new Person[2];
    ///fill the people array with Student and Employee objects
    people[0]=new Employee("Neha Sharma",60000,1987,10,1);
    people[1]=new Student("Avishek Choudhury","computer sciennce");

    //print out names and description of all Person objects

    for(Person p : people) 
        System.out.println(p.getName() +"," +p.getDescription());
}
}