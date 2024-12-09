package rr.sebrae.api.app.database.automacaohomolog.table.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import rr.sebrae.api.app.database.automacaohomolog.table.users.entity.User;
import rr.sebrae.api.app.database.automacaohomolog.table.users.repository.UserRepository;

import java.util.List;

@Service
@Profile("dev")
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

}
