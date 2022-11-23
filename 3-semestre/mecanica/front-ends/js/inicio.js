let btn1 = document.querySelector('#acao1').addEventListener('click', (e) => {

    window.location.href = " cliente.php"
})

let btn2 = document.querySelector('#acao2').addEventListener('click', (e) => {

    window.location.href = "relatorio.php"

    e.preventDefault();
    

})