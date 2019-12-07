package com.ooad.proj;

public class ShortestPathFinder2 {
	
	public static int part1(int goal) {
		int x, y, dx, dy, step, dxtmp;
		x = y = dx = step = 0;
		dy = -1;
		int iteration  = 0;
		
		for(;;) {			
			System.out.println("\n\nIteration   :  "+(iteration += 1));			
			System.out.println("Step  : " +step);
			step += 1;
			System.out.println("Step " +step  + "    and goal : " +goal);
			if(goal == step) {
				System.out.println(" x : " +x +"y :" +y);
				System.out.println("Returning value :" +( Math.abs(x) + Math.abs(y)));
				return Math.abs(x) + Math.abs(y);
			}

			System.out.println("X :  " +x + "  Y : "+y );
			if(x == y || x < 0 && x == -y || x > 0 && x == 1 - y) {
				System.out.println("Before values assignment");
				System.out.println("  dx : "+dx +"  dy: "+dy);
				
				dxtmp = dx;
				dx = -dy;
				dy = dxtmp;
				
				System.out.println("After values assignment");
				System.out.println("  dx : "+dx +"  dy: "+dy);
			}		
			x += dx; 
			y += dy;
			System.out.println("x = "+x  +" and y = " +y);
			
		}
	}
		
	public static void main(String[] args) {
			
		int numMatrix = 10;
		System.out.println("Total no of steps required to reach the base square : "+part1(numMatrix));
	}
}