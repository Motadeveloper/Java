public class Filme {
    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    double totalDaAvaliacoes;

    void exibeFichaTecnica () {
        System.out.println("Nome do filme: " +nome);
        System.out.println("Ano de Lançamento: " +anoDeLancamento);
        System.out.println("Duração em minutos: " +duracaoEmMinutos);
        System.out.println("Incluído no plano: " +incluidoNoPlano);
    }

    void avalia (double nota){
        somaDasAvaliacoes += nota;
        totalDaAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDaAvaliacoes;
    }


}
