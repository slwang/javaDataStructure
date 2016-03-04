package com.sort;
/**
 * 简单选择排序：执行完一次内for循环后最小的一个数放在了数组的最前面。
 * @author Administrator
 *
 */
public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array = {10,11,9,78,87,65};
		for (int i=0; i<array.length ;i++)
			System.out.print(array[i]+",");
		System.out.println("");
		System.out.println("---------------start sort");
		SelectSort ss = new SelectSort();
		ss.selectSort(array);
		System.out.println("---------------end sort");
		for (int i=0; i<array.length ;i++)
			System.out.print(array[i]+",");
		

	}
	
	public void swap(Integer[] array, int i, int j){
		Integer temp = array[i];
		//int temp = array[i];////这个也行
		array[i] = array[j];
		array[j] = temp;
	}
	/**
	 * 
	 * @param array
	 */
	public void selectSort(Integer[] array){
		int minIndex;//最小索引
		// 第一个元素为最小元素，如果从第一元素后能选出比第一个元素更小元素，则让让最小元素与第一 个元素交换     
		for (int i=0;i<array.length; i++){
			minIndex = i;//假设每轮第一个元素为最小元素 
			//从假设的最小元素的下一元素开始循环 
			for (int j =i+1; j<array.length ;j++){
				if (array[minIndex].compareTo(array[j])>0){
					//先前只是记录最小元素索引，当最小元素索引确定后，再与每轮的第一个元素交换
					swap(array,minIndex,j);					
				}
			}
			for (int k=0; k<array.length ;k++)
			{
				System.out.print(array[k]+",");
				
			}
			System.out.println("");
			
		}
		
	}

}
