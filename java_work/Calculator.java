public class Calculator
{
    public static int calculator(int num1, char operator, int num2) 
    {
        if (num2 == 0 && operator == '/')
            return 0;
		return operator == '-' ? num1 - num2 : operator == '+' ? num1 + num2 : operator == '/' ? num1 / num2 : num1 * num2;
    }

    public static void main(String[] args)
    {
        System.out.println(calculator(2, '/', 2));
    }
}