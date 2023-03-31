import java.util.Scanner;
public class Chess{
	public static void main(String[] args){
		Game game= new Game(1, 2);
		game.view();
	}
}
class Game{
	char board[][]=new char[8][8];
	int p1,p2;
	Scanner scan = new Scanner(System.in);
	Piece k = new King();
	Piece q = new Queen();
	Piece b = new Bishop();
	Piece h = new Knight();
	Piece r = new Rook();
	Piece p = new Pawn();
	public Game(int p1,int p2){
		this.p1=p1;
		this.p2=p2;
		int i,j,l;
		char k;
		for(i=2;i<6;i++)
			for(j=0;j<8;j++)
				board[i][j]='.';
		for(i=1,k=80;i<8;i+=5,k+=32)
			for(j=0;j<8;j++)
				board[i][j]=k;
		String s="RHBKQBHRrhbkqbhr";
		char[] c=s.toCharArray();
		for(i=0,l=0;i<8;i+=7)
			for(j=0;j<8;j++,l++)
				board[i][j]=s.charAt(l);
	}
	public void view(){
		System.out.println("  0 1 2 3 4 5 6 7");
		for(int i=0;i<8;i++){
			System.out.print(i+" ");
			for(int j=0;j<8;j++){
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void play(){
		int i,j;
		char l;
		view();
		do{
			System.out.println("Player "+p1+" chance(Enter row and column : ");
			i=scan.nextInt();
			j=scan.nextInt();
			do{
				l=scan.next().charAt(0)
			}while(met(l));
		}while();
		
	}
	public boolean met(char l){
		if(l=='K' || l=='k')
			k.movement();
		else if(l=='Q' || l=='q')
			q.movement();
		else if(l=='B' || l=='B')
			b.movement();
		else if(l=='H' || l=='h')
			h.movement();
		else if(l=='R' || l=='r')
			r.movement();
		else if(l=='P' || l=='p')
			p.movement();
		else{
			System.out.println("Enter the correct Piece");
			return true;
		}
	}
}
abstract class Piece extends Game{
	public abstract void move();
	public void movement(){
		move();
	}
	public void find(int a, int b){
		for(int x=0;x<8;x++){
			for(y=0;y<8;y++){
				if(board[x][y]==k){
					a=x,b=y;
					return;
				}
			}
		}			
	}
	public boolean check(int a, int b){
		if((a-1)>=0 && (a+1)<8 && (b-1)>=0 && (b+1)<8)
			return true;
		return false;
	}
}
class King extends Piece{
	public void move(char k, int i, int j){
		int a=0,b=0;
		find(a,b);
		if(check(a,b) && (a+1
					
	}
}
class Queen extends Piece{

}
class Bishop extends Piece{

}
class Knight extends Piece{

}
class Rook extends Piece{

}
class Pawn extends Piece{

}
interface Diagonal{
	public void moveDiagonal();
}
interface Straight{
	public void moveStraight();
}
interface Lshape{
	public void moveLshape();
}
interface Onestep{
	public void moveOneStep();	
}