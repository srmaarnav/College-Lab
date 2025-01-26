public class lab2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,52,34,5,6,7,89};

        System.out.println("With for each loop");
        //printing with for each looop
        for(int i:arr)
        {
            System.out.println(i);
        }
        System.out.println("The size of array is "+arr.length);
    }
}
