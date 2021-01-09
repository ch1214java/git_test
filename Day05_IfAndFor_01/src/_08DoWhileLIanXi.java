
public class _08DoWhileLIanXi {

	/***
	 * dowhile练习
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	1.求出10以内2的倍数的数字 和 个数。
		2.求出 1-10的所有偶数的和*/
		
		//1.
		int i = 1,j = 0;
		do{
			if(i%2==0){
				j+=1;
			}
			i++;
		}while(i<=10);
		System.out.println("10以内2的倍数的数字 和 个数："+j);
		
		//2.
		int t = 1,sum = 0;
		do{ 
			if(t%2==0){
				sum+=t;
			}
			t++;
		}while(t<=10);
		System.out.println("1-10的所有偶数的和："+sum);
		
		
	}

}
