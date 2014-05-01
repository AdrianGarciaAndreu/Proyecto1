package graficos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Ventana extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public  Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		setResizable(false);
		
		JLabel lblAdrinGarcaLista = new JLabel("Adri\u00E1n Garc\u00EDa Lista de cosas pendientes");
		lblAdrinGarcaLista.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAdrinGarcaLista.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblAdrinGarcaLista, BorderLayout.NORTH);
		
		JList list = new JList();
		list.setVisibleRowCount(5);
		list.setValueIsAdjusting(true);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		getContentPane().add(list, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		DefaultListModel modelo = new DefaultListModel();
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String tmp=null;
				tmp=JOptionPane.showInputDialog(null, "Introduzca lo deseado");
				list.add(new JLabel(tmp));
				modelo.addElement(tmp);			
				list.setModel(modelo);
			}
		});
		panel.add(btnAdd);
	}

}
