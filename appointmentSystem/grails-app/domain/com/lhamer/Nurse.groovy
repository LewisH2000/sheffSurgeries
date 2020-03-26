package com.lhamer

class Nurse {
String nurseName
String qualifications
String nurseEmail
String nurseOffice
int nursePhone

    static constraints = {
nurseName blank:false
qualifications blank:false
nurseEmail blank:false
nurseEmail email:true
nurseOffice blank:false
nursePhone blank:false
    }
}
