package test;

import java.io.File;
import java.util.Scanner;

public class billboard {
	public static void main(String[] args) throws Exception{
		Scanner f = new Scanner(new File("billboard.in"));
		point a1 = new point(f.nextInt(), f.nextInt());
		point a2 = new point(f.nextInt(), f.nextInt());

		point b1 = new point(f.nextInt(), f.nextInt());
		point b2 = new point(f.nextInt(), f.nextInt());
		
		point c1 = new point(f.nextInt(), f.nextInt());
		point c2 = new point(f.nextInt(), f.nextInt());
		
		System.out.println(area(a1, a2,c1, c2) +area(b1, b2, c1, c2));
	}
	public static int areaH(point a, point b) {
		return (a.x - b.x)* (a.y-b.y);
	
	}
	public static int area(point a1, point a2, point b1, point b2) {
		int out = areaH(a1, a2);
		System.out.println(out);
		int blockArea = 0;
		int xLeft = Math.max(a1.x, b1.x);
		int xRight = Math.min(a2.x, b2.x);
		int yBot = Math.max(a1.y, b1.y);
		int yTop = Math.min(a2.y, a2.y);
		point p = new point(xLeft, yBot);
		point p1 = new point(xRight, yTop);
		System.out.println(areaH(p, p1));
		if(xLeft < xRight && yBot < yTop) {
			blockArea = areaH(p, p1);
		}
		return out - blockArea;
	}
}



class point{
	int x, y;
	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {return x;}
	public int getY() {return y;}
	public String toString() {
		return x+ ", " +y;

	}
}