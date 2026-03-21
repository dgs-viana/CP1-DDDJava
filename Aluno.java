public class Aluno {
    String nome;
    int idade;
    String tipoVeiculo;
    int aulasTeoricas;
    int aulasPraticas;
    boolean aprovado;

    void agendarAulaTeorica() {
        aulasTeoricas = aulasTeoricas + 1;
    }

    void agendarAulaPratica() {
        aulasPraticas = aulasPraticas + 1;
    }

    void cancelarAulaTeorica() {
        if (aulasTeoricas > 0) {
            aulasTeoricas = aulasTeoricas - 1;
        }
    }

    void cancelarAulaPratica() {
        if (aulasPraticas > 0) {
            aulasPraticas = aulasPraticas - 1;
        }
    }

    void realizarExame() {
        if (aulasTeoricas >= 5 && aulasPraticas >= 5) {

            int resultado = (int)(Math.random() * 2);

            if (resultado == 1) {
                aprovado = true;
                System.out.println(nome + " foi aprovado no exame.");
            } else {
                aprovado = false;
                System.out.println(nome + " foi reprovado no exame.");
            }

        } else {
            aprovado = false;
            System.out.println(nome + " nao pode fazer o exame ainda.");
            System.out.println("Precisa ter pelo menos 5 aulas teoricas e 5 aulas praticas.");
        }
    }
}