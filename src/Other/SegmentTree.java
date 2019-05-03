package other;

import java.util.Scanner;

public class SegmentTree {
	
	public static int[] input = {5,10,11,2,7,9,1};
	public static int[] seg;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = input.length;
		int height = (int) Math.ceil(Math.log(T)/Math.log(2));
		int size = (int) Math.pow(2, height+1);
		size--;
		seg = new int[size];
		
		buildtree(0,0,6);
		
		for (int i=0; i<seg.length; i++) {
			System.out.println(seg[i]);
		}
		
	}
	public static int buildtree(int index, int bi, int ei) {
		if (bi==ei) {
			seg[index] = input[bi];
			return seg[index];
		}
		int mid = (bi+ei)/2;
		seg [index] = buildtree(2*index+1,bi,mid) + buildtree(2*index+2,mid+1,ei);
		return seg[index];
	}
}
