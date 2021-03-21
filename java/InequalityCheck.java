package java;

public class InequalityCheck
{
    public static boolean correctSigns(String str)
    {
        String[] newString = str.split(" ");
        for (int i = 0; i < newString.length; i++)
        {
            String trimVal = newString[i].trim();
            if(trimVal.equals("<") && Integer.parseInt(newString[i+1]) <= Integer.parseInt(newString[i - 1]))
            {
                return false;
            }
            else if(trimVal.equals(">") && Integer.parseInt(newString[i+1]) >= Integer.parseInt(newString[i - 1]))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(correctSigns("3 < 2 < 11"));
        System.out.println(correctSigns("3 < 15 > 11"));
    }
}