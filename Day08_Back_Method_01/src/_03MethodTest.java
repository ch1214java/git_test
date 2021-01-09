
public class _03MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] c = {2,3,4,5};
		System.out.println(arrC(c));
		cf(9);
	}
	//设计一个方法，传入一个int数组：求出所有数字的乘积，并返回处理
	public static int arrC(int[] arr){
		int c = 1;
		for(int e : arr){
			c *= e;
		}
		return c;
	}
	//设计一个方法，传入一个int类型的值，决定99乘法表，还是nn乘法表；
	public static void cf(int a){
		for(int i = 1;i<=a;i++){
			for(int j = 1;j<=i;j++){
				System.out.print(i+"X"+j+"="+i*j+"  ");
			}
			System.out.println();
		}
	}

}
