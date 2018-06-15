import java.util.Scanner;
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int flag=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array:");
		
		int n= sc.nextInt();
		int array[] = new int[n];
		System.out.println("Enter the elements into array:");
		for(int i=0;i<n;i++){
			array[i]=sc.nextInt();
		}
		
		while(flag==0){
			flag=1;
		System.out.println("MENU:");
		System.out.println("1.BubbleSort\n2.MergeSort\n3.QuickSort");
		System.out.println("Please enter your choice:");
		int ch=sc.nextInt();
		switch(ch){
		case 1:		
			BubbleSort bs= new BubbleSort();
			bs.bubblesort(array);
			System.out.println("Elements after sorting");
			for(int index=0;index<n;index++){
				System.out.print(array[index]+" ");
			}
			break;
		case 2:
			MergeSort ms= new MergeSort();
			ms.recursiveMergeSort(0,array.length-1,array);
			System.out.println("Elements after sorting");
			for(int index=0;index<n;index++){
				System.out.print(array[index]+" ");
			}
			break;
		case 3:
			QuickSort qs= new QuickSort();
			qs.sort(array);
			for(int index=0;index<n;index++){
				System.out.print(array[index]+" ");
			}
			break;
		default: System.out.println("Please enter valid choice");
				 flag=0;
		
		}
		}
		
	}
	

}
