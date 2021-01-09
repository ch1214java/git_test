
public class _01ArrayTest {

	/***
	 * 数组的基本语法及基本使用
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//声明了一个int类型的数组arr   并且定义长度为8；
		int[] arr = new int[8];//arr装了一个地址值 
		
		//存储空间，存值
		arr[3] = 66;
		//       取值 
		System.out.println(arr[3]);
		arr[7] = 88;
		System.out.println(arr);//[I@15db9742   地址值，数组是引用数据类型；
		
	}

}
