
package Agendabancodades;

/**
 *
 * @author maicon
 */
public class Contato {
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String sexo;
    
    public Contato(String n,int f,String end,String email){
            this.nome=n;
            this.telefone=telefone;
            this.endereco=end;
            this.email=email;
        }

    public Contato() {
        Contato contato=new Contato();
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
