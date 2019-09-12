package com.company.workshop.web.screens.sparepart;

import com.haulmont.cuba.gui.screen.*;
import com.company.workshop.entity.SparePart;

@UiController("workshop_SparePart.edit")
@UiDescriptor("spare-part-edit.xml")
@EditedEntityContainer("sparePartDc")
@LoadDataBeforeShow
public class SparePartEdit extends StandardEditor<SparePart> {
}