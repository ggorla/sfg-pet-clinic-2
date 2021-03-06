package guru.springframework.sfgpetclinic2.services.map;

import guru.springframework.sfgpetclinic2.model.vet;
import guru.springframework.sfgpetclinic2.services.CrudService;
import guru.springframework.sfgpetclinic2.services.VetServices;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<vet, Long> implements VetServices {
    @Override
    public Set<vet> findAll() {
        return super.findAll();
    }
    @Override
    public vet findByID(Long id) {
        return super.findById(id);
    }
    @Override
    public vet save(vet object) {
        return super.save(object.getId(), object);
    }
    @Override
    public void delete(vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
