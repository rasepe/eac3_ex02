package cat.xtec.ioc.domain.repository;

import cat.xtec.ioc.domain.Joc;

public interface JocRepository {
    Joc getJocByName (String nomJoc);
}
