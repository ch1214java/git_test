
public class _06YuXi {

	/***
	 * �ࣺ�ṩ��һЩ���߷�������������ʹ�ã���������ͽ���������
	 * ��ӡ����ķ�����1,2,3,4,5,6,7,8��
	 * @param args
	 */
	public static void print(int[] arr) {
		// TODO Auto-generated method stub
		String res = "[";
		for(int i =0;i<arr.length;i++){
			if(i==arr.length-1){
				res+=arr[i]+"]";
			}else{
				res+=arr[i]+",";
			}
		}
		System.out.println("res:"+res);
	}
	public static int getMax(int a,int b,int c){
		int max = a>b?a:b;
		max = max>c?max:c;
		return max;
	}

}
