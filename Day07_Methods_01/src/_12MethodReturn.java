
public class _12MethodReturn {

	/***
	 * ��������ֵreturn
	 * 		1.ע�����return sum://������Ľ�����س�ȥ��ע�⣬���ص���ֵ����sum��
	 * 		2.��������ֵ���ڲ��뷵��ֵλ�ã������͡������Ӧ�� ����ֵ�����Ӧ
	 * 		3.��������ֵ��λ�ã�д�˷���ֵ���ͣ��������ڲ���������Ӧ��return��
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int asum = add(10, 20, 30);
		System.out.println(asum);
		int sum = add1(1,1,2,3);//���÷���������һ������ֵ�����ݣ����Լ���ʹ�ã�
		System.out.println(sum);
	}
	
	
	public static int add(int a,int b,int c){//���ݴ����ȥ�����������㡾�����ɽ����ӡչʾ��һ�¡�
		int sum = a+b+c;
		if(sum>100){//�п���returnִ�в�������������ֻ���ṹ����ֵ���п���returnִ�в�����
			return sum;//������Ľ�������ݣ����ػ�ȥ��ע�⣺���ص���ֵ����sum;
		}else{
			return c;
		}
		
	}
	public static int add1(int a,int b,int c,int d){
		int sum = a+b+c+d;
		if(sum>100){
			return sum;
		}else{
			return d;
		}
	}

}
