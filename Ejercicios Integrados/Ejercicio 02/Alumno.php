<?php
class Alumno
{
	public $id;
	public $nombre;
	public $email;
	public $nota;

	public function __construct(int $id, string $nombre, string $email, string $nota){
		$this->id = $id ? (int) $id : null;

		if (empty($nombre)) {
			throw new Exception("El nombre no puede estar vacío");
		}
		if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
			throw new Exception("El email no es válido");
		}
		if (!is_numeric($nota) || $nota < 0 || $nota > 10) {
			throw new Exception("La nota debe estar entre 0 y 10");
		}

		$this->nombre = $nombre;
		$this->email = $email;
		$this->nota = (float) $nota;
	}

	  // Devuelve todos los alumnos
    public static function all($cn) {
        $sql = "SELECT * FROM alumnos";
        $res = $cn->query($sql);
        $alumnos = [];

        while ($fila = $res->fetch_assoc()) {
            $alumnos[] = new Alumno($fila['id'], $fila['nombre'], $fila['email'], $fila['nota']);
        }
        return $alumnos;
    }

    // Busca un alumno por id
    public static function find($cn, $id) {
        $sql = "SELECT * FROM alumnos WHERE id = ?";
        $stmt = $cn->prepare($sql);
        $stmt->bind_param("i", $id);
        $stmt->execute();
        $res = $stmt->get_result();

        if ($fila = $res->fetch_assoc()) {
            return new Alumno($fila['id'], $fila['nombre'], $fila['email'], $fila['nota']);
        }
        return null;
    }

	 public function insert($cn) {
        $sql = "INSERT INTO alumnos (nombre, email, nota) VALUES (?, ?, ?)";
        $stmt = $cn->prepare($sql);
        $stmt->bind_param("ssd", $this->nombre, $this->email, $this->nota);
        return $stmt->execute();
    }

    public function update($cn) {
        $sql = "UPDATE alumnos SET nombre=?, email=?, nota=? WHERE id=?";
        $stmt = $cn->prepare($sql);
        $stmt->bind_param("ssdi", $this->nombre, $this->email, $this->nota, $this->id);
        return $stmt->execute();
    }

    public function delete($cn) {
        $sql = "DELETE FROM alumnos WHERE id=?";
        $stmt = $cn->prepare($sql);
        $stmt->bind_param("i", $this->id);
        return $stmt->execute();
    }
}
?>