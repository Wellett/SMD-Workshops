package com.unimelb.swen30006.monopoly;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Properties;
import java.io.FileReader;
import java.io.IOException;


/**
 * This class is created based on case study of Monopoly of "Applying UML and Patterns, 3rd edition by Craig Larman".
 * For demonstration on subject SWEN30006 at The University of Melbourne
 * @author 	Yunzhe(Alvin) Jia
 * @version 1.0
 * @since 	2016-07-18
 *
 */
public class MonopolyGame {
	private static final String PROPERTIES_FILE = "monopoly.Properties";
	public final int ROUNDS_TOTAL;
	public static final int MIN_NUM_OF_PLAYER = 2;
	public static final int MAX_NUM_OF_PLAYER = 8;
	public static final int NUM_OF_DICE = 1;
	private static String dieType = "Die";

	private List<Player> players;
	private Board board = new Board();

	/**
	 * initialize the system with number of Players
	 * @param numOfPlayers number of Players
	 */
	public MonopolyGame(int numOfPlayers, int numOfRounds, String dieType){
		Cup.initialize(NUM_OF_DICE, dieType);
		players = new ArrayList<Player>(numOfPlayers);
		ROUNDS_TOTAL = numOfRounds;
		for(int i = 0; i < numOfPlayers;i++){
			Player p;
			p = new Player("Player " + (i+1), board);
			players.add(p);
		}
	}

	/**
	 * start the game simulation
	 */
	public void playGame(){
		for(int i = 0; i < ROUNDS_TOTAL; i++){
			playRound();
		}
	}

	public List<Player> getPlayers(){
		return players;
	}

	private void playRound(){
		for(Iterator<Player> it = players.iterator(); it.hasNext(); ){
			Player player = (Player) it.next();
			player.takeTurn();
		}
	}

	public static void main(String[] args) throws IOException {
		Properties monopolyProperties = new Properties();

		FileReader inStream = null;

		try {
			inStream = new FileReader(PROPERTIES_FILE);
			monopolyProperties.load(inStream);
		} finally {
			 if (inStream != null) {
	                inStream.close();
	            }
		}
		int numberOfPlayers = Integer.parseInt(monopolyProperties.getProperty("Number_of_Players"));
		if (numberOfPlayers > MAX_NUM_OF_PLAYER || numberOfPlayers < MIN_NUM_OF_PLAYER){
			System.err.print("Number of player outside acceptable range");
			System.exit(1);
		}
		int numberOfRounds = Integer.parseInt(monopolyProperties.getProperty("Number_of_Rounds"));

		dieType = monopolyProperties.getProperty("Die_Type");

		//Create/start game
		MonopolyGame game = new MonopolyGame(numberOfPlayers, numberOfRounds, dieType);
		game.playGame();

	}

}
