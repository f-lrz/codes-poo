package exerPessoaVeiculo;


public class Programa {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa("Filipe", 2004);
        Pessoa p2 = new Pessoa("Sophia", 2008);

        Veiculo v1 = new Veiculo("ABC1234", 90000, 2019);
        Veiculo v2 = new Veiculo("AAA1111", 70000, 2020);

        p1.ligaVeic(v1);
        p1.aceleraVeic(v1, 20);
        p1.desaceleraVeic(v1, 10);

    }
}