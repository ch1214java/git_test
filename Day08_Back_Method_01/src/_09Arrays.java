import java.util.Arrays;

public class _09Arrays {

	/***
	 * Arrays工具类练习
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int[] i = Arrays.copyOf(arr, 11);//复制指定的数组，截取或用 0 填充,以使副本具有指定的长度。
		int[] a = Arrays.copyOfRange(i, 1, 5);//将指定数组的指定范围复制到一个新数组。
		Boolean b = Arrays.equals(i, a);//对比数组i和a
		String str = Arrays.toString(i);//返回指定数组内容的字符串表示形式。
		String s = Arrays.toString(a);//返回指定数组内容的字符串表示形式。
		System.out.println(str);
		System.out.println(s);
		System.out.println(b);
	}

}
