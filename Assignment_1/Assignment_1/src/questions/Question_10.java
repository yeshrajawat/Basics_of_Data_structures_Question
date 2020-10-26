package questions;

import java.util.Scanner;

public class Question_10 {
	static void matrix_multiplication(int row1, int column1, int[][] mat1,int row2, int column2, int[][] mat2)
	{
		int mat_1_row = row1, mat_1_column = column1;
        int mat_2_row = row2, mat_2_column = column2;
        int[][] firstMatrix = mat1;
        int[][] secondMatrix = mat2;

        // Mutliplying Two matrices
        int[][] product = new int[mat_1_row][mat_2_column];
        for(int i = 0; i < mat_1_row; i++) {
            for (int j = 0; j < mat_2_column; j++) {
                for (int k = 0; k < mat_1_column; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        // Displaying the result
        System.out.println("Sum of two matrices is: ");
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
	}
	
	public static void main(String ... args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of row of matrix1: ");
		int row_1 = scan.nextInt();
		System.out.print("Enter the size of row of matrix1: ");
		int col_1 = scan .nextInt();
		System.out.println("Enter the elements into matrix");
		int [][] mat_1 = new int[row_1][col_1]; 
		for(int i=0;i<row_1;i++)
		{
			for(int j=0;j<col_1;j++)
			{
				mat_1[i][j] = scan.nextInt();
			}
		}
		 
		
		while(true) 
		{
			System.out.print("Enter the size of row of matrix2: ");
			int row_2 = scan.nextInt();
			System.out.print("Enter the size of row of matrix1: ");
			int col_2 = scan .nextInt();
			int [][] mat_2 = new int[row_2][col_2];
		
			if(col_1==row_2)
			{	
				System.out.println("Enter the elements into matrix");
				
				for(int i=0;i<row_2;i++)
				{
					for(int j=0;j<col_2;j++)
					{
						mat_2[i][j] = scan.nextInt();
					}
					
				}
				matrix_multiplication(row_1, col_1, mat_1, row_2, col_2, mat_2);
					break;
			}
			else
			{
				System.out.println("Size of matrix for multipilcation is not correct!!!(column of matrix 1 should be equal to rowof matrix 2");
				System.out.println("Enter the size again");
			}
		}
		
	
	
	scan.close();}
	
}
	


