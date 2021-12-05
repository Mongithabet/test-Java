class findLargest
{
    static int arr[] = {1, -28, 88, 200, 7};

    static int findLargest(int[] numbers)
    {
        int i;

        int max = numbers[0];
        for (i = 1; i < numbers.length; i++)
            if (numbers[i] > max)
                max = numbers[i];

        return max;
    }
    static boolean a(int i,int j){
        return (i+j==1) || (j==i) ? true : false  ;
    }
    // Driver method
    public static void main(String[] args)
    {

        System.out.println((a(1,5)));
        System.out.println((a(5,5)));
        System.out.println((a(-1,2)));

    }
}
