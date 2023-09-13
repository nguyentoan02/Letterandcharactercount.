/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
///**
// *
// * @author MSII
// */
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your content:");
//        String s = sc.nextLine();
//// hello world
//// h 1, e 1, 13, 2, 1, 1, d- 1 // chỉ đếm các kí tự chữ cái và số, bỏ qua 10#$^&*()...
//        Map<Character, Integer> charCount = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//// count character
//            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
//                if (!charCount.containsKey(s.charAt(i))) 
//                    charCount.put(s.charAt(i), 1);
//                else 
//                    charCount.put(s.charAt(i), charCount.get(s.charAt(i)) + 1);
//                
//            }
//        }
//            System.out.print("{");
//            for (Map.Entry<Character, Integer> entry : charCount.entrySet()) 
//                System.out.print(entry.getKey() + "=" + entry.getValue() + ", ");
//            
//            System.out.print("}\n");
//        
//            Map<String, Integer> wordCount = new HashMap<>(); // Tách các từ bằng các kí tự space, 1, @, #,۰۰
//            String[] word = s.split("[!@#$%&. ]");
//                for (String o: word) {
//                    if (!wordCount.containsKey(o)) 
//                        wordCount.put(o,1);
//                    else
//                        wordCount.put(o, wordCount.get(o) + 1);
//            }
//            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
//                System.out.println(entry.getKey() + "=" + entry.getValue());
//        }
//                
//            
//        }
//    }


    
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class TextAnalyzer {

      public static Map<Character, Integer> countCharacters(String content, boolean ignoreCase) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        if (ignoreCase) {
            content = content.toLowerCase(); 
        }
        
        StringTokenizer tokenizer = new StringTokenizer(content);
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            for (int i = 0; i < token.length(); i++) {
                char c = token.charAt(i);
                if (Character.isLetterOrDigit(c)) {
                    charCount.put(c, charCount.getOrDefault(c, 0) + 1);
                }
            }
        }

        return charCount;
    }

    public static Map<String, Integer> countWords(String content) {
        Map<String, Integer> wordCount = new HashMap<>();

        
        StringTokenizer tokenizer = new StringTokenizer(content, "!@#$%^&*. ");

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();

           
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        return wordCount;
    }
}


    
