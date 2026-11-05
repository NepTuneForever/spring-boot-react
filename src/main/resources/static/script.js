const button = document.getElementById('button');

filmes = [];
attempt = 0;

const Getter = async () =>
{
    const res = await fetch("http://localhost:8080/src/filmes");
    return await res.json();
}

button.onclick = async () =>
{
    try {
        filmes = await Getter();

        if (filmes.length > 0 && attempt == 0)
        {
            console.log(filmes);
            for (let i = 0; i <= filmes.length; i++)
            {
                const artigo = document.createElement("article");
                artigo.setAttribute("id", "film-section");

                artigo.innerHTML = `
                <h2>${filmes[i].titulo}</h2>
                <p>Descrição do Filme: ${filmes[i].descricao}</p>
                <p>Classificação: ${filmes[i].classificacao}</p>
                `

                const pai = document.querySelector("section");
                pai.appendChild(artigo);
                attempt = 1;
            }
            console.log(filmes);
        }

    } catch (error)
    {
        console.error("Erro na API");
    }
}
