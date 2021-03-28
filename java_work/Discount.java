package java_work;

public class Discount 
{
    public static double discountCalculator(int value, int discPercentage)
    {
        return value - (value * discPercentage / 100);
    }

    public static void main(String[] args)
    {
        System.out.println(discountCalculator(500, 50));
    }
}
