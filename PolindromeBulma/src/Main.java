
import java.util.Scanner;
import java.util.Stack;


public class Main {
    //kasaylabalyasak
    public static void main(String[] args) {
        
        System.out.println("Palindrom bulma programına hoşgeldiniz.");
        System.out.println("Cümle: ");
        Scanner scanner = new Scanner(System.in);
        String cumle = scanner.nextLine();
        
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < (cumle.length()/2); i++){
            
            stack.push(cumle.charAt(i));
            
        }
        if (isPalindrome(cumle, stack)) {
            System.out.println("Bu cümle palindromdur. " + cumle);
            
        }
        else {
            System.out.println("Bu cümle palindrom değildir.");
        }
        
    }
    public static boolean isPalindrome(String cumle, Stack<Character> stack){
        
        for (int i = (1 + cumle.length()/2); i < cumle.length(); i++) {
            
            if (cumle.charAt(i) != stack.pop()) {
                return false;
            }
            
        }
        
        return true;
    }
}
