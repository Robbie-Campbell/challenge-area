package java;

//https://edabit.com/challenge/sPz2LcPZyAiBHRgwX
public class FormatPhone {
    public static String formatPhoneNumber(int[] nums)
    {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < nums.length; i++)
        {
            if (i == 0)
                result.append("(" + nums[i]);
            else if (i == 2)
                result.append(nums[i] + ") ");
            else if(i== 5)
                result.append(nums[i] + "-");
            else
                result.append(nums[i]);
        }
        return result.toString();
    }
    public static void main(String[] args){
        System.out.println(formatPhoneNumber(new int[]{5, 1, 9, 5, 5, 5, 4, 4, 6, 8}));
    }
}
