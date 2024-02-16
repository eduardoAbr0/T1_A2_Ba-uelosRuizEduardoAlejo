import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

class VentanaPrincipal extends JFrame{
	public VentanaPrincipal() {
	getContentPane().setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(750,500);
	setLocationRelativeTo(null);
	setTitle("Formulario");
	setVisible(true);
	
	Font myFont1 = new Font("Arial", Font.BOLD, 12);
	
	//TEXTO INTRODUCTORIO
	JLabel txtTexto1 = new JLabel("<html>The Classic Form includes all visible fields for this list.<html>");
	txtTexto1.setBounds(10, 0, 250, 30);
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
	chForm.setBounds(5,75,20, 15);
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
	chBox1.setBounds(5, 250, 20, 15);
	add(chBox1);
	JLabel txtCh1 = new JLabel("interest group fields");
	txtCh1.setBounds(30, 250,150, 15);
	txtCh1.setFont(myFont1);
	add(txtCh1);
	JCheckBox chBox2 = new JCheckBox();
	chBox2.setBounds(5, 270, 20, 15);
	add(chBox2);
	JLabel txtCh2 = new JLabel("required field indicator");
	txtCh2.setBounds(30, 270,150, 15);
	txtCh2.setFont(myFont1);
	add(txtCh2);
	
	//CAMPOTEXTO
	JLabel txtCampo = new JLabel("Set from width");
	txtCampo.setBounds(5,310,100,15);
	txtCampo.setFont(myFont1);
	add(txtCampo);
	JTextField campoTxt1 = new JTextField();
	campoTxt1.setBounds(5,330,250,15);
	add(campoTxt1);
	//CHECKBOX
	JCheckBox chBoxC1 = new JCheckBox();
	chBoxC1.setBounds(5, 350, 20, 15);
	add(chBoxC1);
	JLabel txtChC1 = new JLabel("enable evil popup mode");
	txtChC1.setBounds(30, 350,150, 15);
	txtChC1.setFont(myFont1);
	add(txtChC1);
	JCheckBox chBoxC2 = new JCheckBox();
	chBoxC2.setBounds(5, 370, 20, 15);
	add(chBoxC2);
	JLabel txtChC2 = new JLabel("disable all JavaScript");
	txtChC2.setBounds(30, 370,150, 15);
	txtChC2.setFont(myFont1);
	add(txtChC2);
	JCheckBox chBoxC3 = new JCheckBox();
	chBoxC3.setBounds(5, 390, 20, 15);
	add(chBoxC3);
	JLabel txtChC3 = new JLabel("include archive link");
	txtChC3.setBounds(30, 390,150, 15);
	txtChC3.setFont(myFont1);
	add(txtChC3);
	JCheckBox chBoxC4 = new JCheckBox();
	chBoxC4.setBounds(5, 410, 20, 15);
	add(chBoxC4);
	JLabel txtChC4 = new JLabel("include MonkeyRewards link");
	txtChC4.setBounds(30, 410,200, 15);
	txtChC4.setFont(myFont1);
	add(txtChC4);
	
	//2COLUMNA(PREVIEW)
	JLabel txtTexto2 = new JLabel("<html>Preview<html>");
	txtTexto2.setBounds(300, 0, 50, 20);
	txtTexto2.setFont(myFont1);
	add(txtTexto2);
	//EMAIL
	JLabel txtEmailt = new JLabel("Email Adress");
	txtEmailt.setBounds(330, 30, 100, 20);
	add(txtEmailt);
	JFormattedTextField txtEmail = new JFormattedTextField();
	txtEmail.setBounds(330, 50, 300, 20);
	add(txtEmail);
	//PRIMER NOMBRE
	JLabel txtNombret = new JLabel("First name");
	txtNombret.setBounds(330, 80, 100, 20);
	add(txtNombret);
	JTextField txtNombre = new JFormattedTextField();
	txtNombre.setBounds(330, 100, 300, 20);
	add(txtNombre);
	//APELLIDOS
	JLabel txtApellidost = new JLabel("Email Adress");
	txtApellidost.setBounds(330, 130, 100, 20);
	add(txtApellidost);
	JTextField txtApellidos = new JFormattedTextField();
	txtApellidos.setBounds(330, 150, 300, 20);
	add(txtApellidos);
	//BOTONSUB
	JButton bttSub = new JButton("Suscribe");
	bttSub.setBounds(330, 180, 100, 20);
	add(bttSub);
	
	//CAJATEXTO
	JLabel txtFtexto = new JLabel("Copy/paste into your site");
	txtFtexto.setBounds(330, 230, 150, 20);
	add(txtFtexto);
	JTextField txtTextoG = new JTextField();
	txtTextoG.setBounds(330,250,380,200);
	add(txtTextoG);
	
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
