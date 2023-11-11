package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties("server")
public class Server {
    private String host;
    private final List<String> alias = new ArrayList<>();
    private final Map<String, Alias> aliases = new HashMap<>();
    private final Log log = new Log();

    public String getHost() {
        return host;
    }

    public Server setHost(final String host) {
        this.host = host;
        return this;
    }

    public List<String> getAlias() {
        return alias;
    }

    public Map<String, Alias> getAliases() {
        return aliases;
    }

    @Override
    public String toString() {
        return "Server{" +
               "host='" + host + '\'' +
               ", alias=" + alias +
               ", aliases=" + aliases +
               ", log=" + log +
               '}';
    }

    public Log getLog() {
        return log;
    }

    public static class Log {
        private boolean enabled;

        public boolean isEnabled() {
            return enabled;
        }

        public Log setEnabled(final boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        @Override
        public String toString() {
            return "Log{" +
                   "enabled=" + enabled +
                   '}';
        }
    }

    public static class Alias {
        private String name;

        public String getName() {
            return name;
        }

        public Alias setName(final String name) {
            this.name = name;
            return this;
        }

        @Override
        public String toString() {
            return "Alias{" +
                   "name='" + name + '\'' +
                   '}';
        }
    }
}
