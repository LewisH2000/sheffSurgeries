package com.lhamer

class Doctor {
String fullName
String qualification
String position
String doctorEmail
String password
String doctorOffice
int doctorPhone
String bio
    static constraints = {
fullName blank:false
qualification blank:false
position blank:false
doctorEmail blank:false
doctorEmail email:true
password blank:false
doctorOffice blank:false
doctorPhone blank:false
bio blank:false
bio maxSize:5000
bio widget:'textarea'

    }
}
