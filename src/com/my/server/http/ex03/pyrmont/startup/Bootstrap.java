package com.my.server.http.ex03.pyrmont.startup;

import com.my.server.http.ex03.pyrmont.connector.http.HttpConnector;

public final class Bootstrap {
  public static void main(String[] args) {
    HttpConnector connector = new HttpConnector();
    connector.start();
  }
}