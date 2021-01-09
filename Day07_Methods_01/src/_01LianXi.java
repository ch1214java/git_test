
public class _01LianXi {

	/***
	 * 做6道题
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShuChu();
		JiShuAndOuShu();
		MenSum();
		FanZhuan();
		TuXing();
		Jian();
	}
	//1.设计一个方法：统计一个字符在字符数组中出现的次数（直接输出）
	/*
	 * 1.准备一个字符
	 * 2.字符数组
	 * 3.数组中遍历，比较统计次数
	 */
	public static void ShuChu(){
		int sum = 0;
		char[] ch = {'A','D','C','A','B','A','D','H','A'};
		char c = 'D';
		for(int i = 0;i<ch.length;i++){
			if(c==ch[i]){
				sum++;
			}
		}
		System.out.println(c+"出现的次数为："+sum);
		
		//第二种方法：
		sum = 0;
		for(char e:ch){
			if(c==e)sum++;
		}
		System.out.println(c+"出现的次数为："+sum);
	}
	//2.设计一个方法：已知这样的整型数组 int[] arr = {1,2,3,4,5,6,7,8,9,11,22}， 计算出其中的奇数和以及偶数和
	/*
	 * 1.遍历
	 * 2.判断 奇数 偶数
	 * 3.分别累加
	 */
	public static void JiShuAndOuShu(){
		int oushu = 0, jishu = 0;
		int[] arr = {1,2,3,4,5,6,7,8,9,11,22};
		for(int e:arr){
			if(e%2==0){
				oushu+=e;
			}else{
				jishu+=e;
			}
		}
		System.out.println("偶数和："+oushu);
		System.out.println("奇数和："+jishu);
		//索引写法：
		oushu = 0;
		jishu = 0;
		for(int i = 0;i<arr.length;i++){
			if(arr[i]%2==0){
				oushu+=arr[i];
			}else{
				jishu+=arr[i];
			}
		}
		System.out.println("偶数和："+oushu);
		System.out.println("奇数和："+jishu);
	}
	//3.设计一个方法：现在有数组 double[] scores = {11,34,76,77,88,99,58,97,56};定义一个方法统计并打印出每一个阶段的学生人数(分段方式:0-60; 60-80;80-100)
	public static void MenSum(){
		int sum1 = 0,sum2=0,sum3=0;
		double[] scores = {11,34,76,77,88,99,58,97,56};
		for(double e:scores){
			if(e>80&&e<=100){
				sum1++;
			}else if(e>60&&e<=80){
				sum2++;
			}else if(e>=0&&e<=60){
				sum3++;
			}else{
				
			}
		}
		System.out.println("80-100:"+sum1);
		System.out.println("60-80:"+sum2);
		System.out.println("小于60："+sum3);
	}
	/*
	 * 4.设计一个方法：翻转传入数组中的元素
		例如有这样的数组 char[] arr = {'源','代','码','教','育'};
		调用完上面的方法之后，arr中的内容是这样的{'育','教','码','代','源'};
	 */
	public static void FanZhuan(){
		String str = "{";
		char[] arr = {'源','代','码','教','育'};
		for(int i = 0;i<arr.length;i++){
			char temp;
			int j = arr.length-1-i;
			if(i<=j){//i=j的时候是一个临界点表示i和j自己和自己交换
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			System.out.println("arr[i]="+arr[i]+" arr[j]="+arr[j]);
		}
		//第二种写法：
		for(int i = 0;i<arr.length/2;i++){
			char temp = arr[i];
			arr[i] = arr[arr.length-1 -i];
			arr[arr.length-1 -i] = temp;
		}
		
		System.out.println(arr);
		for(int i = 0;i<arr.length;i++){
			if(i==arr.length-1){
				str += "'"+arr[i]+"'}";
			}else{
				str += "'"+arr[i]+"',";
			}
		}
		System.out.println(str);
	}
	//5.使用嵌套循环打印下面图形
	public static void TuXing(){
		for(int i = 1;i<=9;i++){
			for(int j = 1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	//6.移除数组int[] arr = {1,2,3,4,5,1,9,4,12,67,1};中1这个元素，返回一个新的数组 （不带有1）；即新数组为int[] arr2 ={2,3,4,5,9,4,12,67};
	/*
	 * 思路：
	 * 1.旧数组有多少个不为0的值；能够知道新猪猪应该有多长；
	 * 2.根据长度创建新数组
	 * 3.把旧数组中，非领导额数字放入行数组中；
	 */
	public static void Jian(){
		int h = 0;
		int[] arr = {1,2,3,4,5,1,9,4,12,67,1};
		for(int i = 0;i<arr.length;i++){
			if(arr[i]!=1)h++;
		}
		int[] arr1 = new int[h];
		h=0;
		for(int e:arr){
			if(e!=1){
				arr1[h]=e;
				h++;
			}
		}
		for(int n:arr1){
			System.out.print(n+"  ");
		}
		System.out.println();
		//第二种写法：
		int count = 0;
		for(int e:arr){
			if(e!=1)count++;
		}
		int[] newarr = new int[count];
		int index = 0;
		for(int e:arr){
			if(e!=1){
				newarr[index] =  e;
				index++;
			}
		}
		for(int e:newarr){
			System.out.print(e+"  ");
		}
		
	}
	
}
