
public class _04MethodValueTest {

	/***
	 * �����������ݣ�
	 * 		1.ֵ����
	 * 		2.ֵ����[��ֵַ]
	 * @param args
	 */
	public static void main(String[] args) {
		//part1:
		//[������������]���ݵ���ֵ
		int a = 10;
		System.out.println("ǰ��"+a);//10
		
		changeA(a);//���ݵ���10
		System.out.println("��"+a);//10
		//part2
		int[] a1 = {11,22,33};
		System.out.println(a1[0]);//11
		
		changeA(a1);//��ַ���ݣ����ô���
		System.out.println(a1[0]);//99
	}
	
	public static void changeA(int c){//��a��ֵ��10�������˽���ʹ��Ҳ����˵c=10
		System.out.println("c:"+c);//�ڷ���ִ����������Բ������¸�ֵ��ôc=10;
		c=88;//ֻ�����޸�c����
	}
	
	public static void changeA(int[] b){
		b[0] = 99;
	}

}
