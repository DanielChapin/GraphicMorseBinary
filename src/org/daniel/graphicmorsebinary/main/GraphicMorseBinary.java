package org.daniel.graphicmorsebinary.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.daniel.graphicmorsebinary.graphics.GMBPanel;

public class GraphicMorseBinary {

	// SOS = DOT + INTRA + DOT + INTRA + DOT + INTER + DASH + INTRA + DASH + INTRA + DASH + INTER + DOT + INTRA + DOT + INSTRA + DOT
	private static final byte[] DOT = { 1 }, DASH = { 1, 1, 1 }, INTRASPACE = { 0 }, INTERSPACE = { 0, 0, 0 },
			SPACE = { 0, 0, 0, 0, 0, 0, 0 };

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		byte[] sos = { 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1 };
		new GMBPanel(sos);
	}

}
