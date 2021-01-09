
public class _10SanMu {
	/***
	 * 三目运算符
	 * 		A ？ B ： C
	 * 		A B C 都可以是表达式
	 * 		A:结果类型是boolean类型，表达式；
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b =20;
		int max = a > b ? a+10:b;
		System.out.println(max);
		
		int i = 60;
		
		String s = i>=90?"A":i>=80?"B":i>=70?"C":i>=60?"D":"继续努力";
		System.out.println(s);
	}

}
