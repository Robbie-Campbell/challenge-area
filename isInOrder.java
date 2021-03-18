// https://edabit.com/challenge/KWbrmP9uYSnYtwkAB
public class isInOrder
{
    public static boolean inOrder(String str)
    {
        char[] charArr = str.toCharArray();
        for(int i = 1; i < str.length(); i++)
        {
            if ((int) charArr[i - 1] == (int) charArr[i] - 1)
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(inOrder("12345"));
    }
}