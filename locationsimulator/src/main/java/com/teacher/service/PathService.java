package com.teacher.service;

import com.teacher.model.DirectionInput;
import com.teacher.model.Point;
import com.teacher.model.ServiceLocation;
import com.teacher.model.SimulatorFixture;
import com.teacher.model.DirectionInput;
import com.teacher.model.Point;
import com.teacher.model.ServiceLocation;
import com.teacher.model.SimulatorFixture;

import java.util.List;

/**
 *
 *
 *
 */
public interface PathService {

    /**
     * @return
     */
    List<DirectionInput> loadDirectionInput();

    SimulatorFixture loadSimulatorFixture();

    /**
     * @param directionInput
     * @return
     */
    List<Point> getCoordinatesFromGoogle(DirectionInput directionInput);

    String getCoordinatesFromGoogleAsPolyline(DirectionInput directionInput);


//    List<Point> getCoordinatesFromKmlFile(File kmlFile);

    List<ServiceLocation> getServiceStations();
}
