package com.ejemplo.demo.controller;

import com.ejemplo.demo.Service.DatosPersonalesService;
import com.ejemplo.demo.model.DatosPersonales;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/datos")
public class DatosPersonalesController {
    private final DatosPersonalesService datosPersonalesService;

    public DatosPersonalesController(DatosPersonalesService datosPersonalesService) {
        this.datosPersonalesService = datosPersonalesService;
    }

    @GetMapping
    public DatosPersonales obtenerDatos() {
        return datosPersonalesService.obtenerDatosPersonales();
    }
}

