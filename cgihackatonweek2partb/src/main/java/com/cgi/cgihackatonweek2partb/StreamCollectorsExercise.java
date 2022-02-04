package com.cgi.cgihackatonweek2partb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;



public class StreamCollectorsExercise {

	static List <Player> playerList = new ArrayList<Player>();
	
	public HashMap<String, List<Player>> getPlayersByCountry(){
		HashMap<String,List<Player>> hMap = new HashMap<String, List<Player>>();
		playerList.forEach(x -> {
			if(hMap.containsKey(x.getCountry().getCountryName()))
				hMap.get(x.getCountry().getCountryName()).add(x);
			else {
				List<Player> p = new ArrayList<>();
				p.add(x);
				hMap.put(x.getCountry().getCountryName(), p);
			}
				
		});
		return hMap;
	}
	public HashMap<String, List<String>> getPlayerNamesByCountry(){
		HashMap<String,List<String>> hMap = new HashMap<String, List<String>>();
		playerList.stream().filter(x-> x.getMatchesPlayed() > 100).forEach(x-> {
			if(hMap.containsKey(x.getCountry().getCountryName()))
				hMap.get(x.getCountry().getCountryName()).add(x.getPlayerName());
			else {
				List<String> p = new ArrayList<>();
				p.add(x.getPlayerName());
				hMap.put(x.getCountry().getCountryName(), p);
			}
				
		});
		return hMap;
	}

	



	public LinkedHashMap<String,Integer> getTotalPlayersByCountry()
	{
		LinkedHashMap<String,Integer> hMap = new LinkedHashMap<String,Integer>();
		playerList.forEach(x-> {
			if(hMap.containsKey(x.getCountry().getCountryName())) {
				int value = hMap.get(x.getCountry().getCountryName());
				value ++;
				hMap.put(x.getCountry().getCountryName(), value);
			}
				
			else {
				
				hMap.put(x.getCountry().getCountryName(), 1);
			}
				
		});
		return hMap;
	}
	



	public HashMap<String, Integer> getTotalRunsByCountry(){
		HashMap<String,Integer> hMap = new HashMap<String, Integer>();
		playerList.forEach(x-> {
			if(hMap.containsKey(x.getCountry().getCountryName())) {
				int value = hMap.get(x.getCountry().getCountryName());
				value += x.getRuns();
				hMap.put(x.getCountry().getCountryName(), value);
			}
				
			else {
				
				hMap.put(x.getCountry().getCountryName(), x.getRuns());
			}
				
		});
		return hMap;
	}

	



	public HashMap<String,Integer> getMaxScoreByCountry (){
		HashMap<String,Integer> hMap = new HashMap<String, Integer>();
		playerList.forEach(x-> {
			if(hMap.containsKey(x.getCountry().getCountryName())) {
				int value = hMap.get(x.getCountry().getCountryName());
				if(value < x.getRuns())
					hMap.put(x.getCountry().getCountryName(), x.getRuns());
			}
				
			else {
				
				hMap.put(x.getCountry().getCountryName(), x.getRuns());
			}
				
		});
		return hMap;
	}

	



	public HashMap<String,String> getPlayerNamesStringByCountry(){
		HashMap<String,String> hMap = new HashMap<String, String>();
		playerList.forEach(x-> {
			if(hMap.containsKey(x.getCountry().getCountryName())) {
				String value = hMap.get(x.getCountry().getCountryName());
				value = value +","+ x.getPlayerName();
				hMap.put(x.getCountry().getCountryName(), value);
			}
				
			else {
				
				hMap.put(x.getCountry().getCountryName(), x.getPlayerName());
			}
				
		});
		return hMap;
	}

	
}
