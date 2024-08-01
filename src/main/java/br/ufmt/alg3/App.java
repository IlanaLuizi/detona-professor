package br.ufmt.alg3;

import br.ufmt.alg3.curso.Curso;
import br.ufmt.alg3.professor.Professor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Curso c = new Curso(); /*1 Curso é a classe, 2 c é a variável, "new Curso()" está criando o objeto curso// nesse momento está salvando em c a referência  */ /*variável só guarda uma referência */
        c.setNome("SI"); /* está indo na referência e colocando "SI" */
        System.out.println(c.getNome());

        Professor p = new Professor(); /*reservando o endereço na memória, até esse momento Professor tem null */
        p.setNome ("Rafael");
        p.setArea_atuacao("TI");
        p.setDisciplina("Algoritmos III");
        p.setSemestre("2024/1");

        System.out.println(p.getNome());

        /*garbage collector - na execução */
        /*new Curso() é chamado de método construtor */

    }
}
