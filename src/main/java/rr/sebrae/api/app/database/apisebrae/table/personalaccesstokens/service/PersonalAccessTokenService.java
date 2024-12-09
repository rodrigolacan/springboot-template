package rr.sebrae.api.app.database.apisebrae.table.personalaccesstokens.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rr.sebrae.api.app.database.apisebrae.table.personalaccesstokens.entity.PersonalAccessToken;
import rr.sebrae.api.app.database.apisebrae.table.personalaccesstokens.repository.PersonalAccessTokenRepository;

import java.util.List;

@Service
public class PersonalAccessTokenService {
    @Autowired
    private PersonalAccessTokenRepository personalAccessTokenRepository;

    public List<PersonalAccessToken> findAll(){
        return personalAccessTokenRepository.findAll();
    }
}
