//Do stuff (google java 2d game tutorial-> zetcode & gametutorial)
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.event.KeyEvent;//Selvitä miten toimii
public class Application extends JFrame{
	
	public Application(){
		
		initUI();
		
	}
	
	private void initUI(){
		
		add(new Board());
		
		this.setUndecorated(false);//Poistaa reunat
		//this.setExtendedState(this.MAXIMIZED_BOTH);//Asettaa fullscreeniin
		
		setTitle("Application");//Vaihtaa ohjelman nimen ikkunana yläreunassa.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Sulkee ohjelman, kun ikkuna suljetaan
		setLocationRelativeTo(null);//Asettaa ikkunan keskelle näyttöä
		
	}
	
	public static void main(String []args){
		
		EventQueue.invokeLater(new Runnable(){
			
			@Override
			public void run(){
				
				Application ex = new Application();
				ex.setVisible(true);//Asettaa ikkunan näkyviin
				
			}
			
		});
		
	}
	
}
