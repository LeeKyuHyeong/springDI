package com.bb;

import com.bb.entity.ssTeam;
import com.bb.entity.Team;
import com.bb.ui.inlineTeamConsole;
import com.bb.ui.revertTeamConsole;
import com.bb.ui.teamConsole;

public class bb_player {
	public static void main(String[] args) {
		
		Team team = new ssTeam();
		
		//teamConsole console =  new inlineTeamConsole(team);
		teamConsole console =  new revertTeamConsole();
		//console.setTeam(team);
		console.print();
		
		
	}
}
