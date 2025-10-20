package com.backjoon.algorithm.string;

import java.io.*;
import java.util.regex.Pattern;

/*

SILVER Ⅴ

[input]
a
tv
ptoui
bontres
zoggax
wiinq
eep
houctuh
end

[output]
<a> is acceptable.
<tv> is not acceptable.
<ptoui> is not acceptable.
<bontres> is not acceptable.
<zoggax> is not acceptable.
<wiinq> is not acceptable.
<eep> is acceptable.
<houctuh> is acceptable.

 */
public class N4659 {
	// 1) 모음 하나 이상 포함
	private static final Pattern VOWEL = Pattern.compile("[aeiou]");

	// 2) 모음 3연속 또는 자음 3연속 금지
	//   - 자음 집합은 모음을 제외한 알파벳으로 명시
	private static final Pattern THREE_VOWELS_OR_CONSONANTS =
		Pattern.compile("(?:[aeiou]{3}|[bcdfghjklmnpqrstvwxyz]{3})");

	// 3) 같은 글자 2연속 금지, 단 ee/oo 허용
	//   - 소문자 기준: e, o 를 제외한 동일 문자 2연속을 금지
	private static final Pattern INVALID_DOUBLE =
		Pattern.compile("([a-df-np-z])\\1");

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		for (String word; (word = br.readLine()) != null && !"end".equals(word); ) {
			boolean acceptable = hasVowel(word)
				&& !hasThreeVowelsOrConsonants(word)
				&& !hasInvalidDouble(word);

			extracted(sb, word, acceptable);
		}

		System.out.print(sb);
	}

	private static void extracted(StringBuilder sb, String word, boolean acceptable) {
		sb.append('<').append(word).append("> is ")
			.append(acceptable ? "acceptable." : "not acceptable.")
			.append('\n');
	}

	private static boolean hasVowel(String word) {
		return VOWEL.matcher(word).find();
	}

	private static boolean hasThreeVowelsOrConsonants(String word) {
		return THREE_VOWELS_OR_CONSONANTS.matcher(word).find();
	}

	private static boolean hasInvalidDouble(String word) {
		return INVALID_DOUBLE.matcher(word).find();
	}
}
