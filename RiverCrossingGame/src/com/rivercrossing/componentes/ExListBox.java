/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rivercrossing.componentes;

import com.rivercrossing.color.ColorUI;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.UIManager;
import javax.swing.plaf.ListUI;
import javax.swing.plaf.basic.BasicListUI;

/**
 *
 * @author Carlos
 */
public class ExListBox extends BasicListUI implements IComponents{
    private static ColorUI colorUI;

    public ExListBox(ColorUI colorUI) {
        this.colorUI = colorUI;
    }
    
    
    public static ListUI createUI(JComponent c){
        return new ExListBox(colorUI);
    }
    
    @Override
    public void crearDisenio(){
        UIManager.put("List.selectionForeground", this.colorUI.getColorFondo());
        UIManager.put("List.selectionBackground", this.colorUI.getColorTerciario());
        UIManager.put("List.focusCellHighlightBorder", BorderFactory.createEmptyBorder());
        UIManager.put("List.border", BorderFactory.createLineBorder(this.colorUI.getColorBordeSecundario()));
    }

    @Override
    public void modificarUI(JComponent c) {
        if(c instanceof JList){
            JList ls = (JList)c;
            ls.setUI(this);
        }
    }
    
}
