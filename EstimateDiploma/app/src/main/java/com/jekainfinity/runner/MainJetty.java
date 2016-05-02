/*
package com.jekainfinity.runner;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.util.resource.FileResource;
import org.eclipse.jetty.webapp.Configuration;
import org.eclipse.jetty.webapp.WebAppContext;
import org.eclipse.jetty.webapp.WebXmlConfiguration;

import java.io.File;

public class MainJetty {

    public static void main(String[] args) throws Exception {
        Server server = new Server();
        int port = 8080;

        Connector connector = createSelectChannelConnector(server, port);

        Connector[] connectors = new Connector[] { connector };
        server.setConnectors(connectors);

        WebAppContext webAppContext = new WebAppContext();
        webAppContext.setServer(server);
        webAppContext.setContextPath("/");
        webAppContext.setWar("main/webapp");
        webAppContext.setMaxFormContentSize(1 * 1024 * 1024);
        webAppContext.setDescriptor("main/webapp/WEB-INF/web.xml");
        webAppContext.setResourceBase("main/webapp");
        webAppContext.setConfigurations(new Configuration[]{new WebXmlConfiguration()});
        server.setHandler(webAppContext);

        try {
            System.out.println(">>> STARTING EMBEDDED JETTY SERVER, PRESS ANY KEY TO STOP!!");
            server.start();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(100);
        }

    }

    static Connector createSelectChannelConnector(Server server,int port) {
        ServerConnector connector = new ServerConnector(server);
        connector.setIdleTimeout(1000 * 60 * 60);
        connector.setSoLingerTime(-1);
        connector.setPort(port);
        return connector;
    }


    }


*/
