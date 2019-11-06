package Fenster;
import java.util.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;


import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;



public class Hauptfenster {

	public JFrame frame;
	
	int fbreite;
	int fhoehe;
	int countKnoten = 0;
	private JTextField txtAnz;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hauptfenster window = new Hauptfenster();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Hauptfenster() {
		initialize();
	}
	

	
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1800, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		fhoehe = frame.getHeight();
		fbreite = frame.getWidth();
		
		BaumMethoden x = new BaumMethoden();
		Knoten[] kListe = new Knoten[32];
		
		
		
		// *** Layer erstellen *** ---------------------------------------------
				JLayeredPane layeredPane = new JLayeredPane();
				layeredPane.setBounds(0, 0, 1800, 1000);
				frame.getContentPane().add(layeredPane);
				layeredPane.setLayout(new CardLayout(0, 0));
		
				JPanel Start = new JPanel();
				Start.setBackground(Color.GRAY);
				JPanel AuswahlBaum = new JPanel();
				AuswahlBaum.setBackground(Color.GRAY);
				JPanel ArrayEing = new JPanel();
				ArrayEing.setBackground(Color.GRAY);
				JPanel AVLBaum = new JPanel();
				AVLBaum.setBackground(Color.GRAY);
				JPanel AllBaum = new JPanel();
				AllBaum.setBackground(Color.GRAY);
										
				layeredPane.add(Start, "name_4941080776100");
				Start.setLayout(null);
					layeredPane.add(AVLBaum, "name_5049436050800");
					AVLBaum.setLayout(null);
				layeredPane.add(ArrayEing, "name_7856351001600");
				ArrayEing.setLayout(null);
					layeredPane.add(AuswahlBaum, "name_230308195273100");
				layeredPane.add(AllBaum, "name_231488313974900");
				AllBaum.setLayout(null);
							
								
				
		// *** Startfenster erstellen ***--------------------------------------
					int startbtnArrayA = (int) (0.167*fbreite);
					int startbtnArrayB = (int) (0.5*fhoehe);
					int startbtnBaumA = (int) (0.583*fbreite);
					int startbtnBaumB = (int) (0.5*fhoehe);
					int startbtnABX = (int) (0.25*fbreite);
					int startbtnABY = (int) (0.25*fhoehe);
				
					JButton btnArray = new JButton("Array");
					btnArray.setBounds(startbtnArrayA, startbtnArrayB, startbtnABX, startbtnABY);
					btnArray.setFont(new Font("Tahoma", Font.PLAIN, 40));
					Start.add(btnArray);
					btnArray.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Start.setVisible(false);
							ArrayEing.setVisible(true);
						}
					});
				
					JButton btnBaum = new JButton("Baum");
					btnBaum.setBounds(startbtnBaumA, startbtnBaumB, startbtnABX, startbtnABY);
					btnBaum.setFont(new Font("Tahoma", Font.PLAIN, 40));
					Start.add(btnBaum);
					btnBaum.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Start.setVisible(false);
							//x.buttonEinfuegen(AVLBaum, kListe);
							AuswahlBaum.setVisible(true);
						}
					});
				
					JLabel lblGebenSie = new JLabel("W\u00E4hlen Sie eine Datenstruktur");
					lblGebenSie.setBounds(650, 250, 600, 50);
					lblGebenSie.setFont(new Font("Tahoma", Font.PLAIN, 40));
					Start.add(lblGebenSie);
					
					
				
		// ***Oberfläche Array-Eingabe***------------------------------------------------------		
					JLabel lblFehler = new JLabel("");
					lblFehler.setHorizontalAlignment(SwingConstants.CENTER);
					lblFehler.setForeground(Color.ORANGE);
					lblFehler.setFont(new Font("Tahoma", Font.PLAIN, 40));
					lblFehler.setBounds(575, 380, 650, 70);
					ArrayEing.add(lblFehler);
					
					JLabel lblGebenSieDie = new JLabel("Zahleneingabe:");
					lblGebenSieDie.setFont(new Font("Tahoma", Font.PLAIN, 32));
					lblGebenSieDie.setBounds(750, 100, 224, 100);
					ArrayEing.add(lblGebenSieDie);
					
					JLabel lblAusgewhltesSortierverfahren = new JLabel("Ausgew\u00E4hltes Sortierverfahren:");
					lblAusgewhltesSortierverfahren.setFont(new Font("Tahoma", Font.PLAIN, 32));
					lblAusgewhltesSortierverfahren.setBounds(483, 463, 459, 57);
					ArrayEing.add(lblAusgewhltesSortierverfahren);
					
					JLabel lblAuswahl = new JLabel("(keine Auswahl)");
					lblAuswahl.setFont(new Font("Tahoma", Font.PLAIN, 30));
					lblAuswahl.setBounds(963, 467, 224, 49);
					ArrayEing.add(lblAuswahl);
					
					JTextField txtEingabeArray = new JTextField();
					txtEingabeArray.setBounds(200, 300, 1400, 70);
					txtEingabeArray.setFont(new Font("Tahoma", Font.PLAIN, 32));
					ArrayEing.add(txtEingabeArray);
					txtEingabeArray.setColumns(10);
					
					JButton btnGnome = new JButton("Gnome");
					btnGnome.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							lblAuswahl.setText("Gnome");
						}
					});
					btnGnome.setFont(new Font("Tahoma", Font.PLAIN, 32));
					btnGnome.setBounds(125, 600, 300, 100);
					ArrayEing.add(btnGnome);
						JButton btnSelection = new JButton("Selection");
						btnSelection.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								lblAuswahl.setText("Selection");
							}
						});
						btnSelection.setFont(new Font("Tahoma", Font.PLAIN, 32));
						btnSelection.setBounds(125, 750, 300, 100);
						ArrayEing.add(btnSelection);
						
					JButton btnInsertion = new JButton("Insertion");
					btnInsertion.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							lblAuswahl.setText("Insertion");
						}
					});
					btnInsertion.setFont(new Font("Tahoma", Font.PLAIN, 32));
					btnInsertion.setBounds(525, 600, 300, 100);
					ArrayEing.add(btnInsertion);
						JButton btnBubble = new JButton("Bubble");
						btnBubble.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								lblAuswahl.setText("Bubble");
							}
						});
						btnBubble.setFont(new Font("Tahoma", Font.PLAIN, 32));
						btnBubble.setBounds(525, 750, 300, 100);
						ArrayEing.add(btnBubble);
						
					JButton btnMerge = new JButton("Merge");
					btnMerge.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							lblAuswahl.setText("Merge");
						}
					});
					btnMerge.setFont(new Font("Tahoma", Font.PLAIN, 32));
					btnMerge.setBounds(925, 600, 300, 100);
					ArrayEing.add(btnMerge);
						JButton btnQuick = new JButton("Quick");
						btnQuick.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								lblAuswahl.setText("Quick");
							}
						});
						btnQuick.setFont(new Font("Tahoma", Font.PLAIN, 32));
						btnQuick.setBounds(925, 750, 300, 100);
						ArrayEing.add(btnQuick);
					
					JButton btnHeap = new JButton("Heap");
					btnHeap.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							lblAuswahl.setText("Heap");
						}
					});
					btnHeap.setFont(new Font("Tahoma", Font.PLAIN, 32));
					btnHeap.setBounds(1325, 600, 300, 100);
					ArrayEing.add(btnHeap);
						JButton btnStart = new JButton("Start");
						btnStart.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								int anz = Integer.parseInt(txtAnz.getText());		
								int kontrolle=0;
								
									int[] arr = new int[anz];
								
									try {
										String[] split = txtEingabeArray.getText().split(",");			
										for (int i=0; i<split.length; i++) {
											arr[i] = Integer.parseInt(split[i]);
										}
									
									}
									catch(NumberFormatException e1) {
										lblFehler.setText("Fehlerhafte Eingabe!");
										kontrolle = 1;
									
									}
									catch(ArrayIndexOutOfBoundsException e1) {
										lblFehler.setText("Es wurden zu viele Elemente eingegeben!");
										kontrolle = 1;
									}
								
									if(kontrolle == 0) {
										for (int l=0; l<arr.length; l++) {
											for (int n=l+1; n<arr.length; n++) {
												if (arr[l] != arr[n]) {
												}
												else {
													kontrolle+=1;
												}
											}
										}
										if (kontrolle != 0) {
											lblFehler.setText("Es sind Elemente doppelt vorhanden!");
										}
									}
							}
						});
						btnStart.setBackground(Color.GREEN);
						btnStart.setFont(new Font("Tahoma", Font.PLAIN, 32));
						btnStart.setBounds(1325, 750, 300, 100);
						ArrayEing.add(btnStart);
						
						txtAnz = new JTextField();
						txtAnz.setBounds(850, 210, 100, 70);
						txtAnz.setFont(new Font("Tahoma", Font.PLAIN, 32));
						ArrayEing.add(txtAnz);
						txtAnz.setColumns(10);
						
						JButton btnRandom = new JButton("Random");
						btnRandom.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
									int [] arr = new int[Integer.parseInt(txtAnz.getText())];
									int var = ((int)((Math.random()) * 99 + 1));
									arr[0] = var;
								
									for (int i=1; i<arr.length; i++){ 
										var= ((int)((Math.random())*99+1)); 
										        
								        for (int j=0; j<i; j++) {
								        	if (arr[j] == var) {
								        		var= ((int)((Math.random())*99+1));
										  		j=0;
									      	}	
									        arr[i] = var;
								        }
									}	 
									StringBuffer ausgabe = new StringBuffer();
									ausgabe.append(arr[0]);
									for (int i=1 ; i<Integer.parseInt(txtAnz.getText()) ; i++) {
										ausgabe.append(","+ arr[i]);
									}
									String anzeige = ausgabe.toString();
									txtEingabeArray.setText(anzeige);
									
								}
							});
						btnRandom.setFont(new Font("Tahoma", Font.PLAIN, 32));
						btnRandom.setBounds(1012, 220, 180, 50);
						ArrayEing.add(btnRandom);
						
						JLabel lblAnzahl = new JLabel("Anzahl:");
						lblAnzahl.setBounds(720, 230, 120, 26);
						lblAnzahl.setFont(new Font("Tahoma", Font.PLAIN, 32));
						ArrayEing.add(lblAnzahl);
						
						
						
		// ***Oberfläche AuswahlBaum***------------------------------------------------------				
				JLabel lblAuswahlBaum = new JLabel("W\u00E4hlen Sie eine Baumstruktur");
				lblAuswahlBaum.setBounds(650, 250, 600, 50);
				lblAuswahlBaum.setFont(new Font("Tahoma", Font.PLAIN, 40));
				AuswahlBaum.setLayout(null);
				AuswahlBaum.setLayout(null);
				AuswahlBaum.add(lblAuswahlBaum);
				
				JButton btnAuswahlAllBaum = new JButton("Allgemeiner Baum");
				btnAuswahlAllBaum.setBounds(startbtnArrayA, startbtnArrayB, startbtnABX, startbtnABY);
				btnAuswahlAllBaum.setFont(new Font("Tahoma", Font.PLAIN, 40));
				AuswahlBaum.add(btnAuswahlAllBaum);
				btnAuswahlAllBaum.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						AuswahlBaum.setVisible(false);
						AllBaum.setVisible(true);
					}
				});
			
				JButton btnAuswahlAVLBaum = new JButton("AVL-Baum");
				btnAuswahlAVLBaum.setBounds(startbtnBaumA, startbtnBaumB, startbtnABX, startbtnABY);
				btnAuswahlAVLBaum.setFont(new Font("Tahoma", Font.PLAIN, 40));
				AuswahlBaum.add(btnAuswahlAVLBaum);
				btnAuswahlAVLBaum.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						AuswahlBaum.setVisible(false);
						x.buttonEinfuegen(AVLBaum, kListe);
						AVLBaum.setVisible(true);
					}
				});
								
						
						
		// ***Oberfläche AVL-Baum***------------------------------------------------------
				JTextField textWertEin = new JTextField();
				textWertEin.setFont(new Font("Tahoma", Font.PLAIN, 26));
				textWertEin.setBounds(1570, 150, 120, 50);
				AVLBaum.add(textWertEin);
				textWertEin.setColumns(10);
				
				JButton btnEinfuegen = new JButton("Einf\u00FCgen");
				btnEinfuegen.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (countKnoten == 0) {
							x.wurzelEinfuegen(AVLBaum, kListe, textWertEin.getText());
							countKnoten++;
							textWertEin.setText("");
						}
						else {
							x.knotenEinfuegen(AVLBaum, kListe, textWertEin.getText());
							countKnoten++;
							textWertEin.setText("");
							x.baumDrehen(AVLBaum, kListe);
						}
					}
				});
				btnEinfuegen.setFont(new Font("Tahoma", Font.PLAIN, 28));
				btnEinfuegen.setBounds(1475, 263, 250, 50);
				AVLBaum.add(btnEinfuegen);
				
				JButton btnEntfernen = new JButton("Entfernen");
				btnEntfernen.setFont(new Font("Tahoma", Font.PLAIN, 28));
				btnEntfernen.setBounds(1475, 612, 250, 50);
				AVLBaum.add(btnEntfernen);
				
				JLabel lblKnotenEinfuegen = new JLabel("Knoten einf\u00FCgen:");
				lblKnotenEinfuegen.setFont(new Font("Tahoma", Font.PLAIN, 32));
				lblKnotenEinfuegen.setBounds(1450, 82, 255, 35);
				AVLBaum.add(lblKnotenEinfuegen);
				
				JLabel lblWert = new JLabel("Wert:");
				lblWert.setFont(new Font("Tahoma", Font.PLAIN, 28));
				lblWert.setBounds(1450, 155, 91, 35);
				AVLBaum.add(lblWert);
							
				JLabel lblKnotenEntfernen = new JLabel("Knoten entfernen:");
				lblKnotenEntfernen.setFont(new Font("Tahoma", Font.PLAIN, 32));
				lblKnotenEntfernen.setBounds(1450, 435, 266, 35);
				AVLBaum.add(lblKnotenEntfernen);
				
				JLabel lblKnoten = new JLabel("Knoten:");
				lblKnoten.setFont(new Font("Tahoma", Font.PLAIN, 28));
				lblKnoten.setBounds(1450, 517, 122, 35);
				AVLBaum.add(lblKnoten);
				
				
				
		// ***Oberfläche Allgemeiner-Baum***------------------------------------------------------
				JLabel lbl2KnotenEinfuegen = new JLabel("Knoten einf\u00FCgen:");
				lbl2KnotenEinfuegen.setFont(new Font("Tahoma", Font.PLAIN, 32));
				lbl2KnotenEinfuegen.setBounds(1450, 82, 255, 35);
				AllBaum.add(lbl2KnotenEinfuegen);
				
				JLabel lbl2Wert = new JLabel("Wert:");
				lbl2Wert.setFont(new Font("Tahoma", Font.PLAIN, 28));
				lbl2Wert.setBounds(1450, 155, 91, 35);
				AllBaum.add(lbl2Wert);
				
				JLabel lbl2Vorgaenger = new JLabel("Vorg\u00E4nger:");
				lbl2Vorgaenger.setFont(new Font("Tahoma", Font.PLAIN, 28));
				lbl2Vorgaenger.setBounds(1450, 215, 160, 35);
				AllBaum.add(lbl2Vorgaenger);
				
				JLabel lbl2Nachfolger = new JLabel("Nachfolger:");
				lbl2Nachfolger.setFont(new Font("Tahoma", Font.PLAIN, 28));
				lbl2Nachfolger.setBounds(1450, 275, 160, 35);
				AllBaum.add(lbl2Nachfolger);
				
				JLabel lbl2KnotenEntfernen = new JLabel("Knoten entfernen:");
				lbl2KnotenEntfernen.setFont(new Font("Tahoma", Font.PLAIN, 32));
				lbl2KnotenEntfernen.setBounds(1450, 535, 266, 35);
				AllBaum.add(lbl2KnotenEntfernen);
				
				JLabel lbl2Knoten = new JLabel("Knoten:");
				lbl2Knoten.setFont(new Font("Tahoma", Font.PLAIN, 28));
				lbl2Knoten.setBounds(1450, 617, 122, 35);
				AllBaum.add(lbl2Knoten);
				
				JButton btn2KnotenEinfuegen = new JButton("Einf\u00FCgen");
				btn2KnotenEinfuegen.setFont(new Font("Tahoma", Font.PLAIN, 28));
				btn2KnotenEinfuegen.setBounds(1475, 370, 250, 50);
				AllBaum.add(btn2KnotenEinfuegen);
				
				JButton btn2KnotenEntfernen = new JButton("Entfernen");
				btn2KnotenEntfernen.setFont(new Font("Tahoma", Font.PLAIN, 28));
				btn2KnotenEntfernen.setBounds(1475, 712, 250, 50);
				AllBaum.add(btn2KnotenEntfernen);
				
				JTextField txtWert = new JTextField();
				txtWert.setFont(new Font("Tahoma", Font.PLAIN, 26));
				txtWert.setBounds(1620, 150, 120, 50);
				AllBaum.add(txtWert);
				txtWert.setColumns(10);
				
				JTextField txtVorgaenger = new JTextField();
				txtVorgaenger.setFont(new Font("Tahoma", Font.PLAIN, 26));
				txtVorgaenger.setBounds(1620, 210, 120, 50);
				AllBaum.add(txtVorgaenger);
				txtVorgaenger.setColumns(10);
				
				JTextField txtNachfolger = new JTextField();
				txtNachfolger.setFont(new Font("Tahoma", Font.PLAIN, 26));
				txtNachfolger.setBounds(1620, 270, 120, 50);
				AllBaum.add(txtNachfolger);
				txtNachfolger.setColumns(10);
				
				JTextField txtKnoten = new JTextField();
				txtKnoten.setFont(new Font("Tahoma", Font.PLAIN, 26));
				txtKnoten.setBounds(1620, 612, 120, 50);
				AllBaum.add(txtKnoten);
				txtKnoten.setColumns(10);							
	}
}








































