import java.util.Arrays;

public class FindTheIndex
{

    public static int findIndex(String[] arr,String str) 
    {
		return Arrays.asList(arr).indexOf(str);
	}

    public static void main(String[] args)
    {
        System.out.println(findIndex(new String[]{"a", "g", "y", "d"}, "d"));
    }
    
}