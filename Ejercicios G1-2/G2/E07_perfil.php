<?php
$nombre = "Marina"; $grupo = "A"; $curso= "DAW"; $email;
if(empty($email)){
    echo $nombre . "(" . $grupo . ")," . $curso . "- Email |" . "sin email<br>";   
}else{
    echo $nombre . "(" . $grupo . ")," . $curso . "- Email |" . $email;
}
?>