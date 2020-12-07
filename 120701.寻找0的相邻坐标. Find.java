package java201207;

public class Find {
	void finddZero(int array2d[][]) {
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					System.err.println("R_zero("+column+","+row+")");
				}
				
			}
		}
		
	}
	
	void finddLeft(int array2d[][]) {
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					int LeftX= column-1;
					System.err.println("R_Left("+LeftX+","+row+")");
				}
			   }
			}
		}
		
		void findRight(int array2d[][]) {
			for (int row = 0; row < array2d.length; row++) {
				for (int column = 0; column < array2d[0].length; column++) {
					if (array2d[row][column]==0) {
						int RightX= column+1;
						System.err.println("R_right("+RightX+","+row+")");
					}
					
				}
			}
		
	}
		
		void findUp(int array2d[][]) {
			for (int row = 0; row < array2d.length; row++) {
				for (int column = 0; column < array2d[0].length; column++) {
					if (array2d[row][column]==0) {
						int UpY= row+1;
						System.err.println("R_up("+column+","+UpY+")");
					}
					
				}
			}
		
	}
		
		void findDown(int array2d[][]) {
			for (int row = 0; row < array2d.length; row++) {
				for (int column = 0; column < array2d[0].length; column++) {
					if (array2d[row][column]==0) {
						int DownY= row-1;
						System.err.println("R_down("+column+","+DownY+")");
					}
					
				}
			}
		
	}

}
