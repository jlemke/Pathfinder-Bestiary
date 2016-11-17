package edu.matc.persistence;

import edu.matc.entity.*;
import org.hibernate.Session;

/**
 * Created by Joe on 11/16/2016.
 */
public class BeastDao {

    private Session session;

    private void openSession() {
        session = SessionFactoryProvider.getSessionFactory().openSession();
    }

    public Beast getBeast(String name) {
        Beast beast = new Beast();
        openSession();

        beast = (Beast) session.get(Beast.class, name);
        return beast;
    }

}
