package com.backjoon.algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*

Bronze Ⅰ

[input]
AABCDD
afzz
09121
a8EWg6
P5h3kx

[output]
Aa0aPAf985Bz1EhCz2W3D1gkD6x


1) 문제 인식

초기 before() 구현에서 공백을 다른 문자로 치환해야 한다고 잘못 가정해 불필요한 전처리가 추가되었다.
그 결과 로직이 복잡해졌으며 입력 제약(소문자+공백)을 제대로 활용하지 못했다.

2) 개선 내용

main()에서는 불필요한 치환 과정을 모두 제거하고 입력된 다섯 줄을 그대로 저장한 뒤 세로 방향으로 읽어 출력하는 방식으로 단순화했다.
입력 단계에서 가장 긴 문자열 길이를 maxLen으로 구하고 -> col을 기준으로 0번째 행부터 4번째 행까지 순회
-> 존재하는 문자만 StringBuilder에 순서대로 추가해 최종 문자열 생성.

3) 정리

- 불필요한 치환 제거 → 입력을 그대로 사용해 가독성과 성능 향상
- 입력 스펙 활용 → 행 수(5) 고정, 열 길이만 가변 → 경계 처리 명확
- 단순·명확한 로직 → 세로 탐색으로 의도 분명하게 출력
 */
public class N10798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] rows = new String[5];
		int maxLen = 0;

		for (int i = 0; i < 5; i++) {
			rows[i] = br.readLine();
			maxLen = Math.max(maxLen, rows[i].length());
		}

		StringBuilder sb = new StringBuilder();

		// 세로 읽기
		for (int col = 0; col < maxLen; col++) {
			for (int r = 0; r < 5; r++) {
				if (col < rows[r].length()) {
					sb.append(rows[r].charAt(col));
				}
			}
		}

		System.out.print(sb);
	}

	void before() {
		Scanner sc = new Scanner(System.in);

		// 문장 담을 그릇
		StringBuffer sb = new StringBuffer();
		// 문장 최대 길이
		int maxCol = 0;

		// 입력 받기
		for(int i = 0; i < 5; i++) {
			char[] charArray =  sc.nextLine().trim().toCharArray();
			if (charArray.length > maxCol) maxCol = charArray.length;
			for(char c : charArray) {
				sb.append(c);
			}
			sb.append(',');
		}

		// 입력된 sb 변환
		String[] split = sb.toString().split(",");

		char[][] chars = new char[5][maxCol];

		// ? 특수문자로 공백 치환
		for(int i = 0; i < chars.length; i++) {
			for(int j = 0; j < chars[i].length; j ++) {
				char[] charRow = split[i].toCharArray();
				if(j < charRow.length) {
					chars[i][j] = charRow[j];
				} else {
					chars[i][j] = '?';
				}
			}
		}

		// 세로로 출력
		for(int i = 0; i < maxCol; i++) {
			for(int j = 0; j < 5; j++) {
				String a = chars[j][i] == '?' ? "" : String.valueOf(chars[j][i]);
				System.out.print(a);
			}
		}
	}
}
