package com.lhamer

class Receptionsit {
String recepName
String recepEmail
String recepUsername
String recepPassword
int recepPhone

    static constraints = {
recepName blank:false
recepEmail blank:false
recepEmail email:true
recepUsername blank:false
recepUsername unique:true
recepPassword blank:false
recepPhone blank:false
    }
}
