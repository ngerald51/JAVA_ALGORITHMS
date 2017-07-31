public class BinarySearch {
    //Implementation of Binary Search Algorithm in Java
    static int search(int[] arr, int x){
        // -1 is when no result is found condition
        int p= 0; //Beginning of index
        int r= arr.length-1; // end of index
        int q; // midpoint of arrary
        while (p <= r) {
            q= (p+r)/2;

            if (arr[q] == x){
                return q;
            }
            if (arr[q] > x) {
                r = q -1;

            }else {
                p = q + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args ){
        System.out.println(search(new int[] {1,2,3,4,6,8,9},8));
        System.out.println(search(new int[] {1,2,3,4,6,8,9},122));

    }
}
