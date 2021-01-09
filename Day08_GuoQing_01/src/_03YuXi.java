
public class _03YuXi {

	/***
	 * 4.设计一个方法，传入一个int的数组，返回该数组中最大值（终极）
	 * 思路：
	 * 		1.遍历；
	 * 		2.查找最大的
	 * 			(1)int max = arr[0];
	 * 			(2)max与数组中的每一个依次比较，较大的存入max；
	 * 			(3)循环结束：最大的值已经存入了max;
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,11,2,33,4,6,788,8,54};
		int m = getMax(a);
		System.out.println(m);
	}
	
	static int getMax(int[] arr){
		int max = arr[0];//假定arr[0]是最大的那个值
		for(int e:arr){//遍历数组
			if(e>max){//猪猪和的每个元素和max比较；
				max = e;//有比吗小大的就赋值到max中；
			}
		}
		//循环结束max已经存入了数组中最大的那个值；
		return max;
	}

}
