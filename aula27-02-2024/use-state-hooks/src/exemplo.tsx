import {useState} from "react";

function Exemplo01(){

    const [nome,setNome] = useState<string>('');
    
    return(
        <>
            <h1> Exemplo 1</h1>
            <p>
                <b>Aluno: </b> {nome}
            </p>
            <button onClick={() => setNome("João") }>Clique Aqui!</button>
        </>
    )
}
export default Exemplo01;