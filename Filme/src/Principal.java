public class Principal {

    public static void main(String[] args) {

        Filme favorito = new Filme();

        favorito.nome = "A Lagoa Azul";
        favorito.anoDeLancamento = 1998;
        favorito.duracaoEmMinutos = 135;
        favorito.incluidoNoPlano = true;

        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(7);


        favorito.exibeFichaTecnica();
        System.out.println("Média de avaliações do filme: " + favorito.pegaMedia());
    }
}
