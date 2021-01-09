
public class _07ErWeiArray {
	/**
	 * 二位数组，了解一下
	 * @param args
	 */
	public static void main(String[] args) {
		//定义一个二维数组arr,里面有三个元素
		int[][] arr = {{1,2,3,40},{4,5,6},{7,8,9,10}};
		for(int[] e:arr){//遍历二维数组
			for(int n:e){//遍历二位数组的元素
				System.out.print(n);
			}
			System.out.println();
		}
		//第二种循环遍历方式；
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[i].length;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
