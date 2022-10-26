package com.amr.project.service.impl;

import com.amr.project.dao.abstracts.ItemDao;
import com.amr.project.dao.abstracts.ReadWriteDao;
import com.amr.project.model.entity.Item;
import com.amr.project.service.abstracts.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ItemServiceImpl extends ReadWriteServiceImpl<Item, Long> implements ItemService{

    protected final ItemDao itemRepository;

    @Autowired
    public ItemServiceImpl(ReadWriteDao<Item, Long> dao, ItemDao itemRepository) {
        super(dao);
        this.itemRepository = itemRepository;
    }

    @Override
    public void isPretendedToBeDeleted(Long id) {

        itemRepository.isPretendedToBeDeleted(id);
    }
    
    @Override
    public List<Item> getItemForShop(Long shopId) {
        return itemRepository.getItemForShop(shopId);
    }
}
