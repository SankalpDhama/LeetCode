//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution
{
    void merge(int arr[], int left, int mid, int right)
    {
         int[] merged=new int[right-left+1];
         int i=left,j=mid+1,k=0;
         while(i<=mid && j<=right){
             if(arr[i]<=arr[j]){
                merged[k]=arr[i]; 
                i++;
             }else{
                 merged[k]=arr[j];
                 j++;
             }
             k++;
         }
         while(i<=mid){
             merged[k++]=arr[i++];
         }
         while(j<=right){
             merged[k++]=arr[j++];
         }
         for(int x=0,y=left;x<merged.length;x++,y++){
             arr[y]=merged[x];
         }
         //System.out.println(Arrays.toString(arr)+"bheesh");
    }
    void mergeSort(int arr[], int left, int right)
    {
        if(right>left){
            int mid=left+(right-left)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
}
