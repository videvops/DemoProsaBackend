package com.example.DemoPosaBackend.dao;

import com.example.DemoPosaBackend.entities.TblProsaDemoCatTipoParametro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TblProsaDemoCatTipoParametroDao extends JpaRepository<TblProsaDemoCatTipoParametro, Integer> {

    @Query("Select b From TblProsaDemoCatTipoParametro b")
    public List<TblProsaDemoCatTipoParametro> getAllTiposParametro();

}
