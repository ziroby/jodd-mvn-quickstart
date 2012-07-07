package com.ziroby.jodd.database;

import com.ziroby.jodd.engine.domain.Greeting;
import jodd.db.DbQuery;
import jodd.db.oom.DbOomQuery;
import jodd.db.oom.sqlgen.DbEntitySql;
import jodd.db.oom.sqlgen.DbSqlBuilder;
import jodd.petite.meta.PetiteBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@PetiteBean("greetingDao")
public class DbOomGreetingDao implements GreetingDao {
    Logger log = LoggerFactory.getLogger(DbOomGreetingDao.class);

    @Override
    public Greeting newGreeting() {
        Greeting greeting = new Greeting();

        greeting.setName(" ");

        DbQuery dbQuery = DbOomQuery.query(DbEntitySql.insert(greeting));
        dbQuery.setGeneratedKey();
        dbQuery.executeUpdate();

        long key = dbQuery.getGeneratedKey();
        greeting.setId(key);

        return greeting;
    }

    @Override
    public void save(Greeting greeting) {
        DbOomQuery.query(DbEntitySql.updateAll(greeting)).executeUpdateAndClose();
    }

    @Override
    public Collection<Greeting> findAllGreetings() {
        log.debug("Finding all Greetings");
        DbSqlBuilder sqlBuilder = DbEntitySql.from(Greeting.class);
        DbOomQuery query = DbOomQuery.query(sqlBuilder);
        List<Object> result = query.listAndClose(Greeting.class);
        if (result != null)
            log.debug("Type of result = " + result.getClass() + " value = " + result);

        List<Greeting> greetings = new ArrayList<Greeting>();
        for (Object greeting : result ) {
            greetings.add((Greeting) greeting);
        }

        return greetings;
    }
}
