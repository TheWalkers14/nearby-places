
package com.esri.android.nearbyplaces.data;

import android.support.annotation.NonNull;
import com.esri.arcgisruntime.geometry.Point;
import com.esri.arcgisruntime.tasks.geocode.GeocodeParameters;
import com.esri.arcgisruntime.tasks.networkanalysis.RouteResult;

import java.util.List;

/**
 * Main entry point for accessing places data.
 * Defines an interface to the service API that is used by this application. All data request should
 * be piped through this interface.
 */

public interface PlacesServiceApi {

  interface PlacesServiceCallback<List>{  // callback from server
    void onLoaded(List places);
  }

  interface RouteServiceCallback{
    void onRouteReturned(RouteResult result);
  }

  void getRouteFromService( Point start, Point end, RouteServiceCallback callback);

  void getPlacesFromService(@NonNull GeocodeParameters parameters, @NonNull PlacesServiceCallback callback);

  Place getPlaceDetail(String placeName);


  List<Place> getPlacesFromRepo();


}
