import { useState } from "react";


interface FormData {
    nome : string;
    email : string;
}

const Exemplo02 : React.FC = () => {

    const initialFormState : FormData,{
        nome :'' ,
        email :'' ,
    };
    
    const  [formData , setFormDate] = useState<FormData>(initialFormState);


    return(
        <>
            <h1>Exemplo 2</h1>
            <form>
                <label>
                    <b>Nome: </b>
                    <input type="text" name="nome" value={formData.nome} />
                </label>
                <br/>
                <label>
                    <b>Email: </b>
                    <input type="email" name="email" value={formData.nome}/>
                </label>
                <br/>
                <input type="submit" value="Enviar" value={formData.nome}/>
            </form>
        </>
    )
}
export default Exemplo02
