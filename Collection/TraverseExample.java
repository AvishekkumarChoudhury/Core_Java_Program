import java.util.*;
public class TraverseExample {
    
    public static void main(String[] args)
    {
    ArrayList<String> names=new ArrayList<>();
        names.add("Avishek");
        names.add("Neha");
        names.add("Manish");
        names.add("Chetna");
        names.add("Rohit");
        names.add("ABC");

        //for each loop

        for(String str:names)
        { System.out.println(str +"\t"+str.length()+"\t");
         StringBuffer br=new StringBuffer(str);
         System.out.println(br.reverse());}
}
}