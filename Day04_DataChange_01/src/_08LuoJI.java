
public class _08LuoJI {

	/***
	 * 逻辑运算符， 多个条件，组合判断
	 * &   |   &&   ||  ^   ！
	 * 1.参与运算的都是boolean类型，并且结果类型也是boolean;
	 * 		&  与    -并且-    ；两边同时为true，结果才为true；
	 * 		|  或    -或者-	    ；只要一遍为true，结果就位true；
	 * 2.
	 * 		&&		逻辑与    并且；两边同时为true，结果才为true；
	 * 				短路：前面为false了后面没有必要计算了。
	 * 		||		逻辑或    或者；只要一边、为true，结果就为true；
	 * 				短路：前面为true了后面没有必要计算了。
	 * 
	 * 
	 * 3.
	 * 		^		异或		两边结果不一样就位true；
	 * 
	 * 4.
	 * 		!		逻辑非
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		int a = 10;
		boolean b = a > 5 & a <66;//两边都为true结果才为true，否则为false
		System.out.println(b);
		
		boolean b1 = a > 20 | a > 66;//只要有一边为true结果就为true
		System.out.println(b1);
		//2.
		System.out.println(a > 66 && 1/0 == 0);//短路行为，前面为false了，后面不计算了，所以没有报错
		System.out.println(a < 66 || 1/0 == 0);//短路腥味，前面为true了，后面就不计算了，所以1/0没有报错。
		//3.
		System.out.println(true^false);//true  ^两边结果不一样就位true；
		
		//4.
		System.out.println(!true);//false     ！与当前逻辑相反即：!true--->false;
	}

}
