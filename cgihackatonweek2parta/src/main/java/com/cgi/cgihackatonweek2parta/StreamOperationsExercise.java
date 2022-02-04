package com.cgi.cgihackatonweek2parta;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StreamOperationsExercise implements Comparator<Player> {

	static List<Player> playerList = new ArrayList<Player>();

	public static void displayPlayers() {
		playerList.forEach(x -> System.out.println(x.getPlayerName()));
	}

	public static void displayPlayersForCountry(String country) {
		playerList.stream()
				.filter(x -> x.getCountry().getCountryName().equalsIgnoreCase(country) && x.getHighestScore() > 100)
				.forEach(x -> System.out.println(x.getPlayerName()));

	}

	public static LinkedList<String> getPlayerNames() {
		LinkedList<String> playerNames = playerList.stream().filter(x -> x.getRuns() > 5000).map(x -> x.getPlayerName())
				.sorted((x1, x2) -> x2.compareTo(x1)).collect(Collectors.toCollection(LinkedList::new));
		return playerNames;
	}

	public static double getAverageRunsByCountry(String country) {
		OptionalDouble avg = playerList.stream().filter(x -> x.getCountry().getCountryName().equalsIgnoreCase(country))
				.mapToInt(Player::getRuns).average();
		return avg.getAsDouble();
	}

	public static List<String> getPlayerNamesSorted() {
		List<String> playerNames = playerList.stream().sorted(new StreamOperationsExercise())
				.map(x -> x.getPlayerName()).collect(Collectors.toList());
		return playerNames;
	}

	public static HashMap<String, String> getPlayerCountry() {
		HashMap<String, String> hMap = new HashMap<String, String>();
		playerList.stream().filter(x -> x.getMatchesPlayed() > 200)
				.forEach(x -> hMap.put(x.getPlayerName(), x.getCountry().getCountryName()));
		;
		return hMap;
	}

	public static String getMaxRunsPlayer() {
		Optional<String> playerName = playerList.stream().reduce((x, y) -> x.getRuns() > y.getRuns() ? x : y)
				.map(x -> x.getPlayerName());
		return playerName.get();
	}

	public static Player findPlayer(String name, String country) {
		Optional<Player> p = playerList.stream().filter(x -> x.getCountry().getCountryName().equalsIgnoreCase(country)
				&& x.getPlayerName().equalsIgnoreCase(name)).findFirst();
		;
		return p.get();
	}

	public static boolean checkHighScoreByCountry(String country) {
		Optional<Player> p = playerList.stream()
				.filter(x -> x.getCountry().getCountryName().equalsIgnoreCase(country) && x.getRuns() > 10000)
				.findAny();
		if (p.isEmpty())
			return false;
		else
			return true;
	}

	@Override
	public int compare(Player o1, Player o2) {
		if (o1.getCountry().getCountryName().compareTo(o2.getCountry().getCountryName()) == 0)
			return Integer.compare(o2.getMatchesPlayed(), o1.getMatchesPlayed());
		else
			return o1.getCountry().getCountryName().compareTo(o2.getCountry().getCountryName());
	}
}
