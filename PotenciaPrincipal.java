package Pot; 
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import java.awt.event.*;
import javax.swing.JLabel;
public class PotenciaPrincipal extends JanelaPotencia {
	private JDesktopPane painel;
	private JMenu menu;
	public PotenciaPrincipal(int largura, int altura , String titulo) {
		this.setlargura(largura);
		this.setaltura(altura);
		this.settitulo(titulo);
		this.setLayout(null);
		this.inicializa();
		this.inicializar();
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
	}	
	public void inicializa() {
		JLabel numeros = new JLabel("Potencia Elétrica");
		numeros.setBounds(0,0,179,49);
		getContentPane().add(numeros);	
		JButton btnCalcular = new JButton("Calcule o consumo");
		btnCalcular.setBounds(0,40,185,25);
		btnCalcular.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e) {
			double ampere=Double.parseDouble(JOptionPane.showInputDialog(null, "Ampere"));
			double tomada=Double.parseDouble(JOptionPane.showInputDialog(null, "Voltagem da tomada"));
			double consumo=ampere*tomada;
			JOptionPane.showMessageDialog(null, "O som consome "+consumo+" watts");
	}
	});
		this.add(btnCalcular);
}
	public void inicializar() {
		JButton butCalcular = new JButton("Calcule a potência");
		butCalcular.setBounds(0,80,185,25);
		butCalcular.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e) {
			double voltagem=Double.parseDouble(JOptionPane.showInputDialog(null, "Voltagem do som"));
			int ohms=Integer.parseInt(JOptionPane.showInputDialog(null, "Impedância"));
			int saida=Integer.parseInt(JOptionPane.showInputDialog(null,"Quantidade de saídas"));
			double canal=(voltagem*voltagem)/ohms;
			double potencia=canal*saida;
			JOptionPane.showMessageDialog(null, "Potência por canal: "+canal+" watts");
			JOptionPane.showMessageDialog(null, "Potência total: "+potencia+" watts");
	}
	});
		this.add(butCalcular);
}
	@Override
	public void actionPerformed(ActionEvent e) {	
	}
}