
public class _10MethodTest {

	/***
	 * ��������ϰ
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getMax(10, 20, 5);
		char[] arr = {'A','A','B','D','C','C','B','A'};
		getSum(arr,'C');
		int[] arr1 = {11,2,22,3,4,6,7,88,99,100};
		getQsum(arr1);
		print(3);
	}
	//����һ�������������������Ͳ������ҳ�������һ������ӡ��
	public static void getMax(int a,int b,int c){
		/*if(b<a&&c<a){
			System.out.println("Max:"+a);
		}else if(a<b&&c<b){
			System.out.println("Max:"+b);
		}else if(a<c&&b<c){
			System.out.println("Max:"+c);
		}*/
		int max = a>b?a:b;
		max = max>c?max:c;
		System.out.println("Max:"+max);
	}
	//����һ����������char[] arr,char key��ͳ��һ���ַ����ַ������г��ֵĴ�����ֱ�������
	public static void getSum(char[] arr,char key){
		int sum = 0;
		for(char e:arr){
			if(e==key)sum++;
		}
		System.out.println(key+"���ֵĴ���Ϊ��"+sum);
	}
	//����һ��������(int[] arr)��֪������int[] arr= {1,2,3,4,5,6,7,8,9,11,22};��������е��������Լ�ż����
	public static void getQsum(int[] arr){
		int osum=0;
		int jsum=0;
		for(int e:arr){
			if(e%2==0){
				osum+=e;
			}else{
				jsum+=e;
			}
		}
		System.out.println("ż���ͣ�"+osum+",�����ͣ�"+jsum);
	}
	//����һ������������һ��int���͵Ĳ�����ӡ
	public static void print(int a){
		for(int i=1;i<=a;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"  ");
			}
			System.out.println();
		}
	}
	
}
