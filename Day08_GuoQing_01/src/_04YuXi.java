
public class _04YuXi {

	/***
	 * ������������
	 * 		ֵ���ݣ�
	 * 		ֵ���ã�
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int[] arr = {11,22,33};
		
		System.out.println(i);//10  i ��װ����10�������������͡�
		System.out.println(arr);//[I@15db9742   arr��װ���ǵ�ֵַ���������������͡�
		
		change(i);
		change(arr);
		
		System.out.println(i);
		System.out.println(arr[0]);
	}
	
	static void change(int k){//�������ͣ�
		k = 99;
	}
	
	static void change(int[] brr){//��������
		brr[0] =66;
	}

}
