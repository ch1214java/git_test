
public class _09ArrayMethodsTest {

	/***
	 * arrayһЩ�����Ĳ���
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ������һ������ģ����������
		 * 
		 * static int binarySearch(int[] a,int key)
		 * ʹ�ö���������������ָ����int�������飬�Ի�ȡָ����ֵ
		 */
		
		int[] arr = {4,8,2,34,5,6,7};
		java.util.Arrays.sort(arr);
		String str = java.util.Arrays.toString(arr);//�������ַ���
		System.out.println(str);
		
		int k = 7;
		int index = java.util.Arrays.binarySearch(arr, k);
		System.out.println(index);
		
		/*
		 * static int[] coptof(int[] original,int newLength)
		 * ����ָ�������飬��ȡ����0 ��䣨����б�Ҫ������ʹ��������ָ���ĳ��ȣ�
		 */
		
		int[] b = java.util.Arrays.copyOf(arr, 20);
		//����һ��������ַ�����ʽ
		//String res = java.util.Arrays.toString(b);
		System.out.println(java.util.Arrays.toString(b));
		
		int sum = 3+2;
		System.out.println(3+2);
	}

}
