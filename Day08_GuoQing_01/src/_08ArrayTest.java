
public class _08ArrayTest {

	/***
	 * 测试arrays工具类的使用
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * static String toString(int[] a)
		 * 返回指定数组内容的字符串表示形式
		 */
		int[] arr={1,2,3,4,12,5};
		//[1,2,3,4,5]----java.util.Arrays一定全限定名
		String res = java.util.Arrays.toString(arr);
		System.out.println(res);
		
		/*
		 * static void sort(int[] a)
		 * 对指定的int类型数组案数字进行排序
		 * 
		 */
		java.util.Arrays.sort(arr);
		res = java.util.Arrays.toString(arr);
		System.out.println(res);
	}

}
