// https://edabit.com/challenge/akHQKSkHT26TuA7Ka

public class WageDifference 
{
    public static int programmers(int one, int two, int three) 
    {
		int biggest = (one < two && three < two) ? two : (two < one && three < one) ? one : three;
		int smallest = (one < two && one < three) ? one : (two < one && two < three) ? two : three;
        return biggest - smallest;
    }

    public static void main(String[] args)
    {
        System.out.println(programmers(187, 50, 1200));
    }
}
