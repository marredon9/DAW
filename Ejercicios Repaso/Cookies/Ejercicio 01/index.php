<?php
	$cookie_name = "usuario";
	$cookie_value = "Marina";

	setcookie($cookie_name, $cookie_value, time() + 86400);

?>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Bienvenido</title>
</head>
<body>
	<?php
	if(!isset($_COOKIE[$cookie_name])){
		echo "Bienvenido, primera visita. Recarga la página.";
	}else{
		echo "Hola de nuevo " . $_COOKIE[$cookie_name];
	}
	?>
</body>
</html>