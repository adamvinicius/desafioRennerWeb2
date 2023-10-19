#language:pt
Funcionalidade: Adicionar produtos no carrinho

  @adicionaProduto
  Cenario: adiciono produtos
    Dado que esteja logado na pagina My Store com os dados
      | email    | thiago@email.com.br |
      | password | teste123            |
    E que esteja na pagina de produtos de My Store
    Quando seleciono o produto alterando as opcoes do produto
      | nome                                      | quantidade |
      | Stylish Dress                             | 3          |
      | Beautiful Peacock Blue Cotton Linen Saree | 2          |
      | Men Tshirt                                | 1          |
    Entao valido que possuo "6" itens no carrinho

    @realizarCadastro
  Cenario: realizar novo cadastro
    Dado que esteja na pagina de login e informo os seguintes dados para iniciar o cadastro
      | nome  | Thiago Drumond       |
      | email | thiago2@email.com.br |
    Quando crio uma conta com os seguintes campos
      | password     | teste123      |
      | firstName    | Thiago        |
      | lastName     | Drumond       |
      | address      | Rua Jequitiba |
      | state        | MG            |
      | city         | Contagem      |
      | zipCode      | 32140150      |
      | mobileNumber | 3193432242    |
    Entao valido que a mensagem "ACCOUNT CREATED!" foi exibida