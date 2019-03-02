public class QuickSort implements SortingAlgorithm
{
	public void sort(int [] a)
	{
		int low = 0;
		int high = a.length;
		Qsort(a,low, high - 1);
	} //sort

	public void Qsort(int [] a, int low, int high)
	{
		if(low < high)
		{
			int pi = part(a,low,high);
			Qsort(a,low,pi-1);
			Qsort(a,pi+1,high);
		} //if
	} //sort

	public int part(int [] a, int low, int high)
	{
		int pivot = a[high];
		int i = low - 1;
		for(int j = low; j < high; j++)
		{
			if(a[j] <= pivot)
			{
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			} //if
		} //for
		int temp = a[i+1];
		a[i+1] = a[high];
		a[high] = temp;
		return i+1;
	} //part
} //quicksort