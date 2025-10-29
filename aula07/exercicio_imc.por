programa {
  funcao inicio() {
    real peso, altura, imc
    escreva("Digite sure peso em quilos: ")
    leia(peso)
    escreva("Digite sua altura em metros: ")
    leia(altura)
    imc = peso / (altura * altura)
    se (imc < 18.5) {
      escreva("Abaixo do peso")
    } senao se (imc >= 18.5 e imc <= 24.9) {
      escreva("Peso Normal")
    } senao se (imc >= 25 e imc <= 29.9) {
      escreva("Sobrepeso")
    } senao se (imc >= 30 e imc <= 34.9) {
      escreva("Obesidade grau I")
    } senao se (imc >= 35 e imc <= 39.9) {
      escreva("Obesidade grau II")
    } senao {
      escreva("Obsedidade grau III")
    }
  }
}
