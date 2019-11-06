package Fenster;

import javax.swing.JPanel;

public class BaumMethoden {

	public void buttonEinfuegen(JPanel AVLBaum, Knoten[] kListe) {
		kListe[1] = new Knoten(AVLBaum, 670, 250, 55, 55);
		kListe[2] = new Knoten(AVLBaum, 350, 350, 55, 55);
		kListe[3] = new Knoten(AVLBaum, 990, 350, 55, 55);
		kListe[4] = new Knoten(AVLBaum, 200, 500, 55, 55);
		kListe[5] = new Knoten(AVLBaum, 500, 500, 55, 55);
		kListe[6] = new Knoten(AVLBaum, 840, 500, 55, 55);
		kListe[7] = new Knoten(AVLBaum, 1140, 500, 55, 55);
		kListe[8] = new Knoten(AVLBaum, 120, 650, 55, 55);
		kListe[9] = new Knoten(AVLBaum, 280, 650, 55, 55);
		kListe[10] = new Knoten(AVLBaum, 420, 650, 55, 55);
		kListe[11] = new Knoten(AVLBaum, 580, 650, 55, 55);
		kListe[12] = new Knoten(AVLBaum, 760, 650, 55, 55);
		kListe[13] = new Knoten(AVLBaum, 920, 650, 55, 55);
		kListe[14] = new Knoten(AVLBaum, 1060, 650, 55, 55);
		kListe[15] = new Knoten(AVLBaum, 1220, 650, 55, 55);
		kListe[16] = new Knoten(AVLBaum, 85, 800, 55, 55);
		kListe[17] = new Knoten(AVLBaum, 155, 800, 55, 55);
		kListe[18] = new Knoten(AVLBaum, 245, 800, 55, 55);
		kListe[19] = new Knoten(AVLBaum, 315, 800, 55, 55);
		kListe[20] = new Knoten(AVLBaum, 385, 800, 55, 55);
		kListe[21] = new Knoten(AVLBaum, 455, 800, 55, 55);
		kListe[22] = new Knoten(AVLBaum, 545, 800, 55, 55);
		kListe[23] = new Knoten(AVLBaum, 615, 800, 55, 55);
		kListe[24] = new Knoten(AVLBaum, 725, 800, 55, 55);
		kListe[25] = new Knoten(AVLBaum, 795, 800, 55, 55);
		kListe[26] = new Knoten(AVLBaum, 885, 800, 55, 55);
		kListe[27] = new Knoten(AVLBaum, 955, 800, 55, 55);
		kListe[28] = new Knoten(AVLBaum, 1025, 800, 55, 55);
		kListe[29] = new Knoten(AVLBaum, 1095, 800, 55, 55);
		kListe[30] = new Knoten(AVLBaum, 1185, 800, 55, 55);
		kListe[31] = new Knoten(AVLBaum, 1255, 800, 55, 55);
	}
	
	
	//Knoten in Ebene 1 (Wurzel) einfügen
	public void wurzelEinfuegen(JPanel AVLBaum, Knoten[] kListe, String s) {
		kListe[1].setParameter(s, 0, 0, 1, 1, AVLBaum);
		kListe[1].btn.setText(s);
		kListe[1].btn.setVisible(true);
		kListe[1].sethöheL(0);
		kListe[1].sethöheR(0);
	}
		
	//Knoten in Ebene 2 einfügen
	public void knotenEinfuegen(JPanel AVLBaum, Knoten[] kListe, String s) {
		if ((Integer.parseInt(s) < kListe[1].getWert()) && (kListe[1].getlKind()==0)) {
			kListe[2].setParameter(s, 0, 0, 2, 2, AVLBaum);
			kListe[1].setlKind(1);
			kListe[2].btn.setText(s);
			kListe[2].btn.setVisible(true);
			kListe[1].sethöheL(1);
						
		}
		if ((Integer.parseInt(s) > kListe[1].getWert()) && (kListe[1].getrKind()==0)) {
			kListe[3].setParameter(s, 0, 0, 3, 2, AVLBaum);
			kListe[1].setrKind(1);
			kListe[3].btn.setText(s);
			kListe[3].btn.setVisible(true);
			kListe[1].sethöheR(1);
		}
			//Knoten in Ebene 3 einfügen
			if ((Integer.parseInt(s) < kListe[1].getWert()) && (Integer.parseInt(s) < kListe[2].getWert()) && (kListe[2].getlKind()==0)) {
				kListe[4].setParameter(s, 0, 0, 3, 2, AVLBaum);
				kListe[2].setlKind(1);
				kListe[4].btn.setText(s);
				kListe[4].btn.setVisible(true);
				kListe[1].sethöheL(2);
				kListe[2].sethöheL(1);
			}
			if ((Integer.parseInt(s) < kListe[1].getWert()) && (Integer.parseInt(s) > kListe[2].getWert()) && (kListe[2].getrKind()==0)) {
				kListe[5].setParameter(s, 0, 0, 3, 2, AVLBaum);
				kListe[2].setrKind(1);
				kListe[5].btn.setText(s);
				kListe[5].btn.setVisible(true);
				kListe[1].sethöheL(2);
				kListe[2].sethöheR(1);
			}
			if ((Integer.parseInt(s) > kListe[1].getWert()) && (Integer.parseInt(s) < kListe[3].getWert()) && (kListe[3].getlKind()==0)) {
				kListe[6].setParameter(s, 0, 0, 3, 2, AVLBaum);
				kListe[3].setlKind(1);
				kListe[6].btn.setText(s);
				kListe[6].btn.setVisible(true);
				kListe[1].sethöheR(2);
				kListe[3].sethöheL(1);
			}
			if ((Integer.parseInt(s) > kListe[1].getWert()) && (Integer.parseInt(s) > kListe[3].getWert()) && (kListe[3].getrKind()==0)) {
				kListe[7].setParameter(s, 0, 0, 3, 2, AVLBaum);
				kListe[3].setrKind(1);
				kListe[7].btn.setText(s);
				kListe[7].btn.setVisible(true);
				kListe[1].sethöheR(2);
				kListe[3].sethöheR(1);
			}
				//Knoten in Ebene 4 einfügen
				if ((Integer.parseInt(s) < kListe[1].getWert()) && (Integer.parseInt(s) < kListe[2].getWert()) &&
						(Integer.parseInt(s) < kListe[4].getWert()) && (kListe[4].getlKind()==0)) {
					kListe[8].setParameter(s, 0, 0, 3, 2, AVLBaum);
					kListe[4].setlKind(1);
					kListe[8].btn.setText(s);
					kListe[8].btn.setVisible(true);
					kListe[1].sethöheL(3);
					kListe[2].sethöheL(2);
					kListe[4].sethöheL(1);
				}
				if ((Integer.parseInt(s) < kListe[1].getWert()) && (Integer.parseInt(s) < kListe[2].getWert()) &&
						(Integer.parseInt(s) > kListe[4].getWert()) && (kListe[4].getrKind()==0)) {
					kListe[9].setParameter(s, 0, 0, 3, 2, AVLBaum);
					kListe[4].setrKind(1);
					kListe[9].btn.setText(s);
					kListe[9].btn.setVisible(true);
					kListe[1].sethöheL(3);
					kListe[2].sethöheL(2);
					kListe[4].sethöheR(1);
				}
				if ((Integer.parseInt(s) < kListe[1].getWert()) && (Integer.parseInt(s) > kListe[2].getWert()) &&
						(Integer.parseInt(s) < kListe[5].getWert()) && (kListe[5].getlKind()==0)) {
					kListe[10].setParameter(s, 0, 0, 3, 2, AVLBaum);
					kListe[5].setlKind(1);
					kListe[10].btn.setText(s);
					kListe[10].btn.setVisible(true);
					kListe[1].sethöheL(3);
					kListe[2].sethöheR(2);
					kListe[5].sethöheL(1);
				}
				if ((Integer.parseInt(s) < kListe[1].getWert()) && (Integer.parseInt(s) > kListe[2].getWert()) &&
						(Integer.parseInt(s) > kListe[5].getWert()) && (kListe[5].getrKind()==0)) {
					kListe[11].setParameter(s, 0, 0, 3, 2, AVLBaum);
					kListe[5].setrKind(1);
					kListe[11].btn.setText(s);
					kListe[11].btn.setVisible(true);
					kListe[1].sethöheL(3);
					kListe[2].sethöheR(2);
					kListe[5].sethöheR(1);
				}
				if ((Integer.parseInt(s) > kListe[1].getWert()) && (Integer.parseInt(s) < kListe[3].getWert()) &&
						(Integer.parseInt(s) < kListe[6].getWert()) && (kListe[6].getlKind()==0)) {
					kListe[12].setParameter(s, 0, 0, 3, 2, AVLBaum);
					kListe[6].setlKind(1);
					kListe[12].btn.setText(s);
					kListe[12].btn.setVisible(true);
					kListe[1].sethöheR(3);
					kListe[3].sethöheL(2);
					kListe[6].sethöheL(1);
				}
				if ((Integer.parseInt(s) > kListe[1].getWert()) && (Integer.parseInt(s) < kListe[3].getWert()) &&
						(Integer.parseInt(s) > kListe[6].getWert()) && (kListe[6].getrKind()==0)) {
					kListe[13].setParameter(s, 0, 0, 3, 2, AVLBaum);
					kListe[6].setrKind(1);
					kListe[13].btn.setText(s);
					kListe[13].btn.setVisible(true);
					kListe[1].sethöheR(3);
					kListe[3].sethöheL(2);
					kListe[6].sethöheR(1);
				}
				if ((Integer.parseInt(s) > kListe[1].getWert()) && (Integer.parseInt(s) > kListe[3].getWert()) &&
						(Integer.parseInt(s) < kListe[7].getWert()) && (kListe[7].getlKind()==0)) {
					kListe[14].setParameter(s, 0, 0, 3, 2, AVLBaum);
					kListe[7].setlKind(1);
					kListe[14].btn.setText(s);
					kListe[14].btn.setVisible(true);
					kListe[1].sethöheR(3);
					kListe[3].sethöheR(2);
					kListe[7].sethöheL(1);
				}
				if ((Integer.parseInt(s) > kListe[1].getWert()) && (Integer.parseInt(s) > kListe[3].getWert()) &&
						(Integer.parseInt(s) > kListe[7].getWert()) && (kListe[7].getrKind()==0)) {
					kListe[15].setParameter(s, 0, 0, 3, 2, AVLBaum);
					kListe[7].setrKind(1);
					kListe[15].btn.setText(s);
					kListe[15].btn.setVisible(true);
					kListe[1].sethöheR(3);
					kListe[3].sethöheR(2);
					kListe[7].sethöheR(1);
				}
					if ((Integer.parseInt(s) < kListe[1].getWert()) && (Integer.parseInt(s) < kListe[2].getWert()) &&
						(Integer.parseInt(s) < kListe[4].getWert()) && (Integer.parseInt(s) < kListe[8].getWert()) && 
						(kListe[8].getlKind()==0)) {
							kListe[16].setParameter(s, 0, 0, 3, 2, AVLBaum);
							kListe[8].setlKind(1);
							kListe[16].btn.setText(s);
							kListe[16].btn.setVisible(true);
					}
					if ((Integer.parseInt(s) < kListe[1].getWert()) && (Integer.parseInt(s) < kListe[2].getWert()) &&
							(Integer.parseInt(s) < kListe[4].getWert()) && (Integer.parseInt(s) > kListe[8].getWert()) && 
							(kListe[8].getrKind()==0)) {
								kListe[17].setParameter(s, 0, 0, 3, 2, AVLBaum);
								kListe[8].setrKind(1);
								kListe[17].btn.setText(s);
								kListe[17].btn.setVisible(true);
					}
					if ((Integer.parseInt(s) < kListe[1].getWert()) && (Integer.parseInt(s) < kListe[2].getWert()) &&
							(Integer.parseInt(s) > kListe[4].getWert()) && (Integer.parseInt(s) < kListe[9].getWert()) && 
							(kListe[9].getlKind()==0)) {
								kListe[18].setParameter(s, 0, 0, 3, 2, AVLBaum);
								kListe[9].setlKind(1);
								kListe[18].btn.setText(s);
								kListe[18].btn.setVisible(true);
					}
					if ((Integer.parseInt(s) < kListe[1].getWert()) && (Integer.parseInt(s) < kListe[2].getWert()) &&
							(Integer.parseInt(s) > kListe[4].getWert()) && (Integer.parseInt(s) > kListe[9].getWert()) && 
							(kListe[9].getrKind()==0)) {
								kListe[19].setParameter(s, 0, 0, 3, 2, AVLBaum);
								kListe[9].setrKind(1);
								kListe[19].btn.setText(s);
								kListe[19].btn.setVisible(true);
					}
					if ((Integer.parseInt(s) < kListe[1].getWert()) && (Integer.parseInt(s) > kListe[2].getWert()) &&
							(Integer.parseInt(s) < kListe[5].getWert()) && (Integer.parseInt(s) < kListe[10].getWert()) && 
							(kListe[10].getlKind()==0)) {
								kListe[20].setParameter(s, 0, 0, 3, 2, AVLBaum);
								kListe[10].setlKind(1);
								kListe[20].btn.setText(s);
								kListe[20].btn.setVisible(true);
					}
					if ((Integer.parseInt(s) < kListe[1].getWert()) && (Integer.parseInt(s) > kListe[2].getWert()) &&
							(Integer.parseInt(s) < kListe[5].getWert()) && (Integer.parseInt(s) > kListe[10].getWert()) && 
							(kListe[10].getrKind()==0)) {
								kListe[21].setParameter(s, 0, 0, 3, 2, AVLBaum);
								kListe[10].setrKind(1);
								kListe[21].btn.setText(s);
								kListe[21].btn.setVisible(true);
					}
					if ((Integer.parseInt(s) < kListe[1].getWert()) && (Integer.parseInt(s) > kListe[2].getWert()) &&
							(Integer.parseInt(s) > kListe[5].getWert()) && (Integer.parseInt(s) < kListe[11].getWert()) && 
							(kListe[11].getlKind()==0)) {
								kListe[22].setParameter(s, 0, 0, 3, 2, AVLBaum);
								kListe[11].setlKind(1);
								kListe[22].btn.setText(s);
								kListe[22].btn.setVisible(true);
					}
					if ((Integer.parseInt(s) < kListe[1].getWert()) && (Integer.parseInt(s) > kListe[2].getWert()) &&
							(Integer.parseInt(s) > kListe[5].getWert()) && (Integer.parseInt(s) > kListe[11].getWert()) && 
							(kListe[11].getrKind()==0)) {
								kListe[23].setParameter(s, 0, 0, 3, 2, AVLBaum);
								kListe[11].setrKind(1);
								kListe[23].btn.setText(s);
								kListe[23].btn.setVisible(true);
					}
					if ((Integer.parseInt(s) > kListe[1].getWert()) && (Integer.parseInt(s) < kListe[3].getWert()) &&
							(Integer.parseInt(s) < kListe[6].getWert()) && (Integer.parseInt(s) < kListe[12].getWert()) && 
							(kListe[12].getlKind()==0)) {
								kListe[24].setParameter(s, 0, 0, 3, 2, AVLBaum);
								kListe[12].setlKind(1);
								kListe[24].btn.setText(s);
								kListe[24].btn.setVisible(true);
					}
					if ((Integer.parseInt(s) > kListe[1].getWert()) && (Integer.parseInt(s) < kListe[3].getWert()) &&
							(Integer.parseInt(s) < kListe[6].getWert()) && (Integer.parseInt(s) > kListe[12].getWert()) && 
							(kListe[12].getrKind()==0)) {
								kListe[25].setParameter(s, 0, 0, 3, 2, AVLBaum);
								kListe[12].setrKind(1);
								kListe[25].btn.setText(s);
								kListe[25].btn.setVisible(true);
					}
					if ((Integer.parseInt(s) > kListe[1].getWert()) && (Integer.parseInt(s) < kListe[3].getWert()) &&
							(Integer.parseInt(s) > kListe[6].getWert()) && (Integer.parseInt(s) < kListe[13].getWert()) && 
							(kListe[13].getlKind()==0)) {
								kListe[26].setParameter(s, 0, 0, 3, 2, AVLBaum);
								kListe[13].setlKind(1);
								kListe[26].btn.setText(s);
								kListe[26].btn.setVisible(true);
					}
					if ((Integer.parseInt(s) > kListe[1].getWert()) && (Integer.parseInt(s) < kListe[3].getWert()) &&
							(Integer.parseInt(s) > kListe[6].getWert()) && (Integer.parseInt(s) > kListe[13].getWert()) && 
							(kListe[13].getrKind()==0)) {
								kListe[27].setParameter(s, 0, 0, 3, 2, AVLBaum);
								kListe[13].setrKind(1);
								kListe[27].btn.setText(s);
								kListe[27].btn.setVisible(true);
					}
					if ((Integer.parseInt(s) > kListe[1].getWert()) && (Integer.parseInt(s) > kListe[3].getWert()) &&
							(Integer.parseInt(s) < kListe[7].getWert()) && (Integer.parseInt(s) < kListe[14].getWert()) && 
							(kListe[14].getlKind()==0)) {
								kListe[28].setParameter(s, 0, 0, 3, 2, AVLBaum);
								kListe[14].setlKind(1);
								kListe[28].btn.setText(s);
								kListe[28].btn.setVisible(true);
					}
					if ((Integer.parseInt(s) > kListe[1].getWert()) && (Integer.parseInt(s) > kListe[3].getWert()) &&
							(Integer.parseInt(s) < kListe[7].getWert()) && (Integer.parseInt(s) > kListe[14].getWert()) && 
							(kListe[14].getrKind()==0)) {
								kListe[29].setParameter(s, 0, 0, 3, 2, AVLBaum);
								kListe[14].setrKind(1);
								kListe[29].btn.setText(s);
								kListe[29].btn.setVisible(true);
					}
					if ((Integer.parseInt(s) > kListe[1].getWert()) && (Integer.parseInt(s) > kListe[3].getWert()) &&
							(Integer.parseInt(s) > kListe[7].getWert()) && (Integer.parseInt(s) < kListe[15].getWert()) && 
							(kListe[15].getlKind()==0)) {
								kListe[30].setParameter(s, 0, 0, 3, 2, AVLBaum);
								kListe[15].setlKind(1);
								kListe[30].btn.setText(s);
								kListe[30].btn.setVisible(true);
					}
					if ((Integer.parseInt(s) > kListe[1].getWert()) && (Integer.parseInt(s) > kListe[3].getWert()) &&
							(Integer.parseInt(s) > kListe[7].getWert()) && (Integer.parseInt(s) > kListe[15].getWert()) && 
							(kListe[15].getrKind()==0)) {
								kListe[31].setParameter(s, 0, 0, 3, 2, AVLBaum);
								kListe[15].setrKind(1);
								kListe[31].btn.setText(s);
								kListe[31].btn.setVisible(true);
					}
		}
	
		public void baumDrehen(JPanel AVLBaum, Knoten[] kListe) {
			for(int i = 31; i >= 2; i-- ) {
				if (kListe[i].gethöheR()-kListe[i].gethöheL() == -2) {
					if (kListe[i*2].gethöheR()-kListe[i*2].gethöheL() == -1) {
						kListe[i*2+1].setWert(kListe[i].getWert());
						kListe[i].setWert(kListe[i*2].getWert());
						kListe[i*2].setWert(kListe[i*2*2].getWert());
						kListe[i*2+1].btn.setText(Integer.toString(kListe[i*2+1].getWert()));
						kListe[i].btn.setText(Integer.toString(kListe[i].getWert()));
						kListe[i*2].btn.setText(Integer.toString(kListe[i*2].getWert()));
						
						kListe[i*2*2].btn.setVisible(false);
						kListe[i*2*2].setrKind(0);
						kListe[i*2*2].setlKind(0);
						kListe[i*2*2].sethöheL(0);
						kListe[i*2*2].sethöheR(0);
						kListe[i*2*2].setWert(0);
						kListe[i*2+1].btn.setVisible(true);
						
						
						kListe[i/2].höheL--;
						kListe[i/2/2].höheL--;
						
						kListe[i].setrKind(1);
						kListe[i].setlKind(1);
						kListe[i].sethöheL(1);
						kListe[i].sethöheR(1);
						
						kListe[i*2].setrKind(0);
						kListe[i*2].setlKind(0);
						kListe[i*2].sethöheL(0);
						kListe[i*2].sethöheR(0);
						
						kListe[i*2+1].setrKind(0);
						kListe[i*2+1].setlKind(0);
						kListe[i*2+1].sethöheL(0);
						kListe[i*2+1].sethöheR(0);
						AVLBaum.repaint();
						break;
					}
				}
			}
		}
}
