<!DOCTYPE html>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="file:///C:/Users/PC/Documents/GitHub/sitiowebovi/index.html#">
	<title>Contador de visitas</title>
</head>
<body>
<?php
$cuenta="visitas.txt"	
function contador($cuenta){
	$fp=fopen ($cuenta, r);
	$num=fgets($fp, 5);
	$num+=1;
	print "número de visitas: ";
	echo $num;
	exec("rm-rf $cuenta");
	exce("echo $num >$cuenta")
}

if (!file_exists(cuenta)){
	exce("echo 1>$cuenta");
}
contador ($cuenta);


</body>
</html>;
