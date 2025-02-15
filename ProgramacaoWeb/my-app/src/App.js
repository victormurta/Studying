import CardProduto from './Components/CardProduto';
import styled from 'styled-components';

const MainContainer = styled.div`
  display: grid;
  grid-template-colums:repeat(2,1fr)
`
export const MaintTitle = styled.h1`
    color: red;
`

function App() {
  return (
   <div className='MainContainer'>
    <CardProduto 
      proddutoCadastrado={"Alexa"}
      preco={"2000"}
      descricao={"Uma Alexa muito legal"}
    />
    <CardProduto 
      proddutoCadastrado={"Notebook"}
      preco={"20000"}
      descricao={"Alienware brabão"}
    />
   </div>
  );
}

export default App;
