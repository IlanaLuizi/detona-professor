package br.ufmt.alg3.curso;

public class Curso {

    private String nome;
    private String periodo;
    private float nota;
    private String comentario;
    private String rga;
    private int semestre;

    public Curso(){
        periodo = "matutino";
    }

    public Curso(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setPeriodo( String periodo){
        this.periodo = periodo;
    }

    public String GetPeriodo(){
        return periodo;
    }
    
    public void setNota(float nota){
        this.nota = nota;
    }

    public Float GetNota(){
        return nota;
    }

    public void setComentario(String comentario){
        this.comentario = comentario;
    }

    public String GetComentario(){
        return comentario;
    }

    public void setRga(String rga){
        this.rga = rga;
    }

    public String getRga(){
        return rga;
    }

    public void setSemestre(int semestre){
        this.semestre = semestre;
    }

    public int getSemestre(){
        return semestre;
    }

    
}

/*metodo construtor não tem retorno */
/*assinatura do método construtor */
/*encapsulamento */


/*gitcommit - salvar a alteração localment
 * gitpull - vou mandar 
 * gitfeth
 * git
*/