
public class _07LianXi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[]{11,22,33,44,22,55};
		//���� 1���ҳ�������Ԫ�� 22 ��һ�γ��ֵ�����λ��
		for(int i = 0;i<nums.length;i++){
			if(nums[i] == 22){
				System.out.println("22��һ�γ��ֵ�����λ�ã�"+i);
				break;
			}
		}
		//���� 2����� int �������������Ԫ��ֵ
		/*
		 * 1.����Ԫ�أ�ÿ����Ҫ�Ƚ�
		 * 2.ȡ�������Ǹ�Ԫ��
		 */
		int max = nums[0];
		for(int i = 0;i<nums.length;i++){
			if(nums[i] > nums[0]){
				max = nums[i];
			}
		}
		System.out.println("�������ֵ��"+max);
		
		//�ڶ���д����
		for(int e:nums){
			if(e>max){
				max = e;//�ϴ��ֵ������max�У�
			}
		}
		System.out.println("�������ֵ�ǣ�"+max);
		
		
		//���� 2������ĳ�ָ�ʽ��ӡ����Ԫ�أ�����Ԫ�ط��ڷ�����[]��,����Ԫ��ʹ�ö��ŷָ����������������ӡ ������Ч���磺[11, 22, 33, 44, 22, 55]
		String str = "[";
		for(int i = 0;i<nums.length;i++){
			if(i==nums.length-1){
				str+=nums[i]+"]";
			}else{
				str +=nums[i]+",";
			}
		}
		System.out.println("�����ӡ :"+str);
	}

}
