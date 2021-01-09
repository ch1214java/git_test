
public class _11QianTaoXunHuan {

	/****
	 * 嵌套循环
	 * 		循环里面写循环
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i =1;i <= 5;i++){
			for(int j = 1;j <= 5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		//利用for循环打印九九乘法表
		for(int i = 1;i<=9;i++){
			for(int j = 1;j <=i;j++){
				System.out.print(i+"X"+j+"="+i*j+"  ");
			}
			System.out.println();
		}
	}

}
