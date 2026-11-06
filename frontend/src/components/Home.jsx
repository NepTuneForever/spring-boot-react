import {useState} from "react";
import '../App.css'

function Home() {
    const [filmes, setFilmes] = useState([])

    const Getter = async () => {
        const res = await fetch("http://localhost:8080/src/filmes");
        const json = await res.json();

        setFilmes(json);
        console.log(json)
        }

        return (
        <html lang="pt-BR">
        <head>
            <meta charSet="UTF-8" />
            <meta name="viewport" content="width=device-width, initial-scale=1.0" />
            <title>Catálogo de Filmes</title>
        </head>
        <body>
        <header id="header">
            <h1>Catálogo de Filmes</h1>
            <br/>
            <p>Filmes disponíveis</p>
        </header>
        <main id="main">
            <section id="section">
                <h2 id="main-header">Lista de filmes</h2>
                <button id="button" onClick={Getter}>Load</button>
            </section>
            <section id="filmes">
                {filmes.map((filme) => (
                    <article key={filme.id}>
                        <h1>{filme.titulo}</h1>
                        <p>Descrição: {filme.descricao}</p>
                        <p>Classificação: {filme.classificacao}</p>
                    </article>
                ))}
            </section>
        </main>
        <footer id="footer">
            <h3>Spring Boot</h3>
        </footer>
        </body>
        </html>
    );
}

export default Home