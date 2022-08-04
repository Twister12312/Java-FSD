package Assisted_project_dsa;

import java.util.Stack;

public class ReverseusingStack {
	
	public static String reverse(String str) {
        char[] charArr = str.toCharArray();
        int size = charArr.length;
        Stack<Character> stack = new Stack();

        int i;
        for(i = 0; i < size; ++i) {
            stack.push(charArr[i]);
        }

        for(i = 0; i < size; ++i) {
            charArr[i] = stack.pop();
        }

        return String.valueOf(charArr);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="Veryverylongword";
        System.out.println(reverse(str));
        
		
	}

}
