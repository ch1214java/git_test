
public class _04YuXi {

	/***
	 * 方法参数参数
	 * 		值传递；
	 * 		值引用；
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int[] arr = {11,22,33};
		
		System.out.println(i);//10  i 中装的是10【基本数据类型】
		System.out.println(arr);//[I@15db9742   arr中装的是地址值，【引用数据类型】
		
		change(i);
		change(arr);
		
		System.out.println(i);
		System.out.println(arr[0]);
	}
	
	static void change(int k){//基本类型；
		k = 99;
	}
	
	static void change(int[] brr){//引用类型
		brr[0] =66;
	}

}
