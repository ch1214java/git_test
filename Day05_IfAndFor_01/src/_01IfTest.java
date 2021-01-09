

public class _01IfTest {

	/***
	 * Part1:
	 * if选择结构
	 *	if(){//boolean类型代码；
	 *		//true执行内部的代码；	
	 *	}
	 *	Part2:
	 *	
	 * @param args
	 */
	public static void main(String[] args) {
		//Part1:
		int a = 10;
		if(a>5){
			System.out.println("a大于5");
		}
		
		
		//Part2:特点：if结构到一起是互斥的，只能选择一个，结束整个结构
		if (a>1) {
			System.out.println(1);
		}else if(a>5) {
			System.out.println();
		} else {
			System.out.println("else if不成立才会执行到这里");
		}
		
		
		//Part3:如果只有一个语句就不需要{}
		if(a%3!=0)System.out.println("不是3的倍数");
		
		
	}

}
