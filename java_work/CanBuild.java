package java_work;

public class CanBuild 
{
    public static boolean canBuild(String[] words)
    {
        for (int i = 1; i < words.length; i++)
        {
            if ( words[i].toLowerCase().indexOf(words[i - 1].toLowerCase()) != -1 ) 
            {
                continue;
            } 
            else
            {
                return false;             
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        String[] words = new String[]{"a", "at", "ate", "ated", "health"};
        System.out.println(canBuild(words));
    }
}
