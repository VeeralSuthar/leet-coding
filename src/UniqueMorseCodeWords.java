import java.util.*;

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        int count = 0;
        Map<Character, String> map = new HashMap<>();
            map.put('a',".-");
            map.put('b',"-...");
            map.put('c',"-.-.");
            map.put('d',"-..");
            map.put('e',".");
            map.put('f',"..-.");
            map.put('g',"--.");
            map.put('h',"....");
            map.put('i',"..");
            map.put('j',".---");
            map.put('k',"-.-");
            map.put('l',".-..");
            map.put('m',"--");
            map.put('n',"-.");
            map.put('o',"---");
            map.put('p',".--.");
            map.put('q',"--.-");
            map.put('r',".-.");
            map.put('s',"...");
            map.put('t',"-");
            map.put('u',"..-");
            map.put('v',"...-");
            map.put('w',".--");
            map.put('x',"-..-");
            map.put('y',"-.--");
            map.put('z',"--..");
        
        List<String> list = new LinkedList<>();
    
        for (int i = 0; i < words.length; i++) {
            String temp = "";
            for (int j = 0; j < words[i].length(); j++) {
                
                temp += map.get(words[i].charAt(j));
            }
            if (!list.contains(temp)) {
                list.add(temp);
                count++;
            }
        }
        return count;
    }
}
