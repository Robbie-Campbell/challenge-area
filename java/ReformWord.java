package java;

//https://edabit.com/challenge/R3PnRquBPADEqDxZg
public class ReformWord
{

    public static String getWord(String left, String right)
    {
        return Character.toUpperCase(left.charAt(0)) + left.substring(1) + right;
    }

    public static void main(String[] args)
    {
        System.out.println(getWord("Com", "plete"));
    }
}