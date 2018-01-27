package org.test.ds.arraySorting;

public class RotateSortedArraySearch {

	/*public static int search(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (target == nums[mid])
				return mid;

			if (nums[left] <= nums[mid]) {
				if (nums[left] <= target && target < nums[mid]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			} else {
				if (nums[mid] < target && target <= nums[right]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}

		return -1;
	}
*/	
	public static int search1(int[] arr,int target){
		int left =0;
		int right=arr.length-1;
		while(left<right){
			int mid =(left+right)/2;
			if(arr[mid]==target) return mid;
			
			
			if(arr[left]<=arr[mid]){
				if(arr[left]<target && target<arr[mid]){
					right =right-1;
				}else{
					left=left+1;
				}
			}else 
				if(arr[mid]<target && target<arr[right]){
				  left=left+1;
			    }else{
			    	right=right-1;
			    }
		}
		return -1;
		
	}
	
	public static int search2(int[] arr,int target){
		int left =0;
		int right=arr.length-1;
		while(left<right){
			int mid =(left+right)/2;
			if(arr[mid]==target) return mid;
			
			if(arr[left]<arr[mid]){
				if(arr[left]<target && target<arr[mid]){
					right=right-1;
				}else{
					left=left+1;
				}
			} else if(arr[mid]<arr[right]){
				if(arr[mid]<target && target< arr[right]){
					left=left+1;
				}else{
					right=right-1;
				}
			}
			
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int[] aaa={5, 6, 7, 8, 9, 10, 1, 2, 3};
		int aa =search1(aaa,1);
		int aa1 =search2(aaa,1);
		System.out.println(aa);
		System.out.println(aa1);
		
	}
}