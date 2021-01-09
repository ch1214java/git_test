
public class _07LianXi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[]{11,22,33,44,22,55};
		//需求 1：找出数组中元素 22 第一次出现的索引位置
		for(int i = 0;i<nums.length;i++){
			if(nums[i] == 22){
				System.out.println("22第一次出现的索引位置："+i);
				break;
			}
		}
		//需求 2：求出 int 类型数组中最大元素值
		/*
		 * 1.遍历元素，每个都要比较
		 * 2.取出最大的那个元素
		 */
		int max = nums[0];
		for(int i = 0;i<nums.length;i++){
			if(nums[i] > nums[0]){
				max = nums[i];
			}
		}
		System.out.println("数组最大值："+max);
		
		//第二种写法：
		for(int e:nums){
			if(e>max){
				max = e;//较大的值，存入max中；
			}
		}
		System.out.println("数组最大值是："+max);
		
		
		//需求 2：按照某种格式打印数组元素，数组元素放在方括号[]中,相邻元素使用逗号分隔开。如上述数组打印 出来，效果如：[11, 22, 33, 44, 22, 55]
		String str = "[";
		for(int i = 0;i<nums.length;i++){
			if(i==nums.length-1){
				str+=nums[i]+"]";
			}else{
				str +=nums[i]+",";
			}
		}
		System.out.println("数组打印 :"+str);
	}

}
