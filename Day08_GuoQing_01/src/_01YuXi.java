
public class _01YuXi {

	/***
	 * 1.����һ������getMax,��������int���������ؽϴ��һ������
	 * static��������̬�����Ĳ��ܷ��ʷǾ�̬�ģ���������Ա����
	 * @param args
	 */
	
	static int i = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = getMax(20,30);
		System.out.println(m);
	}
	
	static int getMax(int a,int b){//��������int��������a,b
		int max = a>b?a:b;
		return max;
	}
	

}
