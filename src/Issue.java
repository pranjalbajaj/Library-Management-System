import java.util.Calendar;import javax.swing.JOptionPane;
import login.Establish_Connection;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */;

/*
 * Issue.java
 *
 * Created on 21 Jun, 2015, 6:27:38 PM
 */

/**
 *
 * @author pranjal
 */
public class Issue extends javax.swing.JFrame{

    /** Creates new form Issue */
     Establish_Connection ec=new Establish_Connection();

    public Issue() {
        initComponents();
        Calendar cal=Calendar.getInstance();
        String str= cal.get(Calendar.DATE)+"-"+ (cal.get(Calendar.MONTH)+1)+"-"+ cal.get(Calendar.YEAR);
        cal.add(Calendar.DATE,7);
        String str1=cal.get(Calendar.DATE)+"-"+ (cal.get(Calendar.MONTH)+1)+"-"+ cal.get(Calendar.YEAR);
        jTextField3.setText(str);
        jTextField4.setText(str1);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MEMBER NAME");

        jLabel2.setText("BOOK NAME");

        jLabel3.setText("ISSUE DATE");

        jLabel4.setText("RETURN DATE");

        jButton1.setText("ISSUE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField4)
                        .addComponent(jTextField2)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
        try{
              ec.pst=ec.con.prepareStatement("select * from member where name=?");
              ec.pst.setString(1,jTextField1.getText());
              ec.rs=ec.pst.executeQuery();             
            if(ec.rs.next())
            {
                ec.pst=ec.con.prepareStatement("select * from member where name=? and book_issued is null");
                ec.pst.setString(1,jTextField1.getText());
                ec.rs=ec.pst.executeQuery();
                if(ec.rs.next()){
                    ec.pst=ec.con.prepareStatement("select * from book where bookname=?");
                    ec.pst.setString(1,jTextField2.getText());
                    ec.rs=ec.pst.executeQuery();

                    if(ec.rs.next()){
                ec.pst=ec.con.prepareStatement("select * from book where bookname=? and status='available' ");
                ec.pst.setString(1,jTextField2.getText());
                ec.rs=ec.pst.executeQuery();
                if(ec.rs.next()){
                ec.pst=ec.con.prepareStatement("update member set book_issued=?,issue_date=?,return_date=? where name=?");
                ec.pst.setString(1,jTextField2.getText());
                ec.pst.setString(2,jTextField3.getText());
                ec.pst.setString(3,jTextField4.getText());
                ec.pst.setString(4,jTextField1.getText());
                ec.pst.executeUpdate();
                ec.pst=ec.con.prepareStatement("update book set status='issued' where bookname=?");
                ec.pst.setString(1,jTextField2.getText());
                ec.pst.executeUpdate();
                JOptionPane.showMessageDialog(null,jTextField2.getText()+" issued to "+jTextField1.getText());
                }
                else
                {
                   JOptionPane.showMessageDialog(null,jTextField2.getText()+"is issued to other person"); 
                }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,jTextField2.getText()+"is not in book list");
                    }
             }
            else
            {
                ec.pst=ec.con.prepareStatement("select * from member where name=?");
                ec.pst.setString(1,jTextField1.getText());
                ec.rs=ec.pst.executeQuery();
                if(ec.rs.next())
                JOptionPane.showMessageDialog(null,ec.rs.getString("book_issued")+" is already issued to "+jTextField1.getText());
            }
            }
            else
            {
               JOptionPane.showMessageDialog(null,jTextField1.getText()+" is not a member") ;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Issue().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
