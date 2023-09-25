package br.com.wepdev.trabalhador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wepdev.trabalhador.model.Trabalhador;

public interface TrabalhadorRepository extends JpaRepository<Trabalhador, Long>{

}
