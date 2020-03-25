package eLuoSiFangKuai;

import java.awt.image.BufferedImage;

public class Cell {
		private int row;
		private int col;
		private BufferedImage image;
		
		@Override
		public String toString() {
			return "(" + row + ", " + col + ")";
		}
	 
		public int getRow() {
			return row;
		}
	 
		public void setRow(int row) {
			this.row = row;
		}
	 
		public int getCol() {
			return col;
		}
	 
		public void setCol(int col) {
			this.col = col;
		}
	 
		public BufferedImage getImage() {
			return image;
		}
	 
		public void setImage(BufferedImage image) {
			this.image = image;
		}
	 
		public Cell() {}
		
		public Cell(int row, int col, BufferedImage image) {
			this.row = row;
			this.col = col;
			this.image = image;
		}
		
		/*向左移动*/
		public void left() {
			col--;
		}
		/*向右移动*/
		public void right() {
			col++;
		}
		/*向下移动*/
		public void drop() {
			row++;
		}
}
