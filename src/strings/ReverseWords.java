package strings;

/*
https://leetcode.com/problems/reverse-words-in-a-string/description
 */
public class ReverseWords {
    public static String reverseWords(String s) {
        String answer = "";
        String[] words  = s.trim().split(" ");
         for(int i = words.length - 1; i >= 0; i--) {
             if(!words[i].equals("")) {
                 answer = answer + words[i].trim() + " ";
             }
         }

         return answer.trim();
    }

    public static void main(String[] args) {
        String s1 = "the sky is blue";
        System.out.println(reverseWords(s1));
        System.out.println(reverseWords("  hello world  "));
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("a good   example"));
    }
}
