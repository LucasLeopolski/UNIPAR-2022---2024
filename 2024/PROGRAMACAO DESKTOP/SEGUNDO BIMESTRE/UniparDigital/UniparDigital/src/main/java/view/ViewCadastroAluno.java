/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.AlunoDao;
import dto.EnderecoDTO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.Aluno;
import service.EnderecoService;

/**
 *
 * @author Usuário
 */
public class ViewCadastroAluno extends javax.swing.JFrame {

    private AlunoDao alunoDao = new AlunoDao();
    private boolean alunoPesquisado; 
    private ArrayList<Aluno>lista;
    
    public ViewCadastroAluno() {
        initComponents();
        
        atualizaGrid(); // chamando aqui pq se não só atualiza a tabela quando eu salvar algo 
    }
    
    //metodo para atualizar tabela
    public void atualizaGrid(){
        try {
            String sql = "SELECT * FROM public.\"Aluno\" ORDER BY \"RA_ALUNO\";";
            lista = new ArrayList<>();
            lista = alunoDao.retornaLista(sql);
             
             //Manipulação da tabela 
             
             tbAlunos.removeAll();
             
             //cria as colunas
             DefaultTableModel tableModel = new DefaultTableModel(
                     new Object[][]{},
                        new String[]{"RA", "NOME", "DT. NASCIMENTO"}){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
                            
                            
             
            };
            
             // criando as colunas da tabela
             tbAlunos.setModel(tableModel);
             
             
             // jogando os dados dos alunos na tabela 
             DefaultTableModel dm = (DefaultTableModel)tbAlunos.getModel();
             
             //retornar dados de cada aluno e jogar na tabela , esta adicionando as linhas a tabela com os dados dos alunos
             for (Aluno aluno : lista) {
                    dm.addRow(new Object[]{aluno.getRaAluno(), aluno.getNomeAluno(), aluno.getDtNascAluno()});
             }
             //Cada linha que eu selecionar vai implementar esse método: 
             tbAlunos.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
                 @Override
                 public void valueChanged(ListSelectionEvent e){
                     int linhaSelecionada = tbAlunos.getSelectedRow();
                     if(linhaSelecionada != -1){
                         mostraAluno(lista.get(linhaSelecionada));}
                 }
        });
        } catch (Exception ex) {
        }
    }
    
    public void limparCampos(){
        tfRaAluno.setText(""); // limpando os campos
        tfNomeAluno.setText("");
        tfDataNascAluno.setText("");
        tfRaAluno.setEditable(true);
        btSalvar.setEnabled(false);
    
    }
    
    private void mostraAluno(Aluno aluno){
    tfRaAluno.setText(String.valueOf(aluno.getRaAluno()));
    tfNomeAluno.setText(aluno.getNomeAluno());
    tfDataNascAluno.setText(aluno.getDtNascAluno());
    tfRaAluno.setEditable(false); // impossibilitando editar o RA
    btSalvar.setEnabled(false);
    alunoPesquisado = true; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfRaAluno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfNomeAluno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfDataNascAluno = new javax.swing.JFormattedTextField();
        btRemover = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tfCep = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfLogradouro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfBairro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfCidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAlunos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Aluno");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRO DE ALUNOS");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("R.A: ");

        jLabel3.setText("Nome:");

        jLabel4.setText("Data Nascimento");

        tfDataNascAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        btRemover.setText("Remover");
        btRemover.setPreferredSize(new java.awt.Dimension(90, 23));
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar");
        btAtualizar.setPreferredSize(new java.awt.Dimension(90, 23));
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.setPreferredSize(new java.awt.Dimension(90, 23));
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btPesquisar.setText("Pesquisar");
        btPesquisar.setPreferredSize(new java.awt.Dimension(90, 23));
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        jLabel5.setText("CEP:");

        tfCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCepKeyPressed(evt);
            }
        });

        jLabel6.setText("Logradouro:");

        tfLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLogradouroActionPerformed(evt);
            }
        });

        jLabel7.setText("Nº");

        jLabel8.setText("Bairro:");

        jLabel9.setText("Cidade:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(89, 89, 89)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfRaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNomeAluno)
                                    .addComponent(tfLogradouro)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel6))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(tfCidade))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(tfDataNascAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addComponent(tfNumero)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 167, Short.MAX_VALUE)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDataNascAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        tbAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbAlunos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
       
        Aluno novoAluno = new Aluno();
        novoAluno.setRaAluno(Integer.parseInt( tfRaAluno.getText()));
        novoAluno.setNomeAluno(tfNomeAluno.getText());
        novoAluno.setDtNascAluno(tfDataNascAluno.getText());
        
        if(alunoDao.salvar(novoAluno)){
            JOptionPane.showMessageDialog(this,
                    "Aluno salvo com Sucesso!",
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE); // vai exibir o icone 
        }else{
            JOptionPane.showMessageDialog(this,
                    "Erro ao salvar Aluno, solicite suporte técnico!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE); // vai exibir o icone 
        
        }  
        atualizaGrid();
        limparCampos();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
       if(alunoPesquisado){
            
            Aluno aluno = new Aluno();
            aluno.setRaAluno(Integer.parseInt(tfRaAluno.getText()));
            aluno.setNomeAluno(tfNomeAluno.getText());
            aluno.setDtNascAluno(tfDataNascAluno.getText());
            
            if(alunoDao.atualizar(aluno)){
               JOptionPane.showMessageDialog(this, 
                       "Aluno atualizado com sucesso!");
               limparCampos();
               atualizaGrid();
            }else{
                JOptionPane.showMessageDialog(this, 
                       "Erro ao atualizar o aluno, "
                               + "Solicite suporte técnico.",
                       "Erro",
                       JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, 
                       "Selecione um Aluno para atualizar!",
                       "Atenção",
                       JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        if(alunoPesquisado){
            alunoDao.delete(Integer.parseInt(tfRaAluno.getText()), "Aluno", "RA_ALUNO");
            JOptionPane.showMessageDialog(this, "Aluno atualizado com sucesso!");
            limparCampos();
            atualizaGrid();
            
            
        }else{
             JOptionPane.showMessageDialog(this, "Selecione um Aluno para remover!",
                "Erro",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void tfLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLogradouroActionPerformed

    private void tfCepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCepKeyPressed
        if(evt.getKeyCode()== evt.VK_ENTER){
        if(!tfCep.getText().equals("")){
           
            try {
                EnderecoDTO endereco = EnderecoService.buscaEndereco(tfCep.getText());
                tfLogradouro.setText(endereco.getLogradouro());
                tfBairro.setText(endereco.getBairro());
                tfCidade.setText(endereco.getLocalidade()+"/"+endereco.getUf());
            } catch (Exception ex) {
                Logger.getLogger(ViewCadastroAluno.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                
           
        }}
    }//GEN-LAST:event_tfCepKeyPressed
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAlunos;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCep;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JFormattedTextField tfDataNascAluno;
    private javax.swing.JTextField tfLogradouro;
    private javax.swing.JTextField tfNomeAluno;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfRaAluno;
    // End of variables declaration//GEN-END:variables
}
