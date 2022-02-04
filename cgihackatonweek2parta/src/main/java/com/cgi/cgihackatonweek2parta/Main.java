package com.cgi.cgihackatonweek2parta;

public class Main {

	public static void main(String[] args) {

		StreamOperationsExercise.playerList.add(new Player("David", 210, 5600, 50, new Country(1, "India")));
		StreamOperationsExercise.playerList.add(new Player("Steve", 15, 7600, 4000, new Country(2, "China")));
		StreamOperationsExercise.playerList.add(new Player("Dan", 5, 8600, 10000, new Country(2, "India")));
		StreamOperationsExercise.playerList.add(new Player("Mary", 250, 17600, 50000, new Country(1, "China")));

		StreamOperationsExercise.displayPlayers();
		StreamOperationsExercise.displayPlayersForCountry("india");
		System.out.println(StreamOperationsExercise.getPlayerNames());
		System.out.println(StreamOperationsExercise.getAverageRunsByCountry("india"));
		System.out.println(StreamOperationsExercise.getPlayerNamesSorted());
		System.out.println(StreamOperationsExercise.getPlayerCountry());
		System.out.println(StreamOperationsExercise.getMaxRunsPlayer());
		System.out.println(StreamOperationsExercise.findPlayer("david", "india"));
		System.out.println(StreamOperationsExercise.checkHighScoreByCountry("china"));
	}
}
