package civGame;

import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;

public class GameSettings {
	//Main menu vars
	public static final int TITLE_WINDOW_HEIGHT = 600;
	public static final int TITLE_WINDOW_WIDTH = 400;
	public static final Dimension TITLE_DIM = new Dimension(TITLE_WINDOW_WIDTH, TITLE_WINDOW_HEIGHT);
	
	//Game vars
	public static final int GAME_WINDOW_WIDTH = 1097;
	public static final int GAME_WINDOW_HEIGHT = 928;
	public static final int BLOCK_SIZE = 30;
	public static final int GRID_LENGTH = 900;
	public static final Dimension GAME_DIM = new Dimension(GAME_WINDOW_WIDTH, GAME_WINDOW_HEIGHT);
	
	
	
	public final static Image FARM = new ImageIcon("res/farm.jpg").getImage();
	public final static Image HOUSE = new ImageIcon("res/farm.jpg").getImage();
	public final static Image WELL = new ImageIcon("res/well.jpg").getImage();
	public final static Image MINE = new ImageIcon("res/mine.jpg").getImage();
	public final static Image GRASS = new ImageIcon("res/grass_30.png").getImage();
	
	
	
	
	public final static int HOUSE_GOLD_COST = 60;
	public final static int HOUSE_PEOPLE_YIELD = 10;
	
	public final static int MINE_PEOPLE_COST = 5;
	public final static int MINE_GOLD_YIELD = 80;
	public final static int MINE_STONE_YIELD = 25;
	
	public final static int FARM_PEOPLE_COST = 2;
	public final static int FARM_FOOD_YILED = 16;
	public final static int FARM_GOLD_COST = 25;
	
	public final static int WELL_STONE_COST = 30;
	public final static int WELL_WATER_YILED = 16;
	
	public final static int DAY_LENGTH = 10;
	
	
}