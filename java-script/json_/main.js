fetch("https://jsonplaceholder.typicode.com/users")
  .then((response) => response.json())
  .then((data) => {
    preencherLista(data);
  });

function preencherLista(data) {
  const listC = document.getElementById("lista-container");
  const ul = document.createElement("ul");

  data.forEach((item) => {
    const li = document.createElement("li");
    li.textContent = item.email;
    ul.appendChild(li);
  });

  listC.appendChild(ul);
}
