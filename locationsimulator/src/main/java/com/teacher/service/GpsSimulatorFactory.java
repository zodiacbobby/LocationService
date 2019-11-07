package com.teacher.service;

import com.teacher.model.GpsSimulatorRequest;
import com.teacher.model.Point;
import com.teacher.task.GpsSimulator;

import java.io.File;
import java.util.List;

/**
 *
 *
 */

public interface GpsSimulatorFactory {

    GpsSimulator prepareGpsSimulator(GpsSimulatorRequest gpsSimulatorRequest);

    GpsSimulator prepareGpsSimulator(GpsSimulator gpsSimulator, File kmlFile);

    GpsSimulator prepareGpsSimulator(GpsSimulator gpsSimulator, List<Point> points);

}
