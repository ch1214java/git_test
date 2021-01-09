
public class _12TiaoChu {

	//循环跳出语句
	/***
	 * break:	一个循环 如果循环中出现了, 则终止循环 后面的也不再执行
	 * continue:一个循环 如果循环中出现了, 则跳过循环 后面的继续执行
	 * return:  一个循环 如果循环中出现了,  终止当前的方法 后面的循环也不会被执行 循环外面的语句也不会被执行到
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1l:break:
		/*for(int i = 0;i <=7;i++){
			System.out.println("约会");
			if(i%2==0){
				System.out.println("结束了");
				break;
			}
			System.out.println("asd");
		}*/
		//找出1-1000范围前15个5的倍数的数字；
		/*int count = 0;
		for(int i = 1;i<=1000;i++){
			if(i%5==0){
				count ++;
				System.out.println("第"+count+"个5的倍数："+i);
				if(count == 15)break;
			}
			
		}*/
		//找出500到1000前6个只能被自己和1整除的数字；
		/*int num =0;
		for(int i = 500;i<=1000;i++){
			int n = 0;
			for(int j = 1;j<=i;j++){
				if(i%j==0){
					n++;
				}
				
			}
			if(n==2){
				System.out.println(i);
				num++;
				if(num==6)break;
			}
		}
		*/
		int num =0;
		for(int i = 500;i<=1000;i++){
			int n = 0;
			for(int j = 1;j<=i;j++){
				if(i%j==0){
					n++;
				}
			}
			if(n==2){
				num++;
				System.out.println(i);
			}
			if(num == 6){
				break;
			}
		}
		
	}

}
