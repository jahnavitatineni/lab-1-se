
public interface SortStrategy {
	String strategyName();
	long[] sort(long[] ar);
	long getSortTime();

}
