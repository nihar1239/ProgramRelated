package program;

public class MinNumArray {
	  static int getMin(int arr[], int n)
	    {
	        int res = arr[0];
	        for (int i = 1; i < n; i++)
	            res = Math.min(res, arr[i]);
	        return res;
	    }

	
	   
	    public static void main(String[] args)
	    {
	        int arr[] = { 2, 12, 4, 6,};
	        int n = arr.length;
	        System.out.println("Minimum element of array: " + getMin(arr, n));
	 
	    }
	}

