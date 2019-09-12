package com.company.workshop.web.screens.mechanic;

import com.haulmont.cuba.gui.screen.*;
import com.company.workshop.entity.Mechanic;

@UiController("workshop_Mechanic.edit")
@UiDescriptor("mechanic-edit.xml")
@EditedEntityContainer("mechanicDc")
@LoadDataBeforeShow
public class MechanicEdit extends StandardEditor<Mechanic> {
}