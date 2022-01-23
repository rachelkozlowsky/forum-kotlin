package br.com.alura.forum.Repository

import br.com.alura.forum.model.Curso
import org.springframework.data.jpa.repository.JpaRepository

interface CursoRepository : JpaRepository<Curso, Long>
