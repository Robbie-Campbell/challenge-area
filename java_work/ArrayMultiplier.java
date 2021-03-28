package java_work;

// https://edabit.com/challenge/5mANMR3X6gEfWephD
import java.util.Arrays;

public class ArrayMultiplier
{

    public static String multiply(Object[] values)
    {
        int sizeOfArr = values.length;
        Object[][] multiplied = new Object[sizeOfArr][sizeOfArr];
        for (int i = 0; i < sizeOfArr; i++)
        {
            for (int x = 0; x < sizeOfArr; x++)
            {
                multiplied[i][x] = values[i];
            }
        }
        return Arrays.deepToString(multiplied);

    }

    public static void main(String[] args)
    {
        Object[] object = {1, 3, "hello"};
        System.out.println(multiply(object));
    }
}