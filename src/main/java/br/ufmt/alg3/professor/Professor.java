package br.ufmt.alg3.professor;

public class Professor { /*quando a classe tem só SET e GET , é chamado de ENTIDADE, pois será amarzenado nossos dados vindo dos usuários */
    private String nome;
    private String area_atuacao;
    private String disciplina;
    private int nota;
    private String semestre;
    private String departamento;
    private String comentario;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setArea_atuacao(String area_atuacao){
        this.area_atuacao = area_atuacao;
    }

    public String getArea_Atuacao(){
        return area_atuacao;
    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }

    public String getDisciplina(){
        return disciplina;
    }

    public void setNota(int nota){
        this.nota = nota;
    }

    public int getNota(){
        return nota;
    }

    public void setSemestre(String semestre){
        this.semestre = semestre;
    }

    public String getSemestre(){
        return semestre;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setComentario(String comentario){
        this.comentario = comentario;
    }

    public String getComentario(){
        return comentario;
    }









}
