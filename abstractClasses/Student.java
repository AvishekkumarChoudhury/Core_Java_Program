public class Student extends Person {

    private String major;

    /**
     * @param name the student's name
     * @param major thhe student's major
     */
    public Student(String name, String major) 
    {
      //pass name to the superclass Constructor
        super(name);
        this.major=major;
    }
    public String getDescription()
    {
        return " a student majoring in " +major;
    }
    }
