package java201207;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  int [][] array2d= { 
				  {1,2,3,4,5}, 
				  {4,5,2,1,2}, 
				  {7,8,1,0,6} ,
				  {7,8,6,5,4,3} 
				  }; 
		
		  Find find=new Find(); 
		  find.finddZero(array2d); 
		  find.finddLeft(array2d);
		  find.findRight(array2d);
		  find.findUp(array2d);
		  find.findDown(array2d);
		 
		   
		 
		 
	}

}
