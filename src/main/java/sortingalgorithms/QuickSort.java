
public class QuickSort {

	int array[];
	public void sort(int[] Arr){
		this.array=Arr;
		quickSort(0,Arr.length-1);
	}
	
	public void quickSort(int low, int high){
		int pivot=array[low+(high-low)/2];
		int l= low;
		int h= high;
		
		while(l<=h){
			
			while(array[l]<pivot){
				l++;
			}
			while(array[h]>pivot){
				h--;
			}
			if(l<=h){
				int temp=array[h];
				array[h]=array[l];
				array[l]=temp;
				l++;h--;
			}
		}
		
		if(low<h){
			quickSort(low,h);
			
		}
		if(l<high){
			quickSort(l,high);
		}
	}
	
	

}
