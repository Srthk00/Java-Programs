import java.io.*;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

public class MultiThreadFileProcessor {

    static ReentrantLock lock = new ReentrantLock();

    static boolean isPalindrome(String word) {
        int i = 0, j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    static class PalindromeThread extends Thread {
        List<String> words;

        PalindromeThread(List<String> words) {
            this.words = words;
        }

        public void run() {
            List<String> palindromes = new ArrayList<>();
            for (String word : words) {
                if (isPalindrome(word)) {
                    palindromes.add(word);
                }
            }

            lock.lock();
            try {
                System.out.println("Palindromes found: " + palindromes);
            } finally {
                lock.unlock();
            }
        }
    }

    static class WordLengthThread extends Thread {
        List<String> words;

        WordLengthThread(List<String> words) {
            this.words = words;
        }

        public void run() {
            lock.lock();
            try {
                System.out.println("Word Lengths:");
                for (String word : words) {
                    System.out.println(word + ": " + word.length());
                }
            } finally {
                lock.unlock();
            }
        }
    }

    static List<String> readWordsFromFile(String filename) {
        List<String> words = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNext()) {
                words.add(scanner.next());
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return words;
    }

    public static void main(String[] args) {
        String filename = "sample.txt";

        List<String> words = readWordsFromFile(filename);

        Thread t1 = new PalindromeThread(words);
        Thread t2 = new WordLengthThread(words);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.err.println("Thread interrupted.");
        }
    }
}
