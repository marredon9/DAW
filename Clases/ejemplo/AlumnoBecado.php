<?php
    class AlumnoBecado extends Alumno{
        private float $beca;

        public function __construct(string $nombre, float $nota, float $beca){
            parent::__construct($nombre, $nota);
            $this -> beca = max(0.0, $beca);
        }

        public function getBeca(){
            return $this -> beca;
        }

        public function info(){
            echo "Nombre " . $this -> getNombre() . " Nota " . $this -> getNota() . " Beca " . $this -> getBeca() . "€";
        }
    }
?>