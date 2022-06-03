package com.bb.ui;

import com.bb.entity.Team;

public class inlineTeamConsole implements teamConsole {
	
	private Team team;
	public inlineTeamConsole() {
		
	}
	public inlineTeamConsole(Team team) {
		this.team = team;
	}
	
	@Override
	public void print() {
		System.out.println(team.getName() + "의 승점 : " + team.score() + "\t남은 경기 수 : " + team.rest());
	}

}
