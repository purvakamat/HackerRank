import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BiggerIsGreater {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		String[] list = new String[n];
		if (n>0) {
			for (int i = 0; i < n; i++) {
				list[i] = in.readLine();
			}

			for (int i = 0; i < n; i++) {
				System.out.println(new BiggerIsGreater().getNextPermutation(list[i]));
			}
		}
	}

	private String getNextPermutation(String s) {
		String original = new String(s);
		if (s.length() < 2 || !s.matches("[a-zA-Z]+"))
			return "no answer";

		if (s.length() == 2){
			String r = new StringBuffer(s).reverse().toString();
			if(s.equals(r))
				return "no answer";
			else
				return r;
		}

		int i = s.length()-1;
		while(i > 0 && s.charAt(i-1) >= s.charAt(i))
			i--;

		if (i <= 0)
			return "no answer";

		int pivot = i-1;
		int j = s.length()-1;

		while (s.charAt(j) <= s.charAt(pivot))
			j--;

		// swap pivot with j'th element
		char[] cArr = s.toCharArray();
		char c = cArr[pivot];
		cArr[pivot] = cArr[j];
		cArr[j] = c;

		s = String.valueOf(cArr);
		StringBuffer buffer = new StringBuffer(s.substring(pivot+1));
		String permutation = s.substring(0,pivot+1) + buffer.reverse().toString();

		if (permutation.equals(original))
			return "no answer";
		else
			return permutation;
	}

}