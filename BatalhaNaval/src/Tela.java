import java.awt.EventQueue;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class Tela extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public int contador,perder;
	public int controle[] = new int[64];
	static String caminho = System.getProperty("user.dir");
	ImageIcon agua = new ImageIcon(caminho + "/img/agua.jpg");
	ImageIcon errou = new ImageIcon(caminho + "/img/errou.png");
	ImageIcon navio = new ImageIcon(caminho + "/img/navio.jpg");

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public boolean randomico() {
		boolean valor;
		Random gerador = new Random();
		valor = gerador.nextBoolean();    
		     
		return valor;
	}
	
	private void fim() {
		Ganhou v = new Ganhou();
		v.setVisible(true);
	}
	private void fimp() {
		Perdeu p = new Perdeu();
		p.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Tela() {
		
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				if(contador == 20) {
					dispose();
					fim();
				}
				if(perder == 20){
					dispose();
					fimp();
				}			}
		});
		
		contador = 0;
		perder = 0;
		
		if(contador == 0) {
		for(int i=0;i<controle.length;i++) {
			controle[i]= 0;
		}
			}
		
		contentPane = new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 544);
		contentPane.setBackground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBatalhaNaval = new JLabel("BATALHA NAVAL");
		lblBatalhaNaval.setForeground(new Color(0, 0, 139));
		lblBatalhaNaval.setFont(new Font("Calibri", Font.BOLD, 40));
		lblBatalhaNaval.setBounds(32, 38, 317, 41);
		contentPane.add(lblBatalhaNaval);
		
		JLabel acerta = new JLabel("");
		acerta.setForeground(new Color(47, 79, 79));
		acerta.setFont(new Font("Cambria", Font.BOLD, 40));
		acerta.setBackground(new Color(100, 149, 237));
		acerta.setBounds(665, 11, 139, 49);
		contentPane.add(acerta);
		
		JLabel erro = new JLabel("");
		erro.setForeground(new Color(255, 51, 0));
		erro.setFont(new Font("Cambria", Font.BOLD, 40));
		erro.setBackground(new Color(100, 149, 237));
		erro.setBounds(665, 72, 139, 49);
		contentPane.add(erro);
		
		
		
		JButton quarentaum = new JButton("");
		quarentaum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[40]== 0) {
					controle[40] = 1;
					if(contador <30) {
						if(randomico()) {
							quarentaum.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							quarentaum.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		quarentaum.setBounds(10, 358, 100, 45);
		contentPane.add(quarentaum);
		
		
		JButton quarentanove = new JButton("");
		quarentanove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[48]== 0) {
					controle[48] = 1;
					if(contador <30) {
						if(randomico()) {
							quarentanove.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							quarentanove.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		quarentanove.setBounds(10, 404, 100, 45);
		contentPane.add(quarentanove);
		
		
		JButton trintatres = new JButton("");
		trintatres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[32]== 0) {
					controle[32] = 1;
					if(contador <30) {
						if(randomico()) {
							trintatres.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							trintatres.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		trintatres.setBounds(10, 313, 100, 45);
		contentPane.add(trintatres);
		
		
		JButton vintecinco = new JButton("");
		vintecinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[24]== 0) {
					controle[24] = 1;
					if(contador <30) {
						if(randomico()) {
							vintecinco.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							vintecinco.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
				
			}
		});
			
		vintecinco.setBounds(10, 268, 100, 45);
		contentPane.add(vintecinco);
		
		JButton dezessete = new JButton("");
		dezessete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[16]== 0) {
					controle[16] = 1;
					if(contador <30) {
						if(randomico()) {
							dezessete.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							dezessete.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		dezessete.setBounds(10, 222, 100, 45);
		contentPane.add(dezessete);
		
		JButton cinquentasete = new JButton("");
		cinquentasete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[56]== 0) {
					controle[56] = 1;
					if(contador <30) {
						if(randomico()) {
							cinquentasete.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							cinquentasete.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		cinquentasete.setBounds(10, 449, 100, 45);
		contentPane.add(cinquentasete);
		
		JButton nove = new JButton("");
		nove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[8]== 0) {
					controle[8] = 1;
					if(contador <30) {
						if(randomico()) {
							nove.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							nove.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		nove.setBounds(10, 176, 100, 45);
		contentPane.add(nove);
		
		JButton um = new JButton("");
		um.setBackground(new Color(255, 255, 255));
		um.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[0]== 0) {
					controle[0] = 1;
			if(contador <30) {
				if(randomico()) {
					um.setIcon(navio);
					contador++;
					String cont = Integer.toString(contador);
					acerta.setText(cont);	
				}
				else {
					um.setIcon(errou);
					perder++;
					String cont2 = Integer.toString(perder);
					erro.setText(cont2);
				}
					}
				}
			}
		});
		um.setBounds(10, 132, 100, 45);
		contentPane.add(um);
		
		JButton cinquentaoito = new JButton("");
		cinquentaoito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[57]== 0) {
					controle[57] = 1;
					if(contador <30) {
						if(randomico()) {
							cinquentaoito.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							cinquentaoito.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		cinquentaoito.setBounds(113, 449, 100, 45);
		contentPane.add(cinquentaoito);
		
		JButton cinquentanove = new JButton("");
		cinquentanove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[58]== 0) {
					controle[58] = 1;
					if(contador <30) {
						if(randomico()) {
							cinquentanove.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							cinquentanove.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		cinquentanove.setBounds(215, 449, 100, 45);
		contentPane.add(cinquentanove);
		
		JButton sessentaum = new JButton("");
		sessentaum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[60]== 0) {
					controle[60] = 1;
					if(contador <30) {
						if(randomico()) {
							sessentaum.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							sessentaum.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		sessentaum.setBounds(422, 449, 100, 45);
		contentPane.add(sessentaum);
		
		JButton sessenta = new JButton("");
		sessenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[59]== 0) {
					controle[59] = 1;
					if(contador <30) {
						if(randomico()) {
							sessenta.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							sessenta.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		sessenta.setBounds(319, 449, 100, 45);
		contentPane.add(sessenta);
		
		JButton sessentadois = new JButton("");
		sessentadois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[61]== 0) {
					controle[61] = 1;
					if(contador <30) {
						if(randomico()) {
							sessentadois.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							sessentadois.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		sessentadois.setBounds(525, 449, 100, 45);
		contentPane.add(sessentadois);
		
		JButton sessentatres = new JButton("");
		sessentatres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[62]== 0) {
					controle[62] = 1;
					if(contador <30) {
						if(randomico()) {
							sessentatres.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							sessentatres.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		sessentatres.setBounds(626, 449, 100, 45);
		contentPane.add(sessentatres);
		
		JButton sessentaquatro = new JButton("");
		sessentaquatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[63]== 0) {
					controle[63] = 1;
					if(contador <30) {
						if(randomico()) {
							sessentaquatro.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							sessentaquatro.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		sessentaquatro.setBounds(730, 449, 100, 45);
		contentPane.add(sessentaquatro);
		
		JButton cinquenta = new JButton("");
		cinquenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[49]== 0) {
					controle[49] = 1;
					if(contador <30) {
						if(randomico()) {
							cinquenta.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							cinquenta.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		cinquenta.setBounds(113, 404, 100, 45);
		contentPane.add(cinquenta);
		
		JButton cinquentaum = new JButton("");
		cinquentaum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[50]== 0) {
					controle[50] = 1;
					if(contador <30) {
						if(randomico()) {
							cinquentaum.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							cinquentaum.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		cinquentaum.setBounds(215, 404, 100, 45);
		contentPane.add(cinquentaum);
		
		JButton cinquentadois = new JButton("");
		cinquentadois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[51]== 0) {
					controle[51] = 1;
					if(contador <30) {
						if(randomico()) {
							cinquentadois.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							cinquentadois.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		cinquentadois.setBounds(319, 404, 100, 45);
		contentPane.add(cinquentadois);
		
		JButton cinquentatres = new JButton("");
		cinquentatres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[52]== 0) {
					controle[52] = 1;
					if(contador <30) {
						if(randomico()) {
							cinquentatres.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							cinquentatres.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		cinquentatres.setBounds(422, 404, 100, 45);
		contentPane.add(cinquentatres);
		
		JButton cinquentaquatro = new JButton("");
		cinquentaquatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[53]== 0) {
					controle[53] = 1;
					if(contador <30) {
						if(randomico()) {
							cinquentaquatro.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							cinquentaquatro.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		cinquentaquatro.setBounds(525, 404, 100, 45);
		contentPane.add(cinquentaquatro);
		
		JButton cinquentacinco = new JButton("");
		cinquentacinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[54]== 0) {
					controle[54] = 1;
					if(contador <30) {
						if(randomico()) {
							cinquentacinco.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							cinquentacinco.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		cinquentacinco.setBounds(626, 404, 100, 45);
		contentPane.add(cinquentacinco);
		
		JButton cinquentaseis = new JButton("");
		cinquentaseis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[55]== 0) {
					controle[55] = 1;
					if(contador <30) {
						if(randomico()) {
							cinquentaseis.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							cinquentaseis.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		cinquentaseis.setBounds(730, 404, 100, 45);
		contentPane.add(cinquentaseis);
		
		JButton quarentadois = new JButton("");
		quarentadois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[41]== 0) {
					controle[41] = 1;
					if(contador <30) {
						if(randomico()) {
							quarentadois.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							quarentadois.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		quarentadois.setBounds(113, 358, 100, 45);
		contentPane.add(quarentadois);
		
		JButton quarentatres = new JButton("");
		quarentatres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[42]== 0) {
					controle[42] = 1;
					if(contador <30) {
						if(randomico()) {
							quarentatres.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							quarentatres.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		quarentatres.setBounds(215, 358, 100, 45);
		contentPane.add(quarentatres);
		
		JButton quarentaquatro = new JButton("");
		quarentaquatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[43]== 0) {
					controle[43] = 1;
					if(contador <30) {
						if(randomico()) {
							quarentaquatro.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							quarentaquatro.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		quarentaquatro.setBounds(319, 358, 100, 45);
		contentPane.add(quarentaquatro);
		
		JButton quarentacinco = new JButton("");
		quarentacinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[44]== 0) {
					controle[44] = 1;
					if(contador <30) {
						if(randomico()) {
							quarentacinco.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							quarentacinco.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		quarentacinco.setBounds(422, 358, 100, 45);
		contentPane.add(quarentacinco);
		
		JButton quarentaseis = new JButton("");
		quarentaseis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[45]== 0) {
					controle[45] = 1;
					if(contador <30) {
						if(randomico()) {
							quarentaseis.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							quarentaseis.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		quarentaseis.setBounds(525, 358, 100, 45);
		contentPane.add(quarentaseis);
		
		JButton quarentasete = new JButton("");
		quarentasete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[46]== 0) {
					controle[46] = 1;
					if(contador <30) {
						if(randomico()) {
							quarentasete.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							quarentasete.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		quarentasete.setBounds(626, 358, 100, 45);
		contentPane.add(quarentasete);
		
		JButton quarentaoito = new JButton("");
		quarentaoito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[47]== 0) {
					controle[47] = 1;
					if(contador <30) {
						if(randomico()) {
							quarentaoito.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							quarentaoito.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		quarentaoito.setBounds(730, 358, 100, 45);
		contentPane.add(quarentaoito);
		
		JButton trintaquatro = new JButton("");
		trintaquatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[33]== 0) {
					controle[33] = 1;
					if(contador <30) {
						if(randomico()) {
							trintaquatro.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							trintaquatro.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		trintaquatro.setBounds(113, 313, 100, 45);
		contentPane.add(trintaquatro);
		
		JButton trintacinco = new JButton("");
		trintacinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[34]== 0) {
					controle[34] = 1;
					if(contador <30) {
						if(randomico()) {
							trintacinco.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							trintacinco.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		trintacinco.setBounds(215, 313, 100, 45);
		contentPane.add(trintacinco);
		
		JButton trintaseis = new JButton("");
		trintaseis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[35]== 0) {
					controle[35] = 1;
					if(contador <30) {
						if(randomico()) {
							trintaseis.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							trintaseis.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		trintaseis.setBounds(319, 313, 100, 45);
		contentPane.add(trintaseis);
		
		JButton trintasete = new JButton("");
		trintasete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[36]== 0) {
					controle[36] = 1;
					if(contador <30) {
						if(randomico()) {
							trintasete.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							trintasete.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		trintasete.setBounds(422, 313, 100, 45);
		contentPane.add(trintasete);
		
		JButton trintaoito = new JButton("");
		trintaoito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[37]== 0) {
					controle[37] = 1;
					if(contador <30) {
						if(randomico()) {
							trintaoito.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							trintaoito.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		trintaoito.setBounds(525, 313, 100, 45);
		contentPane.add(trintaoito);
		
		JButton trintanove = new JButton("");
		trintanove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[38]== 0) {
					controle[38] = 1;
					if(contador <30) {
						if(randomico()) {
							trintanove.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							trintanove.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		trintanove.setBounds(626, 313, 100, 45);
		contentPane.add(trintanove);
		
		JButton quarenta = new JButton("");
		quarenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[39]== 0) {
					controle[39] = 1;
					if(contador <30) {
						if(randomico()) {
							quarenta.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							quarenta.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		quarenta.setBounds(730, 313, 100, 45);
		contentPane.add(quarenta);
		
		JButton vinteseis = new JButton("");
		vinteseis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[25]== 0) {
					controle[25] = 1;
					if(contador <30) {
						if(randomico()) {
							vinteseis.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							vinteseis.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		vinteseis.setBounds(113, 268, 100, 45);
		contentPane.add(vinteseis);
		
		JButton vintesete = new JButton("");
		vintesete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[26]== 0) {
					controle[26] = 1;
					if(contador <30) {
						if(randomico()) {
							vintesete.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							vintesete.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		vintesete.setBounds(215, 268, 100, 45);
		contentPane.add(vintesete);
		
		JButton vinteoito = new JButton("");
		vinteoito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[27]== 0) {
					controle[27] = 1;
					if(contador <30) {
						if(randomico()) {
							vinteoito.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							vinteoito.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
				
			}
		});
		vinteoito.setBounds(319, 268, 100, 45);
		contentPane.add(vinteoito);
		
		JButton vintenove = new JButton("");
		vintenove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[28]== 0) {
					controle[28] = 1;
					if(contador <30) {
						if(randomico()) {
							vintenove.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							vintenove.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
				
			}
		});
		vintenove.setBounds(422, 268, 100, 45);
		contentPane.add(vintenove);
		
		JButton trinta = new JButton("");
		trinta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[29]== 0) {
					controle[29] = 1;
					if(contador <30) {
						if(randomico()) {
							trinta.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							trinta.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
				
			}
		});
		trinta.setBounds(525, 268, 100, 45);
		contentPane.add(trinta);
		
		JButton trintaum = new JButton("");
		trintaum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[30]== 0) {
					controle[30] = 1;
					if(contador <30) {
						if(randomico()) {
							trintaum.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							trintaum.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
				
			}
		});
		trintaum.setBounds(626, 268, 100, 45);
		contentPane.add(trintaum);
		
		JButton trintadois = new JButton("");
		trintadois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controle[31]== 0) {
					controle[31] = 1;
					if(contador <30) {
						if(randomico()) {
							trintadois.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							trintadois.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
				
			}
		});
		trintadois.setBounds(730, 268, 100, 45);
		contentPane.add(trintadois);
		
		JButton dezoito = new JButton("");
		dezoito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[17]== 0) {
					controle[17] = 1;
					if(contador <30) {
						if(randomico()) {
							dezoito.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							dezoito.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		dezoito.setBounds(113, 222, 100, 45);
		contentPane.add(dezoito);
		
		JButton dezenove = new JButton("");
		dezenove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[18]== 0) {
					controle[18] = 1;
					if(contador <30) {
						if(randomico()) {
							dezenove.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							dezenove.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		dezenove.setBounds(215, 222, 100, 45);
		contentPane.add(dezenove);
		
		JButton vinte = new JButton("");
		vinte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[19]== 0) {
					controle[19] = 1;
					if(contador <30) {
						if(randomico()) {
							vinte.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							vinte.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		vinte.setBounds(319, 222, 100, 45);
		contentPane.add(vinte);
		
		JButton vinteum = new JButton("");
		vinteum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[20]== 0) {
					controle[20] = 1;
					if(contador <30) {
						if(randomico()) {
							vinteum.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							vinteum.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		vinteum.setBounds(422, 222, 100, 45);
		contentPane.add(vinteum);
		
		JButton vintedois = new JButton("");
		vintedois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[21]== 0) {
					controle[21] = 1;
					if(contador <30) {
						if(randomico()) {
							vintedois.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							vintedois.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		vintedois.setBounds(525, 222, 100, 45);
		contentPane.add(vintedois);
		
		JButton vintetres = new JButton("");
		vintetres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[22]== 0) {
					controle[22] = 1;
					if(contador <30) {
						if(randomico()) {
							vintetres.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							vintetres.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		vintetres.setBounds(626, 222, 100, 45);
		contentPane.add(vintetres);
		
		JButton vintequatro = new JButton("");
		vintequatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[23]== 0) {
					controle[23] = 1;
					if(contador <30) {
						if(randomico()) {
							vintequatro.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							vintequatro.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		vintequatro.setBounds(730, 222, 100, 45);
		contentPane.add(vintequatro);
		
		JButton dez = new JButton("");
		dez.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[9]== 0) {
					controle[9] = 1;
					if(contador <30) {
						if(randomico()) {
							dez.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							dez.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		dez.setBounds(113, 176, 100, 45);
		contentPane.add(dez);
		
		JButton onze = new JButton("");
		onze.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[10]== 0) {
					controle[10] = 1;
					if(contador <30) {
						if(randomico()) {
							onze.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							onze.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		onze.setBounds(215, 176, 100, 45);
		contentPane.add(onze);
		
		JButton doze = new JButton("");
		doze.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[11]== 0) {
					controle[11] = 1;
					if(contador <30) {
						if(randomico()) {
							doze.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							doze.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		doze.setBounds(319, 176, 100, 45);
		contentPane.add(doze);
		
		JButton treze = new JButton("");
		treze.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[12]== 0) {
					controle[12] = 1;
					if(contador <30) {
						if(randomico()) {
							treze.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							treze.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		treze.setBounds(422, 176, 100, 45);
		contentPane.add(treze);
		
		JButton quatorze = new JButton("");
		quatorze.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[13]== 0) {
					controle[13] = 1;
					if(contador <30) {
						if(randomico()) {
							quatorze.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							quatorze.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		quatorze.setBounds(525, 176, 100, 45);
		contentPane.add(quatorze);
		
		JButton quinze = new JButton("");
		quinze.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[14]== 0) {
					controle[14] = 1;
					if(contador <30) {
						if(randomico()) {
							quinze.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							quinze.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		quinze.setBounds(626, 176, 100, 45);
		contentPane.add(quinze);
		
		JButton dezesseis = new JButton("");
		dezesseis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[15]== 0) {
					controle[15] = 1;
					if(contador <30) {
						if(randomico()) {
							dezesseis.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							dezesseis.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		dezesseis.setBounds(730, 176, 100, 45);
		contentPane.add(dezesseis);
		
		JButton dois = new JButton("");
		dois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[1]== 0) {
					controle[1] = 1;
					if(contador <30) {
						if(randomico()) {
							dois.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							dois.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		dois.setBounds(113, 132, 100, 45);
		contentPane.add(dois);
		
		JButton tres = new JButton("");
		tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[2]== 0) {
					controle[2] = 1;
					if(contador <30) {
						if(randomico()) {
							tres.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
							
						}
						else {
							tres.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		tres.setBounds(215, 132, 100, 45);
		contentPane.add(tres);
		
		JButton quatro = new JButton("");
		quatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[3]== 0) {
					controle[3] = 1;
					if(contador <30) {
						if(randomico()) {
							quatro.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
							
						}
						else {
							quatro.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		quatro.setBounds(319, 132, 100, 45);
		contentPane.add(quatro);
		
		JButton cinco = new JButton("");
		cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[4]== 0) {
					controle[4] = 1;
					if(contador <30) {
						if(randomico()) {
							cinco.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							cinco.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		cinco.setBounds(422, 132, 100, 45);
		contentPane.add(cinco);
		
		JButton seis = new JButton("");
		seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[5]== 0) {
					controle[5] = 1;
					if(contador <30) {
						if(randomico()) {
							seis.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							seis.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		seis.setBounds(525, 132, 100, 45);
		contentPane.add(seis);
		
		JButton sete = new JButton("");
		sete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[6]== 0) {
					controle[6] = 1;
					if(contador <30) {
						if(randomico()) {
							sete.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							sete.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		sete.setBounds(626, 132, 100, 45);
		contentPane.add(sete);
		
		JButton oito = new JButton("");
		oito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(controle[7]== 0) {
					controle[7] = 1;
					if(contador <30) {
						if(randomico()) {
							oito.setIcon(navio);
							contador++;
							String cont = Integer.toString(contador);
							acerta.setText(cont);
						}
						else {
							oito.setIcon(errou);
							perder++;
							String cont2 = Integer.toString(perder);
							erro.setText(cont2);
						}
							}
						}
			}
		});
		oito.setBounds(730, 132, 100, 45);
		contentPane.add(oito);
		
		//inseriricones

		um.setIcon(agua);
		dois.setIcon(agua);
		tres.setIcon(agua);
		quatro.setIcon(agua);
		cinco.setIcon(agua);
		seis.setIcon(agua);
		sete.setIcon(agua);
		oito.setIcon(agua);
		nove.setIcon(agua);
		dez.setIcon(agua);
		onze.setIcon(agua);
		doze.setIcon(agua);
		treze.setIcon(agua);
		quatorze.setIcon(agua);
		quinze.setIcon(agua);
		dezesseis.setIcon(agua);
		dezessete.setIcon(agua);
		dezoito.setIcon(agua);
		dezenove.setIcon(agua);
		vinte.setIcon(agua);
		vinteum.setIcon(agua);
		vintedois.setIcon(agua);
		vintetres.setIcon(agua);
		vintequatro.setIcon(agua);
		vintecinco.setIcon(agua);
		vinteseis.setIcon(agua);
		vintesete.setIcon(agua);
		vinteoito.setIcon(agua);
		vintenove.setIcon(agua);
		trinta.setIcon(agua);
		trintaum.setIcon(agua);
		trintadois.setIcon(agua);
		trintatres.setIcon(agua);
		trintaquatro.setIcon(agua);
		trintacinco.setIcon(agua);
		trintaseis.setIcon(agua);
		trintasete.setIcon(agua);
		trintaoito.setIcon(agua);
		trintanove.setIcon(agua);
		quarenta.setIcon(agua);
		quarentaum.setIcon(agua);
		quarentadois.setIcon(agua);
		quarentatres.setIcon(agua);
		quarentaquatro.setIcon(agua);
		quarentacinco.setIcon(agua);
		quarentaseis.setIcon(agua);
		quarentasete.setIcon(agua);
		quarentaoito.setIcon(agua);
		quarentanove.setIcon(agua);
		cinquenta.setIcon(agua);
		cinquentaum.setIcon(agua);
		cinquentadois.setIcon(agua);
		cinquentatres.setIcon(agua);
		cinquentaquatro.setIcon(agua);
		cinquentacinco.setIcon(agua);
		cinquentaseis.setIcon(agua);
		cinquentasete.setIcon(agua);
		cinquentaoito.setIcon(agua);
		cinquentanove.setIcon(agua);
		sessenta.setIcon(agua);
		sessentaum.setIcon(agua);
		sessentadois.setIcon(agua);
		sessentatres.setIcon(agua);
		sessentaquatro.setIcon(agua);
		
		JLabel lblNewLabel = new JLabel("ACERTOS");
		lblNewLabel.setForeground(new Color(47, 79, 79));
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBackground(new Color(0, 0, 255));
		lblNewLabel.setBounds(434, 11, 221, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblErros = new JLabel("ERROS");
		lblErros.setForeground(new Color(255, 51, 0));
		lblErros.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 40));
		lblErros.setBackground(Color.BLUE);
		lblErros.setBounds(434, 71, 221, 49);
		contentPane.add(lblErros);
		
		
		}
		
	}
	    

