package com.sort;
/**
 * 全部排序，不传入从哪里开始，拍到哪里
 * 冒泡排序
 *  基本思想：两两比较待排序数据元素的大小，发现两个数据元素的次序相反时即进行交换，直到没有反序的数据元素为止。
 *  执行完一次内for循环后，最小的一个数放到了数组的最前面（跟那一个排序算法* 不一样）。相邻位置之间交换  
 * @author Administrator
 *
 */

public class BubbleSort3 {
	/**
	 * 冒泡排序算法的实现，对数组中指定的元素进行排序
	 * @param array 待排序数组
	 
	 */
	public void bubble(int[] array){
		//需要array.length-1轮
		for (int k=1 ;k<array.length+1;k++){
			//每轮循环中从最后一个元素开始向前气泡，知道i=k位置，即i=轮次位置
			for(int i =array.length-1; i>=k; i--){
				//按照一种规则（后面元素不能小于前面元素）排序
				if (array[i]<array[i-1]){
					//如果后面元素小于了（当然大于还是小于要看比较器实现了）
					swap(array,i,i-1);
					
				}
			}
			for (int i=0; i<array.length; i++)
				System.out.print(array[i]+",");
			System.out.println("");
			
		}
	}
	
	/**
	 * 交换数组中的两个元素的位置
	 * @param array 待交换的数组
	 * @param i 第一个元素
	 * @param j 第二个元素
	 */
	public void swap(int[] array, int i,int j){
		if (i!=j){//只有不是同一位置才需交换
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] list ={7,2,4,3,12,1,9,6,8,5,11,10};
		int[] list ={7,2,4,3,6,7,8};
		for (int i=0; i<list.length; i++)
			System.out.print(list[i]+",");
		System.out.println("");
		System.out.println("-------start sort--------------");
		
		BubbleSort3 bs = new BubbleSort3();
		bs.bubble(list);
		System.out.println("---------end sort------------");
		for (int i=0; i<list.length; i++)
			System.out.print(list[i]+",");
		

	}

}
