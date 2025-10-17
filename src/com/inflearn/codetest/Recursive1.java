package com.inflearn.codetest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursive1 {
    static final String MSG1 = "\"재귀함수가 뭔가요?\"";
    static final String MSG2 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
    static final String MSG3 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
    static final String MSG4 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";

    static final String MSG_1 = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
    static final String MSG_2 = "라고 답변하였지.";

    static String under_string = "";

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        DFS(N);

    }

    public static void DFS(int N){
        String under = under_string;
        if(N == 0){
            System.out.println(N+""+under+ MSG1);
            System.out.println(N+""+under+ MSG_1);
            System.out.println(N+""+under+ MSG_2);
            return;
        }

        System.out.println(N+""+under+ MSG1);
        System.out.println(under+ MSG2);
        System.out.println(under+ MSG3);
        System.out.println(under+ MSG4);

        under_string += "____";

        DFS(N-1);
        System.out.println(under+ MSG_2);
    }
}

