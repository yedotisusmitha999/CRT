
public class BubbleSortExample{
	public static void bubbleSort(int[] arr){
		int n=arr.length;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args){
		int[] arr={5,1,4,2,8};
		System.out.println("Before sorting:");
		for(int num:arr)System.out.print(num+" ");
		bubbleSort(arr);
		System.out.println("\nAfter Sorting:");
		for(int num:arr)System.out.print(num+"");
	}
}
