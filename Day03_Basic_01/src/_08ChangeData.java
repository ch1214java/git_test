public class _08ChangeData {
	/***
	 * 1.变量概念：存储<空间>，容器，用来装数据的
	 * 		（空间特点：只能装一个值，新值会覆盖旧值）
	 * 		生活中所有的东西都是需要被装起来的
	 * 2.变量语法：
	 * 		数据类型 变量名字 = 值;//声明变量的时候同时赋值
	 * 		
	 * 3.变量特点：
	 * 		1.空间特点；只能装一个值，新值会覆盖旧值；
	 * 		2.一个类型的变量，只能存对应类型的数据；
	 * @param args
	 */
	public static void main(String[] args) {
		//
		int i =10;//从右边往左边赋值，变量i是对该空间的命名
		i = 22;
		System.out.println("变量i的值："+i);
		
		char ch = 'K';
		System.out.println("char变量的值："+ch);
		byte b = 23;
		short s = 22;
		int ii = 45;
		long l = 90l;
		float f = 90f;
		double d = 99;
		char cc = 'A';
		String ss = "JDK";
		
	}

}
