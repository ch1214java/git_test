
public class _08MethodTest {

	/***
	 * �����ĸ��������
	 * 		1.��������飬�ܹ���ɶ����Ĺ��ܣ����Է���ʹ��
	 * 		2.����Ӧ��д����Ľṹ���У�
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add("��Ϊ....", "����......");
		addSum(55, 66);
		getMax(10, "B", 3.0, 4.4, 'A');
	}
	public static void getMax(int a,String b,double c,double d,char e){
		System.out.println(a+b+c+d+e);
	} 
	public static void add(String a,String b){
		String sum = a+b;
		System.out.println(sum);
	}
	public static void addSum(int a,int b){//����һ��addSum�ķ�������������int���͵���ʽ����
		int sum = a+b;//������������ݴ���
		System.out.println(sum);
	}

}
