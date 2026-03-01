package components;
public class key_board {
    public int forward(char letter){
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
        int siginal = alphabets.indexOf(letter);
        return siginal;
    }
    public char backward(int siginal){
        char letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(siginal); 
        return letter;
    }
    public static void main(String args[]){
        key_board obj = new key_board();
        System.out.println(obj.backward(3));

    }
}
