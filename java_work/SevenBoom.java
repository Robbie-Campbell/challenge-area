public class SevenBoom
{
    public static String sevenBoom(int[] values)
    {
        for (int value: values)
        {
            if (String.valueOf(value).contains("7"))
                return "Boom!";
            else
                continue;
        }
        return "There was no 7 in the array";
    }

    public static void main(String[] args)
    {
        System.out.println(sevenBoom(new int[]{8, 6, 33, 100}));
        System.out.println(sevenBoom(new int[]{2, 55, 60, 97, 86}));
    }
}