
public class _01LianXi {

	/***
	 * ��6����
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShuChu();
		JiShuAndOuShu();
		MenSum();
		FanZhuan();
		TuXing();
		Jian();
	}
	//1.���һ��������ͳ��һ���ַ����ַ������г��ֵĴ�����ֱ�������
	/*
	 * 1.׼��һ���ַ�
	 * 2.�ַ�����
	 * 3.�����б������Ƚ�ͳ�ƴ���
	 */
	public static void ShuChu(){
		int sum = 0;
		char[] ch = {'A','D','C','A','B','A','D','H','A'};
		char c = 'D';
		for(int i = 0;i<ch.length;i++){
			if(c==ch[i]){
				sum++;
			}
		}
		System.out.println(c+"���ֵĴ���Ϊ��"+sum);
		
		//�ڶ��ַ�����
		sum = 0;
		for(char e:ch){
			if(c==e)sum++;
		}
		System.out.println(c+"���ֵĴ���Ϊ��"+sum);
	}
	//2.���һ����������֪�������������� int[] arr = {1,2,3,4,5,6,7,8,9,11,22}�� ��������е��������Լ�ż����
	/*
	 * 1.����
	 * 2.�ж� ���� ż��
	 * 3.�ֱ��ۼ�
	 */
	public static void JiShuAndOuShu(){
		int oushu = 0, jishu = 0;
		int[] arr = {1,2,3,4,5,6,7,8,9,11,22};
		for(int e:arr){
			if(e%2==0){
				oushu+=e;
			}else{
				jishu+=e;
			}
		}
		System.out.println("ż���ͣ�"+oushu);
		System.out.println("�����ͣ�"+jishu);
		//����д����
		oushu = 0;
		jishu = 0;
		for(int i = 0;i<arr.length;i++){
			if(arr[i]%2==0){
				oushu+=arr[i];
			}else{
				jishu+=arr[i];
			}
		}
		System.out.println("ż���ͣ�"+oushu);
		System.out.println("�����ͣ�"+jishu);
	}
	//3.���һ������������������ double[] scores = {11,34,76,77,88,99,58,97,56};����һ������ͳ�Ʋ���ӡ��ÿһ���׶ε�ѧ������(�ֶη�ʽ:0-60; 60-80;80-100)
	public static void MenSum(){
		int sum1 = 0,sum2=0,sum3=0;
		double[] scores = {11,34,76,77,88,99,58,97,56};
		for(double e:scores){
			if(e>80&&e<=100){
				sum1++;
			}else if(e>60&&e<=80){
				sum2++;
			}else if(e>=0&&e<=60){
				sum3++;
			}else{
				
			}
		}
		System.out.println("80-100:"+sum1);
		System.out.println("60-80:"+sum2);
		System.out.println("С��60��"+sum3);
	}
	/*
	 * 4.���һ����������ת���������е�Ԫ��
		���������������� char[] arr = {'Դ','��','��','��','��'};
		����������ķ���֮��arr�е�������������{'��','��','��','��','Դ'};
	 */
	public static void FanZhuan(){
		String str = "{";
		char[] arr = {'Դ','��','��','��','��'};
		for(int i = 0;i<arr.length;i++){
			char temp;
			int j = arr.length-1-i;
			if(i<=j){//i=j��ʱ����һ���ٽ���ʾi��j�Լ����Լ�����
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			System.out.println("arr[i]="+arr[i]+" arr[j]="+arr[j]);
		}
		//�ڶ���д����
		for(int i = 0;i<arr.length/2;i++){
			char temp = arr[i];
			arr[i] = arr[arr.length-1 -i];
			arr[arr.length-1 -i] = temp;
		}
		
		System.out.println(arr);
		for(int i = 0;i<arr.length;i++){
			if(i==arr.length-1){
				str += "'"+arr[i]+"'}";
			}else{
				str += "'"+arr[i]+"',";
			}
		}
		System.out.println(str);
	}
	//5.ʹ��Ƕ��ѭ����ӡ����ͼ��
	public static void TuXing(){
		for(int i = 1;i<=9;i++){
			for(int j = 1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	//6.�Ƴ�����int[] arr = {1,2,3,4,5,1,9,4,12,67,1};��1���Ԫ�أ�����һ���µ����� ��������1������������Ϊint[] arr2 ={2,3,4,5,9,4,12,67};
	/*
	 * ˼·��
	 * 1.�������ж��ٸ���Ϊ0��ֵ���ܹ�֪��������Ӧ���ж೤��
	 * 2.���ݳ��ȴ���������
	 * 3.�Ѿ������У����쵼�����ַ����������У�
	 */
	public static void Jian(){
		int h = 0;
		int[] arr = {1,2,3,4,5,1,9,4,12,67,1};
		for(int i = 0;i<arr.length;i++){
			if(arr[i]!=1)h++;
		}
		int[] arr1 = new int[h];
		h=0;
		for(int e:arr){
			if(e!=1){
				arr1[h]=e;
				h++;
			}
		}
		for(int n:arr1){
			System.out.print(n+"  ");
		}
		System.out.println();
		//�ڶ���д����
		int count = 0;
		for(int e:arr){
			if(e!=1)count++;
		}
		int[] newarr = new int[count];
		int index = 0;
		for(int e:arr){
			if(e!=1){
				newarr[index] =  e;
				index++;
			}
		}
		for(int e:newarr){
			System.out.print(e+"  ");
		}
		
	}
	
}
