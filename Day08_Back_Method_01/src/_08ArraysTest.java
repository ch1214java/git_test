import java.util.Arrays;//�����ȫ�޶�������ϸ��ַ��

public class _08ArraysTest {
/***
 * Arrays�������ʹ��
 * @param args
 */
	public static void main(String[] args) {
		//static int binarySearch(byte[] a, byte key) 
        //ʹ�ö���������������ָ���� byte �����飬�Ի��ָ����ֵ��
		int[] arr = {11,8,1,2,3,4,5,6,7};
		//1.������ע�⽻���ɿռ�ֵ���Ӷ�ʵ������
		Arrays.sort(arr);
		//2.�������ַ�������ʽ����
		String str = Arrays.toString(arr);
		System.out.println(str);
		
		int k = 11;
		int index = Arrays.binarySearch(arr, k);
		System.out.println(index);
	}

}
