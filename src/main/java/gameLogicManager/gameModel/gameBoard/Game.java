package gameLogicManager.gameModel.gameBoard;

import gameLogicManager.gameModel.gameResources.tiles.*;
import gameLogicManager.gameModel.player.Player;

import java.util.List;

/**
 * Holds all entities.
 * Serves as a Facade class between controllers and entities.
 * Game is a Singleton
 * @author Rafi Coktalas
 * @version 10.05.2020
 */
public class Game {

    private static Game uniqueInstance; //Singleton

    private GameBoard gameBoard;
    private CultBoard cultBoard;
    private List<Player> players;
    private String[] transformationCycle; //Bu class olabilir aslında
    private ScoringTileList scoringTiles;
    private FavorTileList favorTiles;
    private TownTileList townTiles;
    private BonusCardList bonusCards;
    private String statusBar;

    private Game(){

    }

    public static Game getInstance(){
        if( uniqueInstance == null ){
            uniqueInstance = new Game();
        }
        return uniqueInstance;
    }
}
