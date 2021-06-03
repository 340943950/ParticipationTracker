import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.*;

/**
 *
 * @author Vaughn Chan
 */
public class GUILayout extends javax.swing.JFrame {
    
    /**
     * Creates new form GUILayout
     */
    public GUILayout() {
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

        ScrollPane = new javax.swing.JScrollPane();
        StudentListPanel = new javax.swing.JPanel();
        MenuBar = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        EditMenu = new javax.swing.JMenu();
        NewStudentMenuItem = new javax.swing.JMenuItem();
        PopulateStudentBarMenu = new javax.swing.JMenuItem();
        SavePointsMenu = new javax.swing.JMenuItem();
        CreateGraphMenu = new javax.swing.JMenuItem();
        ViewMenu = new javax.swing.JMenu();
        ResetDisplayMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        StudentListPanel.setLayout(new javax.swing.BoxLayout(StudentListPanel, javax.swing.BoxLayout.Y_AXIS));
        ScrollPane.setViewportView(StudentListPanel);

        FileMenu.setText("File");
        MenuBar.add(FileMenu);

        EditMenu.setText("Edit");

        NewStudentMenuItem.setText("Add New Student");
        EditMenu.add(NewStudentMenuItem);

        PopulateStudentBarMenu.setText("Populate Student Bar");
        EditMenu.add(PopulateStudentBarMenu);

        SavePointsMenu.setText("Save Points");
        EditMenu.add(SavePointsMenu);

        CreateGraphMenu.setText("Create Graph");
        EditMenu.add(CreateGraphMenu);

        MenuBar.add(EditMenu);

        ViewMenu.setText("View");

        ResetDisplayMenu.setText("Reset Display");
        ViewMenu.add(ResetDisplayMenu);

        MenuBar.add(ViewMenu);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem CreateGraphMenu;
    public javax.swing.JMenu EditMenu;
    public javax.swing.JMenu FileMenu;
    public javax.swing.JMenuBar MenuBar;
    public javax.swing.JMenuItem NewStudentMenuItem;
    public javax.swing.JMenuItem PopulateStudentBarMenu;
    public javax.swing.JMenuItem ResetDisplayMenu;
    public javax.swing.JMenuItem SavePointsMenu;
    public javax.swing.JScrollPane ScrollPane;
    public javax.swing.JPanel StudentListPanel;
    public javax.swing.JMenu ViewMenu;
    // End of variables declaration//GEN-END:variables
}
