import java.util.Scanner;
public class Phonenumber {
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	String s=scan.next();
	String str=letterCombinations(s);
	System.out.println(str);
    }
    public static String letterCombinations(String digits) {
        if (digits.length() == 0) 
		return "";
        
        String[] dict = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        String combos="";
	combos = backtrack(combos, digits.toCharArray(), "", dict);
        return combos;
    }
    
    public static String backtrack(String combos, char[] digits, String s, String[] dict) {
        if (s.length() == digits.length) { 
		return combos+=s; 
	}
        int i = s.length();
        int digit = digits[i] - '0';
        for (char letter : dict[digit].toCharArray()) {
            return backtrack(combos, digits, s + Character.toString(letter), dict);
        }
	return "";
    }
}