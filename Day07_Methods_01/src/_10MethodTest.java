
public class _10MethodTest {

	/***
	 * 方法的练习
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getMax(10, 20, 5);
		char[] arr = {'A','A','B','D','C','C','B','A'};
		getSum(arr,'C');
		int[] arr1 = {11,2,22,3,4,6,7,88,99,100};
		getQsum(arr1);
		print(3);
	}
	//定义一个方法：传入三个类型参数，找出最大的那一个，打印；
	public static void getMax(int a,int b,int c){
		/*if(b<a&&c<a){
			System.out.println("Max:"+a);
		}else if(a<b&&c<b){
			System.out.println("Max:"+b);
		}else if(a<c&&b<c){
			System.out.println("Max:"+c);
		}*/
		int max = a>b?a:b;
		max = max>c?max:c;
		System.out.println("Max:"+max);
	}
	//定义一个方法，（char[] arr,char key）统计一个字符在字符数组中出现的次数（直接输出）
	public static void getSum(char[] arr,char key){
		int sum = 0;
		for(char e:arr){
			if(e==key)sum++;
		}
		System.out.println(key+"出现的次数为："+sum);
	}
	//定义一个方法：(int[] arr)已知这样的int[] arr= {1,2,3,4,5,6,7,8,9,11,22};计算出其中的奇数和以及偶数和
	public static void getQsum(int[] arr){
		int osum=0;
		int jsum=0;
		for(int e:arr){
			if(e%2==0){
				osum+=e;
			}else{
				jsum+=e;
			}
		}
		System.out.println("偶数和："+osum+",奇数和："+jsum);
	}
	//定义一个方法：传入一个int类型的参数打印
	public static void print(int a){
		for(int i=1;i<=a;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"  ");
			}
			System.out.println();
		}
	}
	
}
