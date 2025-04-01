it('sem testes, ainda', () => {})

const getSomething = (callback) => {
    //isso se desenrola em 1 segundo
    setTimeout(() => {
        callback(12);
    }, 1000)

}

const system = () => {
    console.log('init');
    getSomething(some => console.log(`Something is ${some}`));
    console.log("end");
}