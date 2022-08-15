public class RomanToInteger {
    public int romanToInt(String s) {
        int value = 0;
        int ret = 0;
        
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I' : value = 1; break;
                case 'V' : value = 5; break;
                case 'X' : value = 10; break;
                case 'L' : value = 50; break;
                case 'C' : value = 100; break;
                case 'D' : value = 500; break;
                case 'M' : value = 1000; break;
            }   
            if (4 * value < ret) ret -= value;
            else ret += value;
        }
        return ret;
    }
}
