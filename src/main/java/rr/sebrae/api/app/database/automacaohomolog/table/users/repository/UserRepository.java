package rr.sebrae.api.app.database.automacaohomolog.table.users.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rr.sebrae.api.app.database.automacaohomolog.table.users.entity.User;

@Repository
@Profile("dev")
public interface UserRepository extends JpaRepository<User, Integer> {
}
