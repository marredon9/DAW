<?php
class Alumno{
    private string $nombre;
    private float $nota;


    public function __construct(string $nombre, float $nota){
        $this -> nombre = $nombre;
        $this -> nota = $nota;
    }

    public function aprobado($nota){
        if ($nota >= 5){
            return true;
        }
    }

    public function getNombre(){
        return $this -> nombre;
    }

    public function getNota(){
        return $this -> nota;
    }
}


?>