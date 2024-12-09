package gestaohospitalar;

import java.util.Scanner;

public class GerenciaPaciente {
    private Paciente pacientes[];
    private Scanner ent;
    
    public GerenciaPaciente(Paciente pacs[]){
        pacientes = pacs;
        ent = new Scanner(System.in);
    }
    
    public void cadastrar(){
        String nome, id, cpf, end, tel, nomeConv, numConv;
        
        // Verifica se existem posições vazias no vetor.
        int i = 0;
        while((i < pacientes.length) && (pacientes[i] != null)){
            i++;
        }
        if(i < pacientes.length){
            System.out.println("--==[Cadastro de Pacientes]==--");
            System.out.println("Nome: ");
            nome = ent.nextLine();
            System.out.println("Identidade: ");
            id = ent.nextLine();
            System.out.println("C.P.F.: ");
            cpf = ent.nextLine();
            System.out.println("Endereco: ");
            end = ent.nextLine();
            System.out.println("Telefone: ");
            tel = ent.nextLine();
            System.out.println("Nome Convenio: ");
            nomeConv = ent.nextLine();
            System.out.println("Numero Convenio: ");
            numConv = ent.nextLine();
            
            pacientes[i] = new Paciente(nome, id, cpf, end, tel, nomeConv, numConv);
        }
        else{
            System.out.println("Vetor cheio.");
        }
    }
    
    public void alterar(){
        String nome, id, cpf, end, tel, nomeConv, numConv;
        int pos, resp;
        
        System.out.println("--==[Alteracao de Pacientes]==--");
        System.out.println("Qual posicao deseja alterar? ");
        pos = ent.nextInt();
        ent.skip("\n");
        if(pacientes[pos] != null){
            System.out.println("-=[Dados]=-");
            System.out.println("Nome atual: " + pacientes[pos].getNome());
            System.out.println("Alterar? (1-sim/2-nao");
            resp = ent.nextInt();
            ent.skip("\n");
            if(resp == 1){
                System.out.println("Digite o novo nome: ");
                nome = ent.nextLine();
                pacientes[pos].setNome(nome);
            }
            System.out.println("----------------------------------");
            System.out.println("Identidade atual: " + pacientes[pos].getIdentidade());
            System.out.println("Alterar? (1-sim/2-nao");
            resp = ent.nextInt();
            ent.skip("\n");
            if(resp == 1){
                System.out.println("Digite a nova identidade: ");
                id = ent.nextLine();
                pacientes[pos].setIdentidade(id);
            }
            System.out.println("----------------------------------");
            System.out.println("C.P.F. atual: " + pacientes[pos].getCpf());
            System.out.println("Alterar? (1-sim/2-nao");
            resp = ent.nextInt();
            ent.skip("\n");
            if(resp == 1){
                System.out.println("Digite o novo C.P.F.: ");
                cpf = ent.nextLine();
                pacientes[pos].setCpf(cpf);
            }
            System.out.println("----------------------------------");
            System.out.println("Endereco atual: " + pacientes[pos].getEndereco());
            System.out.println("Alterar? (1-sim/2-nao");
            resp = ent.nextInt();
            ent.skip("\n");
            if(resp == 1){
                System.out.println("Digite o novo Endereco: ");
                end = ent.nextLine();
                pacientes[pos].setEndereco(end);
            }
            System.out.println("----------------------------------");
            System.out.println("Telefone atual: " + pacientes[pos].getTelefone());
            System.out.println("Alterar? (1-sim/2-nao");
            resp = ent.nextInt();
            ent.skip("\n");
            if(resp == 1){
                System.out.println("Digite o novo Telefone: ");
                tel = ent.nextLine();
                pacientes[pos].setTelefone(tel);
            }
            System.out.println("----------------------------------");
            System.out.println("Nome do Convenio atual: " + pacientes[pos].getNomeConvenio());
            System.out.println("Alterar? (1-sim/2-nao");
            resp = ent.nextInt();
            ent.skip("\n");
            if(resp == 1){
                System.out.println("Digite o novo Nome do Convenio: ");
                 nomeConv = ent.nextLine();
                pacientes[pos].setNomeConvenio(nomeConv);
            }
            System.out.println("----------------------------------");
            System.out.println("Número do Convenio atual: " + pacientes[pos].getNumeroConvenio());
            System.out.println("Alterar? (1-sim/2-nao");
            resp = ent.nextInt();
            ent.skip("\n");
            if(resp == 1){
                System.out.println("Digite o novo Numero do Convenio: ");
                 numConv = ent.nextLine();
                pacientes[pos].setNumeroConvenio(numConv);
            }
            System.out.println("----------------------------------");

            System.out.println("Atualizacao realizada com sucesso.");
        }
        else{
            System.out.println("Vetor cheio.");
        }
    }
    
    public void excluir(){
        int pos, resp;
        
        System.out.println("--==[Exclusao de Pacientes]==--");
        System.out.println("Qual posicao deseja excluir? ");
        pos = ent.nextInt();
        ent.skip("\n");
        
        if(pacientes[pos] != null){
            System.out.println("-=[Dados do Paciente]=-");
            pacientes[pos].imprimir();
            System.out.println("\nConfirma exclusao? (1-sim/2-nao)");
            resp = ent.nextInt();
            ent.skip("\n");
            
            if(resp == 1){
                pacientes[pos] = null;
                System.out.println("Exclusao efetuada com sucesso.");
            }
            else{
                System.out.println("Exclusao nao efetuada.");
            }
        }
        else{
            System.out.println("Paciente nao existe.");
        }
    }
    
    public void consultar(){
        int pos;
        
        System.out.println("--==[Consulta de Pacientes]==--");
        System.out.println("Qual posicao deseja consultar? ");
        pos = ent.nextInt();
        ent.skip("\n");
        
        if(pacientes[pos] != null){
            System.out.println("-=[Dados do Paciente]=-");
            pacientes[pos].imprimir();
        }
        else{
            System.out.println("Paciente nao existe.");
        }
    }
    
    public void relatorio(){
        int pos = 0;
        
        System.out.println("--==[Relatorio de Pacientes]==--");
        
        while(pos < pacientes.length){
            if(pacientes[pos] != null){
                pacientes[pos].imprimir();
                System.out.println("\n-----------------------------------\n");
            }
            
            pos++;
        }
    }
}