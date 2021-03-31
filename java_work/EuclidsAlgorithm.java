package java_work;

import java.util.Arrays;

public class EuclidsAlgorithm {

    public int getCommonFactor(int[] a) 
    {
        Arrays.sort(a);
        int i = a[a.length - 1];
        while (i > 0) 
        {
            for (int j = 0; j < a.length; j++) 
            {
                if (j == a.length - 1 && a[j] % i == 0)
                    return i;
                else if (a[j] % i == 0)
                    continue;
                else
                    break;
            }
            i--;
        }
        return 1;
    }

    public int getCommonFactor(int a, int b) 
    {
        int i = a;
        while (i > 0) 
        {
            if (a % i == 0 && b % i == 0)
                return i;
            i--;
        }
        return 1;
    }

    public int getRecursiveCommonFactor(int a, int b) 
    {
        return (a%b!=0) ? getRecursiveCommonFactor(b, a%b) : b;
    }

    public static void main(String[] args) {
        EuclidsAlgorithm test = new EuclidsAlgorithm();
        // System.out.println(test.getCommonFactor(12, 12));
        System.out.println(test.getRecursiveCommonFactor(1200, 70));
        // System.out.println(test.getCommonFactor(new int[]{30,200,300,333,20}));
    }
}