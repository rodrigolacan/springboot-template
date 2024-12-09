package rr.sebrae.api.app.database.apisebrae.table.personalaccesstokens.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rr.sebrae.api.app.database.apisebrae.table.personalaccesstokens.entity.PersonalAccessToken;

@Repository
public interface PersonalAccessTokenRepository extends JpaRepository<PersonalAccessToken, Integer> {
}
