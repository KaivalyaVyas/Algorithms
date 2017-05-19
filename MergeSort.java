package Sorting;

public class MergeSort {
	
	
	public static void main(String args[])
	{
		int a[] = {1,123,22,1,-12,313,2,124};

		int start = 0;
		int end = a.length-1;	
		
		int[] aux = new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(""+a[i]);
		}

		sort(a,aux,start,end);
		System.out.println("----After applying soritn");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(""+a[i]);
		}
	}
	
	public static void merge(int a[],int aux1[],int start,int mid,int end)
	{
		
		for(int k=start;k<=end;k++)
		{
			aux1[k] =a[k];
		}
		
		
			int i = start, j = mid+1;
	        for (int k = start; k <= end; k++) {
	            if      (i > mid)               a[k] = aux1[j++];
	            else if (j > end)               a[k] = aux1[i++];
	            else if (aux1[j]< aux1[i])        a[k] = aux1[j++];   // to ensure stability
	            else                            a[k] = aux1[i++];
	        }
		
		
	}
	

	public static void sort(int a[],int aux[],int start,int end)
	{
		int mid = start+((end-start)/2);
		if(end==start)
		{
			return;
		}
		else{
		sort(a,aux,start,mid);
		sort(a,aux,mid+1,end);
		//System.out.println("calling merger"+start);
		//System.out.println("calling merger"+end);
		merge(a,aux,start,mid,end);
		}
		
	}

 }
