
public class _03MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] c = {2,3,4,5};
		System.out.println(arrC(c));
		cf(9);
	}
	//���һ������������һ��int���飺����������ֵĳ˻��������ش���
	public static int arrC(int[] arr){
		int c = 1;
		for(int e : arr){
			c *= e;
		}
		return c;
	}
	//���һ������������һ��int���͵�ֵ������99�˷�������nn�˷���
	public static void cf(int a){
		for(int i = 1;i<=a;i++){
			for(int j = 1;j<=i;j++){
				System.out.print(i+"X"+j+"="+i*j+"  ");
			}
			System.out.println();
		}
	}

}
