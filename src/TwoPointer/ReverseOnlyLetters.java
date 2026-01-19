package TwoPointer;

public class ReverseOnlyLetters {

    static void main() {
       String input ="ab-cd";
        System.out.println(reverse(input));
    }

    static String reverse(String s){
        char[] str=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(Character.isLetter(str[start])){
                if(Character.isLetter(str[end])){
                    char temp=str[end];
                    str[end]=str[start];
                    str[start]=temp;
                    start++; end--;
                }else{
                    end--;
                }

            }else{
                start++;
            }
        }
        return new String(str);
    }
}
