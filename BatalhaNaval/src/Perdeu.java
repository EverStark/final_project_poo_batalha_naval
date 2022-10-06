import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Perdeu extends JFrame {
	static String caminho = System.getProperty("user.dir");
	ImageIcon venceu = new ImageIcon(caminho + "/img/perdeu.png");
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	 
	public Perdeu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 508, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(venceu);
		lblNewLabel.setBounds(0, 0, 520, 520);
		contentPane.add(lblNewLabel);
	}
}
