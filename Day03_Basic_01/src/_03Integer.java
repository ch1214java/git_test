public class _03Integer {//声明一个_03Integer类
	/***
	 * 整数类型 btye,short,int,long 
	 * 
	 * 数据类型中 long、float赋值的时候较为特殊
	 * 如：long l = 23489l;
	 * 	  float f = 3.14f;
	 * @param args
	 */
	//声明一个主方法入口，和内部代码无关
	public static void main(String[] args) {
		System.out.println("默认是int类型："+15);
	
		byte b = 127;
		System.out.println("byte类型数据："+b);
		
		
		short s = 3276;
		System.out.println("short类型数据："+s);
		
		
		int i = 98;
		System.out.println("int类型数据："+i);
		
		
		long l = 23489l;
		System.out.println("long类型数据："+l);
		
		//更大的数据需要用到BigInteger数据类型
		
		
		
	}
}
