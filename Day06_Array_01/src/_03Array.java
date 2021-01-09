
public class _03Array {

	/***
	 * 数组特点
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[8];//arr里面装的是一个地址值0-7；
		//1.数组  根据数据类型，存储空间存在默认值；
		System.out.println(arr[3]);
		//2.数组一旦创建，长度固定；
		arr = new int[56];//重新开辟了一个数组，不是原来的数组；
		System.out.println(arr.length);
		//3.数据类型，限定了数组存储空间可以存值的类型；
		//4.最大索引=length-1;
		
	}

}
