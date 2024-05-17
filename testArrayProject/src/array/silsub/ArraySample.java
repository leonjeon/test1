package array.silsub;

import java.util.Random;

public class ArraySample {
	
	Random rd = new Random();
	
	
	public void munjae1() {
		
		//4행 4열 2차원 배열 선언
		int[][] tar = new int[4][4];
		
		//행
		for(int i = 0; i < tar.length - 1; i++) {
			System.out.println(i);
			
			//열
			for(int j = 0; j < tar[i].length - 1; j++) {
				tar[i][j] = rd.nextInt(100) + 1;
				//System.out.print(" " + tar[i][j]);
				
				tar[i][3] += tar[i][j];
				tar[3][j] += tar[i][j];
				tar[3][3] += tar[i][j];
				
			
				
			}//for
			System.out.println();
		}//for
		
	}//munjae1

}//class
