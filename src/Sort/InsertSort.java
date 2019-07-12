package Sort;

import java.util.Arrays;

public class InsertSort {
	
	public static void main(String[] args) {
		int[] arr = new int[] {5,3,2,8,5,9,1,0};
		insertSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void insertSort(int[] arr) {
		//遍历除第一个数字以外的所有数字
		for(int i=1;i<arr.length;i++) {
			//如果当前数字比前一个数字小
			if(arr[i]<arr[i-1]) {
				//把当前遍历数字存起来
				int temp=arr[i];
				int j;
				//遍历当前数字前面的所有数字
				for(j=i-1;j>=0&&temp<arr[j];j--) {
					//把前一个数字赋给后一个数字
					arr[j+1]=arr[j];
				}
				//把临时变量赋值给不满足条件的最后一个元素
				arr[j+1]=temp;
			}
		}
	}
}
