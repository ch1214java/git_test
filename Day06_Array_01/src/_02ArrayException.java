
public class _02ArrayException {

	/***
	 * 数组的常见错误
	 *  NullPointerException：空指针异常（空引用异常） 
 			操作了一个尚未初始化或者没有分配内存空间的数组 
 		  ArrayIndexOutOfBoundsException：数组的索引越界异常 
 			操作的数组的索引不在[0，数组名.length-1]范围内
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[8];//arr里面装的是一个地址值，定义一个int类型数组arr长度为8；
		//报错NullPointerException：空指针异常（空引用异常）
		//int[] arr= null;//引用数据类型默认值可以是null；
		//是后面的数组在调用.length;
		int len = arr.length;//定义一个变量，把数组长度赋值给len
		//报错ArrayIndexOutOfBoundsException：数组的索引越界异常 
		arr[arr.length]=99;//索引越界，索引为7；报错：
		System.out.println(arr[7]);
		
		
		
	}

}
