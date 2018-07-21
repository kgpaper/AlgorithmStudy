class Solution {
	public int[] solution(int n, int s) {
		int[] answer = {};

		int w , e;// w�� s�� n���� ���� ��, e�� s�� n���� ���� ������
		if (s / n == 0) {
			answer[0] = -1;
		} else {
			w = s / n;
			e = s % n;
			int i;
			for (i = 0; i < n; i++)
				answer[i] = w; // �迭 n������ŭ w ����
			for (int j = 1; j <= e; j++) {
				answer[i]++; // ���������� �迭 ���ڸ����� �ϳ��� ���
				i--;
			}
		}
		return answer;
	}
}