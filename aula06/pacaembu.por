programa {
  funcao inicio() {
    cadeia nome
    inteiro idade
    escreva("Digite seu nome: ")
    leia(nome)
    escreva("Digite sua idade: ")
    leia(idade)
    se (idade >= 18) {
      escreva(nome, ", seja bem vindo ao ao Pacaembú")
      escreva("\nAproveite o jogo.")
    } senao {
      escreva(nome, ", você precisa do seu responsável para entrar no Pacaembú.")
    }
    escreva("\nSistema de ingressos do Pacaembú.")
  }
}
