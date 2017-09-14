
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Livro {

    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    /**
     * @return the Genero
     */
    public String getGenero() {
        return Genero;
    }

    /**
     * @param Genero the Genero to set
     */
    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    /**
     * @return the Data_que_pegou
     */
    public Date getData_que_pegou() {
        return Data_que_pegou;
    }

    /**
     * @param Data_que_pegou the Data_que_pegou to set
     */
    public void setData_que_pegou(Date Data_que_pegou) {
        this.Data_que_pegou = Data_que_pegou;
    }

    /**
     * @return the Prazo_para_entrega
     */
    public int getPrazo_para_entrega() {
        return Prazo_para_entrega;
    }

    /**
     * @param Prazo_para_entrega the Prazo_para_entrega to set
     */
    public void setPrazo_para_entrega(int Prazo_para_entrega) {
        this.Prazo_para_entrega = Prazo_para_entrega;
    }

    /**
     * @return the Data_para_Entrega
     */
    public Date getData_para_Entrega() {
        return Data_para_Entrega;
    }

    /**
     * @param Data_para_Entrega the Data_para_Entrega to set
     */
    public void setData_para_Entrega(Date Data_para_Entrega) {
        this.Data_para_Entrega = Data_para_Entrega;
    }
    private String Titulo;
    private String Genero;
    private Date Data_que_pegou;
    private int Prazo_para_entrega;
    private Date Data_para_Entrega;
    
    
}
