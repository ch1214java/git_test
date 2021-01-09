
public class _05WhileTest {

	/***
	 * while循环
	 * 		1.基本语法：
	 * 			while(boolean值){
	 * 			}
	 * 		2.常用格式写法：
	 * 		
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Part1:
		/*while (true) {
			System.out.println("打印");
		}*/
		//part2:
		int i = 1;//初始化语句A
		System.out.print("1到10之间数字打印：");
		while (i<=10) {//循环判断语句B
			System.out.print(i+"  ");//循环执行语句C
			i++;
		}
		System.out.println();
		int j = 1;
		System.out.print("1到10之间偶数打印：");
		while (j<=10) {//循环判断语句B
			if(j%2==0){
				System.out.print(j+"  ");//循环执行语句C
			}
			j++;
		}
		System.out.println();
		int n = 1,num = 0;
		while (n<=1000) {
			if(n%2!=0){
				num += n;
			}
			n++;
		}
		System.out.println("1到1000奇数和："+num);
		
	}

}
