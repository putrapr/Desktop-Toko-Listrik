/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Asus
 */
public class HorizontalAlignmentHeaderRenderer implements TableCellRenderer {
    private int horizontalAlignment = SwingConstants.LEFT;
    public HorizontalAlignmentHeaderRenderer(int horizontalAlignment) {
        this.horizontalAlignment = horizontalAlignment;
    }
    
    @Override public Component getTableCellRendererComponent(
            JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        TableCellRenderer r = table.getTableHeader().getDefaultRenderer();
        JLabel l = (JLabel) r.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        l.setHorizontalAlignment(horizontalAlignment);
        return l;
    }
}
