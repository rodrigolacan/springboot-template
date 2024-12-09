package rr.sebrae.api.app.database.intranet2013.table.gusuarios.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rr.sebrae.api.app.database.intranet2013.table.gusuarios.Entity.GUsuarios;

@Repository
public interface GUsuariosRepository extends JpaRepository<GUsuarios, Long> {
}
