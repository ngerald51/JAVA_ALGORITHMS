public class Recursion {
    public static void main(String[] args)
    {
        reduce(4);
    }

    static void reduce(int n){
        if (n != 0){

            reduce (n-1);
        }
        System.out.println(n);
    }

    static int recursiveLinearSearch(int[] a, int index, int val)
    {

        return index;
    }
}
