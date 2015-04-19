package com.dakkra.pyxleos.model;


import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MainModel {
	public final String version = "0.1.9";
	public String applicationName = "PyxleOS";
	public String applicationNameVersion = applicationName+" "+version;
	//main frame
	public JFrame mainFrame;
	//main menu bar
	public JMenuBar menuBar;
	//main jdpane
	public JDesktopPane mainJDPane;
	
	//internal frames
	public JInternalFrame textEditor;
	
	//file menu
	public JMenu fileMenu;
	//file menu items
	public JMenuItem fileQuit;
	public JMenuItem fileNew;
	public JMenuItem fileOpen;
	public JMenuItem fileSave;
	
	//tools menu
	public JMenu toolsMenu;
	//tools menu items
	public JMenuItem toolTextEditor;
	
	//about menu
	public JMenu aboutMenu;
	//about menu item
	public JMenuItem aboutAbout;
	public JMenuItem aboutTrello;
	public JMenuItem aboutGithub;
	public JMenuItem aboutSourceForge;
	public JMenuItem aboutWebsite;
	
}
