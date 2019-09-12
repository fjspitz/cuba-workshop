package com.company.workshop.web.screens.order;

import com.company.workshop.entity.OrderStatus;
import com.company.workshop.service.OrderService;
import com.haulmont.cuba.gui.screen.*;
import com.company.workshop.entity.Order;

import javax.inject.Inject;

@UiController("workshop_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {

    @Inject
    private OrderService orderService;

    @Subscribe
    private void onInitEntity(InitEntityEvent<Order> event) {
        event.getEntity().setStatus(OrderStatus.NEW);
    }

    @Subscribe
    private void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        Order order = getEditedEntity();
        order.setAmount(orderService.calculateAmount(order));
    }
}