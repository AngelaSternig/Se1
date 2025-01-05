package at.aau.serg.exercises.gamelogic.gameboard;

public class Enemy {

    public double health;
    public EnemyType type;
    public double speedMult;
    public int speed;
    public double damageMult;
    public double damage;
    public Position pos;

    public void placeOnBoard(Position position, double[][] damageMultiplier, double[][] walkingMultiplier) {
        this.pos = position;
        int x = position.x;
        int y = position.y;
        if (this.type == EnemyType.BOSS) {
            this.damageMult = damageMultiplier[x][y] * 1.5;
            this.speedMult = walkingMultiplier[x][y] * 1.5;
        } else {
            this.damageMult = damageMultiplier[x][y];
            this.speedMult = walkingMultiplier[x][y];
        }
    }

    public enum EnemyType{
        NORMAL,
        BOSS
    }
}
