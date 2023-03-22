package PFIntegrador.example.RBPFI.Repository;

import PFIntegrador.example.RBPFI.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{
    
}
