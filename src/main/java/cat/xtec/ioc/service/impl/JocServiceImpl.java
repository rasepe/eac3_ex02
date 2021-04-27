package cat.xtec.ioc.service.impl;

import cat.xtec.ioc.domain.Joc;
import cat.xtec.ioc.domain.repository.JocRepository;
import cat.xtec.ioc.service.JocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JocServiceImpl implements JocService {

    @Autowired
    private JocRepository jocRepository;



    public Joc getJocByName (String nomJoc) {
        return jocRepository.getJocByName(nomJoc);
    }

}