
public class _02YuXi {

	/***
	 * 3.���һ�����������������ķ���
	 * ����ʾ������һ�������������Ĳ�����int���飬�ο����������͵�ʾ����
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9};
		getJi(arr);
		
		int[] a = {11,2,22,33,44};
		getJi(a);
		
	}
	
	static void getJi(int[] arr){
		int a = 1;
		for(int e:arr){
			a*=e;
		}
		System.out.println(a);
	}
	

}
