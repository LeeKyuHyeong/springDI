package com.bb.entity;

public class ssTeam implements Team {
	private int win;
	private int lose;
	private int tie;
	private String teamName;
	public ssTeam() {

	}
	@Override
	public int score() {
		return (3 * win) + (tie);
	}

	@Override
	public int rest() {
		return tot_game - (win + lose + tie);
	}

	public ssTeam(String nm, int w, int l, int t) {
		this.teamName = nm;
		this.win = w;
		this.lose = l;
		this.tie = t;
	}

	@Override
	public String getName() {
		return teamName;
	}

}
