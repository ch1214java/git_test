
public class _05Method {

	/***
	 * 可变参数：传入参数的个数可以变化
	 * 		方法参数语法：类型...参数名字(传入的值被打包成一个数组)
	 * 注意事项：
	 * 		1.一个方法的【可变参数】只能有一个；
	 * 		2.可以有普通参数，但是可变参数必须在方法参数的最后一个
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add("你说",1,23,3);
	}
	
	

	public static void add(String s,int...a){//可变参数必须放在该方法参数的最后一个
		for(int e:a){
			System.out.println(e+" ");
		}
		
	}

}
