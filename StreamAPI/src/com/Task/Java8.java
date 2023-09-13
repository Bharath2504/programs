package com.Task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8 {

	public static void main(String[] args) throws IOException {
	
			//1.Print Integers using Integer Stream
			IntStream.range(0, 10).forEach(System.out::println);
			System.out.println("=====================================");

			//2.Integer Stream with Skip
			IntStream.range(0, 10).skip(5).forEach(System.out::println); 
			System.out.println("=====================================");
			
			//3.IntStream with sum
			int sum = IntStream.range(0, 10).sum();
			System.out.println(sum);
			System.out.println("=====================================");
			
			//4.Stream of, Sorted, findFirst
			Optional<String> findFirst = Stream.of("And","Vandi","Candy","Sandy").sorted().findFirst();
			System.out.println(findFirst);
			System.out.println("=====================================");
			
			//5.Stream from Array sort,filter,and print
			String [] names= {"Ali","Beamandham", "Vennala kishore","Sapthagiri","Venumadhav","Sampurnesh babu"};
			Arrays.stream(names).filter(x->x.startsWith("S")).sorted().forEach(System.out::println);
			System.out.println("=====================================");
			
			//6.Average of Squares of an int[]
			Arrays.stream(new int[] {2,5,6,4,3,8,9}).map(x->x*x).average().ifPresent(System.out::println); 
			System.out.println("=====================================");
			
			//7.Stream From List , filter and print
			List<String> list = Arrays.asList("Ali","Beamandham", "Vennala kishore","Sapthagiri","Venumadhav","Sampurnesh babu");
			list.stream().map(String::toLowerCase).filter(x-> x.startsWith("a")).forEach(System.out::println);
			System.out.println("=====================================");
			
			//8.Stream rows from text file sort,filter,print
			//Stream<String> Text = Files.lines(Paths.get("Text.txt"));
			//Text.sorted().filter(x->x.length()>5).forEach(System.out::println); 
			//Text.close();
			
			//9.Stream rows from CSV file and count
			//List<String> collect = Files.lines(Paths.get("text.txt")).filter(x->x.contains("Roh")).collect(Collectors.toList());
			//System.out.println(collect);
			
			//10.Stream rows from csv file, parse data from rows
			//long rows = Files.lines(Paths.get("data.txt")).map(x->x.split(",")).filter(x->x.length==3).count();
			//System.out.println(rows);
			
			//11. Reduction - sum
			Optional<Integer> reduce = Stream.of(1,5,3,6,7,8,9).reduce((a,b)-> a*b);
			System.out.println(reduce);
			System.out.println("=====================================");
			
			//12.Reduction -Summary 
			IntSummaryStatistics summaryStatistics = IntStream.of(5,6,4,89,3,7,4).summaryStatistics();
			System.out.println(summaryStatistics);
			System.out.println("=====================================");
			
			
	}
}

