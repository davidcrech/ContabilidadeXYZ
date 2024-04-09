
package model;

// pessoas jurídic tem-se, nome, endereço, telefone, C.N.P.J., I.E. e faturamento
// pessoas físicas tem-se, nome, endereço, telefone, CPF, RG e
// Salário.

import javax.swing.JOptionPane;


public class Pessoa {
    private String Nome;
    private String endereco;
    private int Phone;
    
    public Pessoa(){
        this("", "", 0);
    }
    
    public Pessoa(String Nome, String endereco, int Phone) {
        this.Nome = Nome;
        this.endereco = endereco;
        this.Phone = Phone;
    }

    public String getNome() {
        return Nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getPhone() {
        return Phone;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }
    
    public void solicitarNome(){
        setNome(JOptionPane.showInputDialog("Nome: "));
    }
    
    public void solicitarEndereco(){
        setEndereco(JOptionPane.showInputDialog("Endereço"));
    }
    
    public void solicitarPhone(){
        setPhone(Integer.parseInt(JOptionPane.showInputDialog("Phone number; ")));
    }
    
    public void imprimirNome(){
        JOptionPane.showMessageDialog(null, getNome());
    }
    
    public void imprimirEndereco(){
        JOptionPane.showMessageDialog(null, getEndereco());
    }
    
    public void imprimirPhone(){
        JOptionPane.showMessageDialog(null, getPhone());
    }
}
