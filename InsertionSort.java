class InsertionSort implements SortingAlgorithm
{
	@Override
	public void sort(int [] a)
	{
		for(int i = 1; i < a.length; ++i)
		{
			int x = a[i];
			int j = i - 1;

			while(j >= 0 && a[j] > x)
			{
				a[j+1] = a[j];
				j--;
			} //while
			a[j+1] = x;
		} //for
	} //sort
} //insertion sort