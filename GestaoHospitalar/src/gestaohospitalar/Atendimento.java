/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaohospitalar;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Atendimento {
    private Medico[] medicos;
    private Paciente[] pacientes;
    private EstadoAtendimento estado;
    
    public Atendimento(Medico[] medicos, Paciente[] pacientes){
        this.medicos = medicos;
        this.pacientes = pacientes;
    }
    
    
    
    public void AlterarEstado(GerenciaMedico gm){
        if(!gm.Autenticado()){
           System.out.println("Apenas medicos cadastrados podem alterar o estado");
           return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o CPF do paciente:");
        String cpf = sc.nextLine();

        for (Paciente paciente : pacientes) {
            if (paciente != null && paciente.getCpf().equals(cpf)) {
                System.out.println("Paciente encontrado: " + paciente.getNome());
                System.out.println("Estado atual: " + paciente.getEstado());

                System.out.println("Estados disponíveis:");
                for (EstadoAtendimento estado : EstadoAtendimento.values()) {
                    System.out.println("- " + estado);
                }

                System.out.println("Digite o novo estado:");
                String novoEstado = sc.nextLine().toUpperCase();

                try {
                    paciente.setEstado(EstadoAtendimento.valueOf(novoEstado));
                    System.out.println("Estado alterado com sucesso para: " + paciente.getEstado());
                } catch (IllegalArgumentException e) {
                    System.out.println("Estado inválido.");
                }
                return;
            }
        }
        System.out.println("Paciente não encontrado.");

    }
}
