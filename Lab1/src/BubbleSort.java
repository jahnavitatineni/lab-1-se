
public class BubbleSort implements SortStrategy{
	long startTime = System.currentTimeMillis();
	public int bubbleSort(int ar[])
	{
	   for (int i = (ar.length - 1); i >= 0; i--)
	   {
	      for (int j = 1; j <= i; j++)
	      {
	         if (ar[j-1] > ar[j])
	         {
	              int temp = ar[j-1];
	              ar[j-1] = ar[j];
	              ar[j] = temp;
	         } 
	       } 
	    }
	return 0; 
	}

	long endTime = System.currentTimeMillis();
	public long getSortTime()
	{
		long totalTime = endTime - startTime;
		return totalTime;
	}
	@Override
	public String strategyName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public long[] sort(long[] ar) {
		// TODO Auto-generated method stub
		return null;
	}
}
	
	


