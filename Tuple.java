
public class Tuple {

	private int row, column;
	
	public Tuple(int row, int column){
		this.row = row;
		this.column = column;
	}
	
	public void setRow(int row){
		this.row = row;
	}
	
	public int getRow(){
		return row;
	}
	
	public void setColumn(int column){
		this.column = column;
	}
	
	public int getColumn(){
		return column;
	}
	
	public String toString(){
		return "(" + row + ", " + column + ")";
	}
}
