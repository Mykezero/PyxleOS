package com.dakkra.pyxleos.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import com.dakkra.pyxleos.model.CanvasModel;
import com.dakkra.pyxleos.model.MainModel;

public class CanvasView {
	MainModel m;
	CanvasModel cvm;
	
	public static final Color canvasBG = new Color(80,80,80);
	
	public CanvasView(MainModel m){
		this.m = m;
	}
	
	public void createAndShowGUI(MainModel m,CanvasModel cvm){
		this.m = m;
		this.cvm = cvm;
		
		cvm.menuBar = new JMenuBar();
		//file menu
		cvm.fileMenu = new JMenu(" File ");
		cvm.fileNew = new JMenuItem("New");
		cvm.fileOpen = new JMenuItem("Open");
		cvm.fileSave = new JMenuItem("Save");
		cvm.fileExit = new JMenuItem("Exit");
		cvm.fileExit.addActionListener(new ExitListener());
		cvm.fileMenu.add(cvm.fileNew);
		cvm.fileMenu.add(cvm.fileOpen);
		cvm.fileMenu.add(cvm.fileSave);
		cvm.fileMenu.add(cvm.fileExit);
		//all together
		cvm.menuBar.add(cvm.fileMenu);
		
		cvm.canvasFrame = new JInternalFrame("Canvas",true,true,true,true);
		cvm.canvasFrame.setBounds(520, 10, 400, 400);
		cvm.canvasFrame.setJMenuBar(cvm.menuBar);
		cvm.canvasFrame.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
		
		cvm.canvasPanel = new JPanel();
		cvm.canvasPanel.setBackground(canvasBG);
		cvm.canvasPanel.setSize(new Dimension(cvm.canvasFrame.getWidth(),cvm.canvasFrame.getHeight()));
		
		cvm.canvasFrame.add(cvm.canvasPanel);
		
		cvm.canvasFrame.setVisible(true);
		m.mainJDPane.add(cvm.canvasFrame);
	}
	private class ExitListener implements ActionListener{
	    public void actionPerformed(ActionEvent e) {
	    	cvm.canvasFrame.dispose();
	    	
	    }
	}
}