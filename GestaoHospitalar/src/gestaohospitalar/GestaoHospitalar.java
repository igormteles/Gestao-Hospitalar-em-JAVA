package gestaohospitalar;

import java.util.Scanner;

public class GestaoHospitalar {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        
        // Vetores.
        Paciente pacientes[] = new Paciente[100];
        Medico medicos[] = new Medico[100];
        
        GerenciaMedico gm = new GerenciaMedico(medicos);
        GerenciaPaciente gp = new GerenciaPaciente(pacientes);
        Atendimento at = new Atendimento(medicos, pacientes);
        
        int op1, op2;
        
        do{
            System.out.println("--==[Gestao Hospitalar]==--");
            System.out.println("1 - Medicos");
            System.out.println("2 - Pacientes");
            System.out.println("3 - Sair");
            System.out.println("Opcao: ");
            op1 = e.nextInt();
            e.skip("\n");
            
            switch(op1){
                case 1:
                    do{
                        System.out.println("--==[Medicos]==--");
                        System.out.println("1 - Cadastrar");
                        System.out.println("2 - Alterar");
                        System.out.println("3 - Excluir");
                        System.out.println("4 - Consultar");
                        System.out.println("5 - Relatorio");
                        System.out.println("6 - Alterar estado");
                        System.out.println("7 - Voltar ao menu principal");
                        System.out.println("Opcao: ");
                        op2 = e.nextInt();
                        e.skip("\n");

                        switch(op2){
                            case 1:
                                gm.cadastrar();
                                break;
                            case 2:
                                gm.alterar();
                                break;
                            case 3:
                                gm.excluir();
                                break;
                            case 4:
                                gm.consultar();
                                break;
                            case 5:
                                gm.relatorio();
                            case 6:
                                at.AlterarEstado(gm);
                        }
                    }while(op2 != 7);
                    break;
                case 2:
                    do{
                        System.out.println("--==[Pacientes]==--");
                        System.out.println("1 - Cadastrar");
                        System.out.println("2 - Alterar");
                        System.out.println("3 - Excluir");
                        System.out.println("4 - Consultar");
                        System.out.println("5 - Relatorio");
                        System.out.println("6 - Voltar ao menu principal");
                        System.out.println("Opcao: ");
                        op2 = e.nextInt();
                        e.skip("\n");

                        switch(op2){
                            case 1:
                                gp.cadastrar();
                                break;
                            case 2:
                                gp.alterar();
                                break;
                            case 3:
                                gp.excluir();
                                break;
                            case 4:
                                gp.consultar();
                                break;
                            case 5:
                                gp.relatorio();
                        }
                    }while(op2 != 6);
            }
        }while(op1 != 3);
    }
}