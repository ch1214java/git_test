
public class _02YuXi {

	/***
	 * 3.设计一个方法求多个整数积的方法
	 * （提示：定义一个方法：方法的参数是int数组，参考求多个整数和的示例）
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9};
		getJi(arr);
		
		int[] a = {11,2,22,33,44};
		getJi(a);
		
	}
	
	static void getJi(int[] arr){
		int a = 1;
		for(int e:arr){
			a*=e;
		}
		System.out.println(a);
	}
	

}
