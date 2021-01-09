
public class _12MethodReturn {

	/***
	 * 方法返回值return
	 * 		1.注意事项：return sum://把运算的结果返回出去，注意，返回的是值不是sum；
	 * 		2.方法返回值，内部与返回值位置，《类型》必须对应； 返回值必须对应
	 * 		3.方法返回值的位置，写了返回值类型，方法的内部必须有相应的return；
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int asum = add(10, 20, 30);
		System.out.println(asum);
		int sum = add1(1,1,2,3);//调用方法，返回一个返回值（数据）可以继续使用；
		System.out.println(sum);
	}
	
	
	public static int add(int a,int b,int c){//数据传入进去，进行了运算【仅仅吧结果打印展示了一下】
		int sum = a+b+c;
		if(sum>100){//有可能return执行不到；编译器：只看结构不看值，有可能return执行不到；
			return sum;//把运算的结果（数据）返回回去，注意：返回的是值不是sum;
		}else{
			return c;
		}
		
	}
	public static int add1(int a,int b,int c,int d){
		int sum = a+b+c+d;
		if(sum>100){
			return sum;
		}else{
			return d;
		}
	}

}
