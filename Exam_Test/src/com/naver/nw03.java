package com.naver;

import java.util.Arrays;

public class nw03 {

	public static void main(String[] args) {
		String s = "aaaaabbbbb";
		String t = "ab";

		solution(s, t);
		
	}
	public static int solution(String s, String t) {
		int result = -1;

        String [] sArr = s.split("");
        String [] tArr = t.split("");

        int [] cnt = new int [tArr.length];

        for(int i = 0; i < sArr.length; i++) {
            for(int j = 0; j < tArr.length; j++) {
                if(sArr[i].equals(tArr[j])) {
                	System.out.println(sArr[i] + " : " + tArr[j]);
                    cnt[j]++;
                }
            }
        }

        Arrays.sort(cnt);

        result = cnt[0];
        System.out.println(Arrays.toString(sArr));
        System.out.println(Arrays.toString(tArr));
        System.out.println(Arrays.toString(cnt));
        System.out.println(result);
        return result;
	}
	
	
//    public static int solution(String s, String t) {
//        int result = 0;
//
//        while(chkString(s, t)) {
//        	
//        	s = s.replace(t, "");
//        	result++;
//        }
//
//        return result;
//    }

    private static boolean chkString(String s, String t) {
    	
    	if (s.contains(t)) {
    		return true;
    	} else {
    		return false;
    	}
    	
    }
    
}

/*
 * 문제 설명
문서 편집기에는 찾아 바꾸기라는 기능이 있습니다. 찾아 바꾸기를 이용하여 파일에서 바꿀 문자열을 찾은 뒤, 그 문자열이 발견되면 그 문자열을 제거하는 과정을 진행합니다. 찾아 바꾸기는 한 번에 한 개의 문자열만 제거할 수 있습니다. 따라서 제거할 문자열이 여러 번 나타나거나, 문자열을 제거한 결과가 또 다시 바꿀 문자열과 같아지는 경우 한번 더 찾아 바꾸기를 해야 합니다.

예를 들어, aabcbcd 문자열에서 abc 라는 문자열을 제거하고 싶을 때,찾아 바꾸기를 1번 실행하면 abcd가 됩니다.이 때, abc가 1번 더 생기게 되므로, 한번 더 찾아 바꾸기를 실행하여 d로 바꿀 수 있습니다. 더 이상 abc 문자열이 존재하지 않으므로 총 2번의 찾아 바꾸기 과정을 통해 문자열을 모두 바꿀 수 있습니다.

검색하고자 하는 문장 s에서 문자열 t를 찾아 제거할 때, 총 몇 번의 찾아 바꾸기를 진행해야 문장 s에서 t가 더이상 존재하지 않는지 계산하는 함수를 완성하세요.

제한사항
문자열 s : 길이는 1,000,000 이하의 자연수이며, 소문자로만 이루어져 있습니다.
문자열 t : 길이는 10 이하의 자연수이며, 소문자로만 이루어져 있습니다. (단 문자열 t의 문자들은 중복되지 않습니다.)
입출력 예
s	t	result
"aabcbcd"	"abc"	2
"aaaaabbbbb"	"ab"	5
입출력 예 설명
입출력 예 #1

문제의 예시와 같습니다.

입출력 예 #2

"ab"를 제거하면 "aaaabbbb"가 남게 되고, 또 "ab"를 제거할 수 있게 됩니다. 같은 방식으로 총 5번을 진행하면 S 문자열에 "ab"가 더이상 존재하지 않게 됩니다.
 */

