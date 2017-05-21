package Sorting;

public class HeapSort {

	public static void heapSort(int a[])
	{
		 int n = a.length;
		
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(a,n,i);	
		}
		 for (int i=n-1; i>=0; i--)
	        {
	            // Move current root to end
	           int temp = a[0];
	            a[0] = a[i];
	            a[i] = temp;
	 
	            // call max heapify on the reduced heap
	           heapify(a,i,0);
	        }
		
	
	}
	
	public static void heapify(int[] a,int size,int i)
	{
		System.out.println("in side heapify");
		//int l = i;
		int lc= 2*i+1;
		int rc = 2*i+2;
		int max=i;
		if(lc<size && a[lc]>a[max])
		{
			max = lc;
		}
		if(rc<size && a[rc]>a[max])
		{
			max = rc;
		}
		
		if(max!=i)
		{
			int temp = a[i];
			a[i]=a[max];
			a[max]=temp;
			System.out.println("--recusion");
			heapify(a,size,max);

	
		}
		
	
		
	}
	
	//static int a[] = {1,123,22,1,-12,313,2,124};
	public static void main(String args[])
	{
		 int a[] = {1,123,22,1,-12,313,2,124};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		heapSort(a);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("ee"+a[i]);
		}
	}
	
	
}
