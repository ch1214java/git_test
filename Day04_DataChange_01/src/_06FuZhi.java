
public class _06FuZhi {

	/***
	 * ��ֵ�����
	 * 	=   +=   -=   *=   /=   %=
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������һ��int���͵ı���i,����ֵΪ10��  ��������ֵ
		int i = 10;
		String str = "abc";
		
		
		i+= 50;//ֻ�ܿ������������ i = i+50;   ����
		System.out.println(i);
		
		byte b = 10;
		//b+=50;//ֻ�ܿ���b = b+50;
		//b = b + 50;//byte int  �����int����
		System.out.println(b);
		b += 10;
		System.out.println("b += 10��ֵ�ǣ�"+b);
		b -= 10;
		System.out.println("b -= 10��ֵ�ǣ�"+b);
		b *= 10;
		System.out.println("b *= 10��ֵ�ǣ�"+b);
		b /=10;
		System.out.println("b /= 10��ֵ�ǣ�"+b);
		b %=10;
		System.out.println("b %= 10��ֵ�ǣ�"+b);
	}

}
