/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIs;

import Interfaces.DefenceSystem;
import Interfaces.DefenceUnit;
import Strength.Strength;
import javax.swing.SwingUtilities;

/**
 *
 * @author ravindu
 */
public class Helicopter extends javax.swing.JFrame implements DefenceUnit {

    /**
     * Creates new form Helicopter
     *
     * @param defenceUnit
     */
    public Helicopter(DefenceSystem defenceUnit) {
        this.defenceUnit = defenceUnit;
        setTitle("Helicopter");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaLabel = new javax.swing.JLabel();
        shootBtn = new javax.swing.JButton();
        laserBtn = new javax.swing.JButton();
        missileBtn = new javax.swing.JButton();
        soldierLabel = new javax.swing.JLabel();
        ammoLabel = new javax.swing.JLabel();
        ammoCount = new javax.swing.JSpinner();
        soldierCount = new javax.swing.JSpinner();
        positionCheckBox = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainControllerMsg = new javax.swing.JTextArea();
        helicopterMsg = new javax.swing.JTextField();
        sendBtn = new javax.swing.JButton();
        helicopterFuel = new javax.swing.JSlider();
        fuelLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areaLabel.setText("Area Not Cleared");

        shootBtn.setText("Shoot");

        laserBtn.setText("Laser Operation");

        missileBtn.setText("Missile Operation");

        soldierLabel.setText("Soldier Count");

        ammoLabel.setText("Ammo Count");

        ammoCount.setModel(new javax.swing.SpinnerNumberModel(100, 0, null, 1));

        soldierCount.setModel(new javax.swing.SpinnerNumberModel(100, 0, null, 1));

        positionCheckBox.setText("Position");
        positionCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionCheckBoxActionPerformed(evt);
            }
        });

        mainControllerMsg.setEditable(false);
        mainControllerMsg.setColumns(20);
        mainControllerMsg.setRows(5);
        jScrollPane1.setViewportView(mainControllerMsg);

        sendBtn.setText("Send");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });

        helicopterFuel.setMajorTickSpacing(25);
        helicopterFuel.setOrientation(javax.swing.JSlider.VERTICAL);
        helicopterFuel.setPaintLabels(true);
        helicopterFuel.setPaintTicks(true);
        helicopterFuel.setValue(100);
        helicopterFuel.setMaximumSize(new java.awt.Dimension(46, 100));

        fuelLabel.setText("Fuel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(shootBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(laserBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(areaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(missileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(positionCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ammoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(soldierLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(soldierCount)
                                    .addComponent(ammoCount)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(helicopterMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(helicopterFuel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fuelLabel))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaLabel)
                    .addComponent(fuelLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(helicopterFuel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(shootBtn)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(missileBtn)
                                        .addComponent(soldierLabel)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(laserBtn)
                                    .addComponent(ammoLabel)))
                            .addComponent(soldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ammoCount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(positionCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(helicopterMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sendBtn))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void positionCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionCheckBoxActionPerformed
        boolean positionChecked = positionCheckBox.isSelected();
        updateButtons(positionChecked, currentStrengthLevel);
    }//GEN-LAST:event_positionCheckBoxActionPerformed

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        String message = helicopterMsg.getText();
        sendHelicopterMessage(message);
    }//GEN-LAST:event_sendBtnActionPerformed

    @Override
    public void setAreaLabel(String text) {
        areaLabel.setText(text);
    }

    public void setShootButtonEnabled(boolean enabled) {
        shootBtn.setEnabled(enabled);
    }

    public void setMissileButtonEnabled(boolean enabled) {
        missileBtn.setEnabled(enabled);
    }

    public void setLaserButtonEnabled(boolean enabled) {
        laserBtn.setEnabled(enabled);
    }

    @Override
    public void setPositionSliderValue(int sliderValue) {
        this.positionSliderValue = sliderValue;
        updateButtons(positionCheckBox.isSelected(), currentStrengthLevel);
    }

    @Override
    public void setStrength(Strength strength) {
        this.currentStrengthLevel = strength;
        updateButtons(positionCheckBox.isSelected(), currentStrengthLevel);
    }

    private void updateButtons(boolean positionChecked, Strength strength) {
        if (positionChecked) {
            switch (strength) {
                case CLOSED:
                    setShootButtonEnabled(false);
                    setMissileButtonEnabled(false);
                    setLaserButtonEnabled(false);
                    break;
                case LOW:
                    setShootButtonEnabled(true);
                    setMissileButtonEnabled(false);
                    setLaserButtonEnabled(false);
                    break;
                case MEDIUM:
                    setShootButtonEnabled(true);
                    setMissileButtonEnabled(true);
                    setLaserButtonEnabled(false);
                    break;
                case HIGH:
                    setShootButtonEnabled(true);
                    setMissileButtonEnabled(true);
                    setLaserButtonEnabled(true);
                    break;
                case STRONG:
                    setShootButtonEnabled(true);
                    setMissileButtonEnabled(true);
                    setLaserButtonEnabled(true);
                    break;
                default:
                    setShootButtonEnabled(false);
                    setMissileButtonEnabled(false);
                    setLaserButtonEnabled(false);
            }
        } else {
            setShootButtonEnabled(false);
            setMissileButtonEnabled(false);
            setLaserButtonEnabled(false);
        }
    }

    @Override
    public void sendMessage(String message) {
        defenceUnit.sendMessage("Helicopter: " + message);
    }

    @Override
    public void onMessageReceived(String message) {
        mainControllerMsg.append(message + "\n");
    }

    private void sendHelicopterMessage(String message) {
        sendMessage(message);
        helicopterMsg.setText("");
    }

    @Override
    public int getSoldierCount() {
        return (int) soldierCount.getValue();
    }

    @Override
    public int getAmmoCount() {
        return (int) ammoCount.getValue();
    }

    @Override
    public int getFuelCount() {
        return helicopterFuel.getValue();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            Helicopter helicopter = new Helicopter(null);
            helicopter.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner ammoCount;
    private javax.swing.JLabel ammoLabel;
    private javax.swing.JLabel areaLabel;
    private javax.swing.JLabel fuelLabel;
    private javax.swing.JSlider helicopterFuel;
    private javax.swing.JTextField helicopterMsg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton laserBtn;
    private javax.swing.JTextArea mainControllerMsg;
    private javax.swing.JButton missileBtn;
    private javax.swing.JCheckBox positionCheckBox;
    private javax.swing.JButton sendBtn;
    private javax.swing.JButton shootBtn;
    private javax.swing.JSpinner soldierCount;
    private javax.swing.JLabel soldierLabel;
    // End of variables declaration//GEN-END:variables
    private DefenceSystem defenceUnit;
    private Strength currentStrengthLevel = Strength.CLOSED;
    private int positionSliderValue;
}
