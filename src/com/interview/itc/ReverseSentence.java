package com.interview.itc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseSentence {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		input.close();
		
		String sentenceArr[] = sentence.split("\\s");

		Collections.reverse(Arrays.asList(sentenceArr));
		String collect = Arrays.stream(sentenceArr).map(s -> s + "").collect(Collectors.joining(" "));
		System.out.println(collect);

	}
}
