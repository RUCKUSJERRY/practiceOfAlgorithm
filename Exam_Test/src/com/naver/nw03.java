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
 * ���� ����
���� �����⿡�� ã�� �ٲٱ��� ����� �ֽ��ϴ�. ã�� �ٲٱ⸦ �̿��Ͽ� ���Ͽ��� �ٲ� ���ڿ��� ã�� ��, �� ���ڿ��� �߰ߵǸ� �� ���ڿ��� �����ϴ� ������ �����մϴ�. ã�� �ٲٱ�� �� ���� �� ���� ���ڿ��� ������ �� �ֽ��ϴ�. ���� ������ ���ڿ��� ���� �� ��Ÿ���ų�, ���ڿ��� ������ ����� �� �ٽ� �ٲ� ���ڿ��� �������� ��� �ѹ� �� ã�� �ٲٱ⸦ �ؾ� �մϴ�.

���� ���, aabcbcd ���ڿ����� abc ��� ���ڿ��� �����ϰ� ���� ��,ã�� �ٲٱ⸦ 1�� �����ϸ� abcd�� �˴ϴ�.�� ��, abc�� 1�� �� ����� �ǹǷ�, �ѹ� �� ã�� �ٲٱ⸦ �����Ͽ� d�� �ٲ� �� �ֽ��ϴ�. �� �̻� abc ���ڿ��� �������� �����Ƿ� �� 2���� ã�� �ٲٱ� ������ ���� ���ڿ��� ��� �ٲ� �� �ֽ��ϴ�.

�˻��ϰ��� �ϴ� ���� s���� ���ڿ� t�� ã�� ������ ��, �� �� ���� ã�� �ٲٱ⸦ �����ؾ� ���� s���� t�� ���̻� �������� �ʴ��� ����ϴ� �Լ��� �ϼ��ϼ���.

���ѻ���
���ڿ� s : ���̴� 1,000,000 ������ �ڿ����̸�, �ҹ��ڷθ� �̷���� �ֽ��ϴ�.
���ڿ� t : ���̴� 10 ������ �ڿ����̸�, �ҹ��ڷθ� �̷���� �ֽ��ϴ�. (�� ���ڿ� t�� ���ڵ��� �ߺ����� �ʽ��ϴ�.)
����� ��
s	t	result
"aabcbcd"	"abc"	2
"aaaaabbbbb"	"ab"	5
����� �� ����
����� �� #1

������ ���ÿ� �����ϴ�.

����� �� #2

"ab"�� �����ϸ� "aaaabbbb"�� ���� �ǰ�, �� "ab"�� ������ �� �ְ� �˴ϴ�. ���� ������� �� 5���� �����ϸ� S ���ڿ��� "ab"�� ���̻� �������� �ʰ� �˴ϴ�.
 */
