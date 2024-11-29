package com.ejemplo.demo.Service;

import com.ejemplo.demo.model.DatosPersonales;
import org.springframework.stereotype.Service;

@Service
public class DatosPersonalesService {
    public DatosPersonales obtenerDatosPersonales() {
        return new DatosPersonales("Yony Christian", "Tineo Muñoz", 23);
    }
}
