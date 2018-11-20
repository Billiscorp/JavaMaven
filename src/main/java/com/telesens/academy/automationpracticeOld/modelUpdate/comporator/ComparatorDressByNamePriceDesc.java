package com.telesens.academy.automationpracticeOld.modelUpdate.comporator;

import com.telesens.academy.automationpracticeOld.modelUpdate.EntityDressUp;

import java.util.Comparator;

public class ComparatorDressByNamePriceDesc implements Comparator<EntityDressUp>{



        @Override
        public int compare(EntityDressUp o1, EntityDressUp o2) {

          /*  int cmp = compareDressByName.compare(o1, o2);
            if (cmp == 0) {
                cmp = Double.compare(o1.getPrice(), o2.getPrice());
            }*/
//            return cmp;
            return 0; // заглушка
        }
    }

