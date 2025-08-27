//Wall problem
package com.practisetest.practise5july;

public class WallProblem {

	public static void main(String[] args) {
		int[] Height= {10,1,6,6,2,5,4,8,3,1};
		int maxArea=0;
		for(int i=0;i<Height.length;i++) {
			for(int j=1;j<Height.length;j++) {
				int minheight=Math.min(Height[i],Height[j]);
				int diff=Math.abs(i-j);
				int area=minheight*diff;
				if(area>maxArea) {
					maxArea=area;
				}
			}
		}
		System.out.println("Maximum Area bewteen two is "+maxArea);
	}
}
