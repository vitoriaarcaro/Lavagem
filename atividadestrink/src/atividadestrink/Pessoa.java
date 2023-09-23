/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadestrink;

/**
 *
 * @author aluno tds
 */
public class Pessoa {
    private String nome;
    private String sexo;
    private String telefone;
    private String dataNascimento;
    private String endereco;
    private String plano;
    

    public Pessoa (String nome, String sexo, String telefone, String dataNascimento, String endereco) {
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        
     }
    
     public void addPlano(String planoU){
         this.plano = planoU;
             
  }
    
}
