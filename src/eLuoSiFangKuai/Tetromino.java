package eLuoSiFangKuai;

import java.util.Arrays;


public class Tetromino {
	
		protected Cell[] cells=new Cell[4];
		
		/*四格方块向左移动*/
		public void moveLeft() {
			for(Cell c:cells)
				c.left();
		}
		/*四格方块向右移动*/
		public void moveRight() {
			for(Cell c:cells)
				c.right();
		}
		/*四格方块向下移动*/
		public void softDrop() {
			for(Cell c:cells)
				c.drop();
		}
		@Override
		public String toString() {
			return "[" + Arrays.toString(cells) + "]";
		}
		
		public static Tetromino randomOne() {
			Tetromino t = null;
			int num=(int)(Math.random()*7);
			switch (num) {
			case 0:t=new T();break;
			case 1:t=new O();break;
			case 2:t=new I();break;
			case 3:t=new J();break;
			case 4:t=new L();break;
			case 5:t=new S();break;
			case 6:t=new Z();break;
			}
			return t;
		}
		
		public Cell[] spin() {
			if(this.getClass().equals(new O().getClass()))
				return null;
			Cell[] iCells = new Cell[4];
			int iRow = this.cells[2].getRow();
			int iCol = this.cells[2].getCol();
			for(int i = 0;i<this.cells.length;i++) {
				int nRow = this.cells[i].getRow();
				int nCol = this.cells[i].getCol();
				
				iCells[i] = new Cell(iRow-iCol+nCol,iRow+iCol-nRow,this.cells[i].getImage());
				
			}
			return iCells;
		}

}
