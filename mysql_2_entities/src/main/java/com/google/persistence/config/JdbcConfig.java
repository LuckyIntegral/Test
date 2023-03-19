package com.google.persistence.config;

import java.sql.Connection;
import java.sql.Statement;

public interface JdbcConfig {
    Connection getConnection();
    Statement getStatement();
}
