package day1108.abstractex;

public class Player {
	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}

	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		this.level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
	
	
	
}