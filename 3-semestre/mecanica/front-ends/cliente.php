<?php

if (isset($_POST['submit'])) {

    // print_r($_POST['nome']);
    // print_r($_POST['telefone1']);
    // print_r($_POST['telefone2']);
    // print_r($_POST['cpf']);

    include_once('config.php');

    $nome = $_POST['nome'];
    $telefone1 = $_POST['telefone1'];
    $telefone2 = $_POST['telefone2'];
    $cpf = $_POST['cpf'];

    $result = mysqli_query($conexao, "INSERT INTO cliente (cpf,nome,telefone,telefone2) 
            VALUES ('$cpf','$nome' , '$telefone1' , '$telefone2' )");
}


?>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" href="./assets/icon.jpeg">

    <link rel="stylesheet" href="./css/cliente.css">


    <title>Cliente</title>

</head>

<body>

    <nav>

        <h1>Davs's mecanica</h1>

    </nav>



    <form id="form" action="cliente.php" method="POST">

        <h2>Cadastro de cliente</h2>

        <input type="text" name="nome" id="nome" placeholder="Nome Completo" required>
        <input type="tel" name="telefone1" id="telefone" placeholder="Telefone" pattern="^\(\\d{2})\d{4,5}-\d{4}$" required>
        <input type="tel" name="telefone2" id="telefone" placeholder="Telefone 2 opcional " pattern="^\(\\d{2})\d{4,5}-\d{4}$">
        <label for="telefone"> (00)00000-0000</label>

        <input type="text" name="cpf" id="cpf" placeholder="CPF" pattern="^\d{3}.\d{3}.\d{3}-\d{2}$" required>
        <label for="cpf">000.000.000-00</label>

        <input type="submit" name="submit" id="acao" value="Enviar">

    </form>



    <script src="./js/cliente.js"></script>
</body>

</html>