
package TicTacToe;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        char [][]g_boards={
	            {' ','|',' ','|',' '},
	            {'_','|','_','|','_'},
	            {' ','|',' ','|',' '},
	            {'_','|','_','|','_'},
	            {' ','|',' ','|',' '}
	        } ;
	        print_board(g_boards);
	    }
	    static void print_board(char [][]g_boards){
	        for(int r=0;r<g_boards[0].length; r++){
	            for(int c=0;c<g_boards[0].length; c++){
	                System.out.print(g_boards[r][c]);
	            }
	            System.out.println();
	        }

	}
	    
	    static void p_holder(char [][]g_board,int pos,String user) {
	    	char sym='X';
	    	if(user.equals("You")) {
	    		sym='X';
	    		//Comment
	    	}
	    	else if(user.equals("Comp")) {
	    		sym='X';
	    		//Comment
	    	}
	    	switch(pos) {
	    	case 1:
	    		g_board[0][0]=sym;
	    		break;
	    	case 2:
		    	g_board[0][2]=sym;
		    	break;
	    	case 3:
		    	g_board[0][4]=sym;
		    	break;
	    	case 4:
		    	g_board[2][0]=sym;
		    	break;
	    	case 5:
		    	g_board[2][2]=sym;
		    	break;
	    	case 6:
		    	g_board[2][4]=sym;
		    	break;
	    	case 7:
		    	g_board[4][0]=sym;
		    	break;
	    	case 8:
		    	g_board[4][2]=sym;
		    	break;
	    	case 9:
		    	g_board[4][4]=sym;
		    	break;
		    	
		    	default:
		    		System.out.println("Invalid Input");
	    	}
	    	print_board(g_board);
	    }

}
