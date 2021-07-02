package interfacepractice;


class BubbleSortAlgorithm
{
	public static void main(String[] args) 
	{
		int a[] = {2,1,-1,4,7,-10};
		int n = a.length;
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-1; j++)
			{
				if(a[j+1] < a[j])
				{
					int temp = a[j+1];
					a[j+1] = a[i];
					a[i] = temp;
				}
			}
		}
		for(int item: a) 
		{
			System.out.print(item+"	");

		}
	}
}