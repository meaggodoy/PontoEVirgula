package pontoevirgula.tela;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;

public class TelaPrincipal extends javax.swing.JFrame {
    private CardLayout layout;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaPrincipal.class.getName());

    public TelaPrincipal() {
        initComponents();
        
        layout = new CardLayout();
        pnlConteudo.setLayout(layout);
        
        pnlConteudo.add(new PainelInicio(), "inicio");
        pnlConteudo.add(new PainelLivros(), "livros");
        
        layout.show(pnlConteudo, "inicio");
        selecionarBotao(btnInicio);
    }
    
    private void selecionarBotao(JButton selecionado) {
        Color corNormal = Color.decode("#4A2434");
        Color corSelecionada = Color.decode("#95565D");

        btnInicio.setBackground(corNormal);
        btnLivros.setBackground(corNormal);
        btnCafe.setBackground(corNormal);
        btnIngredientes.setBackground(corNormal);
        btnReceitas.setBackground(corNormal);
        btnVendas.setBackground(corNormal);
        btnRelatorios.setBackground(corNormal);

        selecionado.setBackground(corSelecionada);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundoPrincipal = new javax.swing.JPanel();
        pnlLateral = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnLivros = new javax.swing.JButton();
        btnCafe = new javax.swing.JButton();
        btnIngredientes = new javax.swing.JButton();
        btnReceitas = new javax.swing.JButton();
        btnVendas = new javax.swing.JButton();
        btnRelatorios = new javax.swing.JButton();
        btnConfiguracoes = new javax.swing.JButton();
        imgLogo = new javax.swing.JLabel();
        pnlConteudo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1250, 700));

        fundoPrincipal.setBackground(new java.awt.Color(248, 241, 234));
        fundoPrincipal.setPreferredSize(new java.awt.Dimension(1250, 700));

        pnlLateral.setBackground(new java.awt.Color(74, 36, 52));
        pnlLateral.setPreferredSize(new java.awt.Dimension(250, 700));

        btnInicio.setBackground(new java.awt.Color(74, 36, 52));
        btnInicio.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(248, 241, 234));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontoevirgula/img/icon/home.png"))); // NOI18N
        btnInicio.setText("Início");
        btnInicio.setBorderPainted(false);
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicio.setIconTextGap(12);
        btnInicio.setPreferredSize(new java.awt.Dimension(230, 40));
        btnInicio.addActionListener(this::btnInicioActionPerformed);

        btnLivros.setBackground(new java.awt.Color(74, 36, 52));
        btnLivros.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnLivros.setForeground(new java.awt.Color(248, 241, 234));
        btnLivros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontoevirgula/img/icon/open-book.png"))); // NOI18N
        btnLivros.setText("Livros");
        btnLivros.setBorderPainted(false);
        btnLivros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLivros.setIconTextGap(12);
        btnLivros.setPreferredSize(new java.awt.Dimension(230, 40));
        btnLivros.addActionListener(this::btnLivrosActionPerformed);

        btnCafe.setBackground(new java.awt.Color(74, 36, 52));
        btnCafe.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnCafe.setForeground(new java.awt.Color(248, 241, 234));
        btnCafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontoevirgula/img/icon/coffee.png"))); // NOI18N
        btnCafe.setText("Café");
        btnCafe.setBorderPainted(false);
        btnCafe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCafe.setIconTextGap(12);
        btnCafe.setPreferredSize(new java.awt.Dimension(230, 40));

        btnIngredientes.setBackground(new java.awt.Color(74, 36, 52));
        btnIngredientes.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnIngredientes.setForeground(new java.awt.Color(248, 241, 234));
        btnIngredientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontoevirgula/img/icon/coffee-seed.png"))); // NOI18N
        btnIngredientes.setText("Ingredientes");
        btnIngredientes.setBorderPainted(false);
        btnIngredientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnIngredientes.setIconTextGap(12);
        btnIngredientes.setPreferredSize(new java.awt.Dimension(230, 40));

        btnReceitas.setBackground(new java.awt.Color(74, 36, 52));
        btnReceitas.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnReceitas.setForeground(new java.awt.Color(248, 241, 234));
        btnReceitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontoevirgula/img/icon/recipe-book.png"))); // NOI18N
        btnReceitas.setText("Receitas");
        btnReceitas.setBorderPainted(false);
        btnReceitas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReceitas.setIconTextGap(12);
        btnReceitas.setPreferredSize(new java.awt.Dimension(230, 40));

        btnVendas.setBackground(new java.awt.Color(74, 36, 52));
        btnVendas.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnVendas.setForeground(new java.awt.Color(248, 241, 234));
        btnVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontoevirgula/img/icon/price-tag.png"))); // NOI18N
        btnVendas.setText("Vendas");
        btnVendas.setBorderPainted(false);
        btnVendas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVendas.setIconTextGap(12);
        btnVendas.setPreferredSize(new java.awt.Dimension(230, 40));

        btnRelatorios.setBackground(new java.awt.Color(74, 36, 52));
        btnRelatorios.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnRelatorios.setForeground(new java.awt.Color(248, 241, 234));
        btnRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontoevirgula/img/icon/bar-chart.png"))); // NOI18N
        btnRelatorios.setText("Relatórios");
        btnRelatorios.setBorderPainted(false);
        btnRelatorios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRelatorios.setIconTextGap(12);
        btnRelatorios.setPreferredSize(new java.awt.Dimension(230, 40));

        btnConfiguracoes.setBackground(new java.awt.Color(74, 36, 52));
        btnConfiguracoes.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnConfiguracoes.setForeground(new java.awt.Color(248, 241, 234));
        btnConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontoevirgula/img/icon/settings.png"))); // NOI18N
        btnConfiguracoes.setText("Configurações");
        btnConfiguracoes.setBorderPainted(false);
        btnConfiguracoes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConfiguracoes.setIconTextGap(12);
        btnConfiguracoes.setPreferredSize(new java.awt.Dimension(230, 40));

        imgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontoevirgula/img/logo_pontoevirgula_190px.png"))); // NOI18N

        javax.swing.GroupLayout pnlLateralLayout = new javax.swing.GroupLayout(pnlLateral);
        pnlLateral.setLayout(pnlLateralLayout);
        pnlLateralLayout.setHorizontalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLateralLayout.createSequentialGroup()
                        .addGroup(pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnReceitas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addGroup(pnlLateralLayout.createSequentialGroup()
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(7, Short.MAX_VALUE))))
        );
        pnlLateralLayout.setVerticalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(imgLogo)
                .addGap(35, 35, 35)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLivros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCafe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReceitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        pnlConteudo.setBackground(new java.awt.Color(248, 241, 234));
        pnlConteudo.setPreferredSize(new java.awt.Dimension(1000, 700));

        javax.swing.GroupLayout pnlConteudoLayout = new javax.swing.GroupLayout(pnlConteudo);
        pnlConteudo.setLayout(pnlConteudoLayout);
        pnlConteudoLayout.setHorizontalGroup(
            pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 994, Short.MAX_VALUE)
        );
        pnlConteudoLayout.setVerticalGroup(
            pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fundoPrincipalLayout = new javax.swing.GroupLayout(fundoPrincipal);
        fundoPrincipal.setLayout(fundoPrincipalLayout);
        fundoPrincipalLayout.setHorizontalGroup(
            fundoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoPrincipalLayout.createSequentialGroup()
                .addComponent(pnlLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE))
        );
        fundoPrincipalLayout.setVerticalGroup(
            fundoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoPrincipalLayout.createSequentialGroup()
                .addGroup(fundoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fundoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fundoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLivrosActionPerformed
        // TODO add your handling code here:
        layout.show(pnlConteudo, "livros");
        selecionarBotao(btnLivros);

    }//GEN-LAST:event_btnLivrosActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
        layout.show(pnlConteudo, "inicio");
        selecionarBotao(btnInicio);
    }//GEN-LAST:event_btnInicioActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TelaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCafe;
    private javax.swing.JButton btnConfiguracoes;
    private javax.swing.JButton btnIngredientes;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnLivros;
    private javax.swing.JButton btnReceitas;
    private javax.swing.JButton btnRelatorios;
    private javax.swing.JButton btnVendas;
    private javax.swing.JPanel fundoPrincipal;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JPanel pnlLateral;
    // End of variables declaration//GEN-END:variables
}
