
public class _08LuoJI {

	/***
	 * �߼�������� �������������ж�
	 * &   |   &&   ||  ^   ��
	 * 1.��������Ķ���boolean���ͣ����ҽ������Ҳ��boolean;
	 * 		&  ��    -����-    ������ͬʱΪtrue�������Ϊtrue��
	 * 		|  ��    -����-	    ��ֻҪһ��Ϊtrue�������λtrue��
	 * 2.
	 * 		&&		�߼���    ���ң�����ͬʱΪtrue�������Ϊtrue��
	 * 				��·��ǰ��Ϊfalse�˺���û�б�Ҫ�����ˡ�
	 * 		||		�߼���    ���ߣ�ֻҪһ�ߡ�Ϊtrue�������Ϊtrue��
	 * 				��·��ǰ��Ϊtrue�˺���û�б�Ҫ�����ˡ�
	 * 
	 * 
	 * 3.
	 * 		^		���		���߽����һ����λtrue��
	 * 
	 * 4.
	 * 		!		�߼���
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		int a = 10;
		boolean b = a > 5 & a <66;//���߶�Ϊtrue�����Ϊtrue������Ϊfalse
		System.out.println(b);
		
		boolean b1 = a > 20 | a > 66;//ֻҪ��һ��Ϊtrue�����Ϊtrue
		System.out.println(b1);
		//2.
		System.out.println(a > 66 && 1/0 == 0);//��·��Ϊ��ǰ��Ϊfalse�ˣ����治�����ˣ�����û�б���
		System.out.println(a < 66 || 1/0 == 0);//��·��ζ��ǰ��Ϊtrue�ˣ�����Ͳ������ˣ�����1/0û�б���
		//3.
		System.out.println(true^false);//true  ^���߽����һ����λtrue��
		
		//4.
		System.out.println(!true);//false     ���뵱ǰ�߼��෴����!true--->false;
	}

}
