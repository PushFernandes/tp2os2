/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import entity.Arquivo;
import java.awt.Color;
import java.awt.Cursor;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author Push
 */
public class App extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    
    public static String filename = "";
    public static List<Arquivo> arquivos;

    /**
     * Creates new form App
     */
    public App() {
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

        top = new javax.swing.JPanel();
        btClose = new javax.swing.JLabel();
        btMinimizar = new javax.swing.JLabel();
        frameDrag = new javax.swing.JLabel();
        nomeArquivo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btMoverArquivo = new javax.swing.JLabel();
        btInserirArquivo = new javax.swing.JLabel();
        btCriarDiretorio = new javax.swing.JLabel();
        btExtrairArquivo = new javax.swing.JLabel();
        btExibirConteudo = new javax.swing.JLabel();
        frameDrag1 = new javax.swing.JPanel();
        conteudoArquivo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("winDUB");
        setMaximumSize(new java.awt.Dimension(860, 515));
        setMinimumSize(new java.awt.Dimension(860, 515));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        top.setBackground(new java.awt.Color(60, 120, 120));
        top.setForeground(new java.awt.Color(255, 255, 255));
        top.setMaximumSize(new java.awt.Dimension(860, 30));
        top.setMinimumSize(new java.awt.Dimension(860, 30));
        top.setName(""); // NOI18N
        top.setPreferredSize(new java.awt.Dimension(860, 30));
        top.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                topMouseDragged(evt);
            }
        });
        top.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topMousePressed(evt);
            }
        });
        top.setLayout(null);

        btClose.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btClose.setForeground(new java.awt.Color(204, 204, 204));
        btClose.setText("x");
        btClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btCloseMouseExited(evt);
            }
        });
        top.add(btClose);
        btClose.setBounds(735, 2, 14, 20);

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
        top.add(btMinimizar);
        btMinimizar.setBounds(713, 2, 14, 20);

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
        top.add(frameDrag);
        frameDrag.setBounds(0, 0, 757, 30);

        nomeArquivo.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        nomeArquivo.setForeground(new java.awt.Color(255, 255, 255));
        nomeArquivo.setText("[NomeArquivo.dub]");
        top.add(nomeArquivo);
        nomeArquivo.setBounds(80, 0, 628, 26);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WIN");
        top.add(jLabel1);
        jLabel1.setBounds(8, 8, 30, 20);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DUB");
        top.add(jLabel2);
        jLabel2.setBounds(34, 0, 48, 30);

        getContentPane().add(top);
        top.setBounds(103, 0, 757, 30);

        jPanel1.setBackground(new java.awt.Color(30, 60, 60));
        jPanel1.setMaximumSize(new java.awt.Dimension(91, 455));
        jPanel1.setMinimumSize(new java.awt.Dimension(91, 455));
        jPanel1.setPreferredSize(new java.awt.Dimension(91, 455));
        jPanel1.setLayout(null);

        btMoverArquivo.setBackground(new java.awt.Color(30, 60, 60));
        btMoverArquivo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btMoverArquivo.setForeground(new java.awt.Color(255, 255, 255));
        btMoverArquivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btMoverArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/moverArquivo.png"))); // NOI18N
        btMoverArquivo.setText("Mover Arquivo");
        btMoverArquivo.setToolTipText("Move o arquivo selecionado para outro diretório interno");
        btMoverArquivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btMoverArquivo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btMoverArquivo.setMaximumSize(new java.awt.Dimension(103, 103));
        btMoverArquivo.setMinimumSize(new java.awt.Dimension(103, 103));
        btMoverArquivo.setOpaque(true);
        btMoverArquivo.setPreferredSize(new java.awt.Dimension(103, 103));
        btMoverArquivo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btMoverArquivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btMoverArquivoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btMoverArquivoMouseExited(evt);
            }
        });
        jPanel1.add(btMoverArquivo);
        btMoverArquivo.setBounds(0, 206, 103, 103);

        btInserirArquivo.setBackground(new java.awt.Color(30, 60, 60));
        btInserirArquivo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btInserirArquivo.setForeground(new java.awt.Color(255, 255, 255));
        btInserirArquivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btInserirArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inserirArquivo.png"))); // NOI18N
        btInserirArquivo.setText("Inserir Arquivo");
        btInserirArquivo.setToolTipText("Insere novo arquivo ao arquivo .dub");
        btInserirArquivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btInserirArquivo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btInserirArquivo.setMaximumSize(new java.awt.Dimension(103, 103));
        btInserirArquivo.setMinimumSize(new java.awt.Dimension(103, 103));
        btInserirArquivo.setOpaque(true);
        btInserirArquivo.setPreferredSize(new java.awt.Dimension(103, 103));
        btInserirArquivo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btInserirArquivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btInserirArquivoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btInserirArquivoMouseExited(evt);
            }
        });
        jPanel1.add(btInserirArquivo);
        btInserirArquivo.setBounds(0, 103, 103, 103);

        btCriarDiretorio.setBackground(new java.awt.Color(30, 60, 60));
        btCriarDiretorio.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btCriarDiretorio.setForeground(new java.awt.Color(255, 255, 255));
        btCriarDiretorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btCriarDiretorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/criarDiretorio.png"))); // NOI18N
        btCriarDiretorio.setText("Criar Diretório");
        btCriarDiretorio.setToolTipText("Cria novo diretório dentro do arquivo .dub");
        btCriarDiretorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCriarDiretorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCriarDiretorio.setMaximumSize(new java.awt.Dimension(103, 103));
        btCriarDiretorio.setMinimumSize(new java.awt.Dimension(103, 103));
        btCriarDiretorio.setOpaque(true);
        btCriarDiretorio.setPreferredSize(new java.awt.Dimension(103, 103));
        btCriarDiretorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCriarDiretorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btCriarDiretorioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btCriarDiretorioMouseExited(evt);
            }
        });
        jPanel1.add(btCriarDiretorio);
        btCriarDiretorio.setBounds(0, 0, 103, 103);

        btExtrairArquivo.setBackground(new java.awt.Color(30, 60, 60));
        btExtrairArquivo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btExtrairArquivo.setForeground(new java.awt.Color(255, 255, 255));
        btExtrairArquivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btExtrairArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/extrairArquivo.png"))); // NOI18N
        btExtrairArquivo.setText("Extrair Arquivo");
        btExtrairArquivo.setToolTipText("Extrai arquivos para o Sistema");
        btExtrairArquivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExtrairArquivo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExtrairArquivo.setMaximumSize(new java.awt.Dimension(103, 103));
        btExtrairArquivo.setMinimumSize(new java.awt.Dimension(103, 103));
        btExtrairArquivo.setOpaque(true);
        btExtrairArquivo.setPreferredSize(new java.awt.Dimension(103, 103));
        btExtrairArquivo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExtrairArquivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btExtrairArquivoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btExtrairArquivoMouseExited(evt);
            }
        });
        jPanel1.add(btExtrairArquivo);
        btExtrairArquivo.setBounds(0, 309, 103, 103);

        btExibirConteudo.setBackground(new java.awt.Color(30, 60, 60));
        btExibirConteudo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btExibirConteudo.setForeground(new java.awt.Color(255, 255, 255));
        btExibirConteudo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btExibirConteudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exibirConteudo.png"))); // NOI18N
        btExibirConteudo.setText("Exibir Conteúdo");
        btExibirConteudo.setToolTipText("Abre qrquivos com extensão .txt");
        btExibirConteudo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExibirConteudo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExibirConteudo.setMaximumSize(new java.awt.Dimension(103, 103));
        btExibirConteudo.setMinimumSize(new java.awt.Dimension(103, 103));
        btExibirConteudo.setOpaque(true);
        btExibirConteudo.setPreferredSize(new java.awt.Dimension(103, 103));
        btExibirConteudo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExibirConteudo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btExibirConteudoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btExibirConteudoMouseExited(evt);
            }
        });
        jPanel1.add(btExibirConteudo);
        btExibirConteudo.setBounds(0, 412, 103, 103);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 103, 515);

        frameDrag1.setBackground(new java.awt.Color(60, 120, 120));
        frameDrag1.setForeground(new java.awt.Color(255, 255, 255));
        frameDrag1.setMaximumSize(new java.awt.Dimension(860, 30));
        frameDrag1.setMinimumSize(new java.awt.Dimension(860, 30));
        frameDrag1.setName(""); // NOI18N
        frameDrag1.setPreferredSize(new java.awt.Dimension(860, 30));
        frameDrag1.setLayout(null);

        conteudoArquivo.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        conteudoArquivo.setForeground(new java.awt.Color(255, 255, 255));
        conteudoArquivo.setText("Conteúdo do Arquivo [Tamanho]");
        frameDrag1.add(conteudoArquivo);
        conteudoArquivo.setBounds(8, 0, 740, 26);

        getContentPane().add(frameDrag1);
        frameDrag1.setBounds(103, 485, 757, 30);

        jPanel2.setBackground(new java.awt.Color(90, 170, 170));

        jTree1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTree1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTree1.setRowHeight(20);
        jScrollPane1.setViewportView(jTree1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(103, 30, 757, 455);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btCloseMouseClicked

    private void btCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCloseMouseEntered
        // TODO add your handling code here:
        btClose.setForeground(new Color(234, 234, 234));
    }//GEN-LAST:event_btCloseMouseEntered

    private void btCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCloseMouseExited
        // TODO add your handling code here:
        btClose.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_btCloseMouseExited

    private void topMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_topMouseDragged

    private void topMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_topMousePressed

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

    private void frameDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_frameDragMousePressed

    private void frameDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse - 103, y - yMouse);
    }//GEN-LAST:event_frameDragMouseDragged

    private void btCriarDiretorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCriarDiretorioMouseEntered
        // TODO add your handling code here:
        btCriarDiretorio.setBackground(new Color(45, 90, 90));
    }//GEN-LAST:event_btCriarDiretorioMouseEntered

    private void btCriarDiretorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCriarDiretorioMouseExited
        // TODO add your handling code here:
        btCriarDiretorio.setBackground(new Color(30, 60, 60));
    }//GEN-LAST:event_btCriarDiretorioMouseExited

    private void btInserirArquivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btInserirArquivoMouseEntered
        // TODO add your handling code here:
        btInserirArquivo.setBackground(new Color(45, 90, 90));
    }//GEN-LAST:event_btInserirArquivoMouseEntered

    private void btInserirArquivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btInserirArquivoMouseExited
        // TODO add your handling code here:
        btInserirArquivo.setBackground(new Color(30, 60, 60));
    }//GEN-LAST:event_btInserirArquivoMouseExited

    private void btMoverArquivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMoverArquivoMouseEntered
        // TODO add your handling code here:
        btMoverArquivo.setBackground(new Color(45, 90, 90));
    }//GEN-LAST:event_btMoverArquivoMouseEntered

    private void btMoverArquivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMoverArquivoMouseExited
        // TODO add your handling code here:
        btMoverArquivo.setBackground(new Color(30, 60, 60));
    }//GEN-LAST:event_btMoverArquivoMouseExited

    private void btExtrairArquivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExtrairArquivoMouseEntered
        // TODO add your handling code here:
        btExtrairArquivo.setBackground(new Color(45, 90, 90));
    }//GEN-LAST:event_btExtrairArquivoMouseEntered

    private void btExtrairArquivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExtrairArquivoMouseExited
        // TODO add your handling code here:
        btExtrairArquivo.setBackground(new Color(30, 60, 60));
    }//GEN-LAST:event_btExtrairArquivoMouseExited

    private void btExibirConteudoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExibirConteudoMouseEntered
        // TODO add your handling code here:
        btExibirConteudo.setBackground(new Color(45, 90, 90));
    }//GEN-LAST:event_btExibirConteudoMouseEntered

    private void btExibirConteudoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExibirConteudoMouseExited
        // TODO add your handling code here:
        btExibirConteudo.setBackground(new Color(30, 60, 60));
    }//GEN-LAST:event_btExibirConteudoMouseExited

    public JLabel getConteudoArquivo() {
        return conteudoArquivo;
    }

    public void setConteudoArquivo(JLabel conteudoArquivo) {
        this.conteudoArquivo = conteudoArquivo;
    }

    public JLabel getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(JLabel nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btClose;
    private javax.swing.JLabel btCriarDiretorio;
    private javax.swing.JLabel btExibirConteudo;
    private javax.swing.JLabel btExtrairArquivo;
    private javax.swing.JLabel btInserirArquivo;
    private javax.swing.JLabel btMinimizar;
    private javax.swing.JLabel btMoverArquivo;
    private javax.swing.JLabel conteudoArquivo;
    private javax.swing.JLabel frameDrag;
    private javax.swing.JPanel frameDrag1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel nomeArquivo;
    private javax.swing.JPanel top;
    // End of variables declaration//GEN-END:variables
}
