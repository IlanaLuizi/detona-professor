package br.ufmt.alg3;

import java.util.Scanner;

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
    /*  Curso[] respostas;
        respostas = new Curso[3]; instanciando array 

        int [][] mat = new int [3][2]; instanciando martriz  */

        Curso[] respostas;
        respostas = new Curso[3];
        Scanner teclado;
        teclado = new Scanner(System.in);
        for(int i = 0; i < respostas.length; i++){
            Curso c = new Curso();
            System.out.print("Digite o nome do Curso:");
            String nome = teclado.nextLine();
            c.setNome(nome);
            System.out.println("o nome digitado foi:" + c.getNome());
            respostas[i] = c;
        }
        for (Curso curso : respostas){
            System.out.println("Curso avaliado:" + curso.getNome());

        }
        

        
  
    }
}

 /*garbage collector - na execução */
        /*new Curso() é chamado de método construtor */
        
        /*cd detona-professor
         * git init
         * sudo apt install git
         * git add pom.xml src/*
         * git status
         * git config user.name "Ilana Luizi"
         * git config user.email ilanaluizy1008@gmail.com
         * git commit -m "inicia o projeto"
         */

