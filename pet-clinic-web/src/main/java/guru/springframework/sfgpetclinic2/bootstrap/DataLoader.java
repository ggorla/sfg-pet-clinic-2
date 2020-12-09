package guru.springframework.sfgpetclinic2.bootstrap;

import guru.springframework.sfgpetclinic2.model.Owner;
import guru.springframework.sfgpetclinic2.model.vet;
import guru.springframework.sfgpetclinic2.services.OwnerService;
import guru.springframework.sfgpetclinic2.services.VetServices;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private  final OwnerService ownerService;
    private final VetServices vetServices;

    public DataLoader(OwnerService ownerService, VetServices vetServices) {
        this.ownerService = ownerService;
        this.vetServices = vetServices;
    }


    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        vet vet1 = new vet();

        vet1.setId((1L));
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetServices.save(vet1);

        vet vet2 = new vet();

        vet2.setId((2L));
        vet2.setFirstName("Samantha");
        vet2.setLastName("Axedemo");

        vetServices.save(vet2);

        System.out.println("Loaded Vets");
    }
}
