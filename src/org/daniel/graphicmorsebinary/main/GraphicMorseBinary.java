package org.daniel.graphicmorsebinary.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.daniel.graphicmorsebinary.graphics.GMBPanel;

public class GraphicMorseBinary {
	
	private static final byte[] DOT = {1}, DASH = {1, 1, 1}, PAUSE = {0};

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		byte[] hello = {1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1};
		new GMBPanel(hello);
	}

}
