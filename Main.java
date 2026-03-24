public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Felipe";
        aluno1.idade = 23;
        aluno1.tipoVeiculo = "Carro";

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Ulisses";
        aluno2.idade = 22;
        aluno2.tipoVeiculo = "Moto";

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Gabriel";
        aluno3.idade = 23;
        aluno3.tipoVeiculo = "Carro";

        Aluno aluno4 = new Aluno();
        aluno4.nome = "Joan";
        aluno4.idade = 25;
        aluno4.tipoVeiculo = "Moto";

        Instrutor instrutor = new Instrutor();
        instrutor.nome = "Damiana";
        instrutor.experiencia = 10;
        instrutor.categoria = "Carro";

        Veiculo veiculo = new Veiculo();
        veiculo.tipo = "Carro";
        veiculo.modelo = "Fiat Mobi";
        veiculo.placa = "AEI-1I23";

        aluno1.agendarAulaTeorica();
        aluno1.agendarAulaTeorica();
        aluno1.agendarAulaTeorica();
        aluno1.agendarAulaTeorica();
        aluno1.agendarAulaTeorica();
        aluno1.agendarAulaPratica();
        aluno1.agendarAulaPratica();
        aluno1.agendarAulaPratica();
        aluno1.agendarAulaPratica();
        aluno1.agendarAulaPratica();

        aluno2.agendarAulaTeorica();
        aluno2.agendarAulaTeorica();
        aluno2.agendarAulaTeorica();
        aluno2.agendarAulaTeorica();
        aluno2.agendarAulaTeorica();
        aluno2.agendarAulaPratica();
        aluno2.agendarAulaPratica();
        aluno2.agendarAulaPratica();
        aluno2.agendarAulaPratica();
        aluno2.agendarAulaPratica();

        aluno3.agendarAulaTeorica();
        aluno3.agendarAulaTeorica();
        aluno3.agendarAulaTeorica();
        aluno3.agendarAulaPratica();
        aluno3.agendarAulaPratica();
        aluno3.agendarAulaPratica();

        aluno4.agendarAulaTeorica();
        aluno4.agendarAulaTeorica();
        aluno4.agendarAulaTeorica();
        aluno4.agendarAulaTeorica();
        aluno4.agendarAulaTeorica();
        aluno4.agendarAulaPratica();
        aluno4.agendarAulaPratica();
        aluno4.agendarAulaPratica();
        aluno4.agendarAulaPratica();

        aluno2.cancelarAulaPratica();

        aluno1.realizarExame();
        aluno2.realizarExame();
        aluno3.realizarExame();
        aluno4.realizarExame();

        AutoEscola autoEscola = new AutoEscola();
        autoEscola.aluno1 = aluno1;
        autoEscola.aluno2 = aluno2;
        autoEscola.aluno3 = aluno3;
        autoEscola.aluno4 = aluno4;

        autoEscola.exibirResumo();

        System.out.println(" INSTRUTOR ");
        System.out.println("Nome: " + instrutor.nome);
        System.out.println("Experiencia: " + instrutor.experiencia);
        System.out.println("Categoria: " + instrutor.categoria);

        System.out.println(" VEICULO ");
        System.out.println("Tipo: " + veiculo.tipo);
        System.out.println("Modelo: " + veiculo.modelo);
        System.out.println("Placa: " + veiculo.placa);
    }
}