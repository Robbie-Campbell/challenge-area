package java;

import java.util.Arrays;

// https://edabit.com/challenge/KWbrmP9uYSnYtwkAB
public class isInOrder
{
    public static boolean inOrder(String str)
    {
        char[] arr = str.toCharArray();
		Arrays.sort(arr);
		String rev = new String(arr);
		return str.equals(rev);
    }

    public static void main(String[] args)
    {
        System.out.println(inOrder("123"));
    }
}