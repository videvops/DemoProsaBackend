package com.example.DemoPosaBackend.CatErroresTests;

import com.example.DemoPosaBackend.dto.TblProsaDemoCatErrores.CatErroresRequestDto;
import com.example.DemoPosaBackend.dto.TblProsaDemoCatErrores.TblProsaDemoCatErroresDto;
import com.example.DemoPosaBackend.service.TblProsaDemoCatErroresService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@DataJpaTest
public class CatErroresTest {

    @Autowired
    private TblProsaDemoCatErroresService catErroresService;

    @Test
    void testSaveCatError() throws ParseException {
        CatErroresRequestDto requestDto = new CatErroresRequestDto();
        requestDto.setFecha("10-10-2023 12:00:00");
        requestDto.setIdCodigoError(2);
        requestDto.setDescripcion("Descripcion 1");
        requestDto.setMensajeError("Error 201");
        requestDto.setSeveridad(2);
        requestDto.setGenerarEvento(0);
        requestDto.setFirmaRegistro("Firma 1");

        TblProsaDemoCatErroresDto catErrorDto =  catErroresService.save(requestDto);
        assertNotNull(catErrorDto);



    }


}
