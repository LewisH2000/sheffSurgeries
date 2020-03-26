package com.lhamer

class Prescription {
String pharmacyName
int prescripNumber
String medicine
String totalCost
Date dateIssued
Boolean patientPaying

    static constraints = {
pharmacyName blank:false
prescripNumber blank:false
medicine blank:false
totalCost blank:false
dateIssued blank:false

    }
}
