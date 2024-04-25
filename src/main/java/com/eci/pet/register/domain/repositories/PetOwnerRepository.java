package com.eci.pet.register.domain.repositories;

import java.util.List;
import java.util.UUID;

public interface PetOwnerRepository {
    String searchOwnerById(UUID ownerId);
    List<UUID> getOwnerIdList();
}
