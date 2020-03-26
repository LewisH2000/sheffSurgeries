package com.lhamer

class Patient {
String patientName
String patientAddress
String patientResidence
Date patientDob
String patientID
Date dateRegistered
int patientPhone


    static constraints = {
patientName blank:false
patientAddress blank:false
patientResidence blank:false
patientDob blank:false
patientID blank:false
dateRegistered blank:false
patientPhone blank:false
    }
}
