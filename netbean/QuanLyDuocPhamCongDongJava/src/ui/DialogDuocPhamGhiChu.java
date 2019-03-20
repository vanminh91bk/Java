
package ui;

/**
 *
 * @author Thanh Nhan <JackV at congdongjava.com>
 */
public class DialogDuocPhamGhiChu extends javax.swing.JDialog {

    /**
     * Creates new form DialogDuocPhamGhiChu
     */
    public DialogDuocPhamGhiChu(java.awt.Frame parent, boolean modal, String content) {
        super(parent, modal);
        initComponents();
        txtContent.setText(content);
        txtContent.select(0, 0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtContent = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Chu Y");
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        txtContent.setColumns(20);
        txtContent.setEditable(false);
        txtContent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtContent.setLineWrap(true);
        txtContent.setRows(5);
        txtContent.setWrapStyleWord(true);
        txtContent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtContent);

        getContentPane().add(jScrollPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContentMouseClicked
        if (evt.getClickCount() == 2) {
            txtContent.selectAll();
        }
    }//GEN-LAST:event_txtContentMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtContent;
    // End of variables declaration//GEN-END:variables
}