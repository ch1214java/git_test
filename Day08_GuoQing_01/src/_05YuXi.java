
public class _05YuXi {

	/***
	 * �ɱ�������䣬�����ɱ�
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add1(1,2,3,4,5);//new int[]{1,2,3,4,5}
	}
	static void add1(int ... b){//����
		int sum = 0;
		for(int i:b){
			sum+=i;
		}
		System.out.println(sum);
	}
	
	//��������
	/*static void add1(int[] a){//��������+�����б�
		
	}*/
	
	
	//������ֵ�������ʽ������
	static void add1(int a,int b,int c,int d,int e){
		
	}
}
