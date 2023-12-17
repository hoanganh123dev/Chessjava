package com.gold.thumb.chess;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class ChessPanel extends JPanel {
	
	@Override
	protected void paintChildren(Graphics g) {
		super.paintChildren(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		g2.fillRect(0, 0, 600/8, 600/8);
	}
}
