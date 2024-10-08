package controller;

import java.awt.CardLayout;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.DoAnView;
import view.GiaoDien;

public class DoAnController implements ActionListener{
    private DoAnView doAnView;
    private GiaoDien giaoDien;
    

    public DoAnController (DoAnView doAnView) {
    	this.doAnView = doAnView;
    }

	public DoAnController(GiaoDien giaoDien) {
		this.giaoDien = giaoDien;
	}
	 public void changeCard(String cardName) {
	        CardLayout cl = (CardLayout) (doAnView.getCards().getLayout());
	        cl.show(doAnView.getCards(), cardName);
	    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}


	
