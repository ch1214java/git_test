
public class _05WhileTest {

	/***
	 * whileѭ��
	 * 		1.�����﷨��
	 * 			while(booleanֵ){
	 * 			}
	 * 		2.���ø�ʽд����
	 * 		
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Part1:
		/*while (true) {
			System.out.println("��ӡ");
		}*/
		//part2:
		int i = 1;//��ʼ�����A
		System.out.print("1��10֮�����ִ�ӡ��");
		while (i<=10) {//ѭ���ж����B
			System.out.print(i+"  ");//ѭ��ִ�����C
			i++;
		}
		System.out.println();
		int j = 1;
		System.out.print("1��10֮��ż����ӡ��");
		while (j<=10) {//ѭ���ж����B
			if(j%2==0){
				System.out.print(j+"  ");//ѭ��ִ�����C
			}
			j++;
		}
		System.out.println();
		int n = 1,num = 0;
		while (n<=1000) {
			if(n%2!=0){
				num += n;
			}
			n++;
		}
		System.out.println("1��1000�����ͣ�"+num);
		
	}

}
