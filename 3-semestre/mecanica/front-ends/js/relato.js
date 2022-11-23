let relato = document.querySelector('#relato')

let btn = document.querySelector('#acao').addEventListener('click', (e) => {


    let listDataRelato = JSON.parse(localStorage.getItem('listDataRelato') || '[]')

    listDataRelato.push({

        relato: relato.value
    
    })

    localStorage.setItem('listDataRelato', JSON.stringify(listDataRelato))


<<<<<<< HEAD
    window.location.href = "file:///home/davs-kenoby/studspace/projetos-facul/3-semestre/mecanica/front-ends/orcamento.html"
=======
    window.location.href = "file:///Users/davs/studspace/projetos-facul/3-semestre/mecanica/front-ends/orcamento.html"
>>>>>>> origin

    e.preventDefault();
    
})
