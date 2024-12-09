package gestaohospitalar;

public class Paciente extends Pessoa {
    private String nomeConvenio;
    private String numeroConvenio;
    private EstadoAtendimento estado;
    
    public Paciente(String nome, String id, String cpf, String end, String tel,
            String nomeConv, String numConv){
        super(nome, id, cpf, end, tel);
        nomeConvenio = nomeConv;
        numeroConvenio = numConv;
    }

    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public void setNomeConvenio(String nomeConvenio) {
        this.nomeConvenio = nomeConvenio;
    }

    public String getNumeroConvenio() {
        return numeroConvenio;
    }

    public void setNumeroConvenio(String numeroConvenio) {
        this.numeroConvenio = numeroConvenio;
    }
    
     public EstadoAtendimento getEstado() {
        return estado;
    }

    public void setEstado(EstadoAtendimento estado) {
        this.estado = estado;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Nome Convenio  : " + nomeConvenio);
        System.out.println("Número Convenio: " + numeroConvenio);
        System.out.println("Estado: " + estado);
    }
}