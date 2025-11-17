programa {
  funcao inicio() {
    inteiro numero, contador, total, limite
    escreva("Digite o número para a tabuada: ")
    leia(numero)
    contador = 1
    limite = 10
    escreva("******************************")
    escreva("\n      Tabuada do ", numero)
    escreva("\n******************************\n")
    enquanto (contador <= limite){
      total = numero * contador
      escreva(numero, " X ", contador, " = ", total, "\n")
      contador = contador + 1
    }
    escreva("******************************")
  }
}
