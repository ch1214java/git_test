
public class _05YuXi {

	/***
	 * 可变参数，变，个数可变
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add1(1,2,3,4,5);//new int[]{1,2,3,4,5}
	}
	static void add1(int ... b){//数组
		int sum = 0;
		for(int i:b){
			sum+=i;
		}
		System.out.println(sum);
	}
	
	//出入数组
	/*static void add1(int[] a){//方法名字+参数列表
		
	}*/
	
	
	//传入多个值，多个形式参数；
	static void add1(int a,int b,int c,int d,int e){
		
	}
}
