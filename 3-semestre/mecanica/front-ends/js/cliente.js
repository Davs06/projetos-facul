let nome = document.querySelector('#nome')
let telefone =document.querySelector('#telefone')
let cpf = document.querySelector('#cpf')


let btn = document.querySelector('#acao').addEventListener('click', (e) => {


    let listDataCliente = JSON.parse(localStorage.getItem('listDataCliente') || '[]')

    listDataCliente.push({

        nome: nome.value,
        telefone: telefone.value,
        cpf: cpf.value
    })

    localStorage.setItem('listDataCliente', JSON.stringify(listDataCliente))


    window.location.href = '///home/davs-kenoby/studspace/projetos-facul/3-semestre/mecanica/front-end/veiculo.html'
})