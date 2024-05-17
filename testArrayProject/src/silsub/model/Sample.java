package silsub.model;

import java.util.Random;
import java.util.Scanner;

/**
 * 2차원 배열 실습문제 풀이용 클래스이다.
 * 3개의 문제를 3개의 메소드로 작성해서 제공하고 있다.
 * 	 */

public class Sample {
	
		/**
		 * 문제 실행시 사용할 키보드 입력용 필드이다.
		 */
	
		private Scanner sc = new Scanner(System.in);
		
		/**
		 * Sample 클래스의 기본 생성자이다.
		 */
		public Sample() {}
		
		/**
		 *  1. 4행4열 2차원배열 선언 및 생성
			2. 0행0열부터 2행2열까지 1부터 100사이의 임의의 정수값 기록해 넣음
			3. 아래의 내용처럼 처리함
			
				0열	1열	2열	3열	
			0행	값	값	값 	0행 값들의 합계
			1행	값	값	값	1행 값들의 합계
			2행	값	값	값	2행 값들의 합계
			3행	0열합계	1열합계	2열합계	가로+세로합계
		 */
		
		public void munjae1() {
			int[][] matrix = new int[4][4];
			
			//0행0열부터 2행2열까지 1부터 100사이의 임의의 정수값 기록해 넣음
			for(int i = 0; i < 3; i++) {
				
				//각 행에대한 열값
				for(int j = 0; j < 3; j++) {
					matrix[i][j] = (int)(Math.random() * 100) + 1;
				}//for
			}//for
			
			//가로 행 합계, 세로 열 합계, 총 합게 : 가로합 + 세로합
			for(int i = 0; i < matrix.length - 1; i++) {
				for(int j = 0; j < matrix[i].length - 1; j++) {
					//가로합계
					matrix[i][3] += matrix[i][j];
					
					//세로합계
					matrix[3][i] += matrix[j][i];
					
				}//for
				matrix[3][3] += matrix[i][3] + matrix[3][i];
			}//for
			
			//최종 콘솔 출력확인
			for(int i = 0; i < matrix.length; i++) {
				for(int j = 0; j < matrix.length; j++) {
					//System.out.print(matrix[i][j] + "  ");
					System.out.printf("%7d", matrix[i][j]);
				}//for
				System.out.println();
			}//for
			
		}//munjae
		
		//코드 수 줄인 답
		public void munjae1_1() {
			int[][] matrix = new int[4][4];
			
			//0행0열부터 2행2열까지 1부터 100사이의 임의의 정수값 기록해 넣음
			for(int i = 0; i < 3; i++) {
				
				//각 행에대한 열값
				for(int j = 0; j < 3; j++) {
					matrix[i][j] = (int)(Math.random() * 100) + 1;
					matrix[i][3] += matrix[i][j]; 	//가로합계
					matrix[3][j] += matrix[i][j];	//세로합계
					matrix[3][3] += matrix[i][j] * 2; //총합계
					
				}//for
				
			}//for

			//최종 콘솔 출력확인
			for(int i = 0; i < matrix.length; i++) {
				for(int j = 0; j < matrix.length; j++) {
					//System.out.print(matrix[i][j] + "  ");
					System.out.printf("%7d", matrix[i][j]);
				}//for
				System.out.println();
			}//for
		}//munjae1_1
		
		
		
		/**
		1. 3행짜리 2차원배열 선언 및 생성
		2. 각 행별 열갯수는 키보드로 입력받아 생성함
		3. 1~100사이의 임의의 정수를 모든 방에 기록함
		4. 각 행별 열의 합계가 5의 배수인 행열값만 출력함
		**/
		public void munjae2() {
			int[][] tar = new int[3][];
			int[] sum = new int[3];
			
			for(int i = 0; i < tar.length; i++) {
				System.out.print(i + "행의 열갯수 : ");
				tar[i] = new int[sc.nextInt()];
				//1~100사이의 정수 기록
				for(int j = 0; j < tar[i].length; j++) {
					tar[i][j] = (int)(Math.random() * 100) + 1; 
					sum[i] += tar[i][j];
				}//for
			}//for
			
			//각 행별 열의 합계가 5의 배수인 행열값만 출력함
			for(int i = 0; i < tar.length; i++) {
				if(sum[i] % 5 == 0) {
					System.out.print(i + "행 : ");
					for(int j = 0; j < tar[i].length; j++) {
						System.out.printf("%-7d", tar[i][j]);
					}
					System.out.println();
				}//if
			}
		}//munjae2
		
		public void munjae4() {
			// 1. 7행 7열짜리 2차원 정수배열 선언 및 생성
			// 2. 0열 : 학생번호, 1열 : 국어점수, 2열 : 수학점수, 3열 : 영어점수, 4열 : 총점,
			// 		5열 : 평균, 6열 : 등수 가 기록되게 함
			// 3. 6명의 학생번호, 3과목의 점수는 키보드로 입력받아 기록되게 함
			//		총점과 평균은 입력과 동시에 계산 처리해서 기록되게 함.
			// 4. 6행 1열 : 국어 전체 평균
			//	  6행 2열 : 영어 전체 평균
			//	  6행 3열 : 수학 전체 평균 기록 처리함 => 새로열 합계/6
			// 5. 6명의 평균을 가지고 등수 처리함.
			// ==> 힌트 : 자신을 1등으로 지정함
			//			  다른 학생들의 평균값과 자신의 평균을 비교함
			//			  자신의 평균값이 크면, 등수를 1증가 처리함.
			// 6. 각 행별 열의 모든 값들을 출력함.
			
			//2차원 정수배열 선언 및 생성 단계
			
			
		
			//7행 7열 정리
			int[][] score = new int[7][7];
			
			//학생번호,국어,영어,수학 키보드로 입력해야되니 선언
			for(int i = 0; i < score.length - 1; i++) {
				System.out.print("학생번호 : ");
				score[i][0] = sc.nextInt();
				System.out.print("국어 : ");
				score[i][1] = sc.nextInt();
				System.out.print("영어 : ");
				score[i][2] = sc.nextInt();
				System.out.print("수학 : ");
				score[i][3] = sc.nextInt();
				
				
				//
				for(int j = 1; j < score[i].length - 3; j++) {
					score[i][4] += score[i][j]; //학생 총점 계산
				}//for
				score[i][5] = score[i][4] / 3; //학생 평균 계산
			}//for
			
			
			//과목별 평균 계산 값
			int korTot = 0, engTot = 0, matTot = 0;
			for(int k = 0; k < score.length - 1; k++) {
				korTot += score[k][1]; //국어총점
				engTot += score[k][2]; //영어총점
				matTot += score[k][3]; //수학총점
			}
			
			score[6][1] = korTot / 6;
			score[6][2] = engTot / 6;
			score[6][3] = matTot / 6;
			
			
			//등수 처리
			for(int i = 0; i < score.length - 1; i++) {
				score[i][6] = 1; //등수 지정 : 자신을 1등으로 지정함
				for(int j = 0; j < score[i].length; j++) {
					if(score[i][5] < score[j][5]) //자신의 평균이 다른 평균보다 작으면
						score[i][6]++;
						
				}
			}
			
			//출력 확인
			System.out.printf("%4s%4s%4s%4s%4s%4s%4s \n",
					"번호", "국어", "영어", "수학", "총점", "평균", "등수");
			for(int i = 0; i < score.length; i++) {
				for (int j = 0; j < score[i].length; j++)
					System.out.printf("%5d", score[i][j]);
				System.out.println();
			}
			
			
		}//munjae


































}//class



























