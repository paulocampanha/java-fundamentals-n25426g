programa {
  funcao inicio() {
    cadeia nome
    inteiro idade

    escreva("Digite seu nome: ")
    leia(nome)

    escreva("Digite sua idade: ")
    leia(idade)

    se (idade >= 0 e idade <= 12) {
      escreva(nome, ", você é uma criança.")
    } senao se (idade > 12 e idade <= 17) {
      escreva(nome, ", você é um adolescente.")
    } senao se(idade > 17 e idade <= 64) {
      escreva(nome, ", você é um adulto")
    } senao se (idade > 64 e idade <= 120) {
      escreva(nome, ", você é um idoso(a).")
    } senao {
      escreva("Idade informada inválida.")
    }
    escreva("\nSistema de Faixa Etária")
  }
}
