public class nextprime {

    public static int isPrime(int num) 
    {
        for (int i = 2; i < num; i++) 
		{
            if (num % i == 0)
            {
                return isPrime(num + 1);
            }
            else
                continue;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }

}