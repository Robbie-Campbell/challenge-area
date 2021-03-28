package java_work;

// https://edabit.com/challenge/GjCgCugvh4eorPmgM

import java.lang.Math;

public class Disarium
{
    public static boolean isDisarium(int n) 
    {
        String converter = Integer.toString(n);
        int disarium_check = 0;
        for(int i = 0; i < converter.length(); i++)
            disarium_check += Math.pow(Integer.parseInt(String.valueOf(converter.charAt(i))), i + 1);
        return disarium_check == n;
	}

    public static void main(String[] args)
    {
        System.out.println(isDisarium(135));
        System.out.println(isDisarium(89));
        System.out.println(isDisarium(49));
    }
}