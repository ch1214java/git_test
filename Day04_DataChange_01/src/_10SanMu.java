
public class _10SanMu {
	/***
	 * ��Ŀ�����
	 * 		A �� B �� C
	 * 		A B C �������Ǳ��ʽ
	 * 		A:���������boolean���ͣ����ʽ��
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b =20;
		int max = a > b ? a+10:b;
		System.out.println(max);
		
		int i = 60;
		
		String s = i>=90?"A":i>=80?"B":i>=70?"C":i>=60?"D":"����Ŭ��";
		System.out.println(s);
	}

}
