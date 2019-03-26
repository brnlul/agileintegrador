package br.edu.unifacear.agile.main;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.edu.unifacear.agile.dao.Dao;
import br.edu.unifacear.agile.dao.GenericDao;
import br.edu.unifacear.agile.entity.projetos_cadastrados;

public class TelaCadastroProjeto extends JFrame {
	
	private JPanel contentPane;
	private JTextField txt_nomep;
	private JTextField txt_dev1;
	private JTextField txt_dev2;
	private JTextField txt_dev3;
	private JTextField txt_estimativa;
	private JTextField txt_descricao;
	private JTextField txt_codprojeto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroProjeto frame = new TelaCadastroProjeto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCadastroProjeto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_nome = new JLabel("Nome do Projeto:");
		lbl_nome.setBounds(10, 28, 100, 14);
		contentPane.add(lbl_nome);
		
		txt_nomep = new JTextField();
		txt_nomep.setBounds(113, 25, 204, 20);
		contentPane.add(txt_nomep);
		txt_nomep.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 		
				GenericDao gd = new GenericDao();
				projetos_cadastrados p = new projetos_cadastrados();
				Dao<projetos_cadastrados> projetoDao = new GenericDao<projetos_cadastrados>();
				
				p.setNomeprojeto(txt_nomep.getText());
				p.setCod_projeto(txt_codprojeto.getText());
				p.setDev1(txt_dev1.getText());
				p.setDev2(txt_dev2.getText());
				p.setDev3(txt_dev3.getText());
				p.setEstimativa(txt_estimativa.getText());
				p.setDescricao(txt_descricao.getText());
				/*if (p.getCod_projeto() == null) {
					JOptionPane.showMessageDialog(null, "Campo codigo não pode ficar em branco",getTitle(), JOptionPane.INFORMATION_MESSAGE);
				}*/
				gd.inserir(p);
				
		}});
		btnSalvar.setBounds(362, 335, 126, 47);
		contentPane.add(btnSalvar);
		
		JLabel lbl_desenvolvedor1 = new JLabel("Desenvolvedor 1");
		lbl_desenvolvedor1.setBounds(94, 59, 100, 14);
		contentPane.add(lbl_desenvolvedor1);
		
		JLabel lbl_desenvolvedor2 = new JLabel("Desenvolvedor 2");
		lbl_desenvolvedor2.setBounds(94, 90, 100, 14);
		contentPane.add(lbl_desenvolvedor2);
		
		JLabel lbl_desenvolvedor3 = new JLabel("Desenvolvedor 3");
		lbl_desenvolvedor3.setBounds(94, 121, 100, 14);
		contentPane.add(lbl_desenvolvedor3);
		
		txt_dev1 = new JTextField();
		txt_dev1.setBounds(200, 56, 204, 20);
		contentPane.add(txt_dev1);
		txt_dev1.setColumns(10);
		
		txt_dev2 = new JTextField();
		txt_dev2.setColumns(10);
		txt_dev2.setBounds(200, 87, 204, 20);
		contentPane.add(txt_dev2);
		
		txt_dev3 = new JTextField();
		txt_dev3.setColumns(10);
		txt_dev3.setBounds(200, 118, 204, 20);
		contentPane.add(txt_dev3);
		
		JLabel lbl_estimativa = new JLabel("Estimativa:");
		lbl_estimativa.setBounds(44, 168, 59, 14);
		contentPane.add(lbl_estimativa);
		
		txt_estimativa = new JTextField();
		txt_estimativa.setBounds(113, 165, 91, 20);
		contentPane.add(txt_estimativa);
		txt_estimativa.setColumns(10);
		
		JLabel lbl_descricao = new JLabel("Descri\u00E7\u00E3o:");
		lbl_descricao.setBounds(44, 210, 59, 14);
		contentPane.add(lbl_descricao);
		
		txt_descricao = new JTextField();
		txt_descricao.setBounds(113, 207, 126, 47);
		contentPane.add(txt_descricao);
		txt_descricao.setColumns(10);
		
		JLabel lbl_codprojeto = new JLabel("Codigo do projeto:");
		lbl_codprojeto.setBounds(362, 28, 111, 14);
		contentPane.add(lbl_codprojeto);
		
		txt_codprojeto = new JTextField();
		txt_codprojeto.setBounds(466, 25, 86, 20);
		contentPane.add(txt_codprojeto);
		txt_codprojeto.setColumns(10);
	}
}
