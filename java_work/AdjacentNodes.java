// https://edabit.com/challenge/8hk27ha9CtqCQsYP8
/*
    Trying to understand this one was a nightmare, but the solution
    is very very easy.
*/

package java_work;

public class AdjacentNodes
{
    public static boolean adjacent(int[][] graph, int node1, int node2) 
    {
        return graph[node1][node2] == 1;
    }

    public static void main(String[] args)
    {
        System.out.println(adjacent(new int[][]{
                { 0, 1, 0, 0 },
                { 1, 0, 1, 1 },
                { 0, 1, 0, 1 },
                { 0, 1, 1, 0 }
            }, 1, 3
        ));
    }
}