/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Strength.Strength;

/**
 *
 * @author ravindu
 */
public interface DefenceUnit extends MessageService{
    int getSoldierCount();
    int getAmmoCount();
    int getFuelCount();
    void setPositionSliderValue(int value);
    void setAreaLabel(String label);
    void setStrength(Strength strength);
}
