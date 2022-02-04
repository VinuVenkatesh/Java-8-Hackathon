package com.cgi.cgihackatonweek2partb;

import java.util.LinkedList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SepcialStreamExercise {

	public LinkedList<Integer> getSquaresOfThree() {
		//Use IntStream to generate a range of numbers from 20 to 50 inclusive. From the stream, store the square of odd multiples of 3 in an LinkedList and return it
		LinkedList<Integer> list = new LinkedList<Integer>();
		IntStream.range(20, 50).filter(x -> {
			if(x%3 == 0 && x%2 != 0)
				return true;
			else
				return false;
		}).map(x -> x*x).forEach(x -> list.add(x));
		
		return list;
		
	}
	
	public Integer[] getMultiplesOfFive() {
		//Generate a infinite stream with multiples of 5 and collect the first 20 multiples in an array and return the array
		Integer[] num = Stream.iterate(5, i -> i+5).limit(20).toArray(Integer[] :: new);
		
		return num;
	}
	public static void main(String[] args) {
		Integer[] num = new SepcialStreamExercise().getMultiplesOfFive();
		System.out.println("Multiples of 5");
		for (Integer integer : num) {
			System.out.print(integer + " ");
		}
		System.out.println();
		System.out.println("Squares of odd multiples 3");
		LinkedList<Integer> list = new SepcialStreamExercise().getSquaresOfThree();
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
		
	}
}
