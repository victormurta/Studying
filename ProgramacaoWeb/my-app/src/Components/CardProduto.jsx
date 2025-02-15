import {MaintTitle} from "../App"

const CardProduto = ({proddutoCadastrado, descricao, preco}) =>{
    return (
        <div>
           <div>
           <MaintTitle>{proddutoCadastrado}</MaintTitle>
           <h2>{descricao}</h2>
           <p>{preco}</p>
           <button>Comprar</button>
           </div>
        </div>
       );
}

export default CardProduto