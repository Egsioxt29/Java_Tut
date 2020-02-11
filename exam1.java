import java.util.Scanner;

public class exam1 {
    void DemoCount(String str){
        char[] inp = str.toCharArray();
        int vowels=0;
        int consonants=0;

        for(int i=0; i<str.length(); i++){
            if(inp[i] == 'a' || inp[i] == 'e' || inp[i] == 'i' || inp[i] == 'o' || inp[i] == 'u'){
                vowels++;
            }
            else{
                consonants++;
            }
        }

        System.out.println("Vowels = "+vowels+" and Consonants = "+consonants);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input String: ");
        String str = scanner.next();

        exam1 countVowels = new exam1();
        countVowels.DemoCount(str);
    }
}

