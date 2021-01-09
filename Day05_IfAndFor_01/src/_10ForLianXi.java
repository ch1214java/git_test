
public class _10ForLianXi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		2.以下两个示例中 最后i的值是多少 判断执行了几次 循环几次 代码的最终的输出结果是多少？
		(1)
		
		（2）
		*/
		//1.用for循环计算1-10的 积(即10的阶乘)1*2*3*4*5*6  ~   *10
		int t = 10,count = 1;
		for(int i = 1;i<=t;i++){
			count *=i;
			System.out.println(i+"的阶乘:"+count);
		}
		
		for(int i = 1;i<=10;i+=2){
			System.out.println("i="+i);
		}
		
		
		for(int j = 1;j++<=10;j+=2){
			System.out.println("j="+j);
		}
	}

}
