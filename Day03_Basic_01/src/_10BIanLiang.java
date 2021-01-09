
public class _10BIanLiang {

	 /*
	 * 变量分类：
	 * 		1.成员变量【全局变量】
	 * 			1.写在结构中的变量叫做全局变量；
	 * 			2.成员变量【特点：	
	 * 				1.全局都可以用，公共的；
	 * 				2.全局变量，不用赋值，存在一个默认值，根据数据类型来决定的；
	 * 				3.在类结构体中，变量名字不能重复；
	 * 		2.局部变量
	 *			1.写在方法内部的变量，局部变量；
	 *			2.局部变量【特点】：
	 *					1.成员变量和局部变量，优先使用局部变量
	 *					2.局部变量和全局可以重名
	 *					3.局部变量先有值，然后才能用
	 */
	
	static int i = 10;//全局变量[静态上下文]
	static String s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 9;
		System.out.println(i);
		System.out.println(s);
	}
}
