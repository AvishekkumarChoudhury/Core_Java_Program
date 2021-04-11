//import util package[all classes]
import java.util.*;

public class StartCode {
    
    public static void main(String[] args)
    {
        System.out.println("We;come to code java collection framework");

        /**
         * create collection
         * 
         * 1)Type Safe- same types of elements(objects) are added to collection.
         * 
         * 2)Un type Safe- different types of elements are added to collection.
         */
        //Type safe collection 
        ArrayList<String> names=new ArrayList<>();
        names.add("Avishek");
        names.add("Neha");
        names.add("Manish");
        names.add("Chetna");
        names.add("Manish");
        System.out.println(names);
        System.out.println(names.get(0));//get
        System.out.println(names.get(1));


        //Un type safe collection

        LinkedList list=new LinkedList();
        list.add("Sachin");
        list.add(100);
        list.add(9999.23);
        list.add(true);
        System.out.println(list);
       //remove
        names.remove("Chetna");
        System.out.println(names);

        //size
    System.out.println("Size= " +names.size());

    //check item is there or not
    System.out.println(names.contains("Avishek"));
    System.out.println(names.contains("Amit"));

    //check for empty 
    System.out.println(names.isEmpty());
   
    Vector<String> vector=new Vector<>();
    vector.addAll(names);
    System.out.println("Vector" +vector);

    System.out.println("_________________________________");
    HashSet<Double> nms=new HashSet<>();
    nms.add(14.14);
    nms.add(34.12354);
    nms.add(2345.235);
    nms.add(99.3);
    nms.add(99.3);
    nms.add(5.3);

    TreeSet<Double> tset=new TreeSet<>();
    tset.addAll(nms);
    System.out.println(tset);


    }
}
