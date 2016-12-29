/**
 * SIMULADOR DE ESCALONAMENTO DE PROCESSOS.
 * 
 * GRUPO:
 * 
 * Alexandre Prata	CA: 14044676
 * Eric Satoshi		CA: 14057123
 * Marcelo			CA: 14061333
 * Patterson		CA: 14055899
 * 
 */

import java.awt.EventQueue;

import javax.swing.JFrame;



/**
 * @author patterson
 * 
 * Main - Classe principal responsável por executar a aplicação.
 * Cria e inicializa a tela principal TelaEscalonador
 */
public class Main {

	private JFrame schedulerFrame;

	/**
	 * Lança a aplicação.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.schedulerFrame.setVisible(true);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		});
	}

	/**
	 * Cria a aplicação.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Inicializa os conteúdos do frame.
	 */
	private void initialize() {
		schedulerFrame = new TelaEscalonador("Simulador de Escalonamento de Processos");
		schedulerFrame.setBounds(100, 100, 800, 600);
		schedulerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
