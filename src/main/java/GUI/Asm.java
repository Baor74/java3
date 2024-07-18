/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.UIManager;

/**
 *
 * @author Admin
 */
public class Asm {
    public static void main(String[] args) {
        frmLoginASM l = new frmLoginASM();
        l.setVisible(true);
        try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
        }
    }
}
