public class onetimecode{

    public static String encrypt(String plaincode, String pad){
        
        StringBuilder cypherText = new StringBuilder();
        char[] pcarr = plaincode.toCharArray();
        char[] padarr = pad.toCharArray();
        for (int i = 0; i < plaincode.toCharArray().length; i++)
        {
            if (i < 5)
            {
                cypherText.append(String.valueOf(padarr[i]));
            }
            else
            {
                int encryptVal = Integer.parseInt(String.valueOf(pcarr[i])) - Integer.parseInt(String.valueOf(padarr[i])) % 10;
                int finalVal =  encryptVal < 0 ? 10 - (encryptVal * -1) : encryptVal;
                cypherText.append(finalVal);
            }
        }
        System.out.println(cypherText.toString() == "6371956289367449331922");
        return String.valueOf(cypherText);
    }

    public static StringBuilder decrypt(String cypcode, String pad){
        StringBuilder plaintext = new StringBuilder();
        char[] pcarr = cypcode.toCharArray();
        char[] padarr = pad.toCharArray();
        for (int i = 0; i < cypcode.toCharArray().length; i++)
        {
            if (i < 5)
            {
                plaintext.append(String.valueOf(padarr[i]));
            }
            else
            {
                int encryptVal = Integer.parseInt(String.valueOf(pcarr[i])) + Integer.parseInt(String.valueOf(padarr[i])) % 10;
                plaintext.append(encryptVal);
            }
        }
        return plaintext;
    }

    public static void main(String[] args)
    {
        System.out.println(encrypt("56289367449331922", "637197877682780836504704874690100607768768"));
    }
}