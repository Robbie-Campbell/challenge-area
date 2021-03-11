public class onetimecode{

    public static String encrypt(String plncode, String pad) {
		StringBuilder sb = new StringBuilder();
		sb.append(pad.substring(0,5));
		for (int i=0 ; i<plncode.length() ; i++) {
			 sb.append(checkEncrypt(Integer.parseInt(plncode.substring(i, i+1)), Integer.parseInt(pad.substring(i+5, i+6))));
		}
		return sb.toString();
	}

	private static Object checkEncrypt(int plncode, int pad) {
		int encrpt = plncode-pad;
		return encrpt >= 0 ? encrpt : 10 + encrpt;
	}

	public static String decrypt (String cypcode, String pad) {
		StringBuilder sb = new StringBuilder();
		if (!cypcode.substring(0,5).equals(pad.substring(0,5))) return "Error: Key IDs don't match.";
		for (int i=5 ; i<cypcode.length() ; i++) {
			 sb.append(checkDecrypt(Integer.parseInt(cypcode.substring(i, i+1)), Integer.parseInt(pad.substring(i, i+1))));
		}
		return sb.toString();
	}

	private static Object checkDecrypt(int cypcode, int pad) {
		int decrypt = cypcode + pad;
		return decrypt < 10 ? decrypt :  decrypt-10;
	}

    public static void main(String[] args)
    {
        System.out.println(encrypt("56289367449331922", "637197877682780836504704874690100607768768"));
    }
}