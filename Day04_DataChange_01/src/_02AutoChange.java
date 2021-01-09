
public class _02AutoChange {
	
	/**
	 * 数据类型转换概念：
	 *      2.1.概念：将数据从一种格式或结构转换为另一种格式或结构的过程。
				long g = 40;//  从int----long  
				1.原本：40--int : 00001111 00001111 00001111 00001111
				2.之后：40--long--g  00001111 00001111 00001111 00001111 00001111 00001111 00001111 00001111
	 *          3.拿着g  等于拿着long类型    40int----long
	 *      2.2类型转换的重点
	 *      		1.----[小转大]-----   ： 自动类型转换  ：  小杯子里面的水，倒入到大杯子里面
	 *                小：存储空间小
	 *                大：存储空间大
	 *              2.大转小
	 * @param args
	 */
	public static void main(String[] args) {
		//自动类型转换40int  -变成- long类型
		long g = 40;
		System.out.println(g);
		//float 较大的类型  f较大的存储空间    直接将小类型的int 存入进去
		float f = 555;//555.0f 存入f中
		System.out.println(f);
		
		/*细节1
		 *如果2个操作数（包括byte，short，char，int），都将会转换为int类型，且结果也为int（自动向上转型）
		 * */
		byte b1 = 10;
		byte b2 = 20;
		int sum = b1+b2;//累加之后，类型自动提升int，左边要用int接受
		
		char c = 'A';//65
		//b1+b2
		sum = b1+c;//c 变成编码值65 然后参与运算
		System.out.println(sum);
		
		/*细节2
		 *long  float  double只要两个操作数中---有一个为以上类型，[另一个就会被转换成相应类型]，并且结果也为该类型
		 */
		float ng = 10L;
		int b = 55;
		double ss = ng+b;
		
		System.out.println(1.0/0);//   1.0/0.0  Infinity表达的意义，叫做无穷大    0.0不是0  是一个无限接近于0.0的数字
		
		
		/*细节3
		 * 5.特例：只看类型 不看值
		 */
		byte bb = 55;//55 默认是int类型
		
		int a = 55;
		//byte bt = a;//   编译器，编译代码，只看类型不看值：不知道a里面装的什么，大容器东西装入小容器
		
		
		/*细节4
		 * 
		 */
		byte be = -5;
		//char c = be;//小的往大的里面存，自动转换是可以的[char正整数0~?]  byte[-128~+127]  数值范围的不一致，所以不能自动转换
	}

}
