programa {
  funcao inicio() {
    cadeia nome
    real nota

    escreva("Digite o nome do aluno: ")
    leia(nome)
    escreva("Digite a nota final do aluno: ")
    leia(nota)

    se (nota >= 50) {
        escreva(nome, ", você foi APROVADO no curso de Java Fundamentals\n")
    }
    senao {
        escreva(nome, ", você foi REPROVADO no curso de Java Fundamentals\n")
    }

    escreva("*****************************************\n")
    escreva("* Senai Celso Charuri - Guarulhos Dutra *\n")
    escreva("*****************************************\n")
  }
}