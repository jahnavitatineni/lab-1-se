
public class Insertionsort implements SortStrategy {
	long startTime = System.currentTimeMillis();
	void insertionSort(int[] ar)
	{
	   for (int i=1; i<ar.length; i++)
	   {
	      int index = ar[i]; int j = i;
	      while (j > 0 && ar[j-1] > index)
	      {
	           ar[j] = ar[j-1];
	           j--;
	      }
	      ar[j] = index;
	   } 
	}
	long endTime = System.currentTimeMillis();
	public long getSortTime()
	{
		long totalTime = endTime - startTime;
		return totalTime;
	}
	@Override
	public String strategyName() {
		return null;
	}
	@Override
	public long[] sort(long[] ar) {
		// TODO Auto-generated method stub
		return null;
	}


}
