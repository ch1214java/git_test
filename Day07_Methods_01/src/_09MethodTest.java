
public class _09MethodTest {

	/***
	 * 方法的语句：
	 * 		1.public static   修饰符：赋予了特殊意义；可以去掉
	 * 		2.void：位置：代表的是返回类型，void代表意思是 无返回值；
	 * 		3.方法名字：随便取；规定，规范见名知意；
	 * 		4.(int a,int b)入口：应该传入什么类型的数据
	 * 						形式参数：形式参数类型，形式参数名字：看成形式参数是有值的，在方法内部设计代码；		
	 *  					参数类型，个数没有规定，看需求
	 *  	5.方法的结构体：代码块，
	 *  
	 *  注意：静态上下文
	 *  		1.不能访问非静态变量；
	 *  		2.不能访问非静态方法
	 *  
	 * @param args
	 */
	public static void add(String a,String b){
		String sum = a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
