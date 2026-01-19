package class5;

public class ReverseWord {
    public static void main(String[] args) {
        String word = "JavaProgramming";
        String revWord = "";

        for (int i=word.length()-1; i>=0; i--){
            revWord += word.charAt(i);
        }
        System.out.println(revWord);
    }
}
