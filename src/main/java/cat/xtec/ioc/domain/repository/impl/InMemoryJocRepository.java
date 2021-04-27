package cat.xtec.ioc.domain.repository.impl;

import cat.xtec.ioc.domain.Joc;
import cat.xtec.ioc.domain.repository.JocRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryJocRepository implements JocRepository {

    private List<Joc> listOfJocs = new ArrayList<Joc>();

    public InMemoryJocRepository() {
        //Mario, Sonic, Crash
        Joc mario = new Joc("Mario", 1000);

        Joc sonic = new Joc("Sonic", 2000);

        Joc crash = new Joc("Crash", 3000);

        listOfJocs.add(mario);
        listOfJocs.add(sonic);
        listOfJocs.add(crash);
    }

    public Joc getJocByName(String nomJoc) {
        Joc jocByName = null;
        for (Joc joc : listOfJocs) {
            if (joc != null && joc.getName() != null
                    && joc.getName().equals(nomJoc)) {
                jocByName = joc;
                break;
            }
        }
        if (jocByName == null) {
            throw new IllegalArgumentException(
                    "No s'han trobat jocs amb el nom: " + nomJoc);
        }
        return jocByName;
    }

}
