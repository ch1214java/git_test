import java.util.Arrays;

public class _09Arrays {

	/***
	 * Arrays��������ϰ
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int[] i = Arrays.copyOf(arr, 11);//����ָ�������飬��ȡ���� 0 ���,��ʹ��������ָ���ĳ��ȡ�
		int[] a = Arrays.copyOfRange(i, 1, 5);//��ָ�������ָ����Χ���Ƶ�һ�������顣
		Boolean b = Arrays.equals(i, a);//�Ա�����i��a
		String str = Arrays.toString(i);//����ָ���������ݵ��ַ�����ʾ��ʽ��
		String s = Arrays.toString(a);//����ָ���������ݵ��ַ�����ʾ��ʽ��
		System.out.println(str);
		System.out.println(s);
		System.out.println(b);
	}

}
