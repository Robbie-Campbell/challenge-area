package java;

import java.util.Arrays;

public class SecondLargest 
{

    public static int secondLargest(int[] values)
    {
        Arrays.sort(values);
        return values[1];
    }
    
    public static void main(String[] args)
    {
        int[] tester = {3,6,7,4,9};
        System.out.println(secondLargest(tester));
    }
}
