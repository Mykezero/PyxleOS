package com.dakkra.pyxleos;

import com.dakkra.pyxleos.controller.MainController;
import com.dakkra.pyxleos.model.MainModel;
import com.dakkra.pyxleos.modules.TextEdit;
import com.dakkra.pyxleos.view.MainView;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Starting up...");
		
		MainView v = new MainView();
		MainModel m = new MainModel();
		MainController c = new MainController();
		
		//Assign the sub-main classes to point to the mains objects
		v.c = c;
		v.m = m;
		c.m = m;
		c.v = v;
		System.out.println("Welcome to PyxleOS! Version: "+m.version);
		//Start GUI
		System.out.println("Displaying GUI");
		v.createAndShowGUI();
		TextEdit openingNotes = new TextEdit(m);
		openingNotes.setText("Welcome to PyxleOS!\n\nIn this version, a text editor was added\n\nMade with love and Java,\n	Chris Soderquist");
	}

}
