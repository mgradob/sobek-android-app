package com.cita.irrigationsystem.irrigationsystem.requests;

import com.cita.irrigationsystem.irrigationsystem.lists.CropList;
import com.octo.android.robospice.request.springandroid.SpringAndroidSpiceRequest;

/**
 * Created by mgradob on 4/4/14.
 */
public class CropRequest extends SpringAndroidSpiceRequest<CropList> {

    public CropRequest() {
        super(CropList.class);
    }

    @Override
    public CropList loadDataFromNetwork() throws Exception {
        String url = "http://riego.chi.itesm.mx/Crop";

        return getRestTemplate().getForObject(url, CropList.class);
    }
}
