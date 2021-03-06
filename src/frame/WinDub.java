/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import entity.Arquivo;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.event.TreeModelListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import org.w3c.dom.css.RGBColor;


public class WinDub extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    /*
     * WinDub - Trabalho Pratico 2 (SO2)
     *
     * Matheus Fernandes Duarte - CC
     * Pedro Basseto - CC
     * Kimberly Lima - CC
     * Rodrigo Pontes - CC
     *
     */
    
    public WinDub() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btNovo = new javax.swing.JButton();
        btAbrir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btMinimizar = new javax.swing.JLabel();
        frameDrag = new javax.swing.JLabel();
        version = new javax.swing.JLabel();
        lblBemVindo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(860, 515));
        setMinimumSize(new java.awt.Dimension(860, 515));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("x");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(838, 2, 14, 20);

        btNovo.setBackground(new java.awt.Color(30, 60, 60));
        btNovo.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btNovo.setForeground(new java.awt.Color(255, 255, 255));
        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novo_1.png"))); // NOI18N
        btNovo.setText("Novo Arquivo");
        btNovo.setBorderPainted(false);
        btNovo.setContentAreaFilled(false);
        btNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNovo.setFocusPainted(false);
        btNovo.setMaximumSize(new java.awt.Dimension(150, 150));
        btNovo.setMinimumSize(new java.awt.Dimension(150, 150));
        btNovo.setOpaque(true);
        btNovo.setPreferredSize(new java.awt.Dimension(150, 150));
        btNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btNovoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btNovoMouseExited(evt);
            }
        });
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btNovo);
        btNovo.setBounds(525, 168, 240, 80);

        btAbrir.setBackground(new java.awt.Color(30, 60, 60));
        btAbrir.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btAbrir.setForeground(new java.awt.Color(255, 255, 255));
        btAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/abrir_1.png"))); // NOI18N
        btAbrir.setText("Abrir Arquivo");
        btAbrir.setBorderPainted(false);
        btAbrir.setContentAreaFilled(false);
        btAbrir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAbrir.setFocusPainted(false);
        btAbrir.setMaximumSize(new java.awt.Dimension(150, 150));
        btAbrir.setMinimumSize(new java.awt.Dimension(150, 150));
        btAbrir.setOpaque(true);
        btAbrir.setPreferredSize(new java.awt.Dimension(150, 150));
        btAbrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAbrirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAbrirMouseExited(evt);
            }
        });
        btAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbrirActionPerformed(evt);
            }
        });
        getContentPane().add(btAbrir);
        btAbrir.setBounds(525, 268, 240, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 430, 515);

        btMinimizar.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btMinimizar.setForeground(new java.awt.Color(204, 204, 204));
        btMinimizar.setText("_");
        btMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btMinimizarMouseExited(evt);
            }
        });
        getContentPane().add(btMinimizar);
        btMinimizar.setBounds(815, 2, 14, 20);

        frameDrag.setForeground(new java.awt.Color(255, 255, 255));
        frameDrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                frameDragMouseDragged(evt);
            }
        });
        frameDrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                frameDragMousePressed(evt);
            }
        });
        getContentPane().add(frameDrag);
        frameDrag.setBounds(0, 0, 860, 515);

        version.setForeground(new java.awt.Color(100, 120, 120));
        version.setText("v 1.1.4");
        getContentPane().add(version);
        version.setBounds(804, 474, 60, 40);

        lblBemVindo.setBackground(new java.awt.Color(30, 60, 60));
        lblBemVindo.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblBemVindo.setForeground(new java.awt.Color(204, 204, 204));
        lblBemVindo.setText("Bem vindo!");
        lblBemVindo.setBorderPainted(false);
        lblBemVindo.setContentAreaFilled(false);
        lblBemVindo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBemVindo.setFocusPainted(false);
        lblBemVindo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBemVindo.setMaximumSize(new java.awt.Dimension(150, 150));
        lblBemVindo.setMinimumSize(new java.awt.Dimension(150, 150));
        lblBemVindo.setOpaque(true);
        lblBemVindo.setPreferredSize(new java.awt.Dimension(150, 150));
        lblBemVindo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBemVindoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBemVindoMouseExited(evt);
            }
        });
        lblBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblBemVindoActionPerformed(evt);
            }
        });
        getContentPane().add(lblBemVindo);
        lblBemVindo.setBounds(535, 68, 220, 80);

        jPanel2.setBackground(new java.awt.Color(30, 60, 60));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(430, 0, 430, 515);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        
        int dialogResult = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Sair", JOptionPane.YES_NO_OPTION);
        
        if(dialogResult == JOptionPane.YES_OPTION)System.exit(0);
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        jLabel2.setForeground(new Color(234, 234, 234));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        jLabel2.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_jLabel2MouseExited

    private void btAbrirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAbrirMouseEntered
        // TODO add your handling code here:
        btAbrir.setBackground(new Color(45, 90, 90));
    }//GEN-LAST:event_btAbrirMouseEntered
    
    private void btAbrirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAbrirMouseExited
        // TODO add your handling code here:
        btAbrir.setBackground(new Color(30, 60, 60));
    }//GEN-LAST:event_btAbrirMouseExited
 
    private void btNovoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNovoMouseEntered
        // TODO add your handling code here:
        btNovo.setBackground(new Color(45, 90, 90));
    }//GEN-LAST:event_btNovoMouseEntered

    private void btNovoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNovoMouseExited
        // TODO add your handling code here:
        btNovo.setBackground(new Color(30, 60, 60));
    }//GEN-LAST:event_btNovoMouseExited

    private void frameDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_frameDragMouseDragged

    private void frameDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_frameDragMousePressed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        
        fileChooser.setDialogTitle("Selecione o local do Arquivo");
        
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Arquivos Dub (.dub)", "dub"));
        
        if(fileChooser.showSaveDialog(new JFrame()) == JFileChooser.APPROVE_OPTION) {
            
            File novoArquivo = fileChooser.getSelectedFile();
            
            String nome = novoArquivo.getName();
            String caminho = novoArquivo.getAbsolutePath();
            String dataCriacao = "";
            String header = "";
            String headerComHash = "";
            
            try {
                
                FileOutputStream dub = new FileOutputStream(novoArquivo + ".dub");
                
                SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                
                dataCriacao = fmt.format(new Date());
                
                header = nome + "&&&" + caminho + "&&&" + dataCriacao + "$$$";
                
                dub.write(header.getBytes());
                
                dub.close();
                
                // Reescrever com Hash
                // # = Separador, $ = Final do cabeçalho                
                headerComHash = gerarHashArquivo(caminho) + "###"
                        + header;
                
                dub = new FileOutputStream(novoArquivo + ".dub", false);
                
                dub.write(headerComHash.getBytes());
                
                dub.close();
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(WinDub.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(WinDub.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            App app = new App(novoArquivo.getPath() + ".dub", header, headerComHash, dataCriacao, new byte[0]);
            app.setVisible(true);

            this.setAlwaysOnTop(true);

            SwingWorker w = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                for(int i = 50; i > 0; i--) {
                setOpacity(i * 0.02f);
                try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(WinDub.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                setVisible(false);

                return 0;

            }

            };

            w.execute();
            
        }
        
    }//GEN-LAST:event_btNovoActionPerformed

    private void btMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMinimizarMouseClicked
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btMinimizarMouseClicked

    private void btMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMinimizarMouseEntered
        // TODO add your handling code here:
        btMinimizar.setForeground(new Color(234, 234, 234));
    }//GEN-LAST:event_btMinimizarMouseEntered

    private void btMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMinimizarMouseExited
        // TODO add your handling code here:
        btMinimizar.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_btMinimizarMouseExited

    private void lblBemVindoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBemVindoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBemVindoMouseEntered

    private void lblBemVindoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBemVindoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBemVindoMouseExited

    private void lblBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblBemVindoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBemVindoActionPerformed

    private void btAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirActionPerformed
        // TODO add your handling code here:
        
        JFileChooser fileChooser = new JFileChooser();
        
        fileChooser.setDialogTitle("Selecione o Arquivo");
        
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Arquivos Dub (.dub)", "dub"));

        if(fileChooser.showSaveDialog(new JFrame()) == JFileChooser.APPROVE_OPTION) {
            
            this.setCursor(Cursor.WAIT_CURSOR);
            this.setEnabled(false);
            
            if (compararHashArquivo(fileChooser.getSelectedFile().getAbsolutePath())) {
                
                String conteudo = "";
                try {
                    conteudo = new String(Files.readAllBytes(fileChooser.getSelectedFile().toPath()));
                } catch (IOException ex) {
                    Logger.getLogger(WinDub.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                String filename = fileChooser.getSelectedFile().getPath();
                String header = conteudo.substring(conteudo.indexOf("###")+3, conteudo.indexOf("$$$"));
                String conteudoArquivos = conteudo.substring(conteudo.indexOf("$$$")+3);
                String metadado = header.split("###")[0];
                String dataCriacao = metadado.split("&&&")[2];
                        
                App app = new App(filename, header, conteudo, dataCriacao, conteudoArquivos.getBytes());
                app.setVisible(true);

                this.setAlwaysOnTop(true);
                
                SwingWorker w = new SwingWorker() {
                @Override
                protected Object doInBackground() throws Exception {
                    for(int i = 50; i > 0; i--) {
                    setOpacity(i * 0.02f);
                    try {
                            Thread.sleep(20);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(WinDub.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                    setVisible(false);

                    return 0;

                }

                };

                w.execute();
                /*
            } catch (FileNotFoundException ex) {
                Logger.getLogger(WinDub.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                    Logger.getLogger(WinDub.class.getName()).log(Level.SEVERE, null, ex);
                }*/
            
            } else {
                JOptionPane.showMessageDialog(null, "Erro: Não é possível importar o arquivo selecionado "
                        + "pois ele teve seu código alterado.");
            }
            
            this.setEnabled(true);
            this.setCursor(Cursor.DEFAULT_CURSOR);
                
        }
        
    }//GEN-LAST:event_btAbrirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WinDub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinDub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinDub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinDub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                WinDub wd = new WinDub();
                wd.setOpacity(0f);
                wd.setVisible(true);
                SwingWorker w = new SwingWorker() {
                @Override
                protected Object doInBackground() throws Exception {
                    for(int i = 1; i <= 50; i++) {
                    wd.setOpacity(i * 0.02f);
                    try {
                            Thread.sleep(10);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(WinDub.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    return 0;

                }

                };

                w.execute();
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAbrir;
    private javax.swing.JLabel btMinimizar;
    private javax.swing.JButton btNovo;
    private javax.swing.JLabel frameDrag;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton lblBemVindo;
    private javax.swing.JLabel version;
    // End of variables declaration//GEN-END:variables

    private String gerarHashArquivo(String path) {
            
        StringBuffer sb = new StringBuffer("");
        
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            byte [] array = Files.readAllBytes(new File(path + ".dub").toPath());
            String a = new String(array);
            
            md.update(array, 0, array.length);
            byte[] hashMd5 = md.digest();
            for (int i = 0; i < hashMd5.length; i++) {
                sb.append(Integer.toString((hashMd5[i] & 0xff) + 0x100, 16).substring(1));
            }
            
        } catch (IOException ex) {
            Logger.getLogger(WinDub.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(WinDub.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return sb.toString();
        
    }
    
    private boolean compararHashArquivo(String path) {
            
        StringBuffer sb = new StringBuffer("");
        
        String hashArquivo = "";
        
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            byte [] array = Files.readAllBytes(new File(path).toPath());
            String conteudo = new String(array);
            
            int divisor = conteudo.indexOf("###");
            
            hashArquivo = conteudo.substring(0, divisor);
            String restoArquivo = conteudo.substring(divisor+3);
            
            md.update(restoArquivo.getBytes(), 0, restoArquivo.getBytes().length);
            byte[] hashMd5 = md.digest();
            for (int i = 0; i < hashMd5.length; i++) {
                sb.append(Integer.toString((hashMd5[i] & 0xff) + 0x100, 16).substring(1));
            }
            
        } catch (IOException ex) {
            Logger.getLogger(WinDub.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(WinDub.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (sb.toString().equals(hashArquivo)) return true;
        else return false;
        
    }

}
