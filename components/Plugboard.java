package components;

public class Plugboard {
    Plugboard(String[] pairs){
        String left = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String right = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int A = 0;
        int B = 0;
        for(String pair : pairs){
            A = left.indexOf(pair.charAt(0));
            B = left.indexOf(pair.charAt(1));
        }
        left = left.substring(0,A)+left.substring(B, B+1)+left.substring(A+1, B)+left.substring(A, A+1)+left.substring(B+1));
    }
    public static void main(String args[]){
        Plugboard plg_brd = new Plugboard(new String[]{"AX"});
    }
}




