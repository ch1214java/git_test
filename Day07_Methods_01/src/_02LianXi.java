
public class _02LianXi {

	/***
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMax(10, 20));
		System.out.println(getMin(20, 10, 30));
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(getJi(a));
	}
	//1.定义一个方法getMax，接收两个int参数，返回较大的一个数。
	public static int getMax(int a,int b){
		int max = 0;
		if(a > b){
			max = a;
		}else{
			max = b;
		}
		return max;
	}
	//2.定义一个方法，接受三个int参数，返回最小的一个数。
	public static int getMin(int a,int b,int c){
		int min = 0;
		if(a>c&&b>c){
			min = c;
		}else if(a>b&&c>b){
			min = b;
		}else if(b>a&&c>a){
			min = a;
		}
		return min;
	}
	//3.设计一个方法求多个整数积的方法
//	(提示：定义一个方法，方法的参数是 int 数组，参考求多个整数和的示例)
	public static int getJi(int[] a){
		int result = 1;
		for(int i=0;i<a.length;i++){
			result *=a[i];
		}
		return result;
		
	}

}
