public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int horizontal = 0; // Left and Right
        int vertical = 0; // Up and Down
        
        for(int i=0; i<moves.length(); i++){
            Character c = moves.charAt(i);
            switch(c) {
                case 'L': 
                    horizontal--;
                    break;
                case 'R': 
                    horizontal++;
                    break;
                case 'U': 
                    vertical++;
                    break;
                case 'D': 
                    vertical--;
                    break;
            }
        }
        return horizontal == 0 && vertical == 0;
    }
}
