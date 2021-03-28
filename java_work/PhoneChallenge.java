package java_work;

// https://edabit.com/challenge/8NZaLdJBkhZCgNBc7
public class PhoneChallenge
{
    public static String textToNum(String phone)
    {
        char[] converter = phone.toCharArray();
        for (int i = 0; i < phone.length(); i++)
        {
            if ((int) converter[i] >= 65 &&  (int) converter[i] <= 67)
                converter[i] = '2';
            else if ((int) converter[i] >= 68 &&  (int) converter[i] <= 70)
                converter[i] = '3';
            else if ((int) converter[i] >= 71 &&  (int) converter[i] <= 73)
                converter[i] = '4';
            else if ((int) converter[i] >= 74 &&  (int) converter[i] <= 76)
                converter[i] = '5';
            else if ((int) converter[i] >= 77 &&  (int) converter[i] <= 79)
                converter[i] = '6';
            else if ((int) converter[i] >= 80 &&  (int) converter[i] <= 83)
                converter[i] = '7';
            else if ((int) converter[i] >= 84 &&  (int) converter[i] <= 86)
                converter[i] = '8';
            else if ((int) converter[i] >= 87 &&  (int) converter[i] <= 90)
                converter[i] = '9';
        }
        return String.valueOf(converter);
    }

    public static void main(String[] args)
    {
        System.out.println(textToNum("123-647-EYES"));
    }
}