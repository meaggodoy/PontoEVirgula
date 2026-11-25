package pontoevirgula.tela;

//importação das bibliotecas criadas
import pontoevirgula.modelo.GerenciadorProdutos;
import pontoevirgula.modelo.Produto;
import pontoevirgula.modelo.ProdutoLivro;

//importação de bibliotecas de funcionalidades java
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PainelLivros extends javax.swing.JPanel {
    
    private final GerenciadorProdutos gerenciador;

    public PainelLivros() {
        initComponents();
        
        gerenciador = new GerenciadorProdutos();
        atualizarTabela(gerenciador.listarTodos());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLivros = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoBuscaLivro = new javax.swing.JTextField();
        cmbStatus = new javax.swing.JComboBox<>();
        cmbOrdenar = new javax.swing.JComboBox<>();
        btnNovoLivro = new javax.swing.JButton();
        tblLivrosScroll = new javax.swing.JScrollPane();
        tblLivros = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 700));

        pnlLivros.setBackground(new java.awt.Color(248, 241, 234));
        pnlLivros.setPreferredSize(new java.awt.Dimension(1000, 700));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(74, 36, 52));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontoevirgula/img/icon/open-book-inicio.png"))); // NOI18N
        jLabel1.setText("Livros");
        jLabel1.setIconTextGap(12);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(80, 59, 61));
        jLabel2.setText("Gerencie o acervo da livraria.");

        campoBuscaLivro.setBackground(new java.awt.Color(255, 249, 245));
        campoBuscaLivro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoBuscaLivro.setForeground(new java.awt.Color(80, 59, 61));
        campoBuscaLivro.setText("Buscar por título, autor ou código..");
        campoBuscaLivro.setMinimumSize(new java.awt.Dimension(120, 40));
        campoBuscaLivro.setPreferredSize(new java.awt.Dimension(410, 40));

        cmbStatus.setBackground(new java.awt.Color(255, 249, 245));
        cmbStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbStatus.setForeground(new java.awt.Color(80, 59, 61));
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos os Status", "Ativo", "Inativo" }));
        cmbStatus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(179, 138, 104), 1, true));
        cmbStatus.setPreferredSize(new java.awt.Dimension(150, 40));

        cmbOrdenar.setBackground(new java.awt.Color(255, 249, 245));
        cmbOrdenar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbOrdenar.setForeground(new java.awt.Color(80, 59, 61));
        cmbOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordenar por", "Código", "Título", "Autor", " " }));
        cmbOrdenar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(179, 138, 104), 1, true));
        cmbOrdenar.setPreferredSize(new java.awt.Dimension(150, 40));

        btnNovoLivro.setBackground(new java.awt.Color(183, 123, 123));
        btnNovoLivro.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnNovoLivro.setForeground(new java.awt.Color(248, 241, 234));
        btnNovoLivro.setText("+ Novo Livro");
        btnNovoLivro.setBorderPainted(false);
        btnNovoLivro.setIconTextGap(12);
        btnNovoLivro.setPreferredSize(new java.awt.Dimension(160, 40));

        tblLivros.setBackground(new java.awt.Color(248, 241, 234));
        tblLivros.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        tblLivros.setForeground(new java.awt.Color(80, 59, 61));
        tblLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Título", "Autor", "Preço", "Estoque", "Status"
            }
        ));
        tblLivros.setGridColor(new java.awt.Color(179, 138, 104));
        tblLivrosScroll.setViewportView(tblLivros);

        btnBuscar.setBackground(new java.awt.Color(183, 123, 123));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(248, 241, 234));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorderPainted(false);
        btnBuscar.setIconTextGap(12);
        btnBuscar.setPreferredSize(new java.awt.Dimension(160, 40));
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        javax.swing.GroupLayout pnlLivrosLayout = new javax.swing.GroupLayout(pnlLivros);
        pnlLivros.setLayout(pnlLivrosLayout);
        pnlLivrosLayout.setHorizontalGroup(
            pnlLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLivrosLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(pnlLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLivrosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLivrosLayout.createSequentialGroup()
                        .addGroup(pnlLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tblLivrosScroll, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlLivrosLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNovoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlLivrosLayout.createSequentialGroup()
                                .addComponent(campoBuscaLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(34, 34, 34))))
        );
        pnlLivrosLayout.setVerticalGroup(
            pnlLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLivrosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pnlLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNovoLivro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlLivrosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addGroup(pnlLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoBuscaLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37)
                .addComponent(tblLivrosScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlLivros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlLivros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void atualizarTabela(ArrayList<Produto> produtos) {
        DefaultTableModel modelo = (DefaultTableModel) tblLivros.getModel();
        modelo.setRowCount(0);
        
        for (Produto produto : produtos) {
            if (produto instanceof ProdutoLivro livro) {
                String status;

                if (livro.getStatus()) {
                    status = "Ativo";
                } else {
                    status = "Inativo";
                }
                modelo.addRow(new Object[]{
                    livro.getCodigo(),
                    livro.getNome(),
                    livro.getAutor(),
                    livro.getPreco(),
                    livro.getQuantidadeEstoque(),
                    status,
                });
            }
        }
    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String busca = campoBuscaLivro.getText().trim();
        
        if (busca.isEmpty()) {
            atualizarTabela(gerenciador.listarTodos());
            return;
        }
        
        ArrayList<Produto> encontrado = gerenciador.buscarPorCodigo(busca);
        ArrayList<Produto> porNome = gerenciador.buscarPorNome(busca);
        
        for (Produto produto : porNome) {
            if (!encontrado.contains(produto)) {
                encontrado.add(produto);
            }
        }
        
        if (encontrado.isEmpty()) {
            encontrado = gerenciador.buscarPorNome(busca);
        }
        
        atualizarTabela(encontrado);
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnNovoLivro;
    private javax.swing.JTextField campoBuscaLivro;
    private javax.swing.JComboBox<String> cmbOrdenar;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnlLivros;
    private javax.swing.JTable tblLivros;
    private javax.swing.JScrollPane tblLivrosScroll;
    // End of variables declaration//GEN-END:variables
}
