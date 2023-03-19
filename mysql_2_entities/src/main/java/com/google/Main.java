package com.google;

import com.google.controller.CrudController;
import com.google.controller.impl.CrudControllerImpl;

public class Main {
    public static void main(String[] args) {
        CrudController controller = new CrudControllerImpl();
        controller.start();
    }
}