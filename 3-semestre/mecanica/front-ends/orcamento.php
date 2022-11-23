<?php

if (isset($_POST['submit'])) {

    print_r($_POST['valor1']);
    print_r('<br>');
    print_r($_POST['valor2']);
    print_r('<br>');
    print_r($_POST['data-servico']);
    print_r('<br>');
    print_r($_POST['situacao']);
    print_r('<br>');
    print_r($valorFinal = $valor1 + $valor2);
    print_r('<br>');
    print_r($_POST['placa']);



    // include_once('config.php');

    // $valor1 = $_POST['valor1'];
    // $valor2 = $_POST['valor2'];
    // $data_servico = $_POST['data-servico'];
    // $situacao = $_POST['situacao'];
    // $valorFinal = $valor1 + $valor2;
    // $fkPlaca = $_POST['placa'];


    // $result = mysqli_query($conexao, "INSERT INTO cliente (valor,data_servico,situacao,cd_placa) 
    //         VALUES (' $valorFinal','$data_servico','$situacao','$fkPlaca')");
}


?>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" href="/assets/icon.jpeg">
    <link rel="stylesheet" href="./css/orcamento.css">

    <title>Orçamento</title>
</head>

<body>

    <nav>
        <h1>Davs's mecanica</h1>
    </nav>



    <form action="orcamento.php" method="POST">
        <h2>Orçamento</h2>

        <label for="valor1">Valor de peças</label>
        <input type="number" name="valor1" id="peca">
        <label for="valor2">Valor da mão de obra</label>
        <input type="number" name="valor2" id="maoDeObra">
        <label for="data-servico">Data do serviço</label>
        <input type="date" name="data-servico" id="data-servico">
        <input type="text" name="placa" id="placa" placeholder="Placa do veiculo" required>
        <label for="situacao">Situação</label>
        <div>
            <input type="radio" name="situacao" id="fazendo" value="fazendo">
            <label for="fazendo">Em andamento</label>
            <input type="radio" name="situacao" id="finalizado" value="finalizado">
            <label for="fazendo">Finalizado</label>
        </div>
        <input type="submit" name="submit" id="acao" value="Enviar">

    </form>


</body>

</html>