package br.com.banctec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.banctec.domain.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Integer> {

}
