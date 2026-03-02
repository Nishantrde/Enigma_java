package components;

public class Plugboard {
    String left;
    String right;
    Plugboard(String[] pairs){
        left = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        right = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int A = 0;
        int B = 0;
        for(String pair : pairs){
            A = left.indexOf(pair.charAt(0));
            B = left.indexOf(pair.charAt(1));
        }
        left = left.substring(0,A)+left.substring(B, B+1)+left.substring(A+1, B)+left.substring(A, A+1)+left.substring(B+1);
    }
        public int forward(int signal){
            char letter = right.charAt(signal);
            return left.indexOf(letter);
        }
        public int backward(int signal){
            char letter = left.charAt(signal);
            return right.indexOf(letter);
        }
}



// 