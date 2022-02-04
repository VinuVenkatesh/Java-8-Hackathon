package com.cgi.cgihackatonweek2partb;



public class Main {

	public static void main(String[] args) {
		StreamCollectorsExercise.playerList.add(new Player("David", 210, 5600, 50, new Country(1, "India")));
		StreamCollectorsExercise.playerList.add(new Player("Steve", 15, 7600, 4000, new Country(2, "China")));
		StreamCollectorsExercise.playerList.add(new Player("Dan", 115, 8600, 10000, new Country(2, "India")));
		StreamCollectorsExercise.playerList.add(new Player("Mary", 250, 17600, 50000, new Country(1, "China")));
		
		StreamCollectorsExercise sCE = new StreamCollectorsExercise();
		System.out.println(sCE.getPlayersByCountry());
		System.out.println(sCE.getPlayerNamesByCountry());
		System.out.println(sCE.getTotalPlayersByCountry());
		System.out.println(sCE.getTotalRunsByCountry());
		System.out.println(sCE.getMaxScoreByCountry());
		System.out.println(sCE.getPlayerNamesStringByCountry());
	}
	
}
