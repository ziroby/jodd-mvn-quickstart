package com.ziroby.jodd.ui;

import jodd.db.DbDefault;
import jodd.db.ThreadDbSessionProvider;
import jodd.db.connection.ConnectionProvider;
import jodd.db.oom.DbOomManager;
import jodd.db.oom.config.AutomagicDbOomConfigurator;
import jodd.db.pool.CoreConnectionPool;
import jodd.log.Log;
import jodd.madvoc.WebApplication;
import jodd.madvoc.petite.PetiteWebApplication;
import jodd.props.Props;
import jodd.props.PropsUtil;

/**
 * Created with IntelliJ IDEA.
 * User: ziroby
 * Date: 7/6/12
 * Time: 9:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class GreetWebApplication extends PetiteWebApplication {
    private Log log = Log.getLogger(WebApplication.class);

    @Override
    public void registerMadvocComponents() {
        super.registerMadvocComponents();

        log.debug("Initializing database");

        loadAppPropertyFile();

        initDb();


    }

    private void loadAppPropertyFile() {
        Props appProps = new Props();
        appProps.loadSystemProperties("sys");
        appProps.loadEnvironment("env");
        PropsUtil.loadFromClasspath(appProps, "/app*.prop*");
        madpc.defineParameters(appProps);
    }

    private void initDb() {
        // connection pool
        madpc.registerBean("dbpool", CoreConnectionPool.class);
        ConnectionProvider cp = (ConnectionProvider) madpc.getBean("dbpool");
        cp.init();

        // global settings
        DbDefault.debug = true;
        DbDefault.connectionProvider = cp;
        DbDefault.sessionProvider = new ThreadDbSessionProvider(true);


        DbDefault.debug = true;
        DbDefault.sessionProvider = new ThreadDbSessionProvider(true);

        DbOomManager dbOomManager = DbOomManager.getInstance();

        // automatic configuration
        AutomagicDbOomConfigurator dbcfg = new AutomagicDbOomConfigurator();
        dbcfg.setIncludedEntries("com.ziroby.*");
        dbcfg.configure(dbOomManager);
    }

}
