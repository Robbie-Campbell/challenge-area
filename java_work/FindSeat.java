// https://edabit.com/challenge/A2M6aC7BR2P4Qj2Kr

public class FindSeat 
{
	public static int findSeat(int n, int[] arr) 
    {
        int max_capacity = n / arr.length;
        for (int val = 0; val < arr.length; val++)
            if  (arr[val] * 2 <= max_capacity)
                return val;
        return -1;
	}

    public static void main(String[] args)
    {
        System.out.println(findSeat(20, new int[]{3, 5, 4, 2}));
        System.out.println(findSeat(1000, new int[]{50, 20, 80, 90, 100, 60, 30, 50, 80, 60}));
        System.out.println(findSeat(200, new int[]{35, 23, 40, 21, 38}));
    }
}		