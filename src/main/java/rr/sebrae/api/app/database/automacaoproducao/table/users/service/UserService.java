package rr.sebrae.api.app.database.automacaoproducao.table.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import rr.sebrae.api.app.database.automacaoproducao.table.users.entity.User;
import rr.sebrae.api.app.database.automacaoproducao.table.users.repository.UserRepository;

import java.util.List;

@Service
@Profile("prod")
public class UserService {
    @Autowired
    UserRepository usersRepository;

    public List<User> findAll(){
        return usersRepository.findAll();
    }
}
