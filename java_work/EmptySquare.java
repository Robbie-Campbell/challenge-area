package java_work;

// https://edabit.com/challenge/3GvRKZPF2NRPz3DgQ

public class EmptySquare {
	public static int emptySq(int step) 
    {
        int return_val = 0;
        for (int i = 0; i < step; i++)
            return_val += i * 8;
		return return_val;
    }

    public static void main(String[] args)
    {
        System.out.println(emptySq(3));
        System.out.println(emptySq(10));
    }
}