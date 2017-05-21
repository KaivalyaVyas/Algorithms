package Sorting;

public class InsertionSort {

	public static void main(String args[])
	{
		int a[] = {1,123,22,1,-12,313,2,124};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(a[j]<a[j-1])
				{
					int t = a[j];
					a[j] = a[j-1];
					a[j-1] = t;
				}
			}
		}
		
		for(int k=0;k<a.length;k++)
		{
			System.out.println(""+a[k]);
		}
		
	}
}
