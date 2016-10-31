package pkgSerial;

import java.io.Serializable;

public class Rectangle implements Serializable {

	/**
	 * 
	 */

	private int iWidht;
	private int iLength;
	public Rectangle(int iWidht, int iLength) {
		super();
		this.iWidht = iWidht;
		this.iLength = iLength;
	}
	public int getiWidht() {
		return iWidht;
	}
	public void setiWidht(int iWidht) {
		this.iWidht = iWidht;
	}
	public int getiLength() {
		return iLength;
	}
	public void setiLength(int iLength) {
		this.iLength = iLength;
	};
	
}
