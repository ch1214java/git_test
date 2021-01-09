
public class _06FuZhi {

	/***
	 * 赋值运算符
	 * 	=   +=   -=   *=   /=   %=
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//声明了一个int类型的变量i,并赋值为10，  从右往左赋值
		int i = 10;
		String str = "abc";
		
		
		i+= 50;//只能看成是这个样子 i = i+50;   常用
		System.out.println(i);
		
		byte b = 10;
		//b+=50;//只能看成b = b+50;
		//b = b + 50;//byte int  结果是int类型
		System.out.println(b);
		b += 10;
		System.out.println("b += 10的值是："+b);
		b -= 10;
		System.out.println("b -= 10的值是："+b);
		b *= 10;
		System.out.println("b *= 10的值是："+b);
		b /=10;
		System.out.println("b /= 10的值是："+b);
		b %=10;
		System.out.println("b %= 10的值是："+b);
	}

}
