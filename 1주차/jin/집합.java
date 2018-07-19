class Solution {
	public static int[] solution(int n, int s) {
		int[] answer = {};

		int w , e ; // w는 s를 n으로 나눈 몫, e는 s를 n으로 나눈 나머지
		if (s<n) {
			answer[0] = -1;
		} else {
			w = s / n;
			e = s % n;
			int i;
			for (i = 0; i < n; i++)
				answer[i] = w; // 배열 n개수만큼 w 저장
			for (int j = 1; j <= e; j++) {
				answer[i]++; // 나머지값을 배열 끝자리부터 하나씩 배분
				i--;
			}
		}
		return answer;
	}
	public static void main(String args[]) {
		
		System.out.println(solution(2,9));
		System.out.println(solution(2,1));
		
	}
}
