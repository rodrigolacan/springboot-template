package rr.sebrae.api.app.database.intranet2013.table.gusuarios.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import rr.sebrae.api.app.database.intranet2013.table.gusuarios.Entity.GUsuarios;
import rr.sebrae.api.app.database.intranet2013.table.gusuarios.Repository.GUsuariosRepository;


import java.util.List;

@Service
public class GUsuariosService {
    @Autowired
    GUsuariosRepository GUsuariosRepository;

    public List<GUsuarios> findAll(){
        return GUsuariosRepository.findAll();
    }
}
