package com.lhamer

class Surgery {
String name
String address
String postcode
int telephone
int numberOfPatients
String description
String openingTime

static hasMany=[receptionsit:Receptionsit, nurse:Nurse]

static belongsTo=[Patient]

    static constraints = {
name blank:false
address blank:false
postcode blank:false
telephone blank:false
numberOfPatients blank:false
numberOfPatients max:1000
description blank:false
description maxSize:5000
description widget:'textarea'
openingTime blank:false
    }
}
