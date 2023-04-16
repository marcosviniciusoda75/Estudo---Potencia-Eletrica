package Pot;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
public abstract class JanelaPotencia extends JFrame implements ActionListener{
	private int largura;
	private int altura;
	private String titulo;
	public int getlargura() {
		return largura;
	}
	public void setlargura(int largura) {
		this.largura=largura;
	}
	public int getaltura() {
		return altura;
	}
	public void setaltura(int altura) {
		this.altura=altura;
	}
	public String gettitulo() {
		return titulo;
	}
	public void settitulo(String titulo) {
		this.titulo=titulo;
	}
	public void inicializa() {
		this.setSize(this.getlargura(),this.getaltura());
		this.setTitle(this.gettitulo());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.repaint();
	}
	public void inicializar() {
		this.setSize(this.getlargura(),this.getaltura());
		this.setTitle(this.gettitulo());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.repaint();
	}
}