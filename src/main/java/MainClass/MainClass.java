/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClass;

import GUIs.MainController;
import javax.swing.SwingUtilities;

/**
 *
 * @author ravindu
 */
public class MainClass {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainController mainController = new MainController();
            mainController.setVisible(true);
        });
    }
}
