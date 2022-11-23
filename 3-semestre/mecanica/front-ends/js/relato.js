let relato = document.querySelector('#relato')

let btn = document.querySelector('#acao').addEventListener('click', (e) => {


    let listDataRelato = JSON.parse(localStorage.getItem('listDataRelato') || '[]')

    listDataRelato.push({

        relato: relato.value
    
    })

    localStorage.setItem('listDataRelato', JSON.stringify(listDataRelato))


    window.location.href = "file:///home/davs-kenoby/studspace/projetos-facul/3-semestre/mecanica/front-ends/orcamento.html"

    e.preventDefault();
    
})
