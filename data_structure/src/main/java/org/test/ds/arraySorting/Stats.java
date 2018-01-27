package org.test.ds.arraySorting;

	import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;

	public class Stats {
		public static class StatisticsAggregatorImpl //implements StatisticsAggregator {
	    Map<String,Double> map = new HashMap<String,Double>();
			public void putNewPrice(String symbol, double price) {
			 
			    if(map.containsKey(symbol)){
			        
			        //java.util.Map.Entry entry = map.entrySet();
			    double itemPrice = itemPrice +map.get(symbol);
			    	map.put(symbol,itemPrice);
			}
			
			map.put(symbol,price);

			public double getAveragePrice(String symbol) {
			  if(map.containsKey(symbol)){
			        java.util.Map.Entry entry = (Entry) map.entrySet();
			        double itemPrice =map.get(symbol);
			        itemPrice /=itemPrice;
			    	map.put(symbol,itemPrice);
			  }
			
			}

			public int getTickCount(String symbol) {
			    int cnt=0;
			 Map<String,Integer> mapCount = new HashMap<String,Integer>();
			 if(mapCount.(symbol)){
			     
			    mmapCount.put(symbol,mapCount.get(sysmbol)+1); 
			}
			mmapCount.put(symbol,1); 
			return mapCount.get(sysmbol);
		}

		////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

		public interface StatisticsAggregator {
			// This is an input. Make note of this price.
			public void putNewPrice(String symbol, double price);

			// Get the average price
			public double getAveragePrice(String symbol);

			// Get the total number of prices recorded
			public int getTickCount(String symbol);
		}

		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			while (scanner.hasNext()) {
				final StatisticsAggregator stats = new StatisticsAggregatorImpl();
				final Set<String> symbols = new TreeSet<>();

				String line = scanner.nextLine();
				String[] inputs = line.split(",");
				int threads = Integer.parseInt(inputs[0]);
				ExecutorService pool = Executors.newFixedThreadPool(threads);
				for (int i = 1; i < inputs.length; ++i) {
					String[] tokens = inputs[i].split(" ");
					final String symbol = tokens[0];
					symbols.add(symbol);
					final double price = Double.parseDouble(tokens[1]);
					pool.submit(new Runnable() {
						@Override
						public void run() {
							stats.putNewPrice(symbol, price);
						}
					});

				}
				pool.shutdown();
				try {
					pool.awaitTermination(5000, TimeUnit.MILLISECONDS);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				for (String symbol : symbols) {
					System.out.println(String.format("%s %.4f %d", symbol,
							stats.getAveragePrice(symbol),
							stats.getTickCount(symbol)));
				}
			}
			scanner.close();

		}
	}
}
