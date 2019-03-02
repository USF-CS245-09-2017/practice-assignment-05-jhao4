public class MergeSort implements SortingAlgorithm
{

	public void sort(int [] a)
	{
		sort(a,0,a.length - 1);
	} //sort

	public void merge(int [] a, int left, int mid, int right)
	{
		int aa = mid - left + 1;
		int bb = right - mid;

		int L[] = new int [aa];
		int R[] = new int [bb];

		for(int i = 0; i < aa; ++i)
			L[i] = a[left + 1];
		for(int j = 0; j < bb; ++j)
			R[j] = a[mid + 1 + j];

		int i = 0, j = 0;

		int k = left;
		while(i < aa && j < bb)
		{
			if(L[i] <= R[j])
			{
				a[k] = L[i];
				i++;
			} //if
			else
			{
				a[k] = R[i];
				j++;
			} //else
			k++;
		} //while

		while(i < aa)
		{
			a[k] = L[i];
			i++;
			k++;
		} //while

		while(j < bb)
		{
			a[k] = R[j];
			j++;
			k++;
		} //while
	} //merge

	public void sort(int [] a, int left, int right)
	{
		if(left < right)
		{
			int mid = (left + right) / 2;

			sort(a,left,mid);
			sort(a,mid + 1, right);
			merge(a,left, mid,right);
		} //if
	} //sort
} //mergesort





