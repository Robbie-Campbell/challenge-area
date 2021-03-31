package java_work;
//https://edabit.com/challenge/4DKpZPfSgyExdwirC

public class LinearEquation {
    public static int solveEquation(String equation) 
    {
        String[] values = equation.split(" ");
        return values[1].equals("+") ? Integer.parseInt(values[4]) - Integer.parseInt(values[2]) : Integer.parseInt(values[4]) + Integer.parseInt(values[2]);
    }

    public static void main(String[] args) 
    {
        System.out.println(solveEquation("x + 300 = 100"));
        System.out.println(solveEquation("x - 9 = 10"));
    }
}
