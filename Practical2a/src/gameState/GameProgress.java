package gameState;

public class GameProgress {

	private static GameProgress obj;
    private int level;
    private int score;

    private GameProgress() {
        level = 1;
        score = 0;
    }

    public static GameProgress getobj() {
        if (obj == null) {
            obj = new GameProgress();
        }
        return obj;
    }

    public int getLevel() {
        return level;
    }
    public void updatetheLevel(int newLevel) {
        this.level = newLevel;
    }
    public int gettheScore() {
        return score;
    }
    public void updatetheScore(int newScore) {
        this.score = newScore;
    }

	
}
