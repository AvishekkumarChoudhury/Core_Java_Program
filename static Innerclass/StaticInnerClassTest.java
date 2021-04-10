/**
 * This program demonstrates the use of static inner classes.
 */
public class StaticInnerClassTest {
    public static void main(String[] args)
    {
        double[] d=new double[20];
        for(int i=0;i<d.length;i++)
        d[i]=100*Math.random();
        ArrayAlg.Pair p=ArrayAlg.minmax(d);
        System.out.println("min=" +p.getFirst());
        System.out.println("max=" +p.getSecond());
    }
}

class ArrayAlg
{
   /**
    * A pair of floating point numbers.
    */

    public static class Pair
    {
        private double first;
        private double second;

        /**
         * construct a pair from two floating point numbers.
         * @param first the first floating point number
         * @param second the second floating point number
         */
        public Pair(double first, double second)
        {
            this.first = first;
            this.second = second;
        }
        //returns the first numer of the pair 
        public double getFirst()
        {
            return first;
        }
        //return the second numer of the pair
        public double getSecond()
        {
            return second;
        }
    }
    /**
     * Computes both the minimum and maximum of an array
     */
    public static Pair minmax(double[] values)
    {
        double min=Double.POSITIVE_INFINITY;
        double max=Double.NEGATIVE_INFINITY;
        for(double v : values)
        {
            if(min>v) min=v;
            if(max<v) max=v;
                }
                return new Pair(min,max);
    }
}
