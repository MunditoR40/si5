package uns.angel.si5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uns.angel.si5.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
