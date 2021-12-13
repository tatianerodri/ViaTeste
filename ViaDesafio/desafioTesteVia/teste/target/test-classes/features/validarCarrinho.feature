#Author: tatiane.gues.76@gmail.com


Feature: Produto no carrinho
 Eu como usuario quero acessar o site e adicionar produtos no carrinho 
 
@adicionarCarrinho 
Scenario: Deve validar produto no carrinho com sucesso
Given que eu esteja no site "http://lojaebac.ebaconline.art.br/"
And escolher produto
And adicionar no carrinho
When adicionar mais  produto no carrinho
Then valido produtos no carrinho
