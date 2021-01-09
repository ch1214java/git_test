
public class _03SwitchTest {

	/***
	 * switch 根据传入的值，与case匹配，决定执行代码，一旦执行，整个结构结束；
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
