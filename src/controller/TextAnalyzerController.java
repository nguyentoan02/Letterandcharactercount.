/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Map;
import java.util.Scanner;
import model.TextAnalyzer;
import view.Menu;

public class TextAnalyzerController extends Menu<String> {

    static String[] mc = {"Count Characters", "Count Words", "Exit"};

    public TextAnalyzerController() {
        super("Text Analysis Options", mc);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                analyzeCharacters();
                break;
            case 2:
                analyzeWords();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    private void analyzeCharacters() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your text: ");
        String input = scanner.nextLine();
        Map<Character, Integer> charCount = TextAnalyzer.countCharacters(input, true);
        System.out.println("Character Count:");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    private void analyzeWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your text: ");
        String input = scanner.nextLine();
        Map<String, Integer> wordCount = TextAnalyzer.countWords(input);
        System.out.println("Word Count:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    
}

