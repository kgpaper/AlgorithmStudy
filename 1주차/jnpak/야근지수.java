class �߱����� {
	public static long solution(int n, int[] works) {
		long answer = 0;

		if (works.length == 0) { // �迭���� 0�ΰ�� 0 ����
			return answer;
		} else {
			for (int j = 1; j <= n; j++) { // �����ð� n ��ŭ for�� ����
				int m = 0; // m�� �迭 �ε��� ��ȣ
				int max = works[0];
				for (int i = 0; i < works.length; i++) {

					if (works[i] > max) { // �迭�� �ִ밪��ġ�� m�� ����
						max = works[i];
						m = i;
					}
				}
				works[m] = works[m] - 1; // �ִ밪 1��ŭ ���ҽ�Ŵ
			}
		}
		for (int k = 0; k < works.length; k++) {
			if (works[k] >= 0) {
				long w = works[k] * works[k]; // w �迭���� ����
				answer = answer + w; // ������ �� ��� ����
			}
		}

		return answer;
	}

	public static void main(String args[]) {
		int a = 3;
		int w[] = { 4, 3, 3 };
		System.out.println(solution(a, w));
	}
}
