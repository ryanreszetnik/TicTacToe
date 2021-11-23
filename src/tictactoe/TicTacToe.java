package tictactoe;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int numturns = 0;

		boolean lose = false;
		boolean win = false;
		boolean tie = false;

		boolean full1 = false;
		boolean full2 = false;
		boolean full3 = false;
		boolean full4 = false;
		boolean full5 = false;
		boolean full6 = false;
		boolean full7 = false;
		boolean full8 = false;
		boolean full9 = false;

		String sq1 = " ";
		String sq2 = " ";
		String sq3 = " ";
		String sq4 = " ";
		String sq5 = " ";
		String sq6 = " ";
		String sq7 = " ";
		String sq8 = " ";
		String sq9 = " ";

		double square1 = 0.114;
		double square2 = 0.0114;
		double square3 = 0.123;
		double square4 = 0.0123;
		double square5 = 0.2;
		double square6 = 0.0132;
		double square7 = 0.132;
		double square8 = 0.0141;
		double square9 = 0.141;

		boolean[] fullsquare = new boolean[10];
		fullsquare[1] = full1;
		fullsquare[2] = full2;
		fullsquare[3] = full3;
		fullsquare[4] = full4;
		fullsquare[5] = full5;
		fullsquare[6] = full6;
		fullsquare[7] = full7;
		fullsquare[8] = full8;
		fullsquare[9] = full9;

		String[] squareMessage = new String[10];

		double[] squarevalue = new double[10];

		System.out.println("[1]" + "[2]" + "[3]\n[4]" + "[5]" + "[6]\n[7]" + "[8]" + "[9]");
		System.out.println("You are \"x\" and computer is \"o\"");
		while (win == false && tie == false && lose == false) {

			System.out.print("Please enter a number: ");
			int square = sc.nextInt();
			boolean squarefull = false;

			for (int i = 1; i < 10; i++) {
				if (square == i && fullsquare[i] == true) {
					squarefull = true;
				}
			}

			if (squarefull == false && square <= 9 && square >= 1) {
				// will only run if square is not taken and value is within the
				// 1-9
				// next blocks of code puts x in the box chosen
				if (square == 1) {
					sq1 = "x";
					full1 = true;
					square1 += 1;
				} else if (square == 2) {
					sq2 = "x";
					full2 = true;
					square2 += 1;
				} else if (square == 3) {
					sq3 = "x";
					full3 = true;
					square3 += 1;
				} else if (square == 4) {
					sq4 = "x";
					full4 = true;
					square4 += 1;
				} else if (square == 5) {
					sq5 = "x";
					full5 = true;
					square5 += 1;
				} else if (square == 6) {
					sq6 = "x";
					full6 = true;
					square6 += 1;
				} else if (square == 7) {
					sq7 = "x";
					full7 = true;
					square7 += 1;
				} else if (square == 8) {
					sq8 = "x";
					full8 = true;
					square8 += 1;
				} else if (square == 9) {
					sq9 = "x";
					full9 = true;
					square9 += 1;
				}

				// =====================================================================================
				// Start of Computer

				double combo1 = square1 + square2 + square3;
				double combo2 = square4 + square5 + square6;
				double combo3 = square7 + square8 + square9;
				double combo4 = square1 + square5 + square9;
				double combo5 = square3 + square5 + square7;
				double combo6 = square1 + square4 + square7;
				double combo7 = square2 + square5 + square8;
				double combo8 = square3 + square6 + square9;

				if (square1 > 1 && square9 > 1 || square3 > 1 && square7 > 1) {

				}

				if (combo1 >= 3 || combo2 >= 3 || combo3 >= 3 || combo4 >= 3 || combo5 >= 3 || combo6 >= 3
						|| combo7 >= 3 || combo8 >= 3) {
					System.out.println("You Win!");
					win = true;
				}

				// checks if all squares are full and no one won.. therefore it
				// is a tie
				else if (win == false && full1 == true && full2 == true && full3 == true && full4 == true
						&& full5 == true && full6 == true && full7 == true && full8 == true && full9 == true) {
					System.out.println("Tie!");
					tie = true;
				}

				if (win == false && tie == false) {

					// does not allow computer to play in a place that is
					// already played in
					if (full1 && full2 && full3 == true) {
						combo1 = 0;
					}
					if (full4 && full5 && full6 == true) {
						combo2 = 0;
					}
					if (full7 && full8 && full9 == true) {
						combo3 = 0;
					}
					if (full1 && full5 && full9 == true) {
						combo4 = 0;
					}
					if (full3 && full5 && full7 == true) {
						combo5 = 0;
					}
					if (full1 && full4 && full7 == true) {
						combo6 = 0;
					}
					if (full2 && full5 && full8 == true) {
						combo7 = 0;
					}
					if (full3 && full6 && full9 == true) {
						combo8 = 0;
					}
					// --------------

					if (numturns == 1 && square1 >= 1 && square5 <= 0 && square9 >= 1
							|| numturns == 1 && square3 >= 1 && square5 <= 0 && square7 >= 1) {
						System.out.println("defended");
						squareMessage[2] = "o";
						fullsquare[2] = true;
						squarevalue[2] -= 1;
						sq2 = "o";
						System.out.println("Square played: 2");

					} else {

						double MaxCombo = Math.max(combo1, Math.max(combo2, Math.max(combo3,
								Math.max(combo4, Math.max(combo5, Math.max(combo6, Math.max(combo7, combo8)))))));
						double MinCombo = Math.min(combo1, Math.min(combo2, Math.min(combo3,
								Math.min(combo4, Math.min(combo5, Math.min(combo6, Math.min(combo7, combo8)))))));

						double ComputerCombo;
						if (MinCombo <= -1) {
							ComputerCombo = MinCombo;
						} else {
							ComputerCombo = MaxCombo;
						}

						double firstsquare = 0;
						double secondsquare = 0;
						double thirdsquare = 0;
						int squarenumber1 = 0;
						int squarenumber2 = 0;
						int squarenumber3 = 0;

						if (ComputerCombo == combo1) {
							firstsquare = square1;
							secondsquare = square2;
							thirdsquare = square3;
							squarenumber1 = 1;
							squarenumber2 = 2;
							squarenumber3 = 3;
						//	System.out.println("Combo 1");
						} else if (ComputerCombo == combo2) {
							firstsquare = square4;
							secondsquare = square5;
							thirdsquare = square6;
							squarenumber1 = 4;
							squarenumber2 = 5;
							squarenumber3 = 6;
						//	System.out.println("Combo 2");
						} else if (ComputerCombo == combo3) {
							firstsquare = square7;
							secondsquare = square8;
							thirdsquare = square9;
							squarenumber1 = 7;
							squarenumber2 = 8;
							squarenumber3 = 9;
						//	System.out.println("Combo 3");
						} else if (ComputerCombo == combo4) {
							firstsquare = square1;
							secondsquare = square5;
							thirdsquare = square9;
							squarenumber1 = 1;
							squarenumber2 = 5;
							squarenumber3 = 9;
						//	System.out.println("Combo 4");
						} else if (ComputerCombo == combo5) {
							firstsquare = square3;
							secondsquare = square5;
							thirdsquare = square7;
							squarenumber1 = 3;
							squarenumber2 = 5;
							squarenumber3 = 7;
						//	System.out.println("Combo 5");
						} else if (ComputerCombo == combo6) {
							firstsquare = square1;
							secondsquare = square4;
							thirdsquare = square7;
							squarenumber1 = 1;
							squarenumber2 = 4;
							squarenumber3 = 7;
						//	System.out.println("Combo 6");
						} else if (ComputerCombo == combo7) {
							firstsquare = square2;
							secondsquare = square5;
							thirdsquare = square8;
							squarenumber1 = 2;
							squarenumber2 = 5;
							squarenumber3 = 8;
						//	System.out.println("Combo 7");
						} else if (ComputerCombo == combo8) {
							firstsquare = square3;
							secondsquare = square6;
							thirdsquare = square9;
							squarenumber1 = 3;
							squarenumber2 = 6;
							squarenumber3 = 9;
						//	System.out.println("Combo 8");
						} else {
							System.out.println("ERROR");
						}

						fullsquare[1] = full1;
						fullsquare[2] = full2;
						fullsquare[3] = full3;
						fullsquare[4] = full4;
						fullsquare[5] = full5;
						fullsquare[6] = full6;
						fullsquare[7] = full7;
						fullsquare[8] = full8;
						fullsquare[9] = full9;

						squareMessage[1] = sq1;
						squareMessage[2] = sq2;
						squareMessage[3] = sq3;
						squareMessage[4] = sq4;
						squareMessage[5] = sq5;
						squareMessage[6] = sq6;
						squareMessage[7] = sq7;
						squareMessage[8] = sq8;
						squareMessage[9] = sq9;

						squarevalue[1] = square1;
						squarevalue[2] = square2;
						squarevalue[3] = square3;
						squarevalue[4] = square4;
						squarevalue[5] = square5;
						squarevalue[6] = square6;
						squarevalue[7] = square7;
						squarevalue[8] = square8;
						squarevalue[9] = square9;

						// will check if the squares are full and if they are,
						// it
						// will subtract
						// 5 to their priority making them lower than ones that
						// are
						// empty
						double firstsquarecopy = firstsquare;
						double secondsquarecopy = secondsquare;
						double thirdsquarecopy = thirdsquare;
						int squareplayed;

						if (fullsquare[squarenumber1] == true) {
							firstsquarecopy -= 5;
						}
						if (fullsquare[squarenumber2] == true) {
							secondsquarecopy -= 5;
						}
						if (fullsquare[squarenumber3] == true) {
							thirdsquarecopy -= 5;
						}
						// finds the max of those three (max will be empty)
						double MaxCombo1 = Math.max(firstsquarecopy, Math.max(secondsquarecopy, thirdsquarecopy));
						// checks if the square is the max and then plays in it,
						// sets it to full
						// and sets the value of the square to -1
						if (firstsquarecopy == MaxCombo1) {
							squareMessage[squarenumber1] = "o";
							fullsquare[squarenumber1] = true;
							squareplayed = squarenumber1;
							squarevalue[squarenumber1] -= 1;
						//	System.out.println("Square played: " + squarenumber1);
						} else if (secondsquarecopy == MaxCombo1) {
							squareMessage[squarenumber2] = "o";
							fullsquare[squarenumber2] = true;
							squareplayed = squarenumber2;
							squarevalue[squarenumber2] -= 1;
						//	System.out.println("Square played: " + squarenumber2);
						} else if (thirdsquarecopy == MaxCombo1) {
							squareMessage[squarenumber3] = "o";
							fullsquare[squarenumber3] = true;
							squareplayed = squarenumber3;
							squarevalue[squarenumber3] -= 1;
						//	System.out.println("Square played: " + squarenumber3);
						} else {
							System.out.println("ERROR");
						}

						// does the opposite as before and puts the new
						// variables
						// into the
						// different places
						if (ComputerCombo == combo1) {
							square1 = firstsquare;
							square2 = secondsquare;
							square3 = thirdsquare;
							full1 = fullsquare[squarenumber1];
							full2 = fullsquare[squarenumber2];
							full3 = fullsquare[squarenumber3];
							sq1 = squareMessage[squarenumber1];
							sq2 = squareMessage[squarenumber2];
							sq3 = squareMessage[squarenumber3];
						//	System.out.println("Combo 1#2");

						} else if (ComputerCombo == combo2) {
							square4 = firstsquare;
							square5 = secondsquare;
							square6 = thirdsquare;
							full4 = fullsquare[squarenumber1];
							full5 = fullsquare[squarenumber2];
							full6 = fullsquare[squarenumber3];
							sq4 = squareMessage[squarenumber1];
							sq5 = squareMessage[squarenumber2];
							sq6 = squareMessage[squarenumber3];
						//	System.out.println("Combo 2#2");
						} else if (ComputerCombo == combo3) {
							square7 = firstsquare;
							square8 = secondsquare;
							square9 = thirdsquare;
							full7 = fullsquare[squarenumber1];
							full8 = fullsquare[squarenumber2];
							full9 = fullsquare[squarenumber3];
							sq7 = squareMessage[squarenumber1];
							sq8 = squareMessage[squarenumber2];
							sq9 = squareMessage[squarenumber3];
							//System.out.println("Combo 3#2");
						} else if (ComputerCombo == combo4) {
							square1 = firstsquare;
							square5 = secondsquare;
							square9 = thirdsquare;
							full1 = fullsquare[squarenumber1];
							full5 = fullsquare[squarenumber2];
							full9 = fullsquare[squarenumber3];
							sq1 = squareMessage[squarenumber1];
							sq5 = squareMessage[squarenumber2];
							sq9 = squareMessage[squarenumber3];
						//	System.out.println("Combo 4#2");
						} else if (ComputerCombo == combo5) {
							square3 = firstsquare;
							square5 = secondsquare;
							square7 = thirdsquare;
							full3 = fullsquare[squarenumber1];
							full5 = fullsquare[squarenumber2];
							full7 = fullsquare[squarenumber3];
							sq3 = squareMessage[squarenumber1];
							sq5 = squareMessage[squarenumber2];
							sq7 = squareMessage[squarenumber3];
							//System.out.println("Combo 5#2");
						} else if (ComputerCombo == combo6) {
							square1 = firstsquare;
							square4 = secondsquare;
							square7 = thirdsquare;
							full1 = fullsquare[squarenumber1];
							full4 = fullsquare[squarenumber2];
							full7 = fullsquare[squarenumber3];
							sq1 = squareMessage[squarenumber1];
							sq4 = squareMessage[squarenumber2];
							sq7 = squareMessage[squarenumber3];
							//System.out.println("Combo 6#2");
						} else if (ComputerCombo == combo7) {
							square2 = firstsquare;
							square5 = secondsquare;
							square8 = thirdsquare;
							full2 = fullsquare[squarenumber1];
							full5 = fullsquare[squarenumber2];
							full8 = fullsquare[squarenumber3];
							sq2 = squareMessage[squarenumber1];
							sq5 = squareMessage[squarenumber2];
							sq8 = squareMessage[squarenumber3];
							//System.out.println("Combo 7#2");
						} else if (ComputerCombo == combo8) {
							square3 = firstsquare;
							square6 = secondsquare;
							square9 = thirdsquare;
							full3 = fullsquare[squarenumber1];
							full6 = fullsquare[squarenumber2];
							full9 = fullsquare[squarenumber3];
							sq3 = squareMessage[squarenumber1];
							sq6 = squareMessage[squarenumber2];
							sq9 = squareMessage[squarenumber3];
							//System.out.println("Combo 8#2");
						} else {
							System.out.println("ERROR");
						}

						square1 = squarevalue[1];
						square2 = squarevalue[2];
						square3 = squarevalue[3];
						square4 = squarevalue[4];
						square5 = squarevalue[5];
						square6 = squarevalue[6];
						square7 = squarevalue[7];
						square8 = squarevalue[8];
						square9 = squarevalue[9];

						// re calculates all the winning combos
						combo1 = square1 + square2 + square3;
						combo2 = square4 + square5 + square6;
						combo3 = square7 + square8 + square9;
						combo4 = square1 + square4 + square7;
						combo5 = square2 + square5 + square8;
						combo6 = square3 + square6 + square9;
						combo7 = square1 + square5 + square9;
						combo8 = square3 + square5 + square7;
						// makes sure no one has won or tied, then checks if any
						// combos are under 2 (computer won) and will say you
						// lose

						// ==========================================================================================
						// Checks if game is over

						if (combo1 >= 3 || combo2 >= 3 || combo3 >= 3 || combo4 >= 3 || combo5 >= 3 || combo6 >= 3
								|| combo7 >= 3 || combo8 >= 3) {
							System.out.println("You Win!");
							win = true;
						} else if (win == false && tie == false && (combo1 < -2 || combo2 < -2 || combo3 < -2
								|| combo4 < -2 || combo5 < -2 || combo6 < -2 || combo7 < -2 || combo8 < -2)) {
							System.out.println("You Lose!");
							lose = true;
						}

						// checks if all squares are full and no one won..
						// therefore
						// it is a tie
						else if (win == false && full1 == true && full2 == true && full3 == true && full4 == true
								&& full5 == true && full6 == true && full7 == true && full8 == true && full9 == true) {
							System.out.println("Tie!");
							tie = true;
						}

					}
					numturns++;
					// ==========================================================================================
					// prints out the updated board
					System.out.println("[" + sq1 + "]" + "[" + sq2 + "]" + "[" + sq3 + "]\n[" + sq4 + "]" + "[" + sq5
							+ "]" + "[" + sq6 + "]\n[" + sq7 + "]" + "[" + sq8 + "]" + "[" + sq9 + "]");
					
				}

			}

		}
		System.out.println("Game Over");
	}
}