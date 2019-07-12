package Sort;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = new int[] {6,1,2,7,9,8,3,4,5};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int[] arr,int start,int end) {
		if(start<end) {
			//记录数组中的第0个数字
			int standard = arr[start];
			int low = start;
			int high = end;
			int temp=0;
			//循环找出比标准数大的数和比标准数小的数
			while(low<high) {
				//当右边的数字大于标准数时替换，high下标向左移
				while(low<high&&arr[high]>=standard) {
					high--;
				}
				//当左边的数字小于标准数时替换，low下标向右移
				while(low<high&&arr[low]<=standard) {
					low++;
				}
				//将两个数相互交换
				if(low<high) {
					temp=arr[low];
					arr[low]=arr[high];
					arr[high]=temp;
				}
				
			}
			System.out.println(Arrays.toString(arr));
			//将标准数与当前下标交换
			arr[start]=arr[low];
			arr[low]=standard;
			
			quickSort(arr, start, low);
			quickSort(arr, low+1, end);
		}
	}
}
