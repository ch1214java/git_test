
public class _03ZuoYe {

	/***
	 * ========================================必须做================================================
1.定义一个方法getMax,接收两个int参数,返回最大的一个数(低级)
	建议使用三目运算
	
2.定义一个方法,接收三个int参数,返回最小的一个数(低级)


3.设计一个求3个int类型积的方法,并返回这个积(低级)

4.设计一个方法，传入一个int的数组，返回该数组中最大的值(中级)

========================================选做================================================

5.设计一个方法，查询并返回一个字符在字符数组中第一次出现的位置(高级)
	char arr = {'a','b','c','a','g'};
	char c = 'a';

	四要素：
		返回值类型：int 
		方法名：getIndexInArray()
		形参列表：char c,char[] arr
		方法体：
			遍历整个数组，将c 和 arr[i] 如果相等，返回下标i
			如果遍历完，没有找到，返回 -1  下标范围：0,n


6.设计一个方法,统计返回一个字符在字符数组中出现的次数(高级)

7.设计一个方法,已知这样的整形数组  int[] arr = {1,2,3,4,5,6,7,8,9,11,12}返回其中的奇数和

8.现在有数组 double[] scores = {11,34,76,77,88,99,58,97,56};定义一个方法统计并打印出每一个阶段学生人
数(分段方式：0-60;60-80;80-100)(高级)


	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6};
		int[] b = getJi(a);
		String str = "{";
		for(int i = 0;i<b.length;i++){
			
			if(i==b.length-1){
				str += b[i]+"}";
			}else{
				str += b[i]+",";
			}
			System.out.println(b[i]);
		}
		System.out.println(str);
	}
	//9.设计一个方法，传入一个int数组，翻转该数组中的元素，并且返回反转后的数组(牛皮做)
	public static int[] getJi(int[] a){
		
		for(int i=0;i<a.length;i++){
			
		}
		
		for(int i = 0;i<a.length;i++){
			int temp=0;
			int j = a.length-1-i;
			if(i<=j){//i=j的时候是一个临界点表示i和j自己和自己交换
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			System.out.println("arr[i]="+a[i]+" arr[j]="+a[j]);
		}
		return a;
	}
	

}
