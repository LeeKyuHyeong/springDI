package com.bb.ui;

import com.bb.entity.Team;

public class revertTeamConsole implements teamConsole {
	private Team team;
	
	public revertTeamConsole() {
		
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	@Override
	public void print() {
		try {
			if(team.getName() == null) {
				System.out.printf("남은 경기 수 : %d\t 승점 : %d", team.rest(), team.score());			
			} else {
				System.out.printf("%s의 남은 경기 수 : %d\t 승점 : %d", team.getName(), team.rest(), team.score());			
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
