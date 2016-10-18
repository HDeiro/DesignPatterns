package framework.core;

import java.util.ArrayList;
import java.util.Set;
import javax.swing.DefaultListModel;

public class PreparadorDeBolos extends javax.swing.JFrame {
    
    private DefaultListModel lmDecorators;
    private DefaultListModel lmDecoratorsToApply;
    private Bolo bolo;
    
    public void initialize() {
        //Inicializa a lista de componentes        
        this.lmDecorators = new DefaultListModel();
        this.lmDecoratorsToApply = new DefaultListModel();        
        this.decoratorsList.setModel(this.lmDecorators);
        this.decoratorsToApply.setModel(this.lmDecoratorsToApply);
    
        this.loadListOfDecorators();
        
       this.bolo = new Bolo();
    }
    
    private void loadListOfDecorators() {
        Set<String> keys = PluginController.getInstance().getListOfPlugins().keySet();
        for(String key : keys) {
            System.out.println("Adicionou "+key);
            this.lmDecorators.addElement(key);
        }        
    }
    
    public PreparadorDeBolos() {
        initComponents();
        initialize();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        decoratorsList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        decoratorsToApply = new javax.swing.JList<>();
        remove = new javax.swing.JButton();
        add = new javax.swing.JButton();
        moveTop = new javax.swing.JButton();
        moveBottom = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        decoratorsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(decoratorsList);

        decoratorsToApply.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(decoratorsToApply);

        remove.setText("<");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        add.setText(">");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        moveTop.setText("^");
        moveTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveTopActionPerformed(evt);
            }
        });

        moveBottom.setText("v");
        moveBottom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveBottomActionPerformed(evt);
            }
        });

        jButton5.setText("PREPARAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(remove)
                    .addComponent(add))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moveBottom)
                            .addComponent(moveTop))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(moveTop, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(moveBottom, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        int[] selected = this.decoratorsList.getSelectedIndices();
        
        for(int i = 0; i < selected.length; i++) {
            this.lmDecoratorsToApply.addElement(this.lmDecorators.getElementAt(selected[i]));
        }
    }//GEN-LAST:event_addActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        int index = this.decoratorsToApply.getSelectedIndex();
        
        if(index > 0)
            this.lmDecoratorsToApply.removeElementAt(index);
    }//GEN-LAST:event_removeActionPerformed

    private void moveTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveTopActionPerformed
        int selected = this.decoratorsToApply.getSelectedIndex();
        
        if(selected > 0)
            moveTo(selected, selected - 1);
    }//GEN-LAST:event_moveTopActionPerformed

    private void moveBottomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveBottomActionPerformed
        int selected = this.decoratorsToApply.getSelectedIndex();
        
        if(selected < this.lmDecoratorsToApply.size() - 1)
            moveTo(selected, selected + 1);
    }//GEN-LAST:event_moveBottomActionPerformed
    
    private void moveTo(int origin, int destiny) {
        String previousElement = (String) this.lmDecoratorsToApply.getElementAt(destiny);
        String element = (String) this.lmDecoratorsToApply.getElementAt(origin);

        this.lmDecoratorsToApply.setElementAt(previousElement, origin);
        this.lmDecoratorsToApply.setElementAt(element, destiny);

        this.decoratorsToApply.setSelectedIndex(destiny);
    }
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        for(int i = 0; i < this.lmDecoratorsToApply.size(); i++) {
          String key = (String) lmDecoratorsToApply.getElementAt(i);
          PluginController.getInstance().getDecoration(key);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JList<String> decoratorsList;
    private javax.swing.JList<String> decoratorsToApply;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton moveBottom;
    private javax.swing.JButton moveTop;
    private javax.swing.JButton remove;
    // End of variables declaration//GEN-END:variables
}
