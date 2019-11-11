/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaredisciplinaorientacaoaobjetos;

/**
 *
 * @author maicon
 */
public class Contas {
    
protected String tipo;
        protected String Vencimento;

	

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVencimento() {
        return Vencimento;
    }

    public void setVencimento(String Vencimento) {
        this.Vencimento = Vencimento;
    }
    
     public void depositar(){
         System.out.println("Conta");
     }
      public void sacar(){
         System.out.println("Débito");
     }
 
       
  public String toString(){
        return " Forma  "+this.toString();
    }
   
}