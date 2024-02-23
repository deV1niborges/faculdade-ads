fetch("https://fakestoreapi.com/products?limit=10")
  .then((response) => response.json())
  .then((data) => {
    completeCart(data);
  })
  .catch((error) => {
    console.log("ocorreu um erro: " + error);
  });

function completeCart(produtos) {
  const cartContainer = document.getElementById("cart-container");
  produtos.forEach((produto) => {
    const divProduto = document.createElement("div");
    divProduto.classList.add("produto");

    const imagem = document.createElement("img");
    imagem.src = produto.image;
    imagem.width = 200;
    imagem.height = 300;

    divProduto.appendChild(imagem);

    const nome = document.createElement("p");
    nome.textContent = produto.title;

    divProduto.appendChild(nome);

    const preco = document.createElement("p");
    preco.textContent = `R$ ${produto.price}`;

    divProduto.appendChild(preco);

    cartContainer.appendChild(divProduto);
  });
}
