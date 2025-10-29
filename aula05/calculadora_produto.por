programa {
  funcao inicio() {
    cadeia nomeProduto
    real precoProduto
    inteiro quantidade
    escreva("Digite o nome do produto: ")
    leia(nomeProduto)
    escreva("Digite o preço do produto: ")
    leia(precoProduto)
    escreva("Digite a quantidade que deseja comprar: ")
    leia(quantidade)
    real precoTotal
    precoTotal = precoProduto * quantidade
    escreva("O preço total do produto ", nomeProduto, " será R$ ", precoTotal) 
  }
}
