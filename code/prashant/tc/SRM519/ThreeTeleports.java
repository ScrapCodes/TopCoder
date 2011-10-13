package prashant.tc.SRM519;

import java.util.List;

import prashant.lib.*;

public class ThreeTeleports {
	public int distance(int x1, int y1, int x2, int y2) {
		int diffx = Math.abs(x2 - x1);
		int diffy = Math.abs(y2 - y1);

		return diffx + diffy;

	}
	Integer[][] dtele=new Integer[3][3];//inter tele dist
	Integer[] dist=new Integer[3]; //dist from both end points
	public int shortestDistance(int xMe, int yMe, int xHome, int yHome,
			String[] teleports) {
		StringUtil s=new StringUtil();
		Integer [][]tlp =new Integer[4][3];
		for(int i=0;i<3;i++){
			List<Long> l1=s.parseArray(teleports[i]);
			tlp[i]=l1.toArray(new Integer[0]);
		}
		//if(distance(xMe, yMe, xHome, yHome)>)
		int min=0;
		for(int i=0;i<3;i++){
			dist[i]=distance(xMe,yMe,tlp[0][i], tlp[1][i])+distance(xHome,yHome,tlp[2][i] , tlp[3][i]);
			if(dist[min]>dist[i]){
				min=i;
			}
		}
		
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
			dtele[i][j]=distance(tlp[2][i], tlp[3][i],tlp[0][j], tlp[1][j]);
		}
		//checking routes via teleports
		
		return Math.min(distance(xMe,yMe,xHome,yHome), mindist(xMe,yMe,xHome,yHome));
	}
	private int mindist(int x1, int y1, int x2, int y2) {
		return y2;
		
	}
}
