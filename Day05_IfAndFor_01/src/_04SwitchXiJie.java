
public class _04SwitchXiJie {

	/***
	 * switch 根据传入的值，与case匹配，决定执行代码，一旦执行，整个结构结束；
	 * 		1.case之间顺序可以交换
	 * 		2.default不一定不一定放在末尾，在所有case失效的时候执行；
	 * 		3.case中值和key类型必须一致
	 * 		4.最后一个brak可以省略，但不建议
	 * 		5.break可以省略，但会导致后续case条件判断失效，按照从上到下顺序，
	 * 			知道找到第一个break跳出选择结构如果没有找到，执行到末尾自动跳出选择结构
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int week = 7;//week代表星期几
		switch (week) {//小括号里面的值，按照规定给
			case 1:
				System.out.println("周一");
				break;
			case 2:
				System.out.println("周二");
				break;
			case 3:
				System.out.println("周三");
				break;
			case 4:
				System.out.println("周四");
				break;
			case 5:
				System.out.println("周五");
				break;
			default:
				System.out.println("周六、周天、休息");
				break;
		}
		

	}
}
