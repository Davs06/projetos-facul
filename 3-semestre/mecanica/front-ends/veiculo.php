<?php
    
    if (isset($_POST['submit'])) {

        // print_r($_POST ['marca']);
        // print_r('<br>');
        // print_r($_POST ['modelo']);
        // print_r('<br>');
        // print_r($_POST ['cor']);
        // print_r('<br>');
        // print_r($_POST ['placa']);
        // print_r('<br>');
        // print_r($_POST ['ano']);
        // print_r('<br>');
        // print_r($_POST ['cpf']);


        include_once('config.php');
        
        $marca = $_POST ['marca'];
        $modelo = $_POST ['modelo'];
        $cor = $_POST ['cor'];
        $placa = $_POST ['placa'];
        $ano = $_POST ['ano'];
        $fk_cli = $_POST ['cpf'];
        $relato = $_POST ['message'];

        $result = mysqli_query($conexao, "INSERT INTO veiculo (placa,cor,modelo,ano,descricao,cd_cliente,marca) 
            VALUES ('$placa','$cor','$modelo','$ano','$relato','$fk_cli','$marca')");


    }

?>


<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewportp" content="width=device-width, initial-scale=1.0">
    <link rel="icon" href="./assets/icon.jpeg">

    <link rel="stylesheet" href="./css/veiculo.css">

    <title>Veiculo</title>
</head>
<body>

    
    <nav>
        
        <h1>Davs's mecanica</h1>
        
    </nav>
    
    
    <form action="veiculo.php" method="POST">
        
        <h2>Informações do veiculo</h2>

        <input type="text" name= "marca" id="marca" placeholder="Marca" required>
        <input type="text" name= "modelo" id="modelo" placeholder="Modelo" required>
        <input type="text" name= "placa" id="placa" placeholder="Placa do veiculo" required>
        <input type="text" name= "cor" id="cor" placeholder="Cor" required >
        <input type="number" name= "ano" id="ano" placeholder="Ano" required>
        <label for="message"> Problema do veiculo </label>
        <textarea name="message" id="relato" placeholder="Digite aqui..." required></textarea>

        <input type="text" name="cpf" id="cpf" placeholder="CPF" pattern="^\d{3}.\d{3}.\d{3}-\d{2}$" required>
        <label for="cpf">000.000.000-00</label>
        
        <input type="submit" name="submit" id="acao" value="Enviar" >


    </form>

    <script  src="./js/veiculo.js"></script>
    
</body>
</html>