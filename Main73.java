package pat;

import java.util.Scanner;

public class Main73 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		StringBuilder sb = new StringBuilder(s);
		if (s.startsWith("+"))
			sb.deleteCharAt(0);
		int idx = sb.indexOf("E");
		int n = Integer.parseInt(sb.substring(idx + 2));
		if (sb.indexOf("+") == -1) {
			sb.delete(idx, sb.length()); // ɾ�� E �������ַ�
			for (int i = 0; i < n; i++) {
				sb.insert(0, '0');
			}
			sb.deleteCharAt(sb.indexOf("."));
			sb.insert(1, '.');
			if (sb.indexOf("-") != -1) {
				sb.deleteCharAt(sb.indexOf("-"));
				sb.insert(0, '-');
			}
		} else {
			int pIndex = sb.indexOf(".");
			sb.delete(idx, sb.length());
			for (int i = 0; i < n - (idx - pIndex - 1); i++)
				sb.append("0");
			sb.deleteCharAt(sb.indexOf("."));
		}
		System.out.println(sb);
	}
}
// pat һ���ڵ���� һ���ڵ㳬ʱ  ţ����ͨ��