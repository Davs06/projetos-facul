<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" href="./assets/icon.jpeg">

    <link rel="stylesheet" href="./css/relato.css">

    <title>...</title>
</head>

<body>

    <h1>Davs's mecanica</h1>

    <div>

        <h2> Veiculos cadastrados </h2>

        <?php

        include_once('config.php');
        $sql = "select * from veiculo";
        $result = $conexao->query($sql);

        if ($result->num_rows > 0) {
            while ($row = $result->fetch_assoc()) {
                echo "Marca: " . $row["marca"]   . " | Modelo: " . $row["modelo"] . " | Ano: " .  $row["ano"] .  " | Placa: " . $row["placa"] . " | CPF Dono do veiculo: " . $row["cd_cliente"] . "| Problema do veiculo: " . $row["descricao"] . "<br>" . "<br>";
            }
        } else {
            echo "0 results";
        }

        ?>

        <h2>Clientes cadastrados</h2>

        <?php

        include_once('config.php');
        $sql = "select * from cliente";
        $result = $conexao->query($sql);

        if ($result->num_rows > 0) {
            while ($row = $result->fetch_assoc()) {
                echo "Nome: " . $row["nome"]   . " | CPF: " . $row["cpf"] . " | Telefone: " .  $row["telefone"] .  " | Telefone 2: " . $row["telefone2"]  .   "<br>" . "<br>";
            }
        } else {
            echo "0 results";
        }

        ?>


    </div>

    <script src="./js/relato.js"></script>

</body>

</html>