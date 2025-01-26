/**
 * ForEachLoop
 */
public class ForEachLoop {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7};

        System.out.println("With for each loop");
        //printing with for each looop
        for(int i:arr)
        {
            System.out.println(i);
        }

        //traditional for loop
        System.out.println("Tradidtional For loop");
        for(int j=0; j < arr.length; j++)
        {
            System.out.println(arr[j]);
        }
        System.out.println("The size of array is "+arr.length);
    }
}