
public class _01YuXi {

	/***
	 * 1.定义一个方法getMax,接收两个int参数，返回较大的一个数，
	 * static主方法静态上下文不能访问非静态的，方法，成员变量
	 * @param args
	 */
	
	static int i = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = getMax(20,30);
		System.out.println(m);
	}
	
	static int getMax(int a,int b){//传入两个int类型数据a,b
		int max = a>b?a:b;
		return max;
	}
	

}
