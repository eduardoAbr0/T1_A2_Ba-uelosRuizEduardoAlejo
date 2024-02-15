import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

class VentanaPrincipal extends JFrame{
	public VentanaPrincipal() {
	getContentPane().setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(400,400);
	setLocationRelativeTo(null);
	setTitle("Formulario");
	setVisible(true);
	
	Font myFont1 = new Font("Arial", Font.BOLD, 12);
	
	//TEXTO INTRODUCTORIO
	JLabel txtTexto1 = new JLabel("The Classic Form includes all visible fields for this list.");
	txtTexto1.setBounds(10, 10, 320, 10);
	txtTexto1.setFont(myFont1);
	add(txtTexto1);
	
	//FORM OPTIONS
	JLabel txtForm = new JLabel("Form options");
	txtForm.setBounds(10,40,100,10);
	txtForm.setFont(myFont1);
	add(txtForm);
	//FORM TEXTO
	JLabel txtFormText = new JLabel("Include the following:");
	txtFormText.setBounds(10,60,200,10);
	txtFormText.setFont(myFont1);
	add(txtFormText);
	//FORM CHECKBOX
	JCheckBox chForm = new JCheckBox();
	chForm.setBounds(5,75,30,20);
	add(chForm);
	//FORM CHECKBOX TEXT
	JLabel txtCheckForm = new JLabel("A tittle for your form");
	txtCheckForm.setBounds(30,80,150,10);
	txtCheckForm.setFont(myFont1);
	add(txtCheckForm);
	//FORM CAJA TEXTO
	JTextField txtCheckFormText = new JTextField();
	txtCheckFormText.setBounds(5,95,250,20);
	txtCheckFormText.setFont(myFont1);
	add(txtCheckFormText);
	
	//RADIO BUTTONS
	JRadioButton radioB1 = new JRadioButton();
	radioB1.setBounds(5,150,25,20);
	add(radioB1);
	JLabel txtRadio1 = new JLabel("only required fields");
	txtRadio1.setBounds(30, 152,200, 15);
	txtRadio1.setFont(myFont1);
	add(txtRadio1);
	JRadioButton radioB2 = new JRadioButton();
	radioB2.setBounds(5,170,25,20);
	add(radioB2);
	JLabel txtRadio2 = new JLabel("all fields");
	txtRadio2.setBounds(30, 172,100, 15);
	txtRadio2.setFont(myFont1);
	add(txtRadio2);
	JLabel txtRadioW = new JLabel("(edit required fields in the form builder)");
	txtRadioW.setBounds(25,195,250,15);
	txtRadioW.setFont(myFont1);
	add(txtRadioW);
	
	//CHECK BOXES
	JCheckBox chBox1 = new JCheckBox();
	chBox1.setBounds(5, 250, 30, 20);
	add(chBox1);
	JLabel txtCh1 = new JLabel("");
	txtRadio2.setBounds(30, 172,100, 15);
	txtRadio2.setFont(myFont1);
	add(txtRadio2);
	}
}
public class A2 {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new VentanaPrincipal();
			}
		});
	}

}
