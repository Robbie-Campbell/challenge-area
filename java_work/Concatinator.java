package java_work;

//https://edabit.com/challenge/ynzo3DeHCmAXLtpwe
// Yes, this is especially easy

public class Concatinator 
{
    public static String inatorInator(String inv)
    {
        if (!String.valueOf(inv.charAt(inv.length() - 1)).matches("[^aeiouAEIOU]+"))
            return String.format("%s-inator %d000", inv, inv.length());
        return String.format("%sinator %d000", inv, inv.length());
    }

    public static void main(String[] args)
    {
        System.out.println(inatorInator("Shrink"));
        System.out.println(inatorInator("EvilClone"));
    }
}
