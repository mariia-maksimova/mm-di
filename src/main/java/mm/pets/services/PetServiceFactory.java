package mm.pets.services;

public class PetServiceFactory {

    public PetService getPetService(String petType) {
        switch(petType) {
            case "cat":
                return new CatPetService();
            case "dog":
                return new DogPetService();
            default:
                return new CatPetService();
        }
    }
}
