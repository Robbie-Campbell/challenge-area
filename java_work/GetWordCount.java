public class GetWordCount
{
    public static int countWords(String s) {
		return s.split(" ").length;
	}

    public static void main(String[] args)
    {
        System.out.println(countWords("Hello there i am rab"));
    }
}