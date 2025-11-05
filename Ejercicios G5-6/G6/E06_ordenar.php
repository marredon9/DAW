<?php
$arr = [3, 1, 4];
$asc = $arr;
sort($asc);
$desc = $arr;
rsort($desc);

echo "Ascendente: [" . implode(',', $asc) . "]<br>";
echo "Descendente: [" . implode(',', $desc) . "]";
?>