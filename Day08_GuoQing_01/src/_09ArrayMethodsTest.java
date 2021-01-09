
public class _09ArrayMethodsTest {

	/***
	 * array一些方法的测试
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 必须是一个有序的，排序的数组
		 * 
		 * static int binarySearch(int[] a,int key)
		 * 使用二分搜索法来搜索指定的int类型数组，以获取指定的值
		 */
		
		int[] arr = {4,8,2,34,5,6,7};
		java.util.Arrays.sort(arr);
		String str = java.util.Arrays.toString(arr);//数组变成字符串
		System.out.println(str);
		
		int k = 7;
		int index = java.util.Arrays.binarySearch(arr, k);
		System.out.println(index);
		
		/*
		 * static int[] coptof(int[] original,int newLength)
		 * 复制指定的数组，截取或用0 填充（如果有必要），以使副本具有指定的长度；
		 */
		
		int[] b = java.util.Arrays.copyOf(arr, 20);
		//返回一个数组的字符串形式
		//String res = java.util.Arrays.toString(b);
		System.out.println(java.util.Arrays.toString(b));
		
		int sum = 3+2;
		System.out.println(3+2);
	}

}
