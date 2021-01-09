import java.util.Arrays;//类的完全限定名，详细地址；

public class _08ArraysTest {
/***
 * Arrays工具类的使用
 * @param args
 */
	public static void main(String[] args) {
		//static int binarySearch(byte[] a, byte key) 
        //使用二分搜索法来搜索指定的 byte 型数组，以获得指定的值。
		int[] arr = {11,8,1,2,3,4,5,6,7};
		//1.先排序，注意交换律空间值，从而实现排序；
		Arrays.sort(arr);
		//2.数组以字符串的形式返回
		String str = Arrays.toString(arr);
		System.out.println(str);
		
		int k = 11;
		int index = Arrays.binarySearch(arr, k);
		System.out.println(index);
	}

}
