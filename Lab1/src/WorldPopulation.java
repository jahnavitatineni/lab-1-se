
    import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.Reader;
	import java.util.StringTokenizer;

	@SuppressWarnings("unused")
	public class WorldPopulation {

		SortStrategy sortStrategy;
		long [] population = new long[13484];// Cheating because we know number of records!!
		
		long k=0;
		// Lab Exercise:  After creating some strategy classes -- set the default strategy here.		public WorldPopulation(){
		public WorldPopulation() {
		sortStrategy = (SortStrategy) new Insertionsort(); 
		}// Set the default strategy here.	

		
		public void readInputFile(){
			population = readPopulationFile("src\\WorldPopulation.csv");
		}
		
		public void setStrategy(SortStrategy startegy){
			sortStrategy = startegy;
		}
		
		// Lab Exercise:  Read in the WorldPopulation.csv
		// Extract ONLY the numbers and store them into population[]
		@SuppressWarnings("unused")
		public long[] readPopulationFile(String fileName){ int l=0;
			try 
			{
				FileReader m=new FileReader(fileName);
				BufferedReader reader=new BufferedReader(m);
				String p;
				if((p=reader.readLine())!=null)
				{
					
					StringTokenizer tokenizer=new StringTokenizer(p,",");
					if(tokenizer.hasMoreTokens())
					{
						String country=tokenizer.nextToken();
						int year=Integer.parseInt(tokenizer.nextToken());
						long count=Long.parseLong(tokenizer.nextToken());
						population[l++]=count;
						k+=count;
					}
				}
				reader.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		  
			return population;
		}
		
		// Lab Exercise.  Complete this method.
		// Delegate sorting to the strategy object
		public void sortPopulation(){
			population=sortStrategy.sort(population);
			long sortTime=sortStrategy.getSortTime();
			System.out.println(sortStrategy.strategyName()+":"+sortTime+"milliseconds");
			
		}
		
		public void computeTotalPopulation(){
			System.out.println("Total World Population:"+k);
		}
		
		// Experiment with various strategies.
		// Create 3 strategies -- Bubble, insertion, and selection sort.
		public static void main(String[] args) {
			WorldPopulation worldPopulation = new WorldPopulation();
			worldPopulation.readInputFile();
			worldPopulation.setStrategy(new BubbleSort());
			worldPopulation.sortPopulation();
			worldPopulation.readInputFile();
			worldPopulation.setStrategy(new Insertionsort());
			worldPopulation.sortPopulation();
			worldPopulation.readInputFile();
			worldPopulation.setStrategy(new Selectionsort());
			worldPopulation.sortPopulation();
			worldPopulation.computeTotalPopulation();
		}


		private void setStrategy(Insertionsort startegy) {
			// TODO Auto-generated method stub
			
		}


		private void setStrategy(Selectionsort selectionsort) {
			// TODO Auto-generated method stub
			
		}
		}
	
	
		
