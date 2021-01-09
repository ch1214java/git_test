
public class _04MethodValueTest {

	/***
	 * 方法参数传递：
	 * 		1.值传递
	 * 		2.值引用[地址值]
	 * @param args
	 */
	public static void main(String[] args) {
		//part1:
		//[基本数据类型]传递的是值
		int a = 10;
		System.out.println("前："+a);//10
		
		changeA(a);//传递的是10
		System.out.println("后："+a);//10
		//part2
		int[] a1 = {11,22,33};
		System.out.println(a1[0]);//11
		
		changeA(a1);//地址传递，引用传递
		System.out.println(a1[0]);//99
	}
	
	public static void changeA(int c){//将a的值（10）传递了进来使用也就是说c=10
		System.out.println("c:"+c);//在方法执行中如果不对参数重新赋值那么c=10;
		c=88;//只是在修改c变量
	}
	
	public static void changeA(int[] b){
		b[0] = 99;
	}

}
