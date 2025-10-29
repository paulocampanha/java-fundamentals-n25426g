programa {
  funcao inicio() {
    real precoProduto, desconto
    cadeia nomeProduto

    escreva("******************************\n")
    escreva("*        Lojas Malibu        *\n")
    escreva("******************************\n")
    escreva("Digite o nome do Produto: ")
    leia(nomeProduto)
    escreva("Digite o preço do produto: ")
    leia(precoProduto)
    se (precoProduto >= 500){
      desconto = precoProduto * 0.1 
    } senao {
      desconto = precoProduto * 0.05
    }
    precoProduto = precoProduto - desconto
    escreva("O produto teve um desconto de R$ ", desconto)
    escreva("\nVocê pagará apenas R$ ", precoProduto)
    escreva("\n******************************")
  }
}
