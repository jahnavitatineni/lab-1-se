
public class Selectionsort implements SortStrategy
{
	long startTime = System.currentTimeMillis();
	public int selectionSort(int ar[])
	{
		   for (int i = 0; i<ar.length-1; i++)
		   {
		      int min = i;
		      for (int j = i+1; j<ar.length; j++)
		            if (ar[j]<ar[min]) min = j;
		      int temp = ar[i];
		      ar[i] = ar[min];
		      ar[min] = temp;
		   }
		return 0; 
    }
	long endTime = System.currentTimeMillis();
	{
		//return ar;
	}
	//return ar;
	public long getSortTime()
	{
		long totalTime = endTime - startTime;
		return totalTime;
	}
	public long sort(long population) {
		return 0;
	}
	public String strategyName() {
		return null;
	}
	@Override
	public long[] sort(long[] ar) {
		return null;
	}
}
