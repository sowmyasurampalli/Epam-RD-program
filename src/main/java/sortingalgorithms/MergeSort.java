class MergeSort{
	
	void merge(int low, int mid, int high, int arr[]){
		
		
		int n1= mid-low+1;
		int n2= high-mid;
		
		int left[]= new int[n1];
		int right[]= new int[n2];
		
		for (int i=0;i<n1;++i){
			left[i]=arr[low+i];
		}
		for (int j=0; j<n2; ++j)
            right[j] = arr[mid + 1+ j];
		
		
		int i = 0, j = 0;
		    
        int k = low;
        while (i < n1 && j < n2)
        {
            if (left[i] <= right[j])
            {
                arr[k] = left[i];
                i++;
            }
            else
            {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            arr[k] = left[i];
            i++;
            k++;
        }

        
        while (j < n2)
        {
            arr[k] = right[j];
            j++;
            k++;
        }
        
	}
	
	
	void recursiveMergeSort(int low, int high, int[] arr){
		if(low<high){
			int mid= (low+high)/2;
			recursiveMergeSort(low,mid,arr);
			recursiveMergeSort(mid+1,high,arr);
			merge(low, mid, high, arr);
		}
	}
	
	 
	
}