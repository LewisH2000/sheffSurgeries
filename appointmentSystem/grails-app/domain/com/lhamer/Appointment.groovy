package com.lhamer

class Appointment {
Date appDate
String appTime
int appDuration
String roomNumber

    static constraints = {
appDate blank:false
appTime blank:false
appDuration blank:false
appDuration min:5
appDuration max:60
roomNumber blank:false
    }
}
