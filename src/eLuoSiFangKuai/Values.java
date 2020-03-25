package eLuoSiFangKuai;

public class Values {
	/*每个方格的下落间隔时间*/
	private int TIME=1000;
	/*行数*/
	private int ROWS=20;
	/*列数*/
	private int COLS=10;
	/*小方格宽度*/
	private static final int CELL_SIZE=26;
	private int totalScore = 0;//一局游戏的总得分
	private int totalLine = 0;//一局游戏总共消除的行数
	/*定义三个常量：充当游戏的状态*/
	public int PLAYING = 0;
	public int PAUSE = 1;
	public int GAMEOVER = 2;
	/*定义一个属性，存储游戏的当前状态*/
	private int game_state;
	public int getTIME() {
		return this.TIME;
	}
	public int getROWS() {
		return this.ROWS;
	}
	public int getCOLS() {
		return this.COLS;
	}
	public int getCELL_SIZE() {
		return Values.CELL_SIZE;
	}
	public int getScore() {
		return totalScore;
	}
	public int getLine() {
		return this.totalLine;
	}
	public int getPLAYING() {
		return this.PLAYING;
	}
	public int getPAUSE() {
		return this.PAUSE;
	}
	public int getGAMEOVER() {
		return this.GAMEOVER;
	}
	public int getSTATE() {
		return this.game_state;
	}
	public void setTIME(int time) {
		this.TIME = time;
	}
	public void setSCORE(int score) {
		this.totalScore = score;
	}
	public void setLINE(int line) {
		this.totalLine = line;
	}
	public void setSTATE(int state) {
		this.game_state = state;
	}
}
