<?php
class Alumno1
{
    private string $nombre;
    private float $nota;

    function __construct(string $nombre, float $nota)
    {
        $this->nombre = $nota;
        $this->nota = min(10, max(0, $nota));
    }

    public function getNombre()
    {
        return $this->nombre;
    }

    public function getNota()
    {
        return $this->nota;
    }

    public function aprobado()
    {
        if ($this->nota >= 5) {
            return true;
        }
    }

    public function inform(){
        echo $this -> getNombre() . " " . $this -> getNota();
    }
}
?>