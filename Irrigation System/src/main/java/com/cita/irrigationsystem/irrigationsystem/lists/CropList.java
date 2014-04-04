package com.cita.irrigationsystem.irrigationsystem.lists;

import com.cita.irrigationsystem.irrigationsystem.models.CropInformation;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

/**
 * Created by mgradob on 4/4/14.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CropList extends ArrayList<CropInformation> {
}
