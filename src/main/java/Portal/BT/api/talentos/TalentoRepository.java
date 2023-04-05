package Portal.BT.api.talentos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TalentoRepository extends JpaRepository<Talento, Long> {
    Talento findByCPF(String CPF);
    void deleteByCPF(String CPF);

}
