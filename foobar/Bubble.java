
public class bubbleSort {
	public static void main(String [] args){
		long startTime = System.nanoTime();
		int[] arr={15,33,27,35,10};
		
		bubbleSort(arr,0);
		for (int i=0;i<arr.length;i++){
			bubbleSort(arr,0);
		}
		for (int as: arr)
			System.out.print(as+" ");
		System.out.println();
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 
		
	}
	
	private static void bubbleSort(int[]a, int index){
		if (index==a.length-1)
			return;
		int max=a[index]>a[index+1]?index:index+1;
		
		if(max!=index+1){
			int temp=a[max];
			a[index]=a[index+1];
			a[index+1]=temp;
		}
		
		bubbleSort(a,index+1);
	}
}

//code
