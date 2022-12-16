//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends


class Solution
{
	void selectionSort(int arr[], int n)
	{
	    int size=arr.length;
        for(int i=0;i<size-1;i++){
            int min=Integer.MAX_VALUE;
            int place=0;
            for(int j=i;j<size;j++){
                if(arr[j]<min){
                    min=arr[j];
                    place=j;
                }
            }
            int temp=arr[i];
            arr[i]=min;
            arr[place]=temp;
        }
	}
}