package doufu;

public class StringtoChar {
	public static void main(String[] args) {
		String str="多单词组成时所有字母都小写：xxxyyyzzz";
		char[] cc=str.toCharArray();
		for (char c : cc) {
			System.out.println(c);
		}
	}

}
