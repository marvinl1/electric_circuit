package Fenster;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Knoten {
	
	int wert;
	int lKind;
	int rKind;
	int id;
	int ebene;
	int höheR;
	int höheL;
	JButton btn;
		
	public Knoten(String wert, int lKind, int rKind, int id, int ebene, JPanel AVLBaum) {
		this.wert = Integer.parseInt(wert);
		this.lKind = lKind;
		this.rKind = rKind;
		this.ebene = ebene;
		this.id = id;
		this.btn = new JButton(wert);
		btn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn.setBounds(670, 250, 55, 55);
		AVLBaum.add(btn);
		AVLBaum.repaint();	
	}	
	
	public Knoten(JPanel AVLBaum, int x, int y, int x1, int y1) {
		this.btn = new JButton();
		btn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn.setBounds(x, y, x1, y1);
		AVLBaum.add(btn);
		btn.setVisible(false);
		AVLBaum.repaint();
	}
	
	
		
			public void setParameter(String wert, int lKind, int rKind, int id, int ebene, JPanel AVLBaum)	{
				this.wert = Integer.parseInt(wert);
				this.lKind = lKind;
				this.rKind = rKind;
				this.id = id;
				this.ebene = ebene;
			}	
			public void setWert(int wert){
				this.wert = wert;
			}
			public void setlKind(int lKind){
				this.lKind = lKind;
			}
			public void setrKind(int rKind){
				this.rKind = rKind;
			}
			public void setid(int id){
				this.id = id;
			}
			public void setebene(int ebene){
				this.ebene = ebene;
			}
			public void sethöheL(int höheL) {
				this.höheL = höheL;
			}
			public void sethöheR(int höheR) {
				this.höheR = höheR;
			}
		public int getWert(){
            return this.wert;
        }
		public int getlKind(){
            return this.lKind;
        }
		public int getrKind(){
            return this.rKind;
        }
		public int getebene(){
            return this.ebene;
        }
		public int getid(){
            return this.id;
        }
		public int gethöheL() {
			return this.höheL;
		}
		public int gethöheR() {
			return this.höheR;
		}
}
