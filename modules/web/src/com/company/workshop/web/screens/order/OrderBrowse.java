package com.company.workshop.web.screens.order;

import com.company.workshop.entity.OrderStatus;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.workshop.entity.Order;

import javax.inject.Inject;

@UiController("workshop_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {

    @Inject
    private CollectionContainer<Order> ordersDc;

    @Inject
    private DataManager dataManager;

    public void onNewStatusBtnClick() {
        Order selectedItem = ordersDc.getItem();
        if (selectedItem != null) {
            selectedItem.setStatus(OrderStatus.NEW);
            dataManager.commit(selectedItem);
        }
    }
}