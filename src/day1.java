
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1tangjam
 */
public class day1 {
	public static String getWord() {
		Scanner input = new Scanner(System.in);
		System.out.print("Word to encrypt: ");
		return (input.nextLine());
	}

	public static String getReplace() {
		Scanner input = new Scanner(System.in);
		System.out.print("Get Replace: ");
		return (input.nextLine());
	}

	public static String getReplacement() {
		Scanner input = new Scanner(System.in);
		System.out.print("Get Replacement: ");
		return (input.nextLine());
	}

	public static char[] turnIntoArray(String s) {
		char[] sentence = new char[s.length()];

		for (int i = 0; i < sentence.length; i++) {
			sentence[i] = s.charAt(i);
		}
		return (sentence);
	}

	public static char[] doReplacements(char[] sentence, String replace, String replacement) {
		String check;

		for (int i = 0; i < sentence.length; i++) {
			check = "" + sentence[i];

			if (check.equals(replace)) {
				sentence[i] = replacement.charAt(0);
			}
		}
		return (sentence);
	}

	public static void main(String[] args) {
		String s;
		char[] sentence;
		String replace;
		String replacement;

		s = getWord();
		sentence = turnIntoArray(s);

		for (int i = 1; i <= 3; i++) {
			replace = getReplace();
			replacement = getReplacement();
			sentence = doReplacements(sentence, replace, replacement);
		}
		System.out.println(sentence);
	}


}
