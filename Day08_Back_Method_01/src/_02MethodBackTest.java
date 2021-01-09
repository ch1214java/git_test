
public class _02MethodBackTest {

	/***
	 * 1.方法的概述和初体验
	 * 		完成功能的独立的代码块，可以重复使用，存在于类的结构体中
	 * 2.方法的语法和使用
	 * 	语法：
	 * 		public static 修饰符，对于一个方法而言，修饰符可有可无；
	 * 		void 位置：返回值类型，void 无返回值
	 * 		add 方法名；
	 * 		(int a,int b) 形式参数 数据类型 形式参数名字构成；
	 * 		{  } 方法的结构体；
	 * 	使用：
	 * 		方法在同一个类中；方法名字+参数列表（类型，个数，顺序）一致；
	 * 		方法有static修饰；类名，方法名+参数列表（类型，个数，顺序）一致
	 * 		非static修饰，并且不再一个类中，对象名，方法名+参数列表（类型，个数，顺序）一致（面向对象new一个对象来调用方法）
	 * 3.方法的返回值
	 * 		返回概述：方法处理完成的结果如果要继续使用就返回；
	 * 		方法内部的返回值，方法头发返回值位置，必须对应（类型对应，返回值对应）
	 *		只看结构不看值； 
	 * 4.方法的签名和重载
	 * 	方法签名：方法名字+参数列表（类型，个数，顺序）
	 * 		作用：通过方法签名就知道是哪个方法；
	 * 	方法重载：
	 * 		作用：方法名字一样，参数列表不一样；
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(99,9);
		add(1,2,3);//调用的是3个参数的add的重载方法；
	}
	//设计代码块
	public static void add(int a,int b){//形式参数 数据类型形式参数名字
		System.out.println(a+b);
	}
	public static void add(int a,int b,int c){//方法add的参数是3个是一种方法重载的典型案例
		System.out.println(a+b+c);
	}
	
}
