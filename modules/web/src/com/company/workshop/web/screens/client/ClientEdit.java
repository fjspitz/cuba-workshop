package com.company.workshop.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.workshop.entity.Client;

@UiController("workshop_Client.edit")
@UiDescriptor("client-edit.xml")
@EditedEntityContainer("clientDc")
@LoadDataBeforeShow
public class ClientEdit extends StandardEditor<Client> {
}