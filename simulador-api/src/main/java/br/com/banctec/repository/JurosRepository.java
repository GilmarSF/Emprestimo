package br.com.banctec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.banctec.domain.Juros;

public interface JurosRepository extends JpaRepository <Juros, Integer> {

}
