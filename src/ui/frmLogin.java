package ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class frmLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JTextField txtdni;
	JPasswordField txtpasswordd;
	dao.EmpleadoDAO empleadoDAO = new dao.EmpleadoDAO();
	bean.Empleado empleado = new bean.Empleado();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmLogin frame = new frmLogin();
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
	public frmLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 400, 300);
		getContentPane().setLayout(null);
		setUndecorated(true);
		setLocationRelativeTo(null);
		
		JPanel pnlLogin = new JPanel();
		pnlLogin.setBackground(new Color(94,17,90));
		pnlLogin.setBounds(0,0,400,30);
		getContentPane().add(pnlLogin);
		
		JLabel imgLogo = new JLabel();
		imgLogo.setBounds(96,5,208,43);
		pnlLogin.add(imgLogo);
		
		JLabel imgCerrar = new JLabel();
		imgCerrar.setBounds(370,10,16,16);
		pnlLogin.add(imgCerrar);
		
		
		
		
		JLabel lblDni = new JLabel("DNI :");
		lblDni.setBounds(100,80,80,30);
		getContentPane().add(lblDni);
		
		JLabel lblPasswordd = new JLabel("PASSWORD :");
		lblPasswordd.setBounds(100,120,80,30);
		getContentPane().add(lblPasswordd);
		
		JTextField txtdni = new JTextField();
		txtdni.setBounds(180,80,80,30);
		txtdni.setMargin(new Insets(5, 8, 5, 8));
		getContentPane().add(txtdni);
		
		JPasswordField txtpasswordd = new JPasswordField();
		txtpasswordd.setBounds(180,120,80,30);
		txtpasswordd.setMargin(new Insets(5, 8, 5, 8));
		getContentPane().add(txtpasswordd);
		
		JButton btnIniciar = new JButton("Iniciar");
		
		
		
		btnIniciar.setBounds(75,180,100,30);
		btnIniciar.setFocusPainted(false);
		btnIniciar.setBorderPainted(false);
		btnIniciar.setBackground(new Color(94,17,90));
		btnIniciar.setForeground(Color.WHITE);
		getContentPane().add(btnIniciar);
		
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(225,180,100,30);
		btnCancelar.setFocusPainted(false);
		btnCancelar.setBorderPainted(false);
		btnCancelar.setBackground(new Color(94,17,90));
		btnCancelar.setForeground(Color.WHITE);
		getContentPane().add(btnCancelar);
		
		
		
		
		btnIniciar.addFocusListener(new FocusAdapter() {
			@Override public void focusGained(FocusEvent e) {
				btn_focusGained(btnIniciar);
			}
			@Override public void focusLost(FocusEvent e) {
			    btn_focusLost(btnIniciar);
			} });
		
		btnIniciar.addMouseListener(new MouseAdapter() {
			@Override public void mouseEntered(MouseEvent e) {
				btn_focusGained(btnIniciar);
			}
			@Override public void mouseExited(MouseEvent e) {
				btn_focusLost(btnIniciar);
			} });
		
		btnIniciar.addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {
				btnIniciarActionPerfomed();
			} });
		
		
		btnCancelar.addFocusListener(new FocusAdapter() {
			@Override public void focusGained(FocusEvent e) {
				btn_focusGained(btnCancelar);
			}
			@Override public void focusLost(FocusEvent e) {
			    btn_focusLost(btnCancelar);
			} });
		
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override public void mouseEntered(MouseEvent e) {
				btn_focusGained(btnCancelar);
			}
			@Override public void mouseExited(MouseEvent e) {
				btn_focusLost(btnCancelar);
			} });
		
		btnCancelar.addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {
				btnCancelarActionPerfomed();
			} });
		
		imgCerrar.addMouseListener(new MouseAdapter() { 
			@Override public void mouseClicked(MouseEvent e) {
				btnCancelarActionPerfomed();
			} });
		
	}

	protected void btnCancelarActionPerfomed() {
		
		if (JOptionPane.showConfirmDialog(this, "Desea Salir") == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
		
	}

	protected void btnIniciarActionPerfomed() {
		// TODO Auto-generated method stub
		
		
	}

	protected void btn_focusLost(JButton btn) {
		btn.setBackground(new Color(94,17,40));
		
		
	}

	protected void btn_focusGained(JButton btn) {
		// TODO Auto-generated method stub
		btn.setCursor(new Cursor( Cursor.HAND_CURSOR));
		btn.setBackground(Color.BLACK);
	}
	
	

}
