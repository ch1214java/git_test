
public class _12TiaoChu {

	//ѭ���������
	/***
	 * break:	һ��ѭ�� ���ѭ���г�����, ����ֹѭ�� �����Ҳ����ִ��
	 * continue:һ��ѭ�� ���ѭ���г�����, ������ѭ�� ����ļ���ִ��
	 * return:  һ��ѭ�� ���ѭ���г�����,  ��ֹ��ǰ�ķ��� �����ѭ��Ҳ���ᱻִ�� ѭ����������Ҳ���ᱻִ�е�
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1l:break:
		/*for(int i = 0;i <=7;i++){
			System.out.println("Լ��");
			if(i%2==0){
				System.out.println("������");
				break;
			}
			System.out.println("asd");
		}*/
		//�ҳ�1-1000��Χǰ15��5�ı��������֣�
		/*int count = 0;
		for(int i = 1;i<=1000;i++){
			if(i%5==0){
				count ++;
				System.out.println("��"+count+"��5�ı�����"+i);
				if(count == 15)break;
			}
			
		}*/
		//�ҳ�500��1000ǰ6��ֻ�ܱ��Լ���1���������֣�
		/*int num =0;
		for(int i = 500;i<=1000;i++){
			int n = 0;
			for(int j = 1;j<=i;j++){
				if(i%j==0){
					n++;
				}
				
			}
			if(n==2){
				System.out.println(i);
				num++;
				if(num==6)break;
			}
		}
		*/
		int num =0;
		for(int i = 500;i<=1000;i++){
			int n = 0;
			for(int j = 1;j<=i;j++){
				if(i%j==0){
					n++;
				}
			}
			if(n==2){
				num++;
				System.out.println(i);
			}
			if(num == 6){
				break;
			}
		}
		
	}

}
