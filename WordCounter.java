public class WordCounter {
    // הפעולה המקבלת מחרוזת ומילה ומחזירה את מספר הפעמים שהמילה מופיעה במחרוזת
    public static int countOccurrences(String text, String word) {
        int count = 0; // משתנה לספירת מספר ההופעות של המילה
        int index = text.indexOf(word); // חיפוש ראשון של המילה במחרוזת
        
        // לולאה למציאת ההופעות של המילה במחרוזת
        while (index != -1) {
            count++; // הגדלת הספירה
            index = text.indexOf(word, index + word.length()); // חיפוש המיקום הבא למילה
        }
        
        return count; // החזרת מספר ההופעות
    }
    
    public static void main(String[] args) {
        String text = "Hello world! Hello everyone! Hello there!";
        String word = "Hello";
        
        int occurrences = countOccurrences(text, word);
        System.out.println("The word \"" + word + "\" appears " + occurrences + " times in the text.");
    }
}
