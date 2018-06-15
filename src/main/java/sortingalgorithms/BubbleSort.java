import java.util.*;
public class BubbleSort {

	public void bubblesort(int[] sortingArray) {
		// TODO Auto-generated method stub
		
		
		
		
		int n= sortingArray.length;
		
		int temp;
		for(int firstIndex=0; firstIndex<n; firstIndex++){
			for(int secondIndex=firstIndex;secondIndex<n;secondIndex++){
				if(sortingArray[firstIndex]>sortingArray[secondIndex]){
				temp= sortingArray[firstIndex];
				sortingArray[firstIndex]=sortingArray[secondIndex];
				sortingArray[secondIndex]=temp;
				}
			}
		}
		
		

	}

}
