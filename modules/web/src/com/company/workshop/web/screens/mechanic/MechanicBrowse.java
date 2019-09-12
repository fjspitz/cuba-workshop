package com.company.workshop.web.screens.mechanic;

import com.haulmont.cuba.gui.screen.*;
import com.company.workshop.entity.Mechanic;

@UiController("workshop_Mechanic.browse")
@UiDescriptor("mechanic-browse.xml")
@LookupComponent("mechanicsTable")
@LoadDataBeforeShow
public class MechanicBrowse extends StandardLookup<Mechanic> {
}