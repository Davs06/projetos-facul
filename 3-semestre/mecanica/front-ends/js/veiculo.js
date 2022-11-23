// let marca  = document.querySelector('#marca')
//         let modelo =document.querySelector('#modelo')
//         let placa = document.querySelector('#placa')
//         let cor = document.querySelector('#cor')
//         let ano = document.querySelector('#ano')

    
    
        let btn = document.querySelector('#acao').addEventListener('click', (e) => {
    
    
        //     let listDataVeiculo = JSON.parse(localStorage.getItem('listDataVeiculo') || '[]')
    
        //     listDataVeiculo.push({
    
        //     marca: marca.value,
        //     modelo: modelo.value,
        //     placa: placa.value,
        //     cor: cor.value,
        //     ano: ano.value
        // })
    
        // localStorage.setItem('listDataVeiculo', JSON.stringify(listDataVeiculo))
    
    
        window.location.href = "orcamento.php"
    
        e.preventDefault();
        
    })