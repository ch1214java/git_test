
public class _05AutoAdd {

	/***
	 * ���� ++  ----------���ڱ�������
	 * �Լ�--  ----------���ڱ�������
	 * @param args
	 */
	public static void main(String[] args) {
		//1.��õ�
		int i = 10;
		i++;//ԭ��������+1
		System.out.println("��һ��++��"+i);//11
		
		i++;//ԭ��������+1
		System.out.println("�ڶ���++��"+i);//12
		
		
		++i;
		System.out.println("������++��"+i);//13
		
		//++ ���ұߣ��ȸ�ֵ��++
		//++ ����ߣ���++�ڸ�ֵ
		int j = i++;
		System.out.println("j��ֵ��"+j);//13
		System.out.println("i��ֵ��"+i);//14
		
		
		int k = ++i;
		System.out.println("K��ֵ��"+k);//15
		System.out.println("i��ֵ��"+i);//1
		i = i++;
		System.out.println("i = i++��ֵ��"+i);//15
		i = ++i;
		System.out.println("i = ++i��ֵ��"+i);//16
		
		//-- ���ұߣ��ȸ�ֵ��--
		//-- ����ߣ���--�ڸ�ֵ
		int j1 = i--;
		System.out.println("j1��ֵ��"+j1);//15
		System.out.println("i��ֵ��"+i);//14
		
		
		int k1 = --i;
		System.out.println("K1��ֵ��"+k1);//12
		System.out.println("i��ֵ��"+i);//12	
	}
}
