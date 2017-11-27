/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bsmvomeia.telas;

import br.com.bsmvomeia.logica.ItemVenda;
import br.com.bsmvomeia.logica.Venda;
import static br.com.bsmvomeia.telas.TelaPrincipal.tbl_Vendas;

import javax.swing.JOptionPane;

/**
 *
 * @author Mancan
 */
public class TelaVenda extends javax.swing.JFrame {

    public static int flagItem = 0;

    /**
     * Creates new form TelaVenda
     */
    public TelaVenda() {
        initComponents();
        txtidVenda.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtidClienteVenda = new javax.swing.JTextField();
        btn_BuscarCliente = new javax.swing.JButton();
        btn_BuscarProduto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Itens = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btn_EditarProduto = new javax.swing.JButton();
        btn_RemoverProduto = new javax.swing.JButton();
        txtDesconto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_SalvarVenda = new javax.swing.JButton();
        txtNomeCliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtidVenda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CmbPagamento = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setPreferredSize(new java.awt.Dimension(601, 550));

        txtidClienteVenda.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        txtidClienteVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtidClienteVenda.setEnabled(false);
        txtidClienteVenda.setPreferredSize(new java.awt.Dimension(69, 30));

        btn_BuscarCliente.setBackground(new java.awt.Color(51, 0, 153));
        btn_BuscarCliente.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_BuscarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_BuscarCliente.setText("Buscar");
        btn_BuscarCliente.setPreferredSize(new java.awt.Dimension(83, 30));
        btn_BuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarClienteActionPerformed(evt);
            }
        });

        btn_BuscarProduto.setBackground(new java.awt.Color(51, 0, 153));
        btn_BuscarProduto.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_BuscarProduto.setForeground(new java.awt.Color(255, 255, 255));
        btn_BuscarProduto.setText("Adicionar");
        btn_BuscarProduto.setPreferredSize(new java.awt.Dimension(83, 30));
        btn_BuscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarProdutoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel2.setText("Produto: ");

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel1.setText("Codigo do Cliente:");

        txtData.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        txtData.setEnabled(false);
        txtData.setPreferredSize(new java.awt.Dimension(87, 30));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel6.setText("Data:");

        tbl_Itens.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        tbl_Itens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_Itens.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_Itens.getTableHeader().setResizingAllowed(false);
        tbl_Itens.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbl_Itens);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel8.setText("Produtos adicionados na venda:");

        btn_EditarProduto.setBackground(new java.awt.Color(204, 153, 0));
        btn_EditarProduto.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_EditarProduto.setForeground(new java.awt.Color(255, 255, 255));
        btn_EditarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bsmvomeia/icones/editbranco.png"))); // NOI18N
        btn_EditarProduto.setText("Editar Item");
        btn_EditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarProdutoActionPerformed(evt);
            }
        });

        btn_RemoverProduto.setBackground(new java.awt.Color(204, 0, 0));
        btn_RemoverProduto.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_RemoverProduto.setForeground(new java.awt.Color(255, 255, 255));
        btn_RemoverProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bsmvomeia/icones/deletebranco.png"))); // NOI18N
        btn_RemoverProduto.setText("Remover Item");
        btn_RemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RemoverProdutoActionPerformed(evt);
            }
        });

        txtDesconto.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtDesconto.setForeground(new java.awt.Color(153, 0, 0));
        txtDesconto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDesconto.setText("00");
        txtDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescontoFocusLost(evt);
            }
        });
        txtDesconto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescontoKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel9.setText("Desconto:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel10.setText("Valor:");

        btn_SalvarVenda.setBackground(new java.awt.Color(0, 153, 0));
        btn_SalvarVenda.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        btn_SalvarVenda.setForeground(new java.awt.Color(255, 255, 255));
        btn_SalvarVenda.setText("Salvar");
        btn_SalvarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalvarVendaActionPerformed(evt);
            }
        });

        txtNomeCliente.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtidVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidVendaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("R$:");
        jLabel3.setPreferredSize(new java.awt.Dimension(26, 30));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setText("R$");

        CmbPagamento.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        CmbPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Cartão", "Orçamento" }));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel7.setText("Pagamento:");

        lblValor.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        lblValor.setForeground(new java.awt.Color(0, 153, 0));
        lblValor.setText("00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn_EditarProduto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_RemoverProduto))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtidVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CmbPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtidClienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_BuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_BuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_SalvarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 13, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtidClienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_BuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_BuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(txtidVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(CmbPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_EditarProduto)
                            .addComponent(btn_RemoverProduto))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_SalvarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_SalvarVenda, jButton1});

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Venda");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel12))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(205, 205, 205))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(554, 531));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarClienteActionPerformed
        TelaBuscar buscar = new TelaBuscar();
        buscar.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_BuscarClienteActionPerformed

    private void btn_BuscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarProdutoActionPerformed
        flagItem = 0;
        TelaAddProduto p = new TelaAddProduto();
        p.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_BuscarProdutoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        ItemVenda item = new ItemVenda(TelaVenda.txtidVenda, TelaAddProduto.txtIdProduto, TelaAddProduto.txtquantidade);

        item.atualizarTabelaItensVenda(TelaVenda.tbl_Itens, TelaVenda.txtidVenda);
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void btn_EditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarProdutoActionPerformed
        flagItem = 1;

        if (tbl_Itens.getSelectedRow() != -1) {
            TelaAddProduto edit = new TelaAddProduto();
            ItemVenda item = new ItemVenda(TelaVenda.txtidVenda, TelaAddProduto.txtIdProduto, TelaAddProduto.txtquantidade);
            item.setarCamposEditItem(tbl_Itens, TelaAddProduto.txtPesquisa);
            edit.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Escolha um item para editar");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EditarProdutoActionPerformed

    private void btn_RemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RemoverProdutoActionPerformed
        if (tbl_Itens.getSelectedRow() != -1) {

            ItemVenda item = new ItemVenda(TelaVenda.txtidVenda, TelaAddProduto.txtIdProduto, TelaAddProduto.txtquantidade);
            item.removerItemVenda(tbl_Itens, tbl_Itens.getModel().getValueAt(tbl_Itens.getSelectedRow(), 0).toString());
            item.atualizarTabelaItensVenda(tbl_Itens, txtidVenda);
            item.somarColuna(tbl_Itens, lblValor, txtDesconto);

        } else {
            JOptionPane.showMessageDialog(null, "Escolha um item para editar");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_RemoverProdutoActionPerformed

    private void btn_SalvarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalvarVendaActionPerformed
        Venda v = new Venda(TelaVenda.txtidClienteVenda, TelaVenda.txtDesconto, TelaVenda.lblValor, TelaVenda.CmbPagamento);
        if (CmbPagamento.getSelectedItem().toString().equals("Dinheiro")) {
            int confere = v.alterarVenda(txtidVenda);
            if (confere > 0) {

                int confirma = JOptionPane.showConfirmDialog(null, "Deseja Calcular o troco?", "Calcular Troco", JOptionPane.YES_NO_OPTION);
                if (confirma == JOptionPane.YES_OPTION) {
                    this.dispose();
                    TelaTroco t = new TelaTroco();
                    t.setVisible(true);
                    v.somarColuna(tbl_Vendas, TelaPrincipal.lblValorFinal);
                } else {

                    this.dispose();
                }

            }
        } else {
            int confere2 = v.alterarVenda(txtidVenda);
            if (confere2 > 0) {
                this.dispose();
                v.somarColuna(tbl_Vendas, TelaPrincipal.lblValorFinal);
            }

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_SalvarVendaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Venda v = new Venda(TelaVenda.txtidClienteVenda, TelaVenda.txtDesconto, TelaVenda.lblValor, TelaVenda.CmbPagamento);
        v.removerVenda(txtidVenda);
        this.dispose();
        v.somarColuna(tbl_Vendas, lblValor);
        TelaPrincipal.controletelaFlag = 0;
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescontoFocusLost
        // TODO add your handling code here:
        ItemVenda item = new ItemVenda(TelaVenda.txtidVenda, TelaAddProduto.txtIdProduto, TelaAddProduto.txtquantidade);
        item.somarColuna(tbl_Itens, lblValor, TelaVenda.txtDesconto);
    }//GEN-LAST:event_txtDescontoFocusLost

    private void txtDescontoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescontoKeyReleased
        // TODO add your handling code here:
        ItemVenda item = new ItemVenda(TelaVenda.txtidVenda, TelaAddProduto.txtIdProduto, TelaAddProduto.txtquantidade);
        item.somarColuna(tbl_Itens, lblValor, TelaVenda.txtDesconto);
    }//GEN-LAST:event_txtDescontoKeyReleased

    private void txtidVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidVendaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        TelaPrincipal.controletelaFlag = 0;
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> CmbPagamento;
    private javax.swing.JButton btn_BuscarCliente;
    private javax.swing.JButton btn_BuscarProduto;
    private javax.swing.JButton btn_EditarProduto;
    private javax.swing.JButton btn_RemoverProduto;
    private javax.swing.JButton btn_SalvarVenda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JLabel lblValor;
    public static javax.swing.JTable tbl_Itens;
    public static javax.swing.JTextField txtData;
    public static javax.swing.JTextField txtDesconto;
    public static javax.swing.JTextField txtNomeCliente;
    public static javax.swing.JTextField txtidClienteVenda;
    public static javax.swing.JTextField txtidVenda;
    // End of variables declaration//GEN-END:variables
}
