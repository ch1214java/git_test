public class _04Double {
	/***
	 * 浮点数类型，小数 float  double 
	 * @param args
	 */
	public static void main(String[] args) {
		//浮点数值3.14默认类型是double，类型不一致，不能放进去
		float f = 3.14f;
		System.out.println("float类型数据："+f);
		
		double d = 3.14;
		System.out.println("double类型数据："+d);
		//注意事项：浮点数是不精准的BigDecimal金融数据类型，可以表示精准的浮点型数据
		System.out.println(1.3 * 1.4);
		//System.out.println(1.3 * 1.4);
		//1.3 * 1.4= 1.82 打印结果是1.819999999999998
		//实际上浮点型数据是一个不精准的数据类型，只是无限接近于1.82，这是由于计算机本身机制造成的
		
		
	}

}
