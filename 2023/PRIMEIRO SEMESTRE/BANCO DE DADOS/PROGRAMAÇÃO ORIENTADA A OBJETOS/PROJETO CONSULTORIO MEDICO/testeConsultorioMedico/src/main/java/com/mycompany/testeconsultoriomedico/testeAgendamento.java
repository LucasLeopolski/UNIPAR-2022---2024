/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeconsultoriomedico;

/**
 *
 * @author lucas
 *
 */
import java.util.Scanner;
import java.util.Random;

public class testeAgendamento {

    public String nome;
    public String telefone;
    public String sexo;
    public int idade;
    public String endereco;
    public String especialidade; // precisa retirar e colocar na classe medico  addc sintomas 
    public String medico; // retirar e colocar na classe pessoa - add medico de acordeo com sintomas 
    public int idAgendamento; // estava private passado para public
    private boolean lembrete; // não é necessário 
    private String dia;
    private String hora;

    
    Scanner ler = new Scanner(System.in);
    public testeAgendamento(String nome, String telefone, String sexo, String endereco, String especialidade, String medico) {
        
        
     
        System.out.println("Informe seu nome: " + nome);
        nome = ler.nextLine();
        System.out.println("Informe seu telefone: " + telefone);
        telefone = ler.nextLine();
        System.out.println("Informe seu sexo: " + sexo);
        sexo = ler.next(); // retorna uma cadeia de caracter simples, sempespaçõs em branco 
        System.out.println("Informe sua idade: " + idade);
        idade = ler.nextInt();
        System.out.println("Informe seu endereço: " + endereco);
        endereco = ler.nextLine();
        System.out.println("Qual especialidade deseja? " + especialidade);
        especialidade = ler.nextLine();
        System.out.println("Informe o nome do seu médico: " + medico);
        medico = ler.nextLine();
        System.out.println("Seu número de agendamento é: " + idAgendamento);
        // talvez o id agemdamento não seja possivél ser solicitado posis será passado pelo do while
        
        do {

            idAgendamento = idAgendamento + 1;
            System.out.println(idAgendamento);

        } while (idAgendamento <= 10);

    }

    public void opcaoAgendamento() {
        System.out.println("Você optou pela opção Agendamento, por favor informe o que deseja: \n\n");
        System.out.println("[1] Agendar uma consulta   [2] Cancelar meu agendamento   [3] Voltar");
        int opcao = ler.nextInt();
        switch (opcao) {

            case 1:
                System.out.println("Você decidiu agendar uma consulta! \nPor favor inoforme seus dados!");
                testeAgendamento a1 = new testeAgendamento(nome, telefone, sexo, endereco, especialidade, medico);
                System.out.println("");
                
                
                /*a1.nome = nome;
                a1.telefone = telefone;
                a1.sexo = sexo;
                a1.idade = idade;
                a1.endereco = endereco;
                a1.especialidade = especialidade;
                a1.medico = medico;
                a1.idAgendamento = idAgendamento;*/
                
            case 2: 
                System.out.println("Você optou por cancelar seu agendamento!");
                System.out.println("Informe o número do seu agendamento: ");
                idAgendamento=ler.nextInt();
                
                if(idAgendamento == idAgendamento){
                    System.out.println("Seu agendamento foi cancelado!");
                }
            case 3: 
                    System.out.println("Você escolheu retornar ao início!"); // não sei como retornar 
                
                
                default:
                        System.out.println("Número invalido!");
                       
                            

        }
    }

}
