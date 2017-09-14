
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
public class Periódicos {

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
     * @return the Data_que_Pegou
     */
    public Date getData_que_Pegou() {
        return Data_que_Pegou;
    }

    /**
     * @param Data_que_Pegou the Data_que_Pegou to set
     */
    public void setData_que_Pegou(Date Data_que_Pegou) {
        this.Data_que_Pegou = Data_que_Pegou;
    }

    /**
     * @return the Prazo_de_entrega
     */
    public int getPrazo_de_entrega() {
        return Prazo_de_entrega;
    }

    /**
     * @param Prazo_de_entrega the Prazo_de_entrega to set
     */
    public void setPrazo_de_entrega(int Prazo_de_entrega) {
        this.Prazo_de_entrega = Prazo_de_entrega;
    }

    /**
     * @return the Data_para_entrega
     */
    public Date getData_para_entrega() {
        return Data_para_entrega;
    }

    /**
     * @param Data_para_entrega the Data_para_entrega to set
     */
    public void setData_para_entrega(Date Data_para_entrega) {
        this.Data_para_entrega = Data_para_entrega;
    }
    private String Genero;
    private Date Data_que_Pegou;
    private int Prazo_de_entrega;
    private Date Data_para_entrega;
    
}
