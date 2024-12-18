package org.mql.java.reflection;

import javax.swing.SwingUtilities;

import org.mql.java.reflection.ui.ClassParserFrame;

public class Examples {

	public Examples() {
			exp02();
	
	}

	
	void exp01() {
        ClassParser parser = new ClassParser("org.mql.java.reflection.classes.Etudiant");
        try {
            System.out.println(parser.parseClass());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
	}
	void exp02() {
    SwingUtilities.invokeLater(() -> {
        ClassParserFrame ui = new ClassParserFrame();
        ui.setVisible(true);
    });
	}
	
	public static void main(String[] args) {
		new Examples();
	}
}
