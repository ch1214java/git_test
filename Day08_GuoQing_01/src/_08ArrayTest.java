
public class _08ArrayTest {

	/***
	 * ����arrays�������ʹ��
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * static String toString(int[] a)
		 * ����ָ���������ݵ��ַ�����ʾ��ʽ
		 */
		int[] arr={1,2,3,4,12,5};
		//[1,2,3,4,5]----java.util.Arraysһ��ȫ�޶���
		String res = java.util.Arrays.toString(arr);
		System.out.println(res);
		
		/*
		 * static void sort(int[] a)
		 * ��ָ����int�������鰸���ֽ�������
		 * 
		 */
		java.util.Arrays.sort(arr);
		res = java.util.Arrays.toString(arr);
		System.out.println(res);
	}

}
