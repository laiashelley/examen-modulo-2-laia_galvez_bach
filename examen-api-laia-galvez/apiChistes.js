document.getElementById("botonChiste").addEventListener("click", () => {
  const chisteApi = `https://v2.jokeapi.dev/joke/Any?lang=es&type=single`;

  fetch(chisteApi)
    .then((response) => response.json())
      .then((data) => {
        
        console.log(data);
        
        let chisteNormal = data.joke.toUpperCase();
        document.getElementById("chisteNormal").innerHTML = chisteNormal;

    })
    .catch((err) => console.log(err));
});


document.getElementById("botonChisteNorris").addEventListener("click", () => {
  const norrisApi = `https://api.chucknorris.io/jokes/random`;

  fetch(norrisApi)
    .then((response) => response.json())
    .then((data) => {

        console.log(data);

         let chisteNorris = data.value.toUpperCase();
         document.getElementById("chisteNorris").innerHTML = chisteNorris;

    })
    .catch((err) => console.log(err));
});