import java.util.*;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<Character>();
        Stack<Character> s2 = new Stack<Character>();
        
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!s1.isEmpty()) s1.pop();
                continue;
            }
            s1.push(c);
        }
        for (char c : t.toCharArray()) {
            if (c == '#') {
                if (!s2.isEmpty()) s2.pop();
                continue;
            }
            s2.push(c);
        }
        String ret1 = "";
        String ret2 = "";
        
        while(!s1.isEmpty()) {
            ret1 += s1.pop();
        }
        while (!s2.isEmpty()) {
            ret2 += s2.pop();
        }
        System.out.println("ret1: "+ret1);
        System.out.println("ret2: "+ret2);
        return ret1.equals(ret2);
    }
}
