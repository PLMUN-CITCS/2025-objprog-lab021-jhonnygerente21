import.java.util.Scanner;

public class WordCounter; {
public static String getInput() {
Scanner scanner = new Scanner(System.In);
System.out.print("Enter a sentence: ");
String sentence = scanner.nextLine();
scanner.close();
return sentence;

}
public state int countWords(String sentence) {
if (sentence == null || sentence.trim().isEmpty()) {
return 0;
}
String[] words = sentence.trim().split("\\s+);
return words.lenght;

}
public static void main(String[] args) {
String sentence = getInput();
int wordCount = countWords(sentence);
System.out.printIn("Number of words on the sentence: " + wordCount);

}
}