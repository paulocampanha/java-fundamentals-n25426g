programa {
  funcao inicio() {
    cadeia cor
    escreva("Digite a cor do semáforo (vermelho, amarela ou verde)")
    leia(cor)
    se (cor == "vermelho"){
      escreva("Pare!")
    } senao se (cor == "amarelo") {
      escreva("Atenção!")
    } senao se (cor == "verde") {
      escreva("Siga!")
    } senao {
      escreva("Cor inválida")
    }
  }
}
