public class LinearSearch {

    static int search(int[] arr, int x){
    // -1 is when no result is found condition
        for (int i=0; i < arr.length; i++){
            if (arr[i]==x)
            {
                return i;
            }
        }
        return -1 ;
    }


}
