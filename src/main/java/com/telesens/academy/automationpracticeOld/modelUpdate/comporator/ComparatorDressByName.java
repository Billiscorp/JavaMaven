package com.telesens.academy.automationpracticeOld.modelUpdate.comporator;

import com.telesens.academy.automationpracticeOld.modelUpdate.EntityDressUp;

import java.util.Comparator;

public class ComparatorDressByName implements Comparator<EntityDressUp> {

    @Override
    public int compare(EntityDressUp o1, EntityDressUp o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
