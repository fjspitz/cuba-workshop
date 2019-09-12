package com.company.workshop.web.screens.sparepart;

import com.haulmont.cuba.gui.screen.*;
import com.company.workshop.entity.SparePart;

@UiController("workshop_SparePart.browse")
@UiDescriptor("spare-part-browse.xml")
@LookupComponent("sparePartsTable")
@LoadDataBeforeShow
public class SparePartBrowse extends StandardLookup<SparePart> {
}