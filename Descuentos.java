package unico;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Descuentos {

	public static void main(String[] args) {
		/*
		 * Descuentos-Realizar un programa en JAVA que calcule los descuentos a aplicar
		 * a una compra seg�n los siguientes criterios: � Si la compra es superior a 100
		 * unidades, aplicar un 40% de descuento. � Si la compara est� entre 25 y 100
		 * unidades, 20% de descuento � Si la compra est� entre 10 y 24 unidades,
		 * realizar un 10% de descuento. � Si la compra es inferior a 10 unidades, no se
		 * aplica descuento. Se nos pedir� por teclado C�digo art�culo, Precio y
		 * Unidades. Se obtendr� como resultado el C�digo del art�culo, el Subtotal a
		 * pagar, el Descuento aplicado y el Total a pagar
		 */
		Frame v = new Frame();
		v.setBounds(20, 20, 800, 400);
		v.setVisible(true);
		v.setLayout(null);
		v.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});
		Label lblCod = new Label("CodArticulo:");
		lblCod.setBounds(30, 30, 70, 25);
		Label lblPre = new Label("Precio:");
		lblPre.setBounds(30, 70, 70, 25);
		Label lblUnid = new Label("Unidades:");
		lblUnid.setBounds(30, 110, 150, 25);
		Label lblInfo = new Label("Info:");
		lblInfo.setBounds(30, 190, 50, 25);
		v.add(lblCod);
		v.add(lblPre);
		v.add(lblUnid);
		v.add(lblInfo);
		TextField txtCod = new TextField();
		txtCod.setBounds(230, 30, 100, 25);
		TextField txtPrec = new TextField();
		txtPrec.setBounds(230, 70, 70, 25);
		TextField txtUnid = new TextField();
		txtUnid.setBounds(230, 110, 70, 25);
		Label lblInfo1 = new Label();
		lblInfo1.setBounds(230, 190, 600, 25);
		v.add(txtCod);
		v.add(txtPrec);
		v.add(txtUnid);
		v.add(lblInfo1);
		Button btnAceptar = new Button("Aceptar");
		btnAceptar.setBounds(550, 300, 70, 25);
		btnAceptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// Integer.parseInt(txtPrec.getText()) *
				Double compra = Double.parseDouble(txtPrec.getText()) * Integer.parseInt(txtUnid.getText());
				Integer unidades = Integer.parseInt(txtUnid.getText());
				Double var_Descuento = 0.0;
				if (unidades >400) {
					var_Descuento = .4;
					}
				if (unidades > 25 && unidades < 100) {
					var_Descuento = .20;
					}
				if (unidades > 10 && unidades < 24) {
					var_Descuento = .10;
					}
				if (unidades< 10) {
					var_Descuento = 0.0;
				}
					Double desc = compra - compra * var_Descuento;
					          Double i = 100.00 * var_Descuento;
					/*
					 * por si necesito String String descuento = desc.toString(); String subtotal =
					 * compra.toString(); String codigo = txtCod.getText().toString();
					 */
					lblInfo1.setText("Codigo Articulo:  " +   txtCod.getText().toString() + " , Subtotal:  " + compra.toString() + " ,    "
							+ "Descuento Aplicado =" + i + " %  , Total: " + desc.toString());
			}
		});
		Button btnCancelar = new Button("Cancelar");
		btnCancelar.setBounds(150, 300, 70, 25);
		btnCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		v.add(btnAceptar);
		v.add(btnCancelar);
	}
}
