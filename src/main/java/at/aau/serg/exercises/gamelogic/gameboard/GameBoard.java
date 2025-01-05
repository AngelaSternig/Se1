package at.aau.serg.exercises.gamelogic.gameboard;

import java.util.List;
import java.util.Random;

public class GameBoard {

    private final Type[][] board;
    private final double[][] damageMultiplier, walkingMultiplier;
    private final List<Enemy> enemyList;

    public GameBoard(List<Enemy> enemies) {
        board = new Type[5][5];
        damageMultiplier = new double[5][5];
        walkingMultiplier = new double[5][5];

        enemyList = enemies;
        initialize();
    }

    private void initialize() {
        initializeBoard();
        initializeMultipliers();
        placeEnemies();
    }

    private void initializeBoard() {
        Random random = new Random();
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                board[row][col] = Type.values()[random.nextInt(Type.values().length)];
            }
        }
    }

    private void initializeMultipliers() {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                Type type = board[row][col];
                walkingMultiplier[row][col] = getWalkingMultiplier(type);
                damageMultiplier[row][col] = getDamageMultiplier(type);
            }
        }
    }

    private double getWalkingMultiplier(Type type) {
        switch (type) {
            case WOODS: return 0.7;
            case SPECIAL: return 1.0; // Default handling for special cases
            default: return 1.0;
        }
    }

    private double getDamageMultiplier(Type type) {
        switch (type) {
            case WOODS: return 1.2;
            case SPECIAL: return 2.0;
            default: return 1.0;
        }
    }

    private void placeEnemies() {
        Random random = new Random();
        for (Enemy enemy : enemyList) {
            if (enemy.health == 0) continue;
            Position position = new Position(random.nextInt(5), random.nextInt(5));
            enemy.placeOnBoard(position, damageMultiplier, walkingMultiplier);
        }
    }

    // Enum for the field types
    public enum Type {
        GRASS,
        WOODS,
        ROCK,
        SPECIAL
    }

}

