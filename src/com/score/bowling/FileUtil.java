package com.score.bowling;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by slowell on 12/3/16.
 */
public class FileUtil {
    public static final int TOTAL_PINS = 21;

    private int numOfPlayers = 0;
    private int[][] playerRollArr;
    private ArrayList<Player> allPlayers = new ArrayList<Player>();
    private String fileName;

    public FileUtil(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Read input File and create number of Player and Array of pins and Array of player's name
     *
     * @throws IOException
     */
    private void readInput() throws IOException {
        File file = new File(fileName);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";

            //number of players
            if ((line = br.readLine()) != null) {
                numOfPlayers = Integer.parseInt(line);
            }
            readPlayerInfo(br);
            fillPinsArray(br);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Create input array of playerNumber and their pins from inputFile
     *
     * @param br
     * @throws IOException
     */
    private void fillPinsArray(BufferedReader br) throws IOException {
        String line;
        playerRollArr = new int[numOfPlayers][TOTAL_PINS];
        //getting all the pin numbers
        for (int roll = 0; roll < TOTAL_PINS - 1; roll = roll + 2) {
            for (int player = 0; player < numOfPlayers; player++) {
                String[] allPins = new String[3];
                try {
                    if ((line = br.readLine()) != null) {
                        allPins = line.split("\\s+");
                    }
                } catch (IOException e) {
                    e.printStackTrace();

                }
                if (allPins != null) playerRollArr[player][roll] = Integer.parseInt(allPins[0]);
                if (allPins.length > 2)
                    playerRollArr[player][roll + 2] = Integer.parseInt(allPins[2]);
                if (allPins.length > 1)
                    playerRollArr[player][roll + 1] = Integer.parseInt(allPins[1]);
                else
                    playerRollArr[player][roll + 1] = -1;

            }
        }
    }

    /**
     * Create Array of player's name
     *
     * @param br
     */
    private void readPlayerInfo(BufferedReader br) {
        String line = "";
        //player names
        for (int i = 0; i < numOfPlayers; i++) {
            String playerName;
            try {
                if ((line = br.readLine()) != null) {
                    allPlayers.add(new Player(line));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * This is main process to start the game for all players
     *
     */
    public ArrayList<String> process() throws IOException {
        ArrayList<String> result = new ArrayList<String>();
        readInput();
        for (int i = 0; i < numOfPlayers; i++) {
            GameInit game = new GameInit(playerRollArr[i]);
            result.add(allPlayers.get(i).getName() + "  : " + game.getScore());
        }
        return result;

    }

}
