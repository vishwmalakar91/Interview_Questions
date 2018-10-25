package Jobs;

public class vuclip {
	public static void main(String[] args) {

		String[] Words = { "cat", "rat", "tac", "abcd", "cba" ,"tar","xyz","ok","zyx"};
		
		int Wordslength = Words.length;
		System.out.println("stringth lenght = " + Wordslength);

		int i, j;

		for (i = 0; i < Wordslength; i++) {
			
			for (j = 0; j < Wordslength; j++) {
			
				String RevTest = new StringBuffer(Words[j]).reverse().toString();

				if (Words[i].equals(RevTest)) 
				{
					System.out.print("[" + i + "");
					System.out.print(":" + j + "] ");
					System.out.println(Words[i]);
					
				}
			}
		}
	}

}
