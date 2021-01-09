
public class _02IfLianXi {

	public static void main(String[] args) {
		//求出2个变量中的最大值
		int i = 30,j = 20;
		if (i>j) {
			System.out.println("最大值是："+i);
		} else {
			System.out.println("最大值是："+j);
		}
		
		//2.判断一个数是否是3的倍数
		if(i%3==0){
			System.out.println("是3的倍数");
		}else{
			System.out.println("不是3的倍数");
		}
		
		/*
		3.小明java 考试成绩 按等级分A B C D ，判断变量值在不同的范围的，打印输出不同的等级
		90~100  A等。
		80-89    B等。
		70-79    C等。
		60-69    D等。
		60以下   E等。
		*/
		int num = 60;
		if (num>=90) {
			System.out.println("A等");
		}else if(num>=80 && num<90){
			System.out.println("B等");
		}else if(num>=70 && num<80){
			System.out.println("C等");
		}else if(num>=60 && num<70){
			System.out.println("D等");
		}else if(num<60){
			System.out.println("E等");
		}else {
			System.out.println("请输入成绩");
		}
	}

}
