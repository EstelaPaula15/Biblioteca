/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class UsuarioDaBiblioteca {

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the CPF
     */
    public int getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the Endereço
     */
    public String getEndereço() {
        return Endereço;
    }

    /**
     * @param Endereço the Endereço to set
     */
    public void setEndereço(String Endereço) {
        this.Endereço = Endereço;
    }

    /**
     * @return the Numero_do_Celular
     */
    public int getNumero_do_Celular() {
        return Numero_do_Celular;
    }

    /**
     * @param Numero_do_Celular the Numero_do_Celular to set
     */
    public void setNumero_do_Celular(int Numero_do_Celular) {
        this.Numero_do_Celular = Numero_do_Celular;
    }
    private String Nome;
    private int CPF;
    private String Endereço;
    private int Numero_do_Celular;
    
}
