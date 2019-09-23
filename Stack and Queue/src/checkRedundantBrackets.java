import java.util.Stack;

public class solution {
	public static boolean checkRedundantBrackets(String input) { 
        // create a stack of characters  
        Stack<Character> st = new Stack<>(); 
        char[] str = input.toCharArray(); 
        // Iterate through the given expression  
        for (char ch : str) { 
  
            // if current character is close parenthesis ')'  
            if (ch == ')') { 
                char top = st.peek(); 
                st.pop(); 
  
                // If immediate pop have open parenthesis '('  
                // duplicate brackets found  
                boolean flag = true; 
  
                while (top != '(') { 
  
                    // Check for operators in expression  
                    if (top == '+' || top == '-'
                            || top == '*' || top == '/') { 
                        flag = false; 
                    } 
  
                    // Fetch top element of stack  
                    top = st.peek(); 
                    st.pop(); 
                } 
  
                // If operators not found  
                if (flag == true) { 
                    return true; 
                } 
            } else { 
                st.push(ch); // push open parenthesis '(',  
            }                // operators and operands to stack  
        } 
        return false; 
    } 
}
