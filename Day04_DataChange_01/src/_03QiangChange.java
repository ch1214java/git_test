
public class _03QiangChange {

	/***
	 * 大转小：强制类型转换
	 * 		数据类型  变量名 = （数据类型）值；
	 * @param args
	 */
	public static void main(String[] args) {
		//右边double  较大类型   左边int类型
		int i = (int)3.14;
		System.out.println(i);//i只能存整3    损失精度  
		
		int i1 = 10;
		int i2 = 15;
		float f = (float)((i1+i2)*1.2);
		f = (i1 + i2)*(float)1.2;
		System.out.println(f);
		
	}

}
