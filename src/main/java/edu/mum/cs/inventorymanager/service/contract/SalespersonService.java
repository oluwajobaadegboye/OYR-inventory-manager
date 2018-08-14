package edu.mum.cs.inventorymanager.service.contract;

import edu.mum.cs.inventorymanager.model.entity.Merchant;
import edu.mum.cs.inventorymanager.model.entity.Salesperson;

import java.util.List;

public interface SalespersonService extends AbstractService<Salesperson> {
    public List<Salesperson> findAllByMerchant(Merchant merchant);
}
