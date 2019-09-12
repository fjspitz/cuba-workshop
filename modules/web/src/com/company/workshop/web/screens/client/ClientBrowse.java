package com.company.workshop.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.workshop.entity.Client;

@UiController("workshop_Client.browse")
@UiDescriptor("client-browse.xml")
@LookupComponent("clientsTable")
@LoadDataBeforeShow
public class ClientBrowse extends StandardLookup<Client> {
}