
public class _08MethodTest {

	/***
	 * 方法的概念及初体验
	 * 		1.方法代码块，能够完成独立的功能，可以反复使用
	 * 		2.方法应该写在类的结构体中；
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add("因为....", "所以......");
		addSum(55, 66);
		getMax(10, "B", 3.0, 4.4, 'A');
	}
	public static void getMax(int a,String b,double c,double d,char e){
		System.out.println(a+b+c+d+e);
	} 
	public static void add(String a,String b){
		String sum = a+b;
		System.out.println(sum);
	}
	public static void addSum(int a,int b){//定义一个addSum的方法，传入两个int类型的形式参数
		int sum = a+b;//方法里面的数据处理
		System.out.println(sum);
	}

}
