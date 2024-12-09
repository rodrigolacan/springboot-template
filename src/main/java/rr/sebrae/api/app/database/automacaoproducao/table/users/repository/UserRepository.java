package rr.sebrae.api.app.database.automacaoproducao.table.users.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rr.sebrae.api.app.database.automacaoproducao.table.users.entity.User;

@Repository
@Profile("prod")
public interface UserRepository extends JpaRepository<User, Integer> {
}
