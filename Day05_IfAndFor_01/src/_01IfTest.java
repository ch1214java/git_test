

public class _01IfTest {

	/***
	 * Part1:
	 * ifѡ��ṹ
	 *	if(){//boolean���ʹ��룻
	 *		//trueִ���ڲ��Ĵ��룻	
	 *	}
	 *	Part2:
	 *	
	 * @param args
	 */
	public static void main(String[] args) {
		//Part1:
		int a = 10;
		if(a>5){
			System.out.println("a����5");
		}
		
		
		//Part2:�ص㣺if�ṹ��һ���ǻ���ģ�ֻ��ѡ��һ�������������ṹ
		if (a>1) {
			System.out.println(1);
		}else if(a>5) {
			System.out.println();
		} else {
			System.out.println("else if�������Ż�ִ�е�����");
		}
		
		
		//Part3:���ֻ��һ�����Ͳ���Ҫ{}
		if(a%3!=0)System.out.println("����3�ı���");
		
		
	}

}
